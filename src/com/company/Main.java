package com.company;

import java.util.Arrays;
import java.util.Scanner;

// Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd
// number of characters then it should replace the missing second character of the final pair with an
// underscore ('_').  for e.g.
//   StringSplit.solution("abc") // should return {"ab", "c_"}
//   StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}


public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();
//        String str = "Geekforfoolpi";
//        System.out.println("String : " + str);
        String[] array=str.split("(?<=\\G.{2})");
        System.out.println(Arrays.toString(array).replace("[", "").replace("]", ""));
        String ss = Arrays.toString(array);

        if (ss.length() % 2 != 0)
        {
            StringBuilder str1 = new StringBuilder(ss);
            char[] cArr = new char[]{'_'};
            str1.append(cArr);
            System.out.println("After append = " + str1.toString().replace("[", "").replace("]", ""));
        }
    }
}
