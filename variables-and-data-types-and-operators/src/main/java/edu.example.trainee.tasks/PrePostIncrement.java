package edu.example.trainee.tasks;

public class PrePostIncrement {
    public static void main(String[] args) {

        int i =10;
        i++;

        System.out.println(i);    //Pref в строке 6 (11)
        ++i;
        System.out.println(i);    //Pref в строке 9 (12)
        System.out.println(++i);  //Pref в строке 10 (10)
        System.out.println(i++);  // тут Post из- за этого значение не меняется
        System.out.println(i);    //Post в строке 12 (14)
    }
}
