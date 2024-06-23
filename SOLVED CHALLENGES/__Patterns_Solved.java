public class __Patterns_Solved {
    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n - row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfCols = row > n ? 2 * n - row : row;
            for (int col = 1; col <= noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row - 1; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - (row * 2) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {

        for (int row = 1; row <= 2 * n; row++) {
            int noOfSpaces = row <= n ? row : 2 * n - row + 1;
            int noOfCols = row <= n ? n - row + 1 : row - n;

            for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= noOfCols; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int noOfSpaces = row <= n ? n - row : row - n;
            int noOfCols = row <= n ? row : 2 * n - row;
            for (int spaces = 1; spaces <= noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols <= noOfCols; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("--------------------");
        pattern1(5);
        System.out.println("--------------------");
        pattern2(5);
        System.out.println("--------------------");
        pattern3(5);
        System.out.println("--------------------");
        pattern4(5);
        System.out.println("--------------------");
        pattern5(5);
        System.out.println("--------------------");
        pattern6(5);
        System.out.println("--------------------");
        pattern7(5);
        System.out.println("--------------------");
        pattern8(5);
        System.out.println("--------------------");
        pattern9(5);
        System.out.println("--------------------");
        pattern10(5);
        System.out.println("--------------------");
        pattern11(5);
        System.out.println("--------------------");
        pattern12(5);
        System.out.println("--------------------");
        pattern28(5);
    }
}
