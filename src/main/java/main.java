import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("./www/staff/"));

        Runnable r2 = new cssGenerationClass();
        Thread th2 = new Thread(r2, "My second thread");
        th2.start();

        Runnable r1 = new contentGenerationThread();
        Thread th1 = new Thread(r1, "My first thread");
        th1.start();
    }
}
