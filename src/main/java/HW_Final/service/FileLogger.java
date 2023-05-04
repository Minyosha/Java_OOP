package HW_Final.service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements Logger {
    @Override
    public void log(String message) throws IOException {
        FileWriter file = new FileWriter("log.txt", true);
        SimpleDateFormat dateFormat = new SimpleDateFormat("[d MMMM yyyy HH:mm]");
        Date date = new Date();
        file.write(String.format("%s %s\n", dateFormat.format(date), message));
        file.flush();
        file.close();
    }
}