public class task3_2 {
    public static boolean isPalindrom(String str) {
        // Получаем готовую к проверке строку: приводим к нижнему регистру и удаляем всё, кроме букв и цифр
        String clearedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = clearedStr.length() - 1;
        while(left < right){
            if(clearedStr.charAt(left) != clearedStr.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom("Was it a car or a cat I saw"));
        System.out.println(isPalindrom("Merchant"));
    }
}
