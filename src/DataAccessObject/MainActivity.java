package DataAccessObject;

import java.util.Scanner;


public class MainActivity {

    public static void main(String[] args) {

        StudentDao studentdao = new StudentDaoImpl();
        Scanner input = new Scanner(System.in);
        StudentDao studentDao = new StudentDaoImpl();

        for (int looping = 0; looping < 10; looping++) {


            System.out.println("1. Lihat Semua Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Ubah Data");
            System.out.println("Masukkan pilihan = ");
            int pilihan = input.nextInt();

            switch (pilihan) {

                case 1://ViewAll Data

                    System.out.println("Jika Data Kosong, Silahkan isi terlebih dahulu");

                    for (Student student : studentdao.getAllStudents()) {
                        System.out.println("Student: [RollNo : "
                                + student.getRollNo() + ", Name : " + student.getName() + " ]");
                    }
                    break;

                case 2://Input Data

                    String nama = "";

                    System.out.println("Masukkan data : ");
                    nama = input.next();

                    for (int i = 0; i < 1; i++) {
                        studentdao.addStudent(new Student(nama, looping));
                    }
                    break;

                case 3://Delete Data
                    System.out.println("Masukkan data yang ingin dihapus : ");
                    String v = input.next();
                    System.out.println("Masukkan Roll number yang ingin dihapus");
                    int del = input.nextInt();

                    studentdao.deleteStudent(new Student(v, del));
                    break;

                case 4://Update Data
                    System.out.println("Ubah datanya");
                    System.out.println("Input Roll num yang akan di ubah :  ");
                    int b = input.nextInt();

                    System.out.println("Masukkan perubahan disini :  ");
                    String c = input.next();

                    studentdao.updateStudent(new Student(c, b));
                    break;
            }

        }
    }
}
