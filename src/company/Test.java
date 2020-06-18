package company;

public class Test {

    public static void main(String[] args) {
        String[][] example1 = {{"1", "2"}, {"1"}};
        String[][] example2 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "r", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] example3 = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            massiveAllSumElem(example1);
        } catch (MyArraySizeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            massiveAllSumElem(example2);
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            int sum = massiveAllSumElem(example3);
            System.out.println("Сумма элементов массива: " + sum);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    static int massiveAllSumElem(String[][] massive) {
        massiveValidate(massive);
        int sum = 0;
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive[i].length; j++) {
                try {
                    sum += Integer.valueOf(massive[i][j]);
                } catch (Exception ex) {
                    throw new MyArrayDataException("в ячейке: [" + i + "]" + "[" + j + "] - лежит не валидный символ(" +
                            massive[i][j] + "), должно быть целое число");
                }
            }
        }
        return sum;
    }

    private static void massiveValidate(String[][] massive) {
        if (massive.length != 4) {
            throw new MyArraySizeException("не валидный размер массива");
        }
        for (String[] aMassive : massive) {
            if (aMassive.length != 4) {
                throw new MyArraySizeException("не валидный размер массива");
            }
        }
    }

    static class MyArraySizeException extends RuntimeException {
        MyArraySizeException(String message) {
            super(message);
        }
    }

    static class MyArrayDataException extends RuntimeException {
        MyArrayDataException(String message) {
            super(message);
        }
    }
}