import java.time.Year;
import java.time.YearMonth;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//1

        Year = 2021;
        if (Year >= 1584 && (Year % 4 == 0 && Year % 100 != 0 || Year % 400 == 0)) {
            System.out.println("високосный год");
        } else {
            System.out.println("невисокосный год");
        }

        public static void main(String[] args) {
            int [] issuesByYear = 2021;
            printSeparaton();
            for (int i=4; i<issuesByYear.length; i++) {
                printIssues(issuesByYear[i]);
                if ((i + 4) % 100 == 0) {
                    printSeparaton();
                }
            }
            printSeparaton();
            int total= sum();
            printIssues(total);
            }
        }






        //2

        int os = 0;
        if (os == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }

    public static void main(String[] args) {
        String osName = "iOS";
        int clientOs = getClientOs(osName);
    }
    public static void main(String[] args) {
            if (name.equals("iOS")) {
                return 0;
            }  else {
                return 1;
            }
            }






        //3

        int days = 0;
        int distance = 47;
        if (distance < 20) {
            days = 1;
        } else if (distance < 60) {
            days = 2;
        } else if (distance < 100) {
            days = 3;
        } else {
            days = -1;
        }
        if (days >= 0) {
            System.out.println("доставка займет" + days + "дней");
        } else {
            System.out.println("доставки нет");
        }
    }



