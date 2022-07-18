import java.util.Scanner;

public class StepTracker {
    Scanner sc = new Scanner(System.in);
    
    int[] months;
    int[] days;
    int[] steps;
    StepTracker(){
    months = new int[12];
    days = new int[30];
    steps = new int[30];
    }


    //Метод введения шагов за конкретный месяц и день
    int savingSteps(int day){
        for(int i = 0; i <= months.length; i++){
            day = 0;
            System.out.println("Укажите месяц, в котором необходимо внести изменения. Необходимо ввести значение от 0 до 11, где 0 январь и 11 декабрь соответственно");
            months[i] = sc.nextInt();
            System.out.println("Укажите день, в котором необходимо внести изменения.");
            days[i] = sc.nextInt();
            System.out.println("Введите количество пройденых шагов.");
            steps[day] = sc.nextInt();
        }
        return steps;    
 
    }
    //Метод вывода шагов по дням.
    void stepsPerDay(){
        for(int i = 0; i < days.length; i++){
            System.out.println(i + "день: " + steps[i] + ", ");
        }

    }
    //Метод получения общей суммы шагов за месяц
    int totalSteps(int allSteps){
        for(int i = 0; i < days.length; i++){
            allSteps = allSteps + savingSteps;
        }
        return allSteps;
    }
    //Метод нахождения максимально пройдженых шагов за один день
    int maxStepsInDay(){
        int maxSteps = 0;
        for (int i = 0; i < steps.length; i++) {
            if (steps[i] > maxSteps) {
                maxSteps = steps[i];
            }
        }
    return maxSteps;

    }
    //Считаем количество дней беспрерывного выполнения цели
    int objectDays(int count){
        count = 0;
        if (steps[day] > 0){
            count = count + 1;
        }else{
            count = 0;

        }
    }return count;

}
