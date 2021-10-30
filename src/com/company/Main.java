package com.company;

public class Main {

    public static void main(String[] args) {
	int x;

    String name = "Micah";
    String username = createUsername(name);
    System.out.println(username);
    }

    static String createUsername(String name) {
        for (int i =0; i<3;i++){
            name+= (int)(Math.random()*10);
        }
        return (name);
    }
}
