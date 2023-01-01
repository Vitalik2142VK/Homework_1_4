public class Main
{
    public static void Task1_2()
    {
        System.out.println("Task1_2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке.");
        else if (clientOS == 1 && clientDeviceYear <= 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        else if (clientOS == 0)
            System.out.println("Для iOS — «Установите версию приложения для iOS по ссылке».");
        else if (clientOS == 1 && clientDeviceYear <= 2015)
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        System.out.println("##########");
    }

    public static void Task3()
    {
        System.out.println("Task3: ");
        int year = 2021;
        if (year % 4 == 0 || year % 400 == 0)
            System.out.println(year + " год является високосным");
        else if(year % 100 == 0)
            System.out.println(year + " год не является високосным");
        else
            System.out.println(year + " год не является високосным");
        System.out.println("##########");
    }

    public static void Task4()
    {
        System.out.println("Task4: ");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20)
            System.out.println("Потребуется дней: 1");
        else if (deliveryDistance <= 60)
            System.out.println("Потребуется дней: 2");
        else if (deliveryDistance <= 100)
            System.out.println("Потребуется дней: 3");
        else
            System.out.println("Доставки нет.");
        System.out.println("##########");
    }

    public static void Task5()
    {
        System.out.println("Task5: ");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Месяц - \'" + monthNumber + "\' принадлежит к сезону зима");
                break;
            default:
                System.out.println("Не корректно указан месяц.");
                break;
        }
        System.out.println("##########");
    }
    public static void main(String[] args)
    {
        Task1_2();
        Task3();
        Task4();
        Task5();
    }
}