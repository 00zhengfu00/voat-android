package co.voat.android.data;

/**
 * Submission, ya know?
 * Created by John on 6/11/2015.
 */
public class Submission {
    int id;
    int commentCount;
    //TODO fix date
    String date;
    int upVotes;
    int downVotes;
    //TODO fix date
    String lastEditDate;
    int views;
    String userName;
    String subverse;
    String thumbnail;
    String title;
    int type;
    String url;
    String content;
    String formattedContent;

    public int getId() {
        return id;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public String getDate() {
        return date;
    }

    public int getUpVotes() {
        return upVotes;
    }

    public int getDownVotes() {
        return downVotes;
    }

    public String getLastEditDate() {
        return lastEditDate;
    }

    public int getViews() {
        return views;
    }

    public String getUserName() {
        return userName;
    }

    public String getSubverse() {
        return subverse;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getTitle() {
        return title;
    }

    public int getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public String getContent() {
        return content;
    }

    public String getFormattedContent() {
        return formattedContent;
    }
}