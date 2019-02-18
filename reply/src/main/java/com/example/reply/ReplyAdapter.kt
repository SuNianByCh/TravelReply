package com.example.reply

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class ReplyAdapter : BaseQuickAdapter<ReplyBean, ReplyViewHold>(R.layout.item_reply) {

    override fun convert(helper: ReplyViewHold, item: ReplyBean) {
        helper.bindData(mContext, item)



    }


}
