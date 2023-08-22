public class task2 {
    public static void swap(int a, int b) {
        System.out.println("Before swap: " + "a = " + a + ", b = " + b);
        a = a + b; // а теперь содержит сумму a и b
        b = a - b; // вычитание из суммы b дает первоначальное значение a
        a = a - b; // вычитание нового значения b (которое равно старому значению a) дает первоначальное значение b
        System.out.println("After swap: " + "a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        swap(5, 7);
    }
}

