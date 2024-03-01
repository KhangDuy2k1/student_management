package validate;
import Constant.Constant;
import java.time.LocalDate;
public class Validate {
    public static Boolean checkLenghtName(String name){
        return name.length() > Constant.MAX_LENGHT_NAME;
    }
    public static Boolean checkOverDate(LocalDate dateOfBird){
        return dateOfBird.isBefore(Constant.NOW);
    }
    public static Boolean chechMinDate(LocalDate dateOfBird){return dateOfBird.isAfter(Constant.MIN_DATE);}
    public static Boolean checkAddress(String address){
        return address.length() > Constant.MAX_LENGTH_ADDRESS;
    }
    public static Boolean checkHeight(Double height){
        return height > Constant.MIN_HEIGHT && height <= Constant.MAX_HEIGHT;
    }
    public static Boolean checkWeight(Double weight){
        return weight > Constant.MIN_WEIGHT && weight <= Constant.MAX_WEIGHT;
    }
    public static Boolean checkMsv(String msv){
        return msv.trim().length() == Constant.NUMBER_OF_CHARACTERS_MSV;
    }
    public static Boolean checkSchoolName(String schoolName){
        return schoolName.length() <= Constant.MAX_LENGHT_SCHOOL_NAME;
    }
    public static Boolean checkStartYear(String startYear){
        return startYear.length() == Constant.NUMBER_OF_CHARACTERS_START_YEARS;
    }
    public static Boolean checkGpa(Double gpa) {
        return gpa > Constant.MIN_GPA && gpa < Constant.MAX_GPA;
    }
    public static Boolean checkForDuplicateCharacters(String str){
            String[] charArray = str.trim().split("");

            for(int i = 0; i < charArray.length; i++){
                for(int j = i + 1; j < charArray.length; j++){
                    if(charArray[i].equals(charArray[j])){
                        return true;
                    }
                }
            }
            return false;
    }
}
