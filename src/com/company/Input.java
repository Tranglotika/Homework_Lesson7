package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Input {
    public static void getListLapTrinhVien(ArrayList<LapTrinhVien> listLapTrinhVien) {
        for(LapTrinhVien lapTrinhVien : listLapTrinhVien){
            System.out.println(lapTrinhVien);
        }
    }
    public static void getListKiemChungVien(ArrayList<KiemChungVien> listKiemChungVien){
        for(KiemChungVien kiemChungVien : listKiemChungVien){
            System.out.println(kiemChungVien);
        }
    }

    public static void insertLapTrinhVien(ArrayList<LapTrinhVien>listLapTrinhVien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        String id = sc.nextLine();
        System.out.println("Nhập họ tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập số tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số điện thoại: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        long grossSalary = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số giờ làm thêm: ");
        double overtimeHour = Double.parseDouble(sc.nextLine());
        LapTrinhVien newLapTrinhVien = new LapTrinhVien(id, name, age, phoneNumber, email, grossSalary, overtimeHour);

        System.out.println("Thêm thành công 1 Lập trình viên.\n");
        listLapTrinhVien.add(newLapTrinhVien);
    }

    public static void insertKiemChungVien(ArrayList<KiemChungVien> listKiemChungVien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        String id = sc.nextLine();
        System.out.println("Nhập họ tên nhân viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập số tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số điện thoại: ");
        long phoneNumber = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        long grossSalary = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số lỗi phát hiện được: ");
        int errorsFound = Integer.parseInt(sc.nextLine());
        KiemChungVien newKiemChungVien = new KiemChungVien(id, name, age, phoneNumber, email, grossSalary, errorsFound);

        System.out.println("Thêm thành công 1 Kiểm chứng viên.\n");
        listKiemChungVien.add(newKiemChungVien);
    }
}