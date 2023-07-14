import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class TDDExample {

    @Test
    void sumArray() throws Exception {
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1);
        inputArray.add(4);
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(13);
        inputArray.add(19);
        assertEquals(47, sumClass.sumArray(inputArray));
    }

    @Test
    void check_null_array_and_return_0() throws Exception {
        assertEquals(0, sumClass.sumArray(null));
    }
    @Test
    void test() throws Exception {

        for (int number = 1; number <= 100; number ++) {
            String formattedString = String.format("%06d", number);
            System.out.println(formattedString);
        }
    }

    @Test
    void sumArrayObject() throws Exception {
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.add(1999999999);
        inputArray.add(1999999999);
        inputArray.add(5);
        inputArray.add(5);
        inputArray.add(13);
        inputArray.add(19);

        assertThrows(Exception.class, () -> {
            sumClass.sumArray(inputArray);
        });
    }

    @Test
    void power() throws Exception {
        System.out.println(powerClass.powerNum(3, 4));
        System.out.println(powerClass.recursive2(0, 4));
    }

    public static class sumClass {

        public static Integer sumArray(ArrayList<Integer> sumArray) throws Exception {

            Integer answer = 0;
            try {
                if (sumArray == null) {
                    return answer;
                }

                for (Integer value : sumArray) {
                    answer = Math.addExact(answer.intValue(), value.intValue());
                }


            } catch (ArithmeticException e) {
                throw new Exception("Input sum exceeds maximum");
            }

            return answer;
        }
    }

    public static class powerClass {

        public static Integer powerNum(Integer A, Integer n) throws Exception {

            Integer answer = 1;
            //return when n/2 = 1

            //recursive passing n = n/2 till n = 1
            //conquer
            for (Integer i = 0; i < n; i++) {
                answer = answer * A;
            }

            return answer;
        }

        public static Integer recursive2(Integer n, Integer A) {

            if (n == 0) {
                return 1;
            }

            if (n == 1) {
                return A;
            }

            if (n % 2 == 0) {
                return recursive2(n / 2, A * A);
            } else return A * recursive2(n / 2, A * A);

        }

        public Integer recursive(Integer n, Integer A) {

            if (n != 0) {
                return A * recursive(n - 1, A);
            } else {
                return 1;
            }

        }
    }

}
