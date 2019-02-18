package com.example.reply

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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
        ImmersionBar.with(activity!!)
            .navigationBarEnable(false)
            .navigationBarWithKitkatEnable(false)
            .navigationBarWithEMUI3Enable(false)
            .statusBarColorTransformEnable(false)
            .keyboardEnable(true).setOnKeyboardListener { isPopup, keyboardHeight ->
            if(!isPopup){
                KeyboardktUtils.hideKeyboard(etContent)
                tvBottom.visibility = View.VISIBLE
                flBottom.visibility = View.INVISIBLE
                etContent.clearFocus()
            }

        }.init()

        tvBottom.setOnClickListener {
            tvBottom.visibility = View.INVISIBLE
            flBottom.visibility = View.VISIBLE
            etContent.requestFocus()
            KeyboardktUtils.showKeyboard(etContent)
        }


    }

    private fun initData() {
        val list = arrayListOf<ReplyBean>()
        for (i in 0..20) {
            list.add(ReplyBean().apply {
                val arrayListOf = arrayListOf<ReplyBean.ChildReplyBean>()
                for (j in 1..2){

                }
                arrayListOf.add(ReplyBean.ChildReplyBean())
                childReply=arrayListOf
            })
        }
        adapter.addData(list)
    }

    companion object {
        fun instance() = ReplyFragment()
    }
}