package backupDB;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        BackUpTask backUpTask = new BackUpTask();
        DatabaseConfig databaseConfigA = new DatabaseConfig("curses_db","admin","admin");
        DatabaseConfig databaseConfigB = new DatabaseConfig("minecraft","admin","myMin");
        DatabaseConfig databaseConfigC = new DatabaseConfig("users","admin","oiajwoid12123");

        ExecutorService service = null;
        try {
            service = Executors.newScheduledThreadPool(10);
            service.submit(() -> backUpTask.backUp(databaseConfigA));
            service.submit(() -> backUpTask.backUp(databaseConfigB));
            service.submit(() -> backUpTask.backUp(databaseConfigC));

        }finally {
            if(service != null) service.shutdown();
        }
    }
}
