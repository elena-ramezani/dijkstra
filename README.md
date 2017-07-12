# dijkstraYou may work in teams of two or fewer.

Create a java class named Graph:

class Graph
{
     public static void main(String [] args)
     {
         Graph mygraph = new Graph(args[0]);
         mygraph.shortestPath(args[1].get(0));
     }
}

The main method will create a new graph from the file passed as arg[0].

The file will contain information format as:

ag 37
fu 457
af 784
bc 845
bf 34
ga 789


The individual letters are the names of a cities/nodes in the graph (There can be at most 26, one for each letter of the alphabet). The integer number following a pair of letter represents an undirected edge between two cities with a weight equal to the value of the integer. Edges will be strictly positive integers greater than zero.

The shortestPath method takes a single letter to consider as the starting city and produces the following output for example:

a origin
b 45 agb
c 345 afhc
d 76 ad

Each line will represent the letter of city, the length of the shortest path from the origin to that destination city and the list of letters will be the shortest path from the origin to the listed city.

