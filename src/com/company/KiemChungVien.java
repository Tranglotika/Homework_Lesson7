package com.company;

public class KiemChungVien extends NhanVien {
    private int errorsFound;

    public KiemChungVien(String id, String name, int age, long phoneNumber, String email, long grossSalary, int errorsFound) {
        super(id, name, age, phoneNumber, email, grossSalary);
        this.errorsFound = errorsFound;
    }

    public KiemChungVien() {

    }

    public int getErrorsFound() {
        return errorsFound;
    }

    public void setErrorsFound(int errorsFound) {
        this.errorsFound = errorsFound;
    }

    @Override
    public String toString() {
        return super.toString()+ " - " + errorsFound+". Lương = "+(getGrossSalary()+errorsFound*50000);
    }
}
