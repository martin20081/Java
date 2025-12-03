package programmingAdvANCED_011;

public class demo {


    public static void main(String[] args) {

        // varaAgs  - only 1  in the parameters
        // u declare  it by saying ' String , int  - String... names
        //varArgs always has to be last

        printNames("martin");
        printNames();
    }

    public static void printNames(String... names){

        System.out.println(names.length);
        System.out.println(names[1]);

    }
}
