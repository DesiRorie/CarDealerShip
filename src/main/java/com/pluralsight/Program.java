package com.pluralsight;

public class Program {
    public static void main(String[] args) {
Dealership dealership = new Dealership("D & D" , "add", "123");
        DealershipFileManager dealershipFileManager = new DealershipFileManager();


        dealershipFileManager.getDealerShip(dealership);
        System.out.println(dealership.toString());






    }
}
