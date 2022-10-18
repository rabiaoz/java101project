package giris.OBS;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    double quizRatio;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;

    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }
    }

    void printTeacherInfo (){
        this.teacher.print();
    }

    void quiz (){
        if (this.prefix.equals("TRH")){
             this.quizRatio =0.2;
        }
        else if (this.prefix.equals("FZK")){
            this.quizRatio = 0.3;
        }
        else if (this.prefix.equals("BIO")){
            this.quizRatio = 0.4;
        }
    }

}
