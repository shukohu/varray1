import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1, 2
        System.out.println("Задача 1, 2");

        int[] varray1 = new int[3];
        varray1[0] = 1;
        varray1[1] = 2;
        varray1[2] = 3;
        for (int i = 0; i < varray1.length; i++) {
            if (i < varray1.length - 1) {
                System.out.print(varray1[i] + ", ");
            } else
                System.out.print(varray1[i] + "\n");
        }

        double[] varray2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < varray2.length; i++) {
            if (i < varray2.length - 1) {
                System.out.print(varray2[i] + ", ");
            } else
                System.out.print(varray2[i] + "\n");
        }

        int[] varray3 = {12, 13, 14, 15};
        for (int i = 0; i < varray3.length; i++) {
            if (i < varray3.length - 1) {
                System.out.print(varray3[i] + ", ");
            } else
                System.out.print(varray3[i] + "\n");
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int i = varray1.length - 1; i >= 0; i--) {
            System.out.print(varray1[i] + ", ");

        }

        System.out.println();
        for (int i = varray2.length - 1; i >= 0; i--) {
            System.out.print(varray2[i] + ", ");
        }

        System.out.println();
        for (int i = varray3.length - 1; i >= 0; i--) {
            System.out.print(varray3[i] + ", ");
        }
        System.out.println();


        //Задача 4

        System.out.println("Задача 4");
        for (int i = 0; i < varray1.length; i++) {
            if (varray1[i] % 2 != 0) {
                varray1[i] += 1;
            }
        }
        System.out.println(Arrays.toString(varray1));
    }

}