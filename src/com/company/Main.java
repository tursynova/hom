package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        House house[]=new House[5];
        house[0]=new House(1,"29","85","5","2","Abai","JK","5");
        house[1]=new House(1,"25","98","2","3","Talausizdik","JK","4");
        house[2]=new House(1,"37","105","7","2","Mangilik","JK","3");
        house[3]=new House(1,"45","65","8","1","Puchkina","JK","6");
        house[4]=new House(1,"77","77","7","5","Kabanbay","JK","7");
        System.out.println("a) Komnata sani");
        String komt=sc.nextLine();
        for (int i = 0; i <5 ; i++) {
            if(house[i].getRooms().equalsIgnoreCase(komt)){
                System.out.println(house[i].toString());
            }
        }
        System.out.println("a) Olchemi");
        String pocht=sc.nextLine();
        for (int i = 0; i <5 ; i++) {
            if(house[i].getSquare().equalsIgnoreCase(pocht)){
                System.out.println(house[i].toString());
            }
        }
        System.out.println("a) Floor ?");
        String floor=sc.nextLine();
        for (int i = 0; i <5 ; i++) {
            if(house[i].getFloor().equalsIgnoreCase(floor)){
                System.out.println(house[i].toString());
            }
        }
    }
}
