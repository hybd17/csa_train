package csa_03;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try{
            if(n>=0 && n<=100)
                System.out.println(n);
            else
                throw new ScoreException("分数要在0-100之间");
        }catch (ScoreException e){
            System.out.println(e.getMessage());
        }
    }
}
