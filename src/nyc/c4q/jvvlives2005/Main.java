package nyc.c4q.jvvlives2005;

public class Main {

    public static void main(String[] args) {
        //int i = 3;
        int k = 0;
        /*System.out.println(i);                //initialize the int to prevent errors
        //System.out.println(i); if the int i (it's an error because it you haven't initialize anything for the i to use
        for (i = 0; i < 10; i++) {
            int j = 3;
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println();

        /*for (i = 0; true; i++) {
            int j=3;
            System.out.println(i);
            System.out.println(j);
        }
        System.out.println(); <--- if the for loop is "true," then there's in error because you can't an infinite numbers in a line. It's impossible*/

        /*while (k < 10) {
            System.out.println(k); //k starts at 0
            k++;
            System.out.println(k); //after k++, then k starts at 1
        }*/

        while(terminate(k)){
            k++;
            System.out.println(k);
        }
    }// the while and public static boolean is not the same (in this case the while is the caller and the boolean is the callee
        public static boolean terminate(int j) {
            if (j < 10) {
                return true;
            } else {
                return false;
            }
        }


    }

