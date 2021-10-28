import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WinappDriver_poc {

    public static void main(String[] args) throws IOException, InterruptedException {

        //   Runtime.getRuntime().exec("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe", null, new File("C:\\Program Files\\Windows Application Driver\\"));
//    Process process = new ProcessBuilder("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe").start();
//process.
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File("C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe"));
        System.out.println("Desktop>>>" + desktop);
        Thread.sleep(3000);

        //closing the WinAppDriver application
  //      Runtime rt = Runtime.getRuntime();

      //  rt.exec("taskkill /F /IM WinAppDriver.exe");

      /*  String path = "C:\\Program Files\\Windows Application Driver\\WinAppDriver.exe";
        File file = new File(path);
        if (! file.exists()) {
            throw new IllegalArgumentException("The file " + path + " does not exist");
        }
        Process p = Runtime.getRuntime().exec(file.getAbsolutePath());
//        p.isAlive();
        System.out.println("Process>>>"+p);*/

    }


}
