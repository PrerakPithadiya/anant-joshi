public class Main {
    public static void main(String[] args) {
        p12();
    }

    public static void p1() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int r = mat.length, c = mat[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void p2() {
        int[][] mat = {
            {1, 2, 4, 7, 11},
            {3, 5, 8, 12, 16},
            {6, 9, 13, 17, 20},
            {10, 14, 18, 21, 23},
            {15, 19, 22, 24, 25}
        };
        int r = mat.length, c = mat[0].length;
        for (int k = 0; k < c; k++) {
            for (int i = 0, j = k; i < r && j > -1; i++, j--) {
                System.out.print(mat[i][j] + " ");
            }
        }

        for (int k = 1; k < r; k++) {
            for (int i = k, j = c - 1; i < r && j > -1; i++, j--) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void p3() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 16},
            {10, 11, 12, 17, 18},
            {13, 14, 19, 20, 21},
            {15, 22, 23, 24, 25}
        };
        int r = mat.length, c = mat[0].length;
        int i = 0;
        for (int k = c - 1; k >= 0; k--) {
            for (int j = 0; j <= k; j++) {
                System.out.print(mat[i][j] + " ");
            }
            i++;
        }
        i = 1;
        for (int k = c - 1; k >= 1; k--) {
            for (int j = k; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            i++;
        }
    }

    public static void p4() {
        int[][] mat = {
            {1, 6, 11, 16, 21},
            {2, 7, 12, 17, 22},
            {3, 8, 13, 18, 23},
            {4, 9, 14, 19, 24},
            {5, 10, 15, 20, 25}
        };
        int r = mat.length, c = mat[0].length;
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void p5() {
        int[][] mat = {
            {11, 7, 4, 2, 1},
            {16, 12, 8, 5, 3},
            {20, 17, 13, 9, 6},
            {23, 21, 18, 14, 10},
            {25, 24, 22, 19, 15}
        };
        int r = mat.length, c = mat[0].length;
        for (int k = c - 1; k >= 0; k--) {
            for (int i = 0, j = k; i < r && j < c; i++, j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
        for (int k = 1; k < r; k++) {
            for (int i = k, j = 0; i < r && j < c; i++, j++) {
                System.out.print(mat[i][j] + " ");
            }
        }
    }

    public static void p6() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {16, 6, 7, 8, 9},
            {17, 18, 10, 11, 12},
            {19, 20, 21, 13, 14},
            {22, 23, 24, 25, 15}
        };
        int r = mat.length, c = mat[0].length, i = 0;
        for (int k = 0; k < c; k++) {
            for (int j = k; j < c; j++) {
                System.out.print(mat[i][j] + " ");
            }
            i++;
        }
        i = 1;
        for (int k = 0; k <= c - 2; k++) {
            for (int j = 0; j <= k; j++) {
                System.out.print(mat[i][j] + " ");
            }
            i++;
        }
    }

    public static void p7() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {10, 9, 8, 7, 6},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };
        int r = mat.length, c = mat[0].length;
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void p8() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
        };
        int r = mat.length, c = mat[0].length;
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            // top
            for (int j = left; j <= right; j++) {
                System.out.print(mat[top][j] + " ");
            }
            // right
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            // bottom 
            for (int j = right - 1; j >= left; j--) {
                if (top == bottom) {
                    break;
                }
                System.out.print(mat[bottom][j] + " ");
            }
            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (right == left) {
                    break;
                }
                System.out.print(mat[i][left] + " ");
            }
            top++;
            bottom--;
            left++;
            right--;
        }
    }

    public static void p9() {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {22, 21, 14, 13, 6},
            {23, 20, 15, 12, 7},
            {24, 19, 16, 11, 8},
            {25, 18, 17, 10, 9}
        };
        int r = mat.length, c = mat[0].length;
        for (int j = 0; j < c; j++) {
            System.out.print(mat[0][j] + " ");
        }
        for (int j = c - 1; j >= 0; j--) {
            if (j % 2 == 0) {
                for (int i = 1; i < r; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = r - 1; i >= 1; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void p10() {
        int[][] mat = {
            {1, 10, 11, 20, 21},
            {2, 9, 12, 19, 22},
            {3, 8, 13, 18, 23},
            {4, 7, 14, 17, 24},
            {5, 6, 15, 16, 25}
        };
        int r = mat.length, c = mat[0].length;
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < r; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = r - 1; i >= 0; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }

    public static void p11() {
        int[][] mat = {
            {21, 22, 23, 24, 25},
            {20, 7, 8, 9, 10},
            {19, 6, 1, 2, 11},
            {18, 5, 4, 3, 12},
            {17, 16, 15, 14, 13}
        };
        int r = mat.length, c = mat[0].length;
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            // top
            for (int j = right; j >= left; j--) {
                System.out.print(mat[top][j] + " ");
            }
            // left
            for (int i = top + 1; i <= bottom; i++) {
                System.out.print(mat[i][left] + " ");
            }
            // bottom
            for (int j = left + 1; j <= right; j++) {
                if (top == bottom) {
                    break;
                }
                System.out.print(mat[bottom][j] + " ");
            }
            // right
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (left == right) {
                    break;
                }
                System.out.print(mat[i][right] + " ");
            }
            top++;
            bottom--;
            left++;
            right--;
        }
    }

    public static void p12() {
        int[][] mat = {
            {1, 2, 3, 4, 5, 6, 7},
            {26, 25, 20, 19, 14, 13, 8},
            {27, 24, 21, 18, 15, 12, 9},
            {28, 23, 22, 17, 16, 11, 10},
            {29, 34, 35, 40, 41, 46, 47},
            {30, 33, 36, 39, 42, 45, 48},
            {31, 32, 37, 38, 43, 44, 49}
        };
        int r = mat.length, c = mat[0].length;
        for (int j = 0; j < c; j++) {
            System.out.print(mat[0][j] + " ");
        }
        for (int j = c - 1; j >= 0; j--) {
            if (j % 2 == 0) {
                for (int i = 1; i <= (r - 1) / 2; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = (r - 1) / 2; i >= 1; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                for (int i = (r - 1) / 2 + 1; i < r; i++) {
                    System.out.print(mat[i][j] + " ");
                }
            } else {
                for (int i = r - 1; i >= (r - 1) / 2 + 1; i--) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}