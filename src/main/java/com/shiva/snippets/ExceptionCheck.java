package com.shiva.snippets;

public class ExceptionCheck {
    public static void main(String[] args) {
        try {
            System.out.println("inside try");
            int j = 10 / 0;
            System.exit(1);
        } catch (ArithmeticException aex) {
            System.out.println("Inside Arithmetic");
            System.exit(1);
        } catch (Exception ex) {
            System.out.println("Inside exception");
            System.exit(1);
        } finally {
            System.out.println("Inside finally");
        }
    }
}
