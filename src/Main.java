public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 123;
        short b = 12345;
        int c = 1234567890;
        long d = 1234567890123456789L;
        float e = 12.56f;
        double f = 34.56;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом byte равно " + e);
        System.out.println("Значение переменной f с типом byte равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        int firstTeacher = 23;
        int secondTeacher = 27;
        int thirdTeacher = 30;
        int totalPaper = 480;
        int paperForStudent = totalPaper / (firstTeacher + secondTeacher + thirdTeacher);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("Задача 4");
        int minutes = 2;
        int efficiency = 16;
        int oneMinutesEfficiency = efficiency / minutes;
        int efficiencyTwentyMinutes = 20 * oneMinutesEfficiency;
        int efficiencyDay = 24 * 3 * efficiencyTwentyMinutes;
        int efficiencyThreeDay = 3 * efficiencyDay;
        int efficiencyMons = 10 * efficiencyThreeDay;
        System.out.println("За 20 минут машина произвела " + efficiencyTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела  " + efficiencyDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + efficiencyThreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + efficiencyMons + " штук бутылок");
    }

    public static void task5() {
        System.out.println("Задача 5");
        int totalPots = 120;
        int whitePotsForClass = 2;
        int brownPotsForClass = 4;
        int classes = totalPots / (whitePotsForClass + brownPotsForClass);
        int whitePots = classes * whitePotsForClass;
        int brownPots = classes * brownPotsForClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePots +
                " банок белой краски и " + brownPots + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("Задача 6");
        int countBanana = 5;
        int weightBanana = 80;
        int milkMl = 200;
        int weightOneHundredMl = 105;
        int iceCream = 2;
        int weightBriquetteIceCream = 100;
        int egg = 4;
        int weightEgg = 70;
        int totalGrams = countBanana * weightBanana + milkMl / 100 * weightOneHundredMl
                + iceCream * weightBriquetteIceCream + egg * weightEgg;
        System.out.println("Всего грамм: " + totalGrams);
        System.out.println("Всего килограмм: " + (double)totalGrams / 1000);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightKg = 7;
        int declineWeighMinGram = 250;
        int declineWeightMaxGram = 500;
        int dayBy250 = weightKg * 1000 / declineWeighMinGram;
        int dayBy500 = weightKg * 1000 / declineWeightMaxGram;
        System.out.println("Количество дней на похудение при потере в весе " + declineWeighMinGram
                + " грамм составляет " + dayBy250);
        System.out.println("Количество дней на похудение при потере в весе " + declineWeightMaxGram
                + " грамм составляет " + dayBy500);
        System.out.println("Среднее количество ней для похудения " + (dayBy250 + dayBy500) / 2);
    }

    public static void task8() {
        System.out.println("Задача 8");
        float percent = 0.1f;
        float masha = 67760f;
        float denis = 83690f;
        float kris = 76230f;
        System.out.println("Маша теперь получает " + masha * (1 + percent) + " рублей. Годовой доход вырос на "
                + masha * percent);
        System.out.println("Денис теперь получает " + denis * (1 + percent) + " рублей. Годовой доход вырос на "
                + denis * percent);
        System.out.println("Кристина теперь получает " + kris * (1 + percent) + " рублей. Годовой доход вырос на "
                + kris * percent);
    }
}