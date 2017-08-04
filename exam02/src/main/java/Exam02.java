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
        if(checkDiffOrder()==2) {
            total-=200*0.05;
        }
        if(checkDiffOrder()==3) {
            total-=300*0.1;
        }
        if(checkDiffOrder()==4) {
            total-=400*0.2;
        }
        if(checkDiffOrder()==5) {
            total-=500*0.25;
        }
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
