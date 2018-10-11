public class TennisGame {

    public static String getScore(String playerOne, String playerTwo, int scoreOne, int scoreTwo) {
        String score = "";
        int tempScore = 0;
        if (isaBoolean(scoreOne, scoreTwo)) {
            score = getString(scoreOne);
        } else if (isaBoolean((int) scoreOne) || isaBoolean((int) scoreTwo)) {
            int minusResult = scoreOne - scoreTwo;
            if (isaBoolean(minusResult, 1)) score = "Advantage player1";
            else if (isaBoolean(minusResult, -1)) score = "Advantage player2";
            else if (TennisGame.isaBoolean(minusResult, 2)) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (isaBoolean(i, 1)) tempScore = scoreOne;
                else {
                    score += "-";
                    tempScore = scoreTwo;
                }
                score = getString(score, tempScore);
            }
        }
        return score;
    }

    private static boolean isaBoolean(int minusResult, int i) {
        return minusResult >= i;
    }

    private static String getString(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String getString(int m_score1) {
        String score;
        switch (m_score1) {
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

    private static boolean isaBoolean(int m_score1, int m_score2) {
        return m_score1 == m_score2;
    }

    private static boolean isaBoolean(int m_score) {
        return isaBoolean(m_score, 4);
    }
}