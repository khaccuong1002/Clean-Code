package com.codegym;

public class TennisGame {
    public static String getScore(String player1, String player2, int score1, int score2){
        String score = "";
        int tempScore = 0;
        if (score1==score2){
            switch (score1){
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        }
        else if (isaBoolean(score1, score2)){
            int minusResult = score1-score2;
            boolean b = minusResult == 1;
            if (b) score="Advantage player1";
            else {
                boolean c = isC(minusResult);
                if (c) score ="Advantage player2";
                else {
                    boolean d = isD(minusResult);
                    if (d) score = "Win for player1";
                    else score ="Win for player2";
                }
            }
        }
        else {
            for (int i=1; i<3; i++){
                if (i==1) tempScore = score1;
                else { score+="-"; tempScore = score2;}
                switch (tempScore){
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score +="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static boolean isD(int minusResult) {
        return minusResult >= 2;
    }

    private static boolean isC(int minusResult) {
        return minusResult == -1;
    }

    private static boolean isaBoolean(int score1, int score2) {
        return score1 >= 4 || score2 >= 4;
    }
}
