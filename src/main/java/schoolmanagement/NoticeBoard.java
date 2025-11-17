package schoolmanagement;

import java.util.Date;

public class NoticeBoard {
    private String noticeId;
    private String message;
    private Date date;

    public NoticeBoard(String noticeId, String message, Date date) {
        this.noticeId = noticeId;
        this.message = message;
        this.date = date;
    }

    public void displayNotice() {
        System.out.println("Notice (" + date + "): " + message);
    }
}
