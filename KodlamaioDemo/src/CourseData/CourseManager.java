package CourseData;

import DataAccsess.AlternatifDao;

public class CourseManager {
    private AlternatifDao alternatifDao;

    public CourseManager(AlternatifDao alternatifDao){
        this.alternatifDao=alternatifDao;
    }

    public void add(Course course){
        String name1="Veri tabanından çekilen diğer kurs isimler";
        String category1="Veri tabanından çekilen diğer kategori isimleri";
        int bug=0; //döngü atmaktan ise değişken kullanmak bu etapta daha mantıklı
        if(course.name.equals(name1)){
            System.out.println("Bu kurs adında zaten bi kurs var");
            bug++;

        }
        if (course.category.equals(category1)) {
            System.out.println("Bu kategori adı altında zaten kurs var");
            bug++;
        }
        if(course.price<0){
            System.out.println("Kurs fiaytı sıfır ın altında olamaz");
            bug++;
        }
        if(bug==0){
            alternatifDao.databaseAdd(course);
        }


    }
}
