public class Q01_ThreeDMatrixUsingOneD {

    static int X = 3;
    static int Y = 3;
    static int Z = 3;

    static void setValue(int value, int x, int y, int z, int[] array) {
        int index = x * (Y * Z) + y * Z + z;
        array[index] = value;
    }

    static int getValue(int x, int y, int z, int[] array) {
        int index = x * (Y * Z) + y * Z + z;
        return array[index];
    }

    public static void main(String[] args) {

        int[] oneDArray = new int[X * Y * Z];

        setValue(25, 1, 1, 1, oneDArray);

        int value = getValue(1, 1, 1, oneDArray);
        System.out.println("Value at (1,1,1) = " + value);
    }
}
 
    

