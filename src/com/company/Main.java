package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{
        /*BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Double num1;
        Double num2;
        String op;*/
        try {
            while (true) {
                System.out.println();
                System.out.println("Please provide input in format 'OP' 'NUM1' 'NUM2' ");
                Double res = calculate();
                System.out.println(res);
            }
        }
        catch (Exception e){
            System.out.println("Please provide a valid input");
        }
    }

    private static Double calculate() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().split(" ");
        String op = input[0];
        Double num1 = Double.parseDouble(input[1]);
        Double num2 = Double.parseDouble(input[2]);
        Double result = 0.0;
        switch (op) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = (num1 - num2);
                break;
            case "mul":
                result = (num1 * num2);
                break;
            case "div":
                result = num2 != 0.0 ? num1 / num2 : Double.POSITIVE_INFINITY;
                break;
        }
        return result;
    }
}
