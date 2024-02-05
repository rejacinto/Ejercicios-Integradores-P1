package bootcamp.ej1;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Ejercicio1 {

    public static int[] burbuja(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

}
