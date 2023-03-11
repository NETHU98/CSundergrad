public class TheDotProduct2D {
    public static void main(String[] args) {
        int[][] original = {{21, 32, 23, 34}, {13, 14, 15, 16}};
        System.out.println("Original Vector:");
        PrintVect2D(original);
        int r = 0;
        int c = 0;

       
        int[][] Transposed = new int[c][r];
        Transposed = Transpose2D(original);

        System.out.println("\nTransposed Vector: ");
        PrintVect2D(Transposed);
        System.out.println("\nDot product of 2 vectors: ");
        DotProd2D(original, Transposed);

    }

    public static int[][] Transpose2D(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        int[][] ret = new int[c][r];
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                ret[j][i] = arr[i][j];
            }
        }
        return ret;
    }

    public static void DotProd2D(int[][] a, int[][] b) {
        int r = a.length;
        int c = b[0].length;
        int ret[][] = new int[r][c];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
               ret[i][j]=0;
                for (int k = 0; k < a[0].length; k++) {
                    ret[i][j] = ret[i][j] + a[i][k] * b[k][j];
                }

            }
        }
            PrintVect2D(ret);
        }

        public static void PrintVect2D ( int[][] vect){
            System.out.print("{ ");
            for (int i = 0; i < vect.length; i++) {
                if (i > 0)
                    System.out.print("  ");

                for (int j = 0; j < vect[0].length; j++) {
                    if (j < vect[0].length - 1)
                        System.out.print(vect[i][j] + ", ");

                    else
                        System.out.print(vect[i][j]);
                }
                if (i < vect.length - 1)
                    System.out.println("");

                else
                    System.out.println(" }");
            }

        }


    }


