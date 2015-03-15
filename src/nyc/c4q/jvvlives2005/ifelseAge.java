package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/14/15.
 */
import java.util.Scanner;

public class ifelseAge {
    public static void main(String[] args){

        int age = 14;

        if (age == 15 || age >= 21 ) {
            System.out.println("Let's get Krunked!");
        }else if(age > 67) {
            System.out.println("You a little too old to be getting drunk");
        }else {
            System.out.println("You should drink apple juice");
        }

    }
}
