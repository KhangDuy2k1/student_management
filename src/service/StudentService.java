package service;
import java.io.*;
import java.util.*;
import array.DynamicArray;
import array.StaticArray;
import model.LearningAbility;
import model.Students;
import util.Options;
import util.Percent;
import validate.Validate;
import java.time.LocalDate;
import java.util.Collections;
public class StudentService {
    private Scanner scanner;
    private StaticArray staticArr;
    private DynamicArray dynamicArray;
    public StudentService(Scanner scanner, StaticArray staticArr, DynamicArray dynamicArray){
        this.scanner = scanner;
        this.staticArr = staticArr;
        this.dynamicArray = dynamicArray;
    }
    public void addStudentStaticArrService() {
        try {
            System.out.print("Nhập số lượng sinh viên bạn muốn thêm: ");
            int n = this.scanner.nextInt();
            staticArr.setSize(n);
            Students[] studentsArr = staticArr.getArrayStudents();
            for(int i = 0; i<n ; i++){
                int ofset = i + 1;
                System.out.println("Nhập thông tin sinh viên thứ " + ofset);
                String name = this.enterTheName();
                LocalDate dateOfBird = this.enterTheDate();
                String address = this.enterTheAddress();
                Double height = this.enterTheHeight();
                Double weight = this.enterTheWeight();
                String msv = this.enterTheMsv();
                String schoolName = this.enterTheschoolName();
                String startYear = this.enterTheStartYear();
                Double gpa = this.enterTheGpa();
                studentsArr[i] = new Students(name,
                        dateOfBird,
                        address,
                        height,
                        weight,
                        msv,
                        schoolName,
                        startYear,
                        gpa);
                System.out.println(studentsArr[i]);
            }
        }catch (java.util.InputMismatchException e){
            System.out.println(e);
        }
    }

    public void addStudentDynamicArr(){
        List<Students> studentsList = this.dynamicArray.getStudentsList();
        System.out.println("Thêm thông tin Sinh viên cần thêm");
        String name = this.enterTheName();
        LocalDate dateOfBird = this.enterTheDate();
        String address = this.enterTheAddress();
        Double height = this.enterTheHeight();
        Double weight = this.enterTheWeight();
        String msv = this.enterTheMsv();
        String schoolName = this.enterTheschoolName();
        String startYear = this.enterTheStartYear();
        Double gpa = this.enterTheGpa();
        Students student = new Students(name,
                dateOfBird,
                address,
                height,
                weight,
                msv,
                schoolName,
                startYear,
                gpa
        );
        studentsList.add(student);
        System.out.println(student);
    }
    public void findStudentDynamicArrById(){
        List<Students> studentsList = this.dynamicArray.getStudentsList();
        System.out.print("Nhập Id Sinh viên: ");
        Integer id = this.scanner.nextInt();
        Students student = findStudentDynamicArr(studentsList, id);
        if(student instanceof Students){
            System.out.println(student);
            return;
        }
        System.out.println("Không tìm thấy Sinh viên");
    }

    public void updateStudentDynamicArr(){
        List<Students> studentsList = this.dynamicArray.getStudentsList();
        System.out.print("Nhập id sinh viên muốn cập nhật ");
        Integer id = this.scanner.nextInt();
        Students student = this.findStudentDynamicArr(studentsList, id);
        if(student instanceof Students){
            Options.updateStudent();
            Integer n = this.scanner.nextInt();
            switch (n){
                case 1:
                    String name = this.enterTheName();
                    student.setName(name);
                    break;
                case 2:
                    String address = this.enterTheAddress();
                    student.setAddress(address);
                    break;
                case 3:
                    Double height = this.enterTheHeight();
                    student.setHeight(height);
                    break;
                case 4:
                    Double weight = this.enterTheWeight();
                    student.setWeight(weight);
                    break;
                case 5:
                    String msv = this.enterTheMsv();
                    student.setMsv(msv);
                    break;
                case 6:
                    String schoolName = this.enterTheschoolName();
                    student.setSchoolName(schoolName);
                    break;
                case 7:
                    String startYear = this.enterTheStartYear();
                    student.setStartYear(startYear);
                    break;
                case 8:
                    Double gpa = this.enterTheGpa();
                    student.setGPA(gpa);
                    break;
                case 9:
                    LocalDate dateOfBird = this.enterTheDate();
                    student.setDateOfBird(dateOfBird);
                    break;
                case 0:
                    return;
            }
            System.out.println("Cập nhật thành công");
            System.out.println(student);
            return;
        }
        System.out.println("Không tìm thấy sinh viên");
    }

