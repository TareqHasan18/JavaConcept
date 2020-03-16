package OOPConcept;

public class WrapperClassConcept {


    public static void main(String[] args) {

        String s = "120";
        System.out.println(s+30);

        //data conversion from String to int
        int i = Integer.parseInt(s);
        System.out.println(i + 30);

        //String to double conversion
        String t = "49.99";
        double d = Double.parseDouble(t);
        System.out.println(d + 10);

        //String to boolean
        String x = "true";
        boolean b = Boolean.parseBoolean(x);
        System.out.println(b);

        //int to String conversion
        int j = 200;
        System.out.println(j + 20);

        String k = String.valueOf(j);  //"200"
        System.out.println(k + 20);  //this will print 20020


        //String u = "200d";
        //int n = Integer.parseInt(u); //This will throw NumberFormatException for input string : "200d"
        //System.out.println(n);

    }
}
