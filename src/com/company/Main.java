
// Team Member Name: Elnaz ramezani
//  Class: COMP282
// Assignment: Project 3

package com.company;

public class Main {
    public Main(String arg) {
    }

    public static void main(String [] args){
        int graph[][]= new int[26][26];
        char a = (char)102;
        int b = Character.getNumericValue(a);
        System.out.print(b);
         graph mygraph = new graph(args[0]);
        mygraph.shortestPath(args[1].charAt(0));
    }

}