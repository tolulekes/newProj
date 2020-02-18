package com.db;
import java.sql.*;
import java.util.Scanner;


public class connectToDb {

    public static void main(String[] args) {
        Scanner aise = new Scanner(System.in);
        Scanner aise1 = new Scanner(System.in);
        Scanner aise2 = new Scanner(System.in);
        Scanner aise3 = new Scanner(System.in);
        Scanner aiso = new Scanner(System.in);
        insertDB ais = new insertDB();
        insertDB ais1 = new insertDB();
        selectDB ai = new selectDB();
        removeDB del = new removeDB();
        updateDB upDate = new updateDB();

        System.out.println("1---Connect With Database \n2---Input Data into Database\n3---Read Data from Database\n" +
                "4---Delete Data from Database\n5---Update Password in Database");

        int opt = 0;
        opt = aise.nextInt();
        switch (opt){
            case 1:
                ais.Connect();
                System.out.println("Connected Sucessfully");
                break;
            case 2:
                System.out.println("How many times are you inputing?");
                int num = 0;
                num = aise3.nextInt();

                String name;
                String pass;
                for (int i = 0; i < num; i++) {
                    System.out.print("Name: ");
                    name = aise1.nextLine();
                    System.out.print("Password: ");
                    pass = aise2.nextLine();
                    ais1.insertDB(name, pass);
                }
                System.out.println("Inserted Successfully");
                break;

            case 3:
                ai.readDataDB();
                break;

            case 4:
                int id = 0;
                System.out.print("Which row would you be deleting? ");
                id = aiso.nextInt();
                del.deleteDB(id);
                System.out.println("Row " + id + " has been deleted");
                break;

            case 5:
                String pWord;
                String uName;
                System.out.print("What is your User Name: ");
                uName = aiso.nextLine();
                System.out.println("New Password: ");
                pWord = aiso.nextLine();
                upDate.updateDB(pWord, uName);
                System.out.println("Password for " + uName + " has been changed successfully");


        }


    }
}
