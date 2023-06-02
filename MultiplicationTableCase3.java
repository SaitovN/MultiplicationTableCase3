package academy.devonline.java.basic.section01_setup.section05_setup;

public class MultiplicationTableCase3 {
    public static void main(String[] args) {
        var to = 9;
        var cols= 4;
        for (int i = 2; i <=to; i+=cols) {
            for (int j =2; j <=to; j++) {
                for (int k = i; k < i+cols&&k<=to; k++) {

                    System.out.print(k+" * "+j+" = "+(k*j)+"\t");
            }
                System.out.println();
            }
            System.out.println();
            }

    }
}
