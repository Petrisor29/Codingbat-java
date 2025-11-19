package string1;

/**
 * CodingBat - String-1: makeAbba
 *
 * Given two strings a and b,
 * return the result of putting them together as a+b+b+a.
 */
public class MakeAbba {

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {
        MakeAbba ma = new MakeAbba();

        System.out.println(ma.makeAbba("Hi", "Bye"));   // HiByeByeHi
        System.out.println(ma.makeAbba("Yo", "Alice")); // YoAliceAliceYo
        System.out.println(ma.makeAbba("What", "Up"));  // WhatUpUpWhat
        System.out.println(ma.makeAbba("a", "b"));      // abba
    }
}
