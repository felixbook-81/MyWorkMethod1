public class Main {
    class Homework { // класс Homework
         public  void main(String[] args) { // Метод main
            task1(); // Объявили метод «задача1»
            //task2(); // Объявили метод «задача2»
        }
        /**
         * Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
         * <p>
         * Эту проверку вы уже реализовывали в задании по условным операторам
         */
       public void task1() {

            public static void printIsleapYearResult ( int year, boolean yearIsLeap){

                if (yearIsLeap) {
                    System.out.println(year + " Высокосный");
                } else {
                    System.out.println(year + " Не Высокосный");
                }

            }
        }

        int printIsleapYearResult (2022);
        public void printIsleapYearResult(int year) {
            boolean yearIsLeap = isLeap(year);
            printIsleapYearResult(year, yearIsLeap);
        }

        public boolean isLeap(int year) {
            return year % 4 == 0 && year % 100 != 0 || year % 100 == 0;
            System.out.println(isLeap(2022));
        }

}


    //task2
    public static void task2() {
/**Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.

 Если устройство старше текущего года, предложите ему установить облегченную версию.

 Текущий год можно получить таким способом:

 int currentYear = LocalDate.now().getYear();

 Или самим задать значение вручную — ввести в переменную числовое значение.

 В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную) и для какой ОС (Android или iOS) установить пользователю.
 */

        public static void recomendAppYear ( int clientOs, int deviceYear);
        public static void printSetSystem ( int clientDivaceYear, int clientDevice){
            String version = "";
            if (clientDivaceYear < 2015) {
                version = "Облегченная";
            }
            String device = "";
            if (clientDevice == 0) {
                device = "iOS"
            }
        }
    }
}
