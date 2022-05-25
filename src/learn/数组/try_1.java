package learn.数组;

public class try_1 {
    public static void main(String[] args) {
        int [][] array = {{8, 75, 23}, {21, 55, 34}, {15, 23, 20}};
        int temp;
        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.println(anInt + "\t");
            }
            System.out.println();
        }
    }
}
