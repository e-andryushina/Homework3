public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte b = 122;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short s = 1345;
        System.out.println("Значение переменной s с типом short равно " + s);
        int i = 13678;
        System.out.println("Значение переменной i с типом int равно " + i);
        long l = 23445667L;
        System.out.println("Значение переменной l с типом long равно " + l);
        float f = 333.333f;
        System.out.println("Значение переменной f с типом float равно " + f);
        double d = 76.34568899;
        System.out.println("Значение переменной d с типом double равно " + d);

        // Задача 2

        float apple = 27.12f;
        long population = 987678965549L;
        byte orange = 2;
        short banana = 786;
        boolean bread = false;
        short chair = 569;
        int difference = -159;
        char car = 27897;

        // Задача 3
        System.out.println("Задача 3");
        short studentsLyudmilaP = 23;
        short studentsAnnaS = 27;
        short studentsEkaterinaA = 30;
        short sheetsTotal = 480;
        int sheetPerStudent = sheetsTotal / (studentsEkaterinaA + studentsAnnaS + studentsLyudmilaP);
        System.out.println("На каждого ученика рассчитано " +  sheetPerStudent + " листов бумаги");

        // Задача 4
        System.out.println("Задача 4");
        int performance = 16;
        int timeline = 2;
        int performancePer1Min = performance / timeline;
        timeline = 20;
        System.out.println("За " + timeline + " минут машина произвела бутылок " + (performancePer1Min * timeline) + " штук");
        timeline = 24 * 60;
        System.out.println("За " + (timeline / 24 / 60) + " день машина произвела бутылок " + (performancePer1Min * timeline) + " штук");
        timeline = 24 * 60 * 3;
        System.out.println("За " + (timeline / 24 / 60) + " дня машина произвела бутылок " + (performancePer1Min * timeline) + " штук");
        timeline = 24 * 60 * 30;
        System.out.println("За " + (timeline / 24 / 60 / 30) + " месяц машина произвела бутылок " + (performancePer1Min * timeline) + " штук");

        // Задача 5
        System.out.println("Задача 5");
        int paintTotal = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;
        int classAmount = paintTotal / (whitePerClass + brownPerClass);
        System.out.println("В школе, где " + classAmount + " классов, нужно " + (whitePerClass * classAmount) + " банок белой краски и " + (brownPerClass * classAmount) + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");
        banana = 5;
        int bananaWeight = 80;
        int milk = 200;
        int milkWeight = 105 / 100;
        int icecream = 2;
        int icecreamWeight = 100;
        int egg = 4;
        int eggWeight = 70;
        double totalWeight = banana * bananaWeight + milk * milkWeight + icecream * icecreamWeight + egg * eggWeight;
        double totalWeightKg = totalWeight / 1000;
        System.out.println("Вес завтрака составляет " + totalWeight + " грамм, или " + totalWeightKg + " килограмм");

        // Задача 7
        System.out.println("Задача 7");
        int weightMinusKg = 7;
        int weightMinusGr = weightMinusKg * 1000;
        int minimumMinusPerDay = 250;
        int maxMinusPerDay = 500;
        System.out.println("Если спортсмен будет худеть на 250 грамм в день, то на похудение потребуется " + (weightMinusGr / minimumMinusPerDay) + " дней");
        System.out.println("Если спортсмен будет худеть на 500 грамм в день, то на похудение потребуется " + (weightMinusGr / maxMinusPerDay) + " дней");
        System.out.println("Если спортсмен будет худеть от 250 до 500 грамм в день, то на похудение в среднем потребуется " + (((weightMinusGr / minimumMinusPerDay) + (weightMinusGr / maxMinusPerDay)) / 2) + " день");

        // Задача 8
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float salaryIncrease = 1.1f;
        float mashaSalaryIncrease = mashaSalary * salaryIncrease;
        float denisSalaryIncrease = denisSalary * salaryIncrease;
        float kristinaSalaryIncrease = kristinaSalary * salaryIncrease;
        float mashaSalIncYear = (mashaSalaryIncrease - mashaSalary) * 12;
        float denisSalIncYear = (denisSalaryIncrease - denisSalary) * 12;
        float kristinaSalIncYear = (kristinaSalaryIncrease - kristinaSalary) * 12;
        System.out.println("Зарплата Маши после индексации составила " + mashaSalaryIncrease + " рублей в месяц, годовое увеличение зарплаты составило " + mashaSalIncYear + " рублей.");
        System.out.println("Зарплата Дениса после индексации составила " + denisSalaryIncrease + " рублей в месяц, годовое увеличение зарплаты составило " + denisSalIncYear + " рублей.");
        System.out.println("Зарплата Кристины после индексации составила " + kristinaSalaryIncrease + " рублей в месяц, годовое увеличение зарплаты составило " + kristinaSalIncYear + " рублей. ");


    }
}