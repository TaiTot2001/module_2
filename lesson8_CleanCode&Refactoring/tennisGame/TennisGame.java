package tennisGame;

public class TennisGame {

    public static final String SUBTRACTION = "-";

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1Score == player2Score) {
            score = new StringBuilder(getEqualScore(player1Score));
        } else {
            int scoreBy4 = 4;
            if (player1Score >= scoreBy4 || player2Score >= scoreBy4) {
                score = new StringBuilder(getAdvantagePlayer(player1Score, player2Score));
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) tempScore = player1Score;
                    else {
                        score.append(SUBTRACTION);
                        tempScore = player2Score;
                    }
                    switch (tempScore) {
                        case 0:
                            score.append("Love");
                            break;
                        case 1:
                            score.append("Fifteen");
                            break;
                        case 2:
                            score.append("Thirty");
                            break;
                        case 3:
                            score.append("Forty");
                            break;
                    }
                }
            }
        }
        return score.toString();
    }

    private static String getAdvantagePlayer(int player1Score, int player2Score) {
        String score;
        int difference = player1Score - player2Score;
        if (difference == 1) score = "Advantage player1";
        else if (difference == -1) score = "Advantage player2";
        else if (difference >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getEqualScore(int player1Score) {
        String score;
        switch (player1Score) {
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
}
