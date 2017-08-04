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

    public int priceOfDiffOrder(int numOfDiffOder) {
        switch (numOfDiffOder) {
            case 1:  return 100;
            case 2:  return 190;
            case 3:  return 270;
            case 4:  return 320;
            case 5:  return 375;
            default: return 0;
        }
    }

    public int calculateMoney() {
        int total=priceOfDiffOrder(checkDiffOrder());
        total+=100*(sumOrder-checkDiffOrder());
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
