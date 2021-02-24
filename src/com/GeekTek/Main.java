package com.GeekTek;

public class Main {

    public static void main(String[] args) {
        goWalk(40, -20);
        String name;
    }

    public static String goWalk(int age, int temperatura) {
        if ((age > 20 && age < 45) && (temperatura > -20 && temperatura < 30)) {
            return "можно идти гулять";
        } else if (age < 20 && (temperatura > 0 && temperatura < 28)) {
            return "можно идти гулять";
        } else if (age > 45) {
            return "можно идти гулять";
        }else {
            return "net ne id gulyat";
        }
    }

}

