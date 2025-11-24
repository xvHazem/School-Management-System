package schoolmanagement;

import java.util.*;

class NoticeBoard {
    private List<String> newsList;
    private String inchargeName;
    
    public NoticeBoard(String inchargeName) {
        this.inchargeName = inchargeName;
        this.newsList = new ArrayList<>();
    }
    
    public void display() {
        System.out.println("\n--- NOTICE BOARD (Incharge: " + inchargeName + ") ---");
        if (newsList.isEmpty()) {
            System.out.println("No announcements");
        } else {
            for (int i = 0; i < newsList.size(); i++) {
                System.out.println((i + 1) + ". " + newsList.get(i));
            }
        }
    }
    
    public void addContent(String content) {
        newsList.add(content);
        System.out.println(" Content added to notice board!");
    }
    
    public String getInchargeName() { return inchargeName; }
}
