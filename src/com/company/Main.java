package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<LapTrinhVien> listLapTrinhVien = new ArrayList<>();
        ArrayList<KiemChungVien> listKiemChungVien = new ArrayList<>();

        Input input = new Input();
        Scanner sc = new Scanner(System.in);

        boolean isContinue = false;
        while (!isContinue) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    input.insertLapTrinhVien(listLapTrinhVien);
                    break;
                case 2:
                    input.insertKiemChungVien(listKiemChungVien);
                    break;
                case 3:
                    System.out.println("Danh sách các nhân viên Lập trình viên là: ");
                    Input.getListLapTrinhVien(listLapTrinhVien);
                    System.out.println("Danh sách các nhân viên Kiểm chứng viên là: ");
                    Input.getListKiemChungVien(listKiemChungVien);
                    break;
                case 0:
                    isContinue = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Thêm thông tin Lập trình viên");
        System.out.println("2 - Thêm thông tin Kiểm chứng viên");
        System.out.println("3 - Hiển thi danh sách các nhân viên ra màn hình");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
