package com.company;
class shape {

    public int draw(){
        System.out.println("Drawing Shape ");
        return 0;

    }
    public int erase(){
        System.out.println("Erasing shape");
        return 0;
    }

}

public class gulu {
    public static void main(String[] args) {
   shape A = new shape();
        A.draw();
        A.erase();


    }
}
