
public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore=0;
        boolean isDeuce = scorePlayer1 == scorePlayer2;
        if (isDeuce)
        {
            showScoreWhenDuece(scorePlayer1,score);
        }
        else {
            boolean player1ReachTo4 = scorePlayer1 >= 4;
            boolean player2ReachTo4 = scorePlayer2 >= 4;
            if (player1ReachTo4 || player2ReachTo4)
            {
                checkWin( scorePlayer1, scorePlayer2,  score);
            }
            else
            {
                checkScore(scorePlayer1,scorePlayer2,score,tempScore);
            }
        }
        return score;
    }
    public static String showScoreWhenDuece(int scorePlayer1, String score) {
        switch (scorePlayer1)
        {
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
        return score;

    }
    public static String checkWin(int scorePlayer1,int scorePlayer2, String score) {
                        int theDifferentScore = scorePlayer1-scorePlayer2;
                boolean advantageToPlayer1 = theDifferentScore == 1;
                if (advantageToPlayer1) score ="Advantage player1";
                else {
                    boolean advantageToPlayer2 = theDifferentScore == -1;
                    if (advantageToPlayer2) score ="Advantage player2";
                    else {
                        boolean winForPlayer1 = theDifferentScore >= 2;
                        if (winForPlayer1) score = "Win for player1";
                        else score ="Win for player2";
                    }
                }
                return score;
    }
    public static String checkScore(int scorePlayer1,int scorePlayer2, String score,int tempScore) {
        for (int i=1; i<3; i++)
        {
            if (i==1) tempScore = scorePlayer1;
            else { score+="-"; tempScore = scorePlayer2;}
            switch(tempScore)
            {
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
                    score+="Forty";
                    break;
            }
        }
        return score;


    }

}
