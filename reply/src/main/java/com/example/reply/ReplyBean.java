package com.example.reply;

import java.util.List;

public class ReplyBean {

    /**
     * id : 1
     * mid : 518757401021775900
     * nickName : JRSMITH
     * toNickName : nntk
     * avatar : http://img5.duitang.com/uploads/item/201410/19/20141019224235_F3WHu.jpeg
     * gmtCreate : 2018-12-11T16:14:31.000+0000
     * content : 很棒！
     * userId : 1
     * replyUserId : 1
     * parentReplyId : 0
     * childReply : [{"id":530676169470115840,"mid":518757401021775900,"nickName":"JAMES","toNickName":"JRSMITH","avatar":"http://img5.duitang.com/uploads/item/201410/19/20141019224235_F3WHu.jpeg","gmtCreate":"2019-01-04T09:17:38.000+0000","content":"哈哈哈","userId":2,"replyUserId":1,"parentReplyId":1},{"id":530676906832953340,"mid":518757401021775900,"nickName":"CURRY","toNickName":"JAMES","avatar":"http://img5.duitang.com/uploads/item/201410/19/20141019224235_F3WHu.jpeg","gmtCreate":"2019-01-04T09:20:34.000+0000","content":"哈哈哈","userId":3,"replyUserId":2,"parentReplyId":1},{"id":530676906832953340,"mid":518757401021775900,"nickName":"JR超","toNickName":"JAMES","avatar":"http://b-ssl.duitang.com/uploads/item/201509/04/20150904102829_RdnSa.jpeg","gmtCreate":"2018-12-11T16:27:22.000+0000","content":"很棒！！","userId":4,"replyUserId":2,"parentReplyId":1}]
     */

    private int id;
    private long mid;
    private String nickName;
    private String toNickName;
    private String avatar;
    private String gmtCreate;
    private String content;
    private int userId;
    private int replyUserId;
    private int parentReplyId;
    private List<ChildReplyBean> childReply;
    private boolean isExpland;

    public boolean isExpland() {
        return isExpland;
    }

    public void setExpland(boolean expland) {
        isExpland = expland;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMid() {
        return mid;
    }

    public void setMid(long mid) {
        this.mid = mid;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getToNickName() {
        return toNickName;
    }

    public void setToNickName(String toNickName) {
        this.toNickName = toNickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(int replyUserId) {
        this.replyUserId = replyUserId;
    }

    public int getParentReplyId() {
        return parentReplyId;
    }

    public void setParentReplyId(int parentReplyId) {
        this.parentReplyId = parentReplyId;
    }

    public List<ChildReplyBean> getChildReply() {
        return childReply;
    }

    public void setChildReply(List<ChildReplyBean> childReply) {
        this.childReply = childReply;
    }

    public static class ChildReplyBean {
        /**
         * id : 530676169470115840
         * mid : 518757401021775900
         * nickName : JAMES
         * toNickName : JRSMITH
         * avatar : http://img5.duitang.com/uploads/item/201410/19/20141019224235_F3WHu.jpeg
         * gmtCreate : 2019-01-04T09:17:38.000+0000
         * content : 哈哈哈
         * userId : 2
         * replyUserId : 1
         * parentReplyId : 1
         */

        private long id;
        private long mid;
        private String nickName;
        private String toNickName;
        private String avatar;
        private String gmtCreate;
        private String content;
        private int userId;
        private int replyUserId;
        private int parentReplyId;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getMid() {
            return mid;
        }

        public void setMid(long mid) {
            this.mid = mid;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getToNickName() {
            return toNickName;
        }

        public void setToNickName(String toNickName) {
            this.toNickName = toNickName;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getGmtCreate() {
            return gmtCreate;
        }

        public void setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getReplyUserId() {
            return replyUserId;
        }

        public void setReplyUserId(int replyUserId) {
            this.replyUserId = replyUserId;
        }

        public int getParentReplyId() {
            return parentReplyId;
        }

        public void setParentReplyId(int parentReplyId) {
            this.parentReplyId = parentReplyId;
        }
    }
}
