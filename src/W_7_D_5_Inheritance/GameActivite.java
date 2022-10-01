package W_7_D_5_Inheritance;

public class GameActivite {
    private double score;

    public double getScore() {
        return score;
    }
    public void setScore(double score){
        this.score=score;
    }
    public String getRank(){    //rank rütbe
        String rank;
        if (score>=800){
            rank="veteran";

        } else if (score>=500) {
            rank="advanced";

        } else if (score>=300) {
            rank="undead";
        }else {
            rank="beginner";
        }
        return rank;
    }
}
