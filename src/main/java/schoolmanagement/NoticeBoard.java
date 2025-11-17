package schoolmanagement;

import java.util.List;

public class NoticeBoard {
    private List<String> newsList;  // قائمة الأخبار أو المعلومات
    private String inchargeName;   // اسم المسؤول عن لوحة الإعلانات

    public NoticeBoard(List<String> newsList, String inchargeName) {
        this.newsList = newsList;
        this.inchargeName = inchargeName;
    }

    public void display() {
    System.out.println("NoticeBoard (" + inchargeName + "): " + String.join(", ", newsList));
}


    // getters and setters
    public List<String> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<String> newsList) {
        this.newsList = newsList;
    }

    public String getInchargeName() {
        return inchargeName;
    }

    public void setInchargeName(String inchargeName) {
        this.inchargeName = inchargeName;
    }
}
