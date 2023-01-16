package chapterEight.hugeInteger;

    public class HugeInteger {
        private int[] digitArray = new int[40];
        private int digitLength;

        public void parse(String number){
            digitLength = number.length();
            for(int i = 0; i < digitLength; i++){
                String character = Character.toString(number.charAt(i));
                digitArray[i] = Integer.parseInt(character);
            }
        }

        public boolean isEqualTo(int num1, int num2){
            boolean check = false;
            if(num1 == num2){
                check = true;
            }
            return check;
        }

        public boolean isNotEqualTo(int num1, int num2){
            boolean check = false;
            if(num1 != num2){
                check = true;
            }
            return check;
        }

        public boolean isGreaterThan(int num1, int num2){
            boolean check = false;
            if(num1 > num2){
                check = true;
            }
            return check;
        }

        public boolean isLessThan(int num1, int num2){
            boolean check = false;
            if(num1 < num2){
                check = true;
            }
            return check;

        }

        public boolean isGreaterThanOrEqualTo(int num1, int num2){
            boolean check = false;
            if(num1 >= num2){
                check = true;
            }
            return check;

        }

        public boolean isLessThanOrEqualTo(int num1, int num2){
            boolean check = false;
            if(num1 <= num2){
                check = true;
            }
            return check;
        }

        public boolean isZero(int number){
            boolean check = false;
            if(number == 0){
                check = true;
            }
            return check;
        }

        public String toString(int number){
            return Integer.toString(number);
        }

        public String toString(){
            String number = "";
            for(int i = 0; i < digitLength; i++) {
                number += Integer.toString(digitArray[i]);
            }
            return number;
        }

        public int add(int num1, int num2){
            return num1 + num2;
        }

        public int subtract(int num1, int num2){
            return num1 - num2;
        }

        public int[] getDigitArray() {
            return digitArray;
        }

        public void setNumber(int intNumber){
            String number = Integer.toString(intNumber);
            digitLength = number.length();
            for(int i = 0; i < digitLength; i++){
                String character = Character.toString(number.charAt(i));
                digitArray[i] = Integer.parseInt(character);
            }
        }

        public int getNumber(){
            String number = "";
            for(int i = 0; i < digitLength; i++) {
                number += Integer.toString(digitArray[i]);
            }
            return Integer.parseInt(number);

        }
    }
