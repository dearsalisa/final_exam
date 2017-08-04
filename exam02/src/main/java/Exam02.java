public class Exam02 {
    private int[] orderList = {0, 0, 0, 0, 0};
    private int sumOrder = 0;

    public void addOrder(char input) {
        sumOrder++;
        switch (input) {
            case 'A':  orderList[0]++;
                break;
            case 'B':  orderList[1]++;
                break;
            case 'C':  orderList[2]++;
                break;
            case 'D':  orderList[3]++;
                break;
            case 'E':  orderList[4]++;
                break;
        }
    }
    public int calculateMoney() {
        int total=sumOrder*100;
        if(checkDiffOrder()==2) total*=0.95;
        return total;
    }

    public int checkDiffOrder() {
        int count=0;
        for (int i = 0; i <5 ; i++) {
            if(orderList[i]>0) count++;
        }
        return count;
    }
}
