package backupDB;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BackUpTask {
    public void backUp(DatabaseConfig dbConfig) {
        System.out.println("El BackUp comenzo: "+new Date());

        Date backUpDate = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String backUpDateStr = format.format(backUpDate);

        String folderPath = "C:\\Users\\user\\IdeaProjects\\ProgramacionFuncional\\src\\main\\java\\backupDB\\backUps";
        File file = new File(folderPath);
        file.mkdir();

        String saveFileName = "backUp "+dbConfig.getDbname()+"_"+backUpDateStr+".sql";
        String savePath = folderPath + File.separator+saveFileName;

        String executeCMD = "cmd.exe /c echo. 2>"+savePath;

        execCommand(executeCMD);
    }
    private void execCommand(String command) {
        System.out.println(command);
        Process runtimeProcess = null;

        try {
            runtimeProcess = Runtime.getRuntime().exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int processComplete = 0;
        try {
            processComplete = runtimeProcess.waitFor();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(processComplete == 0) {
            System.out.println("Comando completado: "+new Date());
        } else {
            System.err.println("Error al ejecutar el comando: "+command);
        }
    }
}
