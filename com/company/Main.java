package com.company;

public class Main {
    public static void main(String[] args) {
    }
    public static int max(int a, int b) {
        if (a < b) {
            return b;
        }
        return a;
    }
    public static int min(int a, int b) {
        if(a<b){
            return a;
        }
        return b;
    }

    public static boolean isPositive(int a){
        if(a>=0){
            return true;
        }
        return false;
    }

}
