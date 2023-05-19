import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class OutputInEveryTwoMin {
    private static final int DELAY = 2 * 60 * 1000;

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                displayMessage();
            }
        }, 0, DELAY);
    }

    private static void displayMessage() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy, HH:mm:ss");
        System.out.println("Current time  : "+LocalDateTime.now().format(formatter));
        System.out.println("The message will be display in the console in every 2 minutes");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println();
    }
}
