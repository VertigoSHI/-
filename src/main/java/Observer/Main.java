package Observer;

public class Main
{
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.addObserver(new dad("我嫩爹"));
        baby.addObserver(new dog("我嫩🐕"));
        baby.wakeUp();
    }
}
