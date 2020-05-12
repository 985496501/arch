package arch.algorithm.twoDemensionalArray;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jinyun liu
 * @description 二维数组练习题
 * @date 2020/4/16
 */
public class Test2 {
    @Test
    public void test2() {
        // 3 rows: 0, 1, 2;   4 columns: 0, 1, 2, 3
        int[][] nums = new int[4][5];
        for (int[] num : nums) {
            for (int i = 0; i < num.length; i++) {
                num[i] = i;
            }

            System.out.println(Arrays.toString(num));
        }

        outputArray(nums);
    }

    /**
     * 对角线输出二维数组中的数据
     * @param nums 3 5  7,  m+n-1 次循环。
     */
    public void outputArray(int[][] nums) { // 3行 4列   打印了6排
        // 00,
        // 01, 10,
        // 20, 11, 02,
        // 03, 12, 21,
        // 22, 13,
        // 23

        // 00
        // 01 10
        // 20 11 02
        // 03 12 21 30                    m + n = 9
        // 31 22 13 04        4            i                  i - (m + n)/2 = min  min + max = i       (m + n)/2 = max
        // 14 23 32                 5
        // 33 24          6
        // 34               7

        // (m + n)/ 2 : 最大个数。



        //           1  2   3  4  5  6
        // 打印次数： 1， 2 ，3，3，2， 1
        // int[] temp = {};
        // i = 0,
        //
        int rows = nums.length;
        int columns = nums[0].length;
        for (int i = 0; i < rows + columns; ++i) {
            // 每次循环关注的是i, i的值是每次循环行列坐标的和. m + n = i
            // i是奇数还是偶数决定了第一位索引的大小. if i is odd, m > n; if i is even, m < n
            // 每次循环产出多少个元素：
            // every loop: sum(row, column) = loop(index)

            // if i is a odd number, [m][n] m from m to 0, n from m-n

            // odd number

            if (i <= (rows + columns) / 2) {
                if (i % 2 == 0) {
                    for (int j = i; j >= 0; j++) {
                        System.out.print(nums[j][i - j] + " ");
                    }
                }

                // even number
                if (i % 2 != 0) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(nums[j]);
                    }
                }
            } else {
                // --
                if (i % 2 == 0) {
                    for (int j = (rows + columns) / 2; j >= i - (rows + columns) / 2; j--) {
                        System.out.print(nums[j][i - j] + " ");
                    }
                } else {
                    for (int j = (rows + columns) / 2; j >= i - (rows + columns) / 2; j--) {
                        System.out.print(nums[j][i - j] + " ");
                    }
                }

                // ++
            }




        }


    }

}
