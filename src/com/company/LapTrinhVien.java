package com.company;

public class LapTrinhVien extends NhanVien {
    private double overtimeHour;

    public LapTrinhVien(String id, String name, int age, long phoneNumber, String email, long grossSalary, double overtimeHour) {
        super(id, name, age, phoneNumber, email, grossSalary);
        this.overtimeHour = overtimeHour;
    }

    public LapTrinhVien() {
        super();
    }

    public double getOvertimeHour() {
        return overtimeHour;
    }

    public void setOvertimeHour(double overtimeHour) {
        this.overtimeHour = overtimeHour;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + overtimeHour+". Lương = "+(getGrossSalary()+overtimeHour*200000);
    }
}
