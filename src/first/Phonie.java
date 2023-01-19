package first;

public class Phonie {


    public static boolean checkMtn(String number){
        String[] mtnNumbers = {"0803", "0816", "0903", "0810", "0806",
        "0703", "0706", "0813", "0814", "0906"};
        for (String mtnNumber : mtnNumbers) {
            if (number.equals(mtnNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkAirtel(String number) {
        String[] airtelNumbers = {"0808", "0812", "0907", "0708", "0802",
                "0902", "0701"};
        for (String airtelNumber : airtelNumbers) {
            if (number.equals(airtelNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkGlo(String number) {
        String[] gloNumbers = {"0805", "0905", "0807", "0811", "0705",
                "0815"};
        for (String gloNumber : gloNumbers) {
            if (number.equals(gloNumber)) {
                return true;
            }
        }
        return false;
    }

    public static boolean check9mobile(String number) {
        String[] etisalatNumbers = {"0809", "0909", "0908", "0818", "0817"};
        for (String etisalatNumber : etisalatNumbers) {
            if (number.equals(etisalatNumber)) {
                return true;
            }
        }
        return false;
    }
    public String ifContainAlphabet(String number)  {
        char[] alphabets = {'a', 'A', 'b', 'B', 'c', 'C', 'd', 'D', 'e', 'E', 'c', 'C', 'f', 'F', 'g', 'G', 'h',
                'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S',
                't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'z', 'Z'};

        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < alphabets.length; j++) {
                if (number.charAt(i) == alphabets[j]) {
                    return "  you have entered a Mobile number that contain an alphabet ";
                }
            }
        }
        return number;
    }

    public static String checkFirstFourDigits(String number) {
        String cutNumber = "";
        if(number.length()== 11){
            for (int i = 0; i < 4; i++) {
            cutNumber += number.charAt(i)  ;
            }
            return cutNumber;
        }
    return "invalid number";
    }
}
