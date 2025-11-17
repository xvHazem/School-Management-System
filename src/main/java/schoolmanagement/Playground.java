package schoolmanagement;

public class Playground {
    private String playgroundId;
    private String playgroundName;

    public Playground(String playgroundId, String playgroundName) {
        this.playgroundId = playgroundId;
        this.playgroundName = playgroundName;
    }

    public void playgroundDetails() {
        System.out.println("Playground: " + playgroundName);
    }
}
