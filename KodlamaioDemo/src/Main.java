import CourseData.Course;
import CourseData.CourseManager;
import CourseData.LoggersManagerr;
import DataAccsess.JdbsDao;
import Loggers.DatabaseLoggers;
import Loggers.FileLoggers;
import Loggers.LoggersManager;
import Loggers.MailLoggers;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Course course=new Course();
        course.name="Java";
        course.category="Programlama";
        course.instiructor="Engin Demirog";
        course.price=10;
        CourseManager courseManager=new CourseManager(new JdbsDao());
        courseManager.add(course);

        ArrayList<LoggersManager>loggersManager=new ArrayList<>();
         loggersManager.add(new DatabaseLoggers());
         loggersManager.add(new FileLoggers());
         loggersManager.add(new MailLoggers());

         LoggersManagerr loggersManagerr=new LoggersManagerr(loggersManager);
         loggersManagerr.log("data");

    }
}
