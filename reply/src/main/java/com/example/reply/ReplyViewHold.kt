package com.example.reply

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.chad.library.adapter.base.BaseViewHolder

public class ReplyViewHold(view: View?) : BaseViewHolder(view) {
    fun bindData(context: Context, replyBean: ReplyBean) {

        if (!replyBean.isExpland || replyBean.childReply == null || replyBean.childReply.isEmpty()) {
            closeView(context, replyBean.childReply)
        } else {
            explandView(context, replyBean.childReply)
        }

        setOnClickListener(R.id.tv_more) {
            if (replyBean.isExpland) {
                closeView(context, replyBean.childReply)
            } else {
                explandView(context, replyBean.childReply)
            }

            replyBean.isExpland = !replyBean.isExpland

        }


    }

    private fun explandView(context: Context, list: List<ReplyBean.ChildReplyBean>) {
        val recyclerView = getView<RecyclerView>(R.id.rv)
        val layoutManager = recyclerView.layoutManager
        var adapter = recyclerView.adapter
        if (layoutManager == null || adapter !is ReplyCildAdapter) {
            recyclerView.layoutManager = LinearLayoutManager(context)
            adapter = ReplyCildAdapter()
            recyclerView.adapter = adapter

        }
        getView<View>(R.id.tv_more).visibility = View.VISIBLE
        setText(R.id.tv_more, "收起全部回复")
        adapter.data.clear()
        adapter.addData(list)
    }


    private fun closeView(context: Context, list: List<ReplyBean.ChildReplyBean>?) {
        val recyclerView = getView<RecyclerView>(R.id.rv)

        val layoutManager = recyclerView.layoutManager
        var adapter = recyclerView.adapter
        if (layoutManager == null || adapter !is ReplyCildAdapter) {
            recyclerView.layoutManager = LinearLayoutManager(context)
            adapter = ReplyCildAdapter()
            recyclerView.adapter = adapter

        }
        if (list != null && list.size > 1) {
            adapter.data.clear()
            adapter.addData(list.subList(0, 1))
            getView<View>(R.id.tv_more).visibility = View.VISIBLE
            setText(R.id.tv_more, "查看全部" + list.size + "条回复")
        } else {
            if (list != null) {
                adapter.data.clear()
                adapter.addData(list)
            }
            getView<View>(R.id.tv_more).visibility = View.GONE
        }


    }

}