
class Main { // класс Main

    public static void main(String[] args) { // Метод main
        task1(); // Объявили метод «задача1»
        task2(); // Объявили метод «задача2»
        task3(); // Объявили метод «задача3»
    }

    /**
     * Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
     * <p>
     * Эту проверку вы уже реализовывали в задании по условным операторам
     */
    public static void task1() {
        printIsleapYearResult (2018);


}


    public static void printIsleapYearResult(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 100 == 0) {
            System.out.println(year + " - Высокосный год");
        } else {
            System.out.println(year + " - Не Высокосный год");


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
            printSetSystem(2025,1);
        }

        public static void printSetSystem (int clientDeviceYear, int clientDevice){
            String version = "";
            if (clientDeviceYear <= 2023) {
                 version = "Облегченная";
            }
            if (clientDeviceYear >2023) {
                version = "Обычная";
                System.out.println(version);
            }
            String device = "";
            if (clientDevice == 0) {
                device = "iOS";
            }
            if (clientDevice == 1) {
                device = "Android";
            }
            System.out.println(device);
        }


    public static void task3() {
        /**В банке для клиентов организовывается доставка карт на дом. Чтобы известить клиента о том, когда будет доставлена его карта, нужно знать расстояние от офиса до адреса доставки.

         Правила доставки такие:

         Доставка в пределах 20 км занимает сутки.
         Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
         Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
         Свыше 100 км доставки нет.
         То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.

         Напишите программу, которая выдает сообщение в консоль: "Потребуется дней: " + срок доставки.

         Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.



         Ваша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.

         */
        getDateOffDelivery(25);
    }

    public static int getDateOffDelivery(int deliveryDistance) {
        int days = 0;

        if (deliveryDistance <= 20) {
            days = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance < 60) {
            days=(days+1);

        }
        if (deliveryDistance > 60 && deliveryDistance < 100) {
            days +=days+1;
        }
        if (deliveryDistance > 100) {
            days = -1;
        }
        if (days == -1) {
            System.out.println("доставки нет");
        }
        System.out.println("Потребуется дней: " + days);
          return days;
    }

}

