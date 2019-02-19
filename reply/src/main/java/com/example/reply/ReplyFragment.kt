package com.example.reply

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import cn.dreamtobe.kpswitch.IPanelHeightTarget
import cn.dreamtobe.kpswitch.util.KeyboardUtil
import com.gyf.barlibrary.ImmersionBar
import kotlinx.android.synthetic.main.frg_reply.*


class ReplyFragment : Fragment() {

    lateinit var adapter: ReplyAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.frg_reply, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = ReplyAdapter()
        rv.layoutManager = LinearLayoutManager(context)
        rv.adapter = adapter
        initData()
        flBottom.visibility = View.INVISIBLE
        KeyboardUtil.attach(activity!!,object:IPanelHeightTarget{
            override fun getHeight(): Int {

                return 200
            }

            override fun refreshHeight(panelHeight: Int) {

                Log.i("infos","he" + panelHeight)
            }

            override fun onKeyboardShowing(showing: Boolean) {
                if(!showing){
                    KeyboardUtil.hideKeyboard(etContent)
                    tvBottom.visibility = View.VISIBLE
                    flBottom.visibility = View.INVISIBLE
                    etContent.clearFocus()
                }

            }

        })


        tvBottom.setOnClickListener {
            tvBottom.visibility = View.INVISIBLE
            flBottom.visibility = View.VISIBLE
            etContent.requestFocus()
            KeyboardUtil.showKeyboard(etContent)
        }


    }

    private fun initData() {
        val list = arrayListOf<ReplyBean>()
        for (i in 0..20) {
            list.add(ReplyBean().apply {
                val arrayListOf = arrayListOf<ReplyBean.ChildReplyBean>()
                for (j in 1..i) {
                    arrayListOf.add(ReplyBean.ChildReplyBean())
                }
                childReply = arrayListOf
            })
        }
        adapter.addData(list)
    }

    companion object {
        fun instance() = ReplyFragment()
    }
}