package org.example;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (!s.equals("quit")) {
            s = scanner.nextLine();
            stack.push(s);
        }
        while (!stack.isEmpty())
        {             System.out.println("stack element: " + stack.pop());
        }
    }
}

