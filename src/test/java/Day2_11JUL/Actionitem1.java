package Day2_11JUL;

public class Actionitem1 {


    public static void main(String[] args) {



        String[] zipcode, streetnumber;
        zipcode = new String[6];
        zipcode[0] = "11423";
        zipcode[1] = "10011";
        zipcode[2] = "20023";
        zipcode[3] = "11315";
        zipcode[4] = "11961";
        zipcode[5] = "11693";

        streetnumber= new String[6];
        streetnumber[0] = "77th road";
        streetnumber[1] = "69th street";
        streetnumber[2] = "42nd Street";
        streetnumber[3] = "Jamaica Ave";
        streetnumber[4] = "Steinway Street";
        streetnumber[5] = "81st avenue";

        for(int i= 0; i<zipcode.length; i++) {

            System.out.println("my zipcode is " + zipcode[i] + " and my street number is " + streetnumber[i]);
//getting the length of the variable


        }


    } // end of class






}//end of program
