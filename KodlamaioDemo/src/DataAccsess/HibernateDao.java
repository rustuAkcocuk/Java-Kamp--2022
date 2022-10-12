package DataAccsess;

import CourseData.Course;

public class HibernateDao implements AlternatifDao {
    public void databaseAdd(Course course){
        System.out.println("Hibernate ile database e eklendi:\n Kurs Adı:"+course.name+"\nKurs Kategoris:"
                +course.category +"\n Kurs eğitmeni:"+course.instiructor+"\n Kurs Fiyatı:"+course.price);
    }
}
