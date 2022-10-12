package CourseData;

import Loggers.LoggersManager;
import java.util.ArrayList;

public class LoggersManagerr {
    private ArrayList<LoggersManager> loggersManager;
      public LoggersManagerr(ArrayList<LoggersManager> loggersManager){
             this.loggersManager=loggersManager;
   }
    public void log(String data){
     for(LoggersManager loggersManagerr:loggersManager){
         loggersManagerr.log(data);
      }
    }
}
