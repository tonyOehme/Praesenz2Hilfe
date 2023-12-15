import java.util.Arrays;

public class Fun{
    public static void main(String[] args) {

    }

    public static <T> boolean arraysEqual(T[] genericArray1, T[] genericArray2){
        return Arrays.equals(genericArray1, genericArray2);
    }
}
