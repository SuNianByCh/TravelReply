package com.example.reply

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder

class ReplyAdapter : BaseQuickAdapter<ReplyBean, ReplyViewHold>(R.layout.item_reply) {

    var mZanParentListener: IOnClickListener<ReplyBean>? = null
    var mZanChildClickListener: IOnClickListener<ReplyBean.ChildReplyBean>? = null
    var mReplyChildClickListener: IOnClickListener<ReplyBean>? = null
    var mReplyParentClickListener: IOnClickListener<ReplyBean>? = null


    override fun convert(helper: ReplyViewHold, item: ReplyBean) {
        helper.bindData(mContext, item)

        helper.getView<View>(R.id.tvZan).setOnClickListener {
            mZanParentListener?.onClick(helper.adapterPosition, item, helper)

        }

        helper.getView<View>(R.id.ivRely).setOnClickListener {
            mReplyParentClickListener
        }
    }


    interface IOnClickListener<T> {
        fun onClick(position: Int, t: T, helper: ReplyViewHold)
    }

}
