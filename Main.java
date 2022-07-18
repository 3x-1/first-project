import  java.util.Scanner;

public class Main {
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        printMenu();
        int userInput = scanner.nextInt();
        StepTracker stepsSaver= new StepTracker();
        int stepObject = 10000;
        
        
        while (userInput !=0) {
            int command = scanner.nextInt();
            
            if (command == 1){
                stepsSaver.savingSteps();
                
            }else if (command == 2){
                System.out.println("Выберите интересующий Вас месяц. ");
                System.out.println("Введите номер месяца, где 1 - это январь, 12 - декабрь соответственно.");
                stepsSaver.savingSteps(months, days, steps);
                
            }else if (command ==3){
                stepObject = scanner.nextInt();
            
                
            }else if (command == 0) {
            System.out.println("Выход");
            break;
            } else {
            printMenu();    
             System.out.println("Извините, такой команды пока нет.");
        
        

        }
        System.out.println("Программа завершена");
    }

    
    
    //Меню
    public static void printMenu(){
        
        System.out.println("Выберите действие:");
        System.out.println("1-Введите количество пройденых шагов.");
        System.out.println("2-Вывести данные за месяц.");
        System.out.println("3-Изменить количество шагов-больше шагов.");
        System.out.println("4-Выход.");
    }
}