    public void deleteStudentDynamicArr(){
        List<Students> studentsList = this.dynamicArray.getStudentsList();
        System.out.print("Nhập Id Sinh viên muốn xóa: ");
        Integer id = this.scanner.nextInt();
        Students student = this.findStudentDynamicArr(studentsList, id);
        if(student instanceof Students){
             studentsList.remove(student);
             System.out.println("Xóa sinh viên thành công");
             return;
        }
        System.out.println("Không tìm thấy sinh viên");
    }
    public void findStudentStaticArrByIdService(){
        try {
        Students[] studentsArr = this.staticArr.getArrayStudents();
        System.out.print("Nhập Id: ");
        Integer id = this.scanner.nextInt();
        Students student = this.findStudentStaticArr(studentsArr, id);
        if(student instanceof Students){
            System.out.println(student);
        }else {
            System.out.println("Không tìm thấy");
        }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void updateStudentStaticArrByIdService(){
        try {
            System.out.print("Nhập Id sinh viên muốn cập nhật: ");
            Integer idStudent = this.scanner.nextInt();
            Students student = this.findStudentStaticArr(this.staticArr.getArrayStudents(),idStudent);
            if(student instanceof Students){
                Options.updateStudent();
                Integer n = this.scanner.nextInt();
                switch (n){
                    case 1:
                        String name = this.enterTheName();
                        student.setName(name);
                        break;
                    case 2:
                        String address = this.enterTheAddress();
                        student.setAddress(address);
                        break;
                    case 3:
                        Double height = this.enterTheHeight();
                        student.setHeight(height);
                        break;
                    case 4:
                        Double weight = this.enterTheWeight();
                        student.setWeight(weight);
                        break;
                    case 5:
                        String msv = this.enterTheMsv();
                        student.setMsv(msv);
                        break;
                    case 6:
                        String schoolName = this.enterTheschoolName();
                        student.setSchoolName(schoolName);
                        break;
                    case 7:
                        String startYear = this.enterTheStartYear();
                        student.setStartYear(startYear);
                        break;
                    case 8:
                        Double gpa = this.enterTheGpa();
                        student.setGPA(gpa);
                        break;
                    case 9:
                        LocalDate dateOfBird = this.enterTheDate();
                        student.setDateOfBird(dateOfBird);
                        break;
                    case 0:
                        return;
                }
                System.out.println("Cập nhật thành công");
                System.out.println(student);
                return;
            }
          System.out.println("Không tìm thấy sinh viên để cập nhật");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

     public void deleteStudentStaticArrService(){
        System.out.println("Nhập Id Sinh viên muốn xóa");
        Integer idStudent = this.scanner.nextInt();
        Students[] arrStudent =  this.staticArr.getArrayStudents();
        try{
            Students students = this.findStudentStaticArr(arrStudent,idStudent);
            if(students == null){
                System.out.println("Không tim thấy sinh viên để xóa");
                return;
            }else{
                Integer index =  this.checkIndex(arrStudent, idStudent);
                System.out.println("index" + index);
                deleteStudentById(arrStudent, index);
                System.out.println("Xóa sinh viên thành công");
                System.out.println(Arrays.toString(arrStudent));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
     }

     private void deleteStudentById(Students[] students, Integer index){
              students[index] = null;
              for(int i = index; i < students.length; i++){
                  if(i <= students.length - 2){
                      students[i] = students[i+1];
                  }
              }
              students[students.length - 1] = null;
     }

     private Integer checkIndex(Students[] students, Integer idStudent){
        for(int i = 0; i < students.length; i++) {
            if(students[i].getId() == idStudent){
                return i;
            }
        }
        return null;
     }

    private Students findStudentStaticArr(Students[] studentsArr, Integer id){
        for(Students student: studentsArr){
            if(student.getId() == id){
                return student;
            }
        }
        return null;
    }

    private Students findStudentDynamicArr(List<Students> studentsList, Integer id){
        for(Students student : studentsList){
            if(student.getId() == id){
                return student;
            }
        }
        return  null;
    }
    public void showStaticArr(){
        System.out.println(Arrays.toString(this.staticArr.getArrayStudents()));
    }
    public void showDynamicArr(){
        System.out.println(this.dynamicArray.getStudentsList().toString());
    }

    public void sortPercentLearningAbility(){
        List<Percent> percentsList = new ArrayList<Percent>();
        for(LearningAbility learningAbility : LearningAbility.values()){
               percentsList.add(this.percent(this.dynamicArray.getStudentsList(), learningAbility));
        }
        Collections.sort(percentsList, Comparator.comparingDouble(Percent::getPersent).reversed());
        System.out.println("Sắp xếp từ cao xuống thấp theo học lực");
        for(Percent percent : percentsList){
            System.out.println("Học lực: " + percent.getLearningAbility() + ", Phần trăm: " + percent.getPersent() +  "%" )
          ;
        }
    }
    private Percent percent(List<Students> studentsList, LearningAbility learningAbility){
        Integer count = 0;
        for(Students student : studentsList){
            if(student.getLearningAbility() == learningAbility){
                count++;
            }
        }
        return new Percent(learningAbility, (double) (count * 100 / studentsList.size()));
    }

    public void mediumScore(){
        List<Students> studentsList = this.dynamicArray.getStudentsList();
        Map<Double, Double> mediumScoreMap = this.dynamicArray.getMediumScoreMap();
        for(Students student :  studentsList){
            mediumScoreMap.put(student.getGPA(), this.percentScore(studentsList, (double)(student.getGPA())));
        }
        System.out.println("Sắp xếp % điểm từ thấp lên cao: ");
        for (Map.Entry<Double, Double> entry : mediumScoreMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "%");
        }
    }

    public void getStudentByAbility(){
        List<Students> studentsList = this.dynamicArray.getStudentsList();
        Options.learningAbility();
        int choose = this.scanner.nextInt();
        if(choose != 7){
            Boolean check = false;
            for(Students student : studentsList){
                if(student.getLearningAbility().ordinal()+1 == choose){
                    System.out.println(student);
                    check = true;
                }
            }
            if(!check){
                System.out.println("Không có sinh viên được tìm thay");
            }
         }
    }

    private Double percentScore(List<Students> studentsList, Double score){
        Integer count = 0;
        for(Students student: studentsList){
            if((double)(student.getGPA()) == score){
                count++;
            }
        }
        return (double)(count*100/studentsList.size());
    }
    public void writeFile() throws IOException {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("output.txt"));
            List<Students> students = this.dynamicArray.getStudentsList();
            for (Students student : students) {
                writer.write(student.toString() + "\n");
            }
            System.out.println("Dữ liệu đã được ghi vào file thành công.");
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
    }
     private String enterTheName(){
         String name = null;
      do {
          try {
            System.out.print("Nhập tên (<100 kí tự): ");
            name = this.scanner.nextLine();
            if (Validate.checkLenghtName(name)) {
                System.out.println("tối đa 100 kí tự");
            } else if(name.length() == 0){
                System.out.println("không được bỏ trống");
            }else  {
                break;      
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println(e);
        }
    } while (true);

    return name;
}

    private LocalDate enterTheDate(){
        LocalDate dateOfBird = null;
         do{
             try {
                 System.out.print("Nhập ngày sinh(yyyy-MM-dd): ");
                 dateOfBird = LocalDate.parse(this.scanner.nextLine());
                 if(!Validate.checkOverDate(dateOfBird)){
                        System.out.println("không được quá thời gian hiện tại");
                 }else if(!Validate.chechMinDate(dateOfBird)){
                        System.out.println("Ngày sinh phải sau 1900-01-01");
                 }else break;
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
         }while(true);
        return dateOfBird;
    }

    private String enterTheAddress(){
          String address;
          do{
               System.out.print("Nhập địa chỉ ( < 300 kí tự): ");
               address = this.scanner.nextLine();
               if(Validate.checkAddress(address)){
                   System.out.println("độ dài phải nhỏ hơn 300 kí tự");
               }else if(address.trim().length() == 0) {
                   System.out.println("không được để trống");
               }else break;
          }while (true);
          return address;
    }

    private Double enterTheHeight(){
          Double height;
          do {
              System.out.print("Nhập chiều cao (50 - 300): ");
              String heightString = this.scanner.nextLine();
              if(heightString.trim().length() == 0){
                   System.out.println("Không được để trống");
              }else if(!Validate.checkHeight(Double.parseDouble(heightString))){

                   System.out.println("Chiều cao phải lớn hơn 50cm và nhỏ hơn 300cm");
              }else {
                 height = Double.parseDouble(heightString);
                 break; 
              }
          }while (true);
          return height;
    }

    private Double enterTheWeight(){
        Double weight;
        do {
            System.out.print("Nhập cân nặng ( 5 - 1000): ");
            String weightString = this.scanner.nextLine();
            if(weightString.trim().length() == 0){
                System.out.println("Không được để trống");
            }else if(!Validate.checkWeight(Double.parseDouble(weightString))){

                System.out.println("cân nặng phải lớn hơn 5 và nhỏ hơn 1000");
            }else {
                weight = Double.parseDouble(weightString);
                break;
            }
        }while (true);
        return weight;
    }

    private String enterTheMsv(){
        String msv;
        while (true){
            System.out.print("Nhập MSV ( = 10 kí tự): ");
            msv = this.scanner.nextLine();
            if(msv.trim().length() == 0){
                System.out.println("Không được để trống");
            }else if(!Validate.checkMsv(msv)){
                System.out.println("Mã sinh viên phải có 10 kí tự");

            }else if(Validate.checkForDuplicateCharacters(msv)) {
                System.out.println("Mã sinh viên bị trùng kí tự");
            }else {
                break;
            }
        }
        return msv;
    }

    private String enterTheschoolName(){
        String choolName;
        while (true){
            System.out.print("Nhập SchoolName (<200 kí tự): ");
            choolName = this.scanner.nextLine();
            if(choolName.trim().length() == 0){
                System.out.println("Không được để trống");
            }else if(!Validate.checkSchoolName(choolName)){
                System.out.println("không được quá 199 kí tự");
            }else {
                break;
            }
        }
        return choolName;
    }

    private String enterTheStartYear(){
        String startYear;
        while (true){
            System.out.print("Nhập năm bắt đầu: ");
            startYear = this.scanner.nextLine();
            if(startYear.trim().length() == 0){
                System.out.println("Không được để trống");
            }else if(!Validate.checkStartYear(startYear)){
                System.out.println("phải có 4 kí tự");
            }else {
                break;
            }
        }
        return startYear;
    }

    private Double enterTheGpa(){
        Double gpa;
        while (true){
            System.out.print("Nhập GPA (0.0 - 10.0): ");
            String gpaString = this.scanner.nextLine();
            if(gpaString.trim().length() == 0){
                System.out.println("Không được để trống");
            }else if(!Validate.checkGpa(Double.parseDouble(gpaString))){
                System.out.println("Điểm GPA phải trong khoản từ 0.0 tới 10.0");
            }else {
                gpa = Double.parseDouble(gpaString);
                break;
            };
        }
        return gpa;
    }
}

