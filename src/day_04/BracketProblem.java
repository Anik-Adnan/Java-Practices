package day_04;

import java.util.Scanner;

public class BracketProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb= new StringBuilder(String.valueOf(s));

        for(int i=0;i<sb.length();i++){
            switch (sb.charAt(i)){
                case '(':
                case '{':
                case'[':

            }
        }

    }
}
