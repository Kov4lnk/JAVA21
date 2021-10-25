package com.java21days;

public class ZipCode {
    private String zipcode = "";

    public ZipCode(String zipcode) {
        setZipcode(zipcode);
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = ((zipcode.length() == 5) | (zipcode.length() == 9)) ?
                zipcode :
                "PZDC!";
/*        if ((zipcode.length() == 5) | (zipcode.length() == 9)){
            this.zipcode = zipcode;
        }*/
    }

    public static void main(String[] args) {
        ZipCode zip = new ZipCode("12345");
        ZipCode zip2 = new ZipCode("123456789");
        System.out.println(zip.getZipcode());
        System.out.println(zip2.getZipcode());
/*        if (!zip.getZipcode().equals("")) {
            System.out.println("Zip1 : " + zip.getZipcode());
        }
        if (!zip2.getZipcode().equals("")){
            System.out.println("Zip2: " + zip2.getZipcode());
        }*/
    }
}
