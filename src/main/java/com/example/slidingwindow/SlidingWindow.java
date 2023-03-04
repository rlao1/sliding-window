package com.example.slidingwindow;

import java.util.ArrayList;
import java.util.Scanner;

public class SlidingWindow {
    static ArrayList<String> subList = new ArrayList<>();
    public static int CountGoodSubstrings(String s) {
        int endPos = 0;
        int count = 0;
        String substring;

        for(int i = 0; i < s.length(); i++)
        {
            if(endPos > 1) {
                if( s.charAt(endPos)!=s.charAt(endPos-1) &&
                        s.charAt(endPos)!=s.charAt(endPos-2) &&
                        s.charAt(endPos-1)!=s.charAt(endPos-2))
                {
                    subList.add(String.valueOf(s.charAt(endPos-2)) + String.valueOf(s.charAt(endPos-1)) + String.valueOf(s.charAt(endPos)));
                    count++;
                }
            }
            endPos++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("<< A substring of length 3 is Good if there are no repeated characters >>");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scan.nextLine();
        int result = CountGoodSubstrings(input);

        System.out.println(result + " Good substrings found: ");

        for(int i = 0; i < subList.size(); i++) {
            System.out.println("\"" + subList.get(i) + "\"");
        }
    }
}