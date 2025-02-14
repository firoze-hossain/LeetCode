package com.leetcode.topInterview150.stack.simplifyPath;

import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        String[] comps = path.split("/");
        Stack<String> stack = new Stack<>();
        for (String com : comps) {
            if (com.equals("") || com.equals(".")) {
                continue;
            }
            if (com.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(com);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));


    }
}
