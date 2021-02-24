package com.GeekTek;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int age = generateRandomAge();
        System.out.println(goWalk(age, -20));
        System.out.println(goWalk(age, 17));
        System.out.println(goWalk(age, -38));
        System.out.println(goWalk(age, 15));
        System.out.println(goWalk(age, 30));


    }

    private static int generateRandomAge() {
        Random random = new Random();
        int num = random.nextInt(80)+1;
        return num;
    }

    public static String goWalk(int age, int temperatura) {
        if ((age > 20 && age < 45) && (temperatura > -20 && temperatura < 30)) {
            return "можно идти гулять";
        } else if (age < 20 && (temperatura > 0 && temperatura < 28)) {
            return "можно идти гулять";
        } else if (age > 45 && (temperatura>-10 && temperatura<25)) {
            return "можно идти гулять";
        }else {
            return "оставайтесь дома";
        }
    }

}

