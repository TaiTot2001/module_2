import java.util.Scanner;

public class readNumbersIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập số cần đọc (nhấn -1 để thoát): ");
                int input = sc.nextInt();
            if(input ==-1){
                System.out.println("Chương trình đã kết thúc !!");
                break;
            }
            String output;
            if (input < 10 && input >= 0) {
                output = firstNaturalNumber(input);
            } else if (input < 20 && input >= 0) {
                int number = input % 10;
                output = twoDigitNumberLessThan20(number);
            } else if (input%10==0 && input < 100&& input >= 0) {
                int number = input / 10;
                output = roundTensGreaterThan20(number);
            }
            else if (input %10 !=0 && input < 100&& input >= 0) {
                int ones = input % 10;
                int twos = input / 10;
                output = roundTensGreaterThan20(twos) +" "+ firstNaturalNumber(ones);
            }
            else if (input <1000 && input >= 0){
                int hundreds = input / 100;
                int remainder = input % 100;
                output = firstNaturalNumber(hundreds) + " hundred";
                if (remainder != 0) {
                    if(remainder<10){
                        output+= " and "+ firstNaturalNumber(remainder);
                    }
                    else if(remainder<20){
                        output+=" and "+ twoDigitNumberLessThan20(remainder%10);
                    }
                    else{
                        int ones = remainder % 10;
                        int twos = remainder / 10;
                        if (ones == 0) {
                            output +=" and "+ roundTensGreaterThan20(twos);
                        } else {
                            output +=" and "+ roundTensGreaterThan20(twos) + " " + firstNaturalNumber(ones);
                        }
                    }
                }
            }
            else{
                System.out.println("Chương trình chỉ chạy với số từ 0 đến 999");
                break;
            }
            System.out.println("Số " + input + " đọc là: " + output+"\n");

        }
    }

    private static String roundTensGreaterThan20(int number) {
        String output = "";
        switch (number) {
            case 2:
                output = "Twenty";
                break;
            case 3:
                output = "Thirty";
                break;
            case 4:
                output = "Forty";
                break;
            case 5:
                output = "Fifty";
                break;
            case 6:
                output = "Sixty";
                break;
            case 7:
                output = "Seventy";
                break;
            case 8:
                output = "Eighty";
                break;
            case 9:
                output = "Ninety";
                break;
        }
        return output;
    }

    private static String twoDigitNumberLessThan20(int number) {
        String output = "";
        switch (number) {
            case 0:
                output = "Ten";
                break;
            case 1:
                output = "Eleven";
                break;
            case 2:
                output = "Twelve";
                break;
            case 3:
                output = "Thirteen";
                break;
            case 4:
                output = "Fourteen";
                break;
            case 5:
                output = "Fifteen";
                break;
            case 6:
                output = "Sixteen";
                break;
            case 7:
                output = "Seventeen";
                break;
            case 8:
                output = "Eighteen";
                break;
            case 9:
                output = "Nineteen";
                break;
        }
        return output;
    }

    private static String firstNaturalNumber(int input) {
        String output = "";
        switch (input) {
            case 0:
                output = "Zero";
                break;
            case 1:
                output = "One";
                break;
            case 2:
                output = "Two";
                break;
            case 3:
                output = "Three";
                break;
            case 4:
                output = "Four";
                break;
            case 5:
                output = "Five";
                break;
            case 6:
                output = "Six";
                break;
            case 7:
                output = "Seven";
                break;
            case 8:
                output = "Eight";
                break;
            case 9:
                output = "Nine";
                break;
        }
        return output;
    }
}
