package chapter14.paragonString;

public class exampleOne {
    public static void main(String[] args) {
        String name = new String();

//        byte[] bytes = {(byte) 65, (byte)66, (byte)67, (byte)68};
        byte item1 = Byte.parseByte("65");
        byte item2 = Byte.parseByte("66");
        byte item3 = Byte.parseByte("67");

        byte[] myByteArray = {item1, item2, item3};
        String myname = new String(myByteArray, 0, 3);
        System.out.println("str:: "+ myname);

        System.out.println(myname.length()==3);

        char[] charArray = {'A', 'b', 'c', 'd'};
        String mySchoolName = new String(charArray);
        System.out.println(mySchoolName);

        String secondName = new String("Martha");
        System.out.println(secondName);
        System.out.println(secondName.charAt(2));
    }
}
