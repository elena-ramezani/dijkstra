
// Team Member Name: Elnaz ramezani

//  Class: COMP282
// Assignment: Project 3

package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class graph {
    static String file;
    int v = 26;
    int[][] graph;

    public graph(String info) {
        //file = "info.csv";
        file = info;        //passing through arg 0 to the file
        graph = new int[26][26];        //initializes the matrix (nodes) to 0
        for (int i = 0; i <= 25; i++) {
            for (int j = 0; j <= 25; j++) {
                graph[i][j] = 0;
            }
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));   //reads file.
            String arg;

            while ((arg = br.readLine()) != null) {     //
                char v1 = arg.charAt(0);
                char v2 = arg.charAt(1);
                int weight_v1_v2 = Integer.parseInt(arg.substring(3, arg.length()));

                graph[(int) v1 - (int) 'a'][(int) v2 - (int) 'a'] = weight_v1_v2; //Whenever there is
                graph[(int) v2 - (int) 'a'][(int) v1 - (int) 'a'] = weight_v1_v2; //an adjacency, the value is stored

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(" ");

        }

    }

    public int minDistance(int[] distance, boolean[] short_past) {//the minimum distance is found

        int min = Integer.MIN_VALUE, min_index = -1;
        for (v = 0; v < v; v++) {
            if (distance[v] <= min && short_past[v] == false) {  //checks entire array to find the least cost
                min = distance[v];
                min_index = v;
            }
        }
        return min_index;   //returns minimum
    }


    public void shortestPath(char start) {
        boolean[] short_past = new boolean[v];
        int[] distance = new int[v];

        for (v = 0; v < v; v++) {
            distance[v] = Integer.MAX_VALUE; //The entire matrix is set to the max value instead of infinity
            short_past[v] = false;  //if false, that means it has not been visited
        }

        distance[0] = 0; //starting point is initialized as 0

        for (int row = 0; row < v; row++) {
            int min_index = minDistance(distance, short_past); //calls min value function
            short_past[row] = true; //means the node has been visited

            for (int colum = 0; colum < v; colum++) {
                if (!short_past[row] && graph[min_index][colum] != 0 && //if path isnt visited and graph isnt zero
                        distance[min_index] != Integer.MAX_VALUE && //it means that the distance marked isnt infinity
                        distance[min_index] + graph[min_index][colum] < distance[colum]) {//if min distance found is less
                    distance[colum] = distance[min_index] + graph[row][colum]; //than the one found before

                }

            }

        }
        printSolution( distance,v);

    }

    void printSolution(int dist[], int n) {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < v; i++)
            System.out.println(i + " tt " + dist[i]);

    }

}











