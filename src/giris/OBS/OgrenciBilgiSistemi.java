package giris.OBS;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali Demir","TRH","55511");
        Teacher t2 = new Teacher("alexander", "FZK", "55335");
        Teacher t3 = new Teacher ("Rabia H", "BIO", "33344");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "101", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("ali tarık", "123", "4", tarih,fizik,biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("melda ayık", "223", "5",tarih,fizik,biyo);
        s2.addBulkExamNote(50,60,40);
        s2.isPass();

    }
}
