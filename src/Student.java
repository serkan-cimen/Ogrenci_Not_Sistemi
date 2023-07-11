public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarege;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.avarege = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int fizik, int kimya, int noteSoz1, int noteSoz2, int noteSoz3) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (noteSoz1 >= 0 && noteSoz1 <= 100) {
            this.mat.noteSoz = noteSoz1;
        }

        if (noteSoz2 >= 0 && noteSoz2 <= 100) {
            this.fizik.noteSoz = noteSoz2;
        }

        if (noteSoz3 >= 0 && noteSoz3 <= 100) {
            this.kimya.noteSoz = noteSoz3;
        }
    }

    public void isPass() {
        System.out.println("==================");
        this.avarege = ((this.mat.note * 0.8 + this.mat.noteSoz * 0.2) + (this.fizik.note * 0.8 + this.fizik.noteSoz * 0.2) + (this.kimya.note * 0.8 + this.kimya.noteSoz * 0.2)) / 3.0;
        if (this.avarege >= 55) {
            System.out.println("Sınıfı geçtiniz.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız.");
            this.isPass = false;
        }
        printNote();
    }

     public void printNote() {
         System.out.println(this.mat.name + "Sınav Notu\t: " + this.mat.note + "\n Sözlü Notu : " + this.mat.noteSoz);
         System.out.println(this.fizik.name + "Sınav Notu\t: " + this.fizik.note + "\n Sözlü Notu : " + this.fizik.noteSoz);
         System.out.println(this.kimya.name + "Sınav Notu\t: " + this.kimya.note + "\n Sözlü Notu : " + this.kimya.noteSoz);
         System.out.println("Not Ortalamanız : " + this.avarege);
    }
}
