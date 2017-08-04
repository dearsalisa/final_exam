public class Exam02 {
    private int numberOfOrder = 0;
    public void addOrder() {
        numberOfOrder++;
    }
    public int calculateMoney() {
        return numberOfOrder*100;
    }
}
