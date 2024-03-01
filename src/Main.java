import array.DynamicArray;
import array.StaticArray;
import service.StudentService;
import util.Options;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StaticArray staticArray = new StaticArray();
        DynamicArray dynamicArray = new DynamicArray();
        StudentService studentService = new StudentService(scanner, staticArray, dynamicArray);
        int choose;
        try{
            do {
                Options.menuMain();
                choose = scanner.nextInt();
                switch (choose){
                    case 1:
                            Options.staticArrMenu();
                            int n1 = scanner.nextInt();
                            switch (n1) {
                                case 1:
                                    studentService.addStudentStaticArrService();
                                    break;
                                case 2:
                                    studentService.findStudentStaticArrByIdService();
                                    break;
                                case 3:
                                    studentService.updateStudentStaticArrByIdService();
                                    break;
                                case 4:
                                    studentService.deleteStudentStaticArrService();
                                    break;
                                case 5:
                                    studentService.showStaticArr();
                                    break;
                                case 0:
                                    break;
                            }
                            break;
                    case 2:
                        Options.dynamicArrMenu();
                        int n2 = scanner.nextInt();
                        switch (n2){
                            case 1:
                                studentService.addStudentDynamicArr();
                                break;
                            case 2:
                                studentService.findStudentDynamicArrById();
                                break;
                            case 3:
                                studentService.updateStudentDynamicArr();
                                break;
                            case 4:
                                studentService.deleteStudentDynamicArr();
                                break;
                            case 5:
                                studentService.sortPercentLearningAbility();
                                break;
                            case 6:
                                studentService.mediumScore();
                                break;
                            case 7:
                                studentService.showDynamicArr();
                                break;
                            case 8:
                                studentService.getStudentByAbility();
                                break;
                            case 9:
                                studentService.writeFile();
                                break;
                            case 0:
                                break;
                        }
                }
            } while (choose != 3);
        }catch (Exception e){
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
