public class Exam01 {
    public long max_number(long input) {
        if(input <= 9) return input;
        else {
            String numberStr = Long.toString(input);
            String firstTwoDigits = findMaxNumber(input);
            for (int i = 0; i <numberStr.length()-2 ; i++) {
                firstTwoDigits+="9";
            }
            return Long.parseLong(firstTwoDigits);
        }
    }

    public String findMaxNumber(long number) {
        int firstDigit = Integer.parseInt(Long.toString(number).substring(0, 1));
        int secondDigit = Integer.parseInt(Long.toString(number).substring(1, 2));
        int result = (firstDigit*10)+secondDigit;

        while (result > 9) {
            result--;
            if(result <= 9) return Integer.toString(result);
            if(check(result)) return Integer.toString(result);
        }
        System.out.println("eiei = "+result);
        return Integer.toString(result);
    }

    public boolean check(int number) {
        boolean result = true;
        String numberStr = Integer.toString(number);
        for (int i = 0; i < numberStr.length()-1 ; i++) {
            if(Character.getNumericValue(numberStr.charAt(i)) > Character.getNumericValue(numberStr.charAt(i+1))) result=false;
        }
        return result;
    }
}
