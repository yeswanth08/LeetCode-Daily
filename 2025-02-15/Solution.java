import java.util.*;

class Solution{
    public static ArrayList<String> arr;
    public static void getallpossiblepartitions(String one){

    }
    public static void main(String[] args){
        String one = "12345";
        getallpossiblepartitions(one);
        for (String i: arr) System.out.println(i);
    }
}

/**
 * permutations => all possible arrangements of the given string or array
 * 
 * partitions => all possbile partitions of the given stirng or array
 */

/***
 * steps to solve recursion
 * 
 * first imagine that recursion as a tree
 * 
 * aim for generating all possible branches from that tree by partitioning
 * 
 */