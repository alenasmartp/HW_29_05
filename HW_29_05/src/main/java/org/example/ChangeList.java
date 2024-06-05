package org.example;

import java.util.*;

public class ChangeList {
    public static void main(String[] args) {
        System.out.println(         changeList(
                List.of(10, 20, 30, 40, 50), 4
        )
        );

    }
    public static Collection<Integer> changeList(Collection<Integer> l, int k) {
        Queue<Integer> q = new LinkedList<>(l);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < l.size(); i++) {
            s.push(q.poll());
        }
        while (!s.isEmpty())
        {
            q.add(s.pop());
        }
        for (int i = 0; i < l.size() - k; i++) {
            q.add(q.poll());
        }
        return q; }
}
