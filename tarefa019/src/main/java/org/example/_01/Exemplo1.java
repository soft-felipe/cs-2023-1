package org.example._01;
//https://codegym.cc/groups/posts/196-how-refactoring-works-in-java
public class Exemplo1 {
    public boolean max(int a, int b) {
        if(a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }

    public boolean maxRefactored(int a, int b) {
        return a > b;
    }
}
