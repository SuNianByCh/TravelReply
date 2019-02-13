package com.example.reply

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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

    }

    fun initData() {
        val list = arrayListOf<Any>()
        for (i in 1 .. 20){
            list.add(i)
        }
        adapter.addData(list)
    }

    companion object {
        fun instance() = ReplyFragment()
    }
}