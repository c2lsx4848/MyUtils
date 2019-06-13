package com.fmsd.liu.Entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by liang on 2018/10/19.
 */

public class Work_PullableListView_Entity {

    private List<ArticlelistBean> articlelist;

    public List<ArticlelistBean> getArticlelist() {
        return articlelist;
    }

    public void setArticlelist(List<ArticlelistBean> articlelist) {
        this.articlelist = articlelist;
    }

    public static class ArticlelistBean implements Serializable{
        /**
         * appid : 2
         * article_id : 998
         * article_name : 绝地求生刺激战场海岛防空洞解析
         * authorlist : null
         * class_id : 9
         * column_id : 0
         * commentlist : null
         * commentnum : 0
         * contempt : 0
         * content :
         <span style="font-family: 微软
         * contentPictures : [{"article_id":998,"column_id":0,"create_date":"2018-08-03 16:21:27","create_idate":20180803,"isaudit":1,"label":"","order":4,"picture_id":1401,"picture_name":"EScAAFsDz_yAGKTzAACA6W3ZKgY033.jpg","title":"EScAAFsDz_yAGKTzAACA6W3ZKgY033","url":"/app2/class3/EScAAFsDz_yAGKTzAACA6W3ZKgY033.jpg"}]
         * countbrowse : 9258
         * countcollect : 272
         * countlike : 994
         * create_date : null
         * create_idate : 20180803
         * imageNum : 4
         * is_attention : 0
         * is_audit : 0
         * is_collect : 0
         * is_like : 0
         * superheat : 0
         * url : http://www.gao7.com/pgqq/detail-916264.shtm
         */

        private int appid;
        private int article_id;
        private String article_name;
        private Object authorlist;
        private int class_id;
        private int column_id;
        private Object commentlist;
        private int commentnum;
        private int contempt;
        private String content;
        private int countbrowse;
        private int countcollect;
        private int countlike;
        private int countup;
        private int countshare;
        private String create_date;
        private String iscollect;
        private String isup;
        private int create_idate;
        private int imageNum;
        private int is_attention;
        private int is_audit;
        private int is_collect;
        private int is_like;
        private int superheat;
        private String url;
        private int liulancount;
        private String pictures_url;
        private int shoucangcount;
        private List<ContentPicturesBean> contentPictures;
        private boolean isShowRadioButton;
        private boolean isDelete;
        private boolean isSelected;

        public boolean isShowRadioButton() {
            return isShowRadioButton;
        }

        public void setShowRadioButton(boolean showRadioButton) {
            isShowRadioButton = showRadioButton;
        }

        public boolean isDelete() {
            return isDelete;
        }

        public void setDelete(boolean delete) {
            isDelete = delete;
        }

        public boolean isSelected() {
            return isSelected;
        }

        public void setSelected(boolean selected) {
            isSelected = selected;
        }

        public int getCountshare() {
            return countshare;
        }

        public void setCountshare(int countshare) {
            this.countshare = countshare;
        }

        public String getIsup() {
            return isup;
        }

        public void setIsup(String isup) {
            this.isup = isup;
        }

        public String getIscollect() {
            return iscollect;
        }

        public void setIscollect(String iscollect) {
            this.iscollect = iscollect;
        }

        public int getLiulancount() {
            return liulancount;
        }

        public void setLiulancount(int liulancount) {
            this.liulancount = liulancount;
        }

        public String getPictures_url() {
            return pictures_url;
        }

        public void setPictures_url(String pictures_url) {
            this.pictures_url = pictures_url;
        }

        public int getShoucangcount() {
            return shoucangcount;
        }

        public void setShoucangcount(int shoucangcount) {
            this.shoucangcount = shoucangcount;
        }

        public int getCountup() {
            return countup;
        }

        public void setCountup(int countup) {
            this.countup = countup;
        }

        public int getAppid() {
            return appid;
        }

        public void setAppid(int appid) {
            this.appid = appid;
        }

        public int getArticle_id() {
            return article_id;
        }

        public void setArticle_id(int article_id) {
            this.article_id = article_id;
        }

        public String getArticle_name() {
            return article_name;
        }

        public void setArticle_name(String article_name) {
            this.article_name = article_name;
        }

        public Object getAuthorlist() {
            return authorlist;
        }

        public void setAuthorlist(Object authorlist) {
            this.authorlist = authorlist;
        }

        public int getClass_id() {
            return class_id;
        }

        public void setClass_id(int class_id) {
            this.class_id = class_id;
        }

        public int getColumn_id() {
            return column_id;
        }

        public void setColumn_id(int column_id) {
            this.column_id = column_id;
        }

        public Object getCommentlist() {
            return commentlist;
        }

        public void setCommentlist(Object commentlist) {
            this.commentlist = commentlist;
        }

        public int getCommentnum() {
            return commentnum;
        }

        public void setCommentnum(int commentnum) {
            this.commentnum = commentnum;
        }

        public int getContempt() {
            return contempt;
        }

        public void setContempt(int contempt) {
            this.contempt = contempt;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getCountbrowse() {
            return countbrowse;
        }

        public void setCountbrowse(int countbrowse) {
            this.countbrowse = countbrowse;
        }

        public int getCountcollect() {
            return countcollect;
        }

        public void setCountcollect(int countcollect) {
            this.countcollect = countcollect;
        }

        public int getCountlike() {
            return countlike;
        }

        public void setCountlike(int countlike) {
            this.countlike = countlike;
        }

        public String getCreate_date() {
            return create_date;
        }

        public void setCreate_date(String create_date) {
            this.create_date = create_date;
        }

        public int getCreate_idate() {
            return create_idate;
        }

        public void setCreate_idate(int create_idate) {
            this.create_idate = create_idate;
        }

        public int getImageNum() {
            return imageNum;
        }

        public void setImageNum(int imageNum) {
            this.imageNum = imageNum;
        }

        public int getIs_attention() {
            return is_attention;
        }

        public void setIs_attention(int is_attention) {
            this.is_attention = is_attention;
        }

        public int getIs_audit() {
            return is_audit;
        }

        public void setIs_audit(int is_audit) {
            this.is_audit = is_audit;
        }

        public int getIs_collect() {
            return is_collect;
        }

        public void setIs_collect(int is_collect) {
            this.is_collect = is_collect;
        }

        public int getIs_like() {
            return is_like;
        }

        public void setIs_like(int is_like) {
            this.is_like = is_like;
        }

        public int getSuperheat() {
            return superheat;
        }

        public void setSuperheat(int superheat) {
            this.superheat = superheat;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public List<ContentPicturesBean> getContentPictures() {
            return contentPictures;
        }

        public void setContentPictures(List<ContentPicturesBean> contentPictures) {
            this.contentPictures = contentPictures;
        }

        public static class ContentPicturesBean implements Serializable{
            /**
             * article_id : 998
             * column_id : 0
             * create_date : 2018-08-03 16:21:27
             * create_idate : 20180803
             * isaudit : 1
             * label :
             * order : 4
             * picture_id : 1401
             * picture_name : EScAAFsDz_yAGKTzAACA6W3ZKgY033.jpg
             * title : EScAAFsDz_yAGKTzAACA6W3ZKgY033
             * url : /app2/class3/EScAAFsDz_yAGKTzAACA6W3ZKgY033.jpg
             */

            private int article_id;
            private int column_id;
            private String create_date;
            private int create_idate;
            private int isaudit;
            private String label;
            private int order;
            private int picture_id;
            private String picture_name;
            private String pic_url;
            private String title;
            private String url;

            public String getPic_url() {
                return pic_url;
            }

            public void setPic_url(String pic_url) {
                this.pic_url = pic_url;
            }

            public int getArticle_id() {
                return article_id;
            }

            public void setArticle_id(int article_id) {
                this.article_id = article_id;
            }

            public int getColumn_id() {
                return column_id;
            }

            public void setColumn_id(int column_id) {
                this.column_id = column_id;
            }

            public String getCreate_date() {
                return create_date;
            }

            public void setCreate_date(String create_date) {
                this.create_date = create_date;
            }

            public int getCreate_idate() {
                return create_idate;
            }

            public void setCreate_idate(int create_idate) {
                this.create_idate = create_idate;
            }

            public int getIsaudit() {
                return isaudit;
            }

            public void setIsaudit(int isaudit) {
                this.isaudit = isaudit;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public int getOrder() {
                return order;
            }

            public void setOrder(int order) {
                this.order = order;
            }

            public int getPicture_id() {
                return picture_id;
            }

            public void setPicture_id(int picture_id) {
                this.picture_id = picture_id;
            }

            public String getPicture_name() {
                return picture_name;
            }

            public void setPicture_name(String picture_name) {
                this.picture_name = picture_name;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
