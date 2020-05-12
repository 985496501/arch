package arch.algorithm.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jinyun liu
 * @description 算法测试- central index
 * 1. sum(left subList) = sum(right sublist)
 * 2. if there is more than one central index, return the most left one.
 * @Required: 1. all digits in array is integer-type that range from -1000 to 1000.
 * 2. length ranges from 0 to 10000.
 * @date 2020/4/13
 */
public class CentralIndexTest {
    // basic solution:
    @Test
    public void test3() {
        int[] nums = {-1, -1, -1, 0, 1, 1};

        if (nums.length < 0 || nums.length > 10000) {
            return;
        }

        // flag from 1 to end(length - 2) moving, for example: 2-8.
        // right solution: index from 0 to length - 1, the sum of boundary outside is 0.
        // length - 1 : end index.
        int index = 0;
        while (index <= nums.length - 1) {
            int sumLeft = 0;
            for (int i = 0; i < index; ++i) {
                if (nums[i] < -1000 || nums[i] > 1000) {
                    return;
                }

                sumLeft += nums[i];
            }

            int sumRight = 0;
            for (int j = nums.length - 1; j > index; --j) {
                if (nums[j] < -1000 || nums[j] > 1000) {
                    return;
                }

                sumRight += nums[j];
            }

            if (sumLeft == sumRight) {
                System.out.println("central index is : " + index);
                return;
            }

            index++;
        }

    }

    public int solution2(int[] nums) {
        if (nums.length < 0 || nums.length > 10000) {
            return -1;
        }

        // flag from 1 to end(length - 2) moving, for example: 2-8.
        // right solution: index from 0 to length - 1, the sum of boundary outside is 0.
        // length - 1 : end index.
        int index = 0;
        while (index <= nums.length - 1) {
            int sumLeft = 0;
            for (int i = 0; i < index; ++i) {
                if (nums[i] < -1000 || nums[i] > 1000) {
                    return -1;
                }

                sumLeft += nums[i];
            }

            int sumRight = 0;
            for (int j = nums.length - 1; j > index; --j) {
                if (nums[j] < -1000 || nums[j] > 1000) {
                    return -1;
                }

                sumRight += nums[j];
            }

            if (sumLeft == sumRight) {
                System.out.println("central index is : " + index);
                return index;
            }

            index++;
        }

        return -1;
    }

    @Test
    public void test4() {
        //int[] nums = {3, 6, 1, 0};
        //int[] nums = {0, 0, 0, 1};
        int[] nums = {0, 0, 1, 2};

        if (nums.length < 1 || nums.length > 50) {
            return;
        }

        if (nums.length == 1) {
            System.out.println("the biggest digit index is :" + 0);
        }

        // Compared order:
        // find the biggest number. default the first one is the biggest.
        // one loop: compare index(0) to another, biggest moves to head.
        // order refresh the index, never to find original index.
        int biggestDigitIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[0] < 0 || nums[0] > 50) {
                return;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < 0 || nums[j] > 50) {
                    return;
                }

                if (nums[i] < nums[j]) {
                    // not import third variable to finish number change.
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                    biggestDigitIndex = j;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(biggestDigitIndex);

        if (nums[0] > 2 * nums[1]) {
            System.out.println("the biggest digit index is :" + biggestDigitIndex);
        } else {
            System.out.println("not found");
        }

        // default the biggest digit.
        // int biggest = nums[0];

        // after looping, the biggest one is the index(0) actually.
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[0] < nums[i]) {
//                nums[0] = nums[0] + nums[i];
//                nums[i] = nums[0] - nums[i];
//                nums[0] = nums[0] - nums[i];
//            }
//        }

    }

    @Test
    public void test1() {
        int[] nums = {0, 0, 2, 1};
        int solution = solution(nums);
        System.out.println(solution);
    }


    public int solution(int[] nums) {
        if (nums.length < 1 || nums.length > 50) {
            return -1;
        }

        if (nums.length == 1) {
            return 0;
        }
        // Compared order:
        // find the biggest number. default the first one is the biggest.
        // one loop: compare index(0) to another, biggest moves to head.
        // order refresh the index, never to find original index.
        int biggestDigitIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[0] < 0 || nums[0] > 100) {
                return -1;
            }

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < 0 || nums[j] > 100) {
                    return -1;
                }

                if (nums[i] < nums[j]) {
                    // the first loop fetch the biggest index to temporary.
                    if (i == 0) {
                        biggestDigitIndex = j;
                    }

                    // not import third variable to finish number change.
                    nums[i] = nums[i] + nums[j];
                    nums[j] = nums[i] - nums[j];
                    nums[i] = nums[i] - nums[j];
                }
            }
        }

        if (nums[0] >= 2 * nums[1]) {
            System.out.println("the biggest digit index is :" + biggestDigitIndex);
            return biggestDigitIndex;
        } else {
            return -1;
        }
    }

    @Test
    public void testIncrement() {
        // given a array, including a number. return the array which is the result if the number + 1.
        int[] digits = {1, 2, 3};
        int[] ints = addOne(digits);
        System.out.println(Arrays.toString(ints));
    }

    public int[] addOne(int[] digits) {
        // one loop.
        int flag = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    if (digits.length != 1) {
                        digits[i - 1] = digits[i - 1] + 1;
                    } else {
                        flag = 1;
                    }
                } else {
                    digits[i]++;
                }
            } else if (i < digits.length - 1 && i > 0) {
                if (digits[i] > 9) {
                    digits[i] = digits[i] % 10;
                    digits[i - 1] = digits[i - 1] + 1;
                }
            } else if (i == 0) {
                if (digits[i] > 9) {
                    digits[i] = digits[i] % 10;
                    flag = 1;
                }
            }
        }

        if (flag == 1) {
            int[] newArray = new int[digits.length + 1];
            newArray[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                newArray[i + 1] = digits[i];
            }

            return newArray;
        } else {
            return digits;
        }
    }
}
