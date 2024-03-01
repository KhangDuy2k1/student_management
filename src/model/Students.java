package model;

import java.time.LocalDate;

public class Students extends People {
      private String msv;
      private String schoolName;
      private String startYear;
      private Double GPA;
      private LearningAbility learningAbility;
    public Students(){

    }
    public Students(String name, LocalDate dateOfBird, String address, Double height, Double weight, String msv, String schoolName, String startYear, Double GPA) {
        super(name, dateOfBird, address, height, weight);
        this.msv = msv;
        this.schoolName = schoolName;
        this.startYear = startYear;
        this.GPA = GPA;
        this.setLearningAbility();
    }


    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }
    public LearningAbility getLearningAbility(){
        return this.learningAbility;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {

        this.GPA = GPA;
        this.setLearningAbility();
    }

    @Override
    public String toString() {
        return "Students{" +
                "id: '" + this.getId() +"', " +
                "name: '" + this.getName() + "', " +
                "dateOfBird: '" + this.getDateOfBird() + "', " +
                "address: '" + this.getAddress() +"', " +
                "height: '" + this.getHeight() +"', " +
                "weight: '" + this.getWeight() +"', " +
                "msv='" + msv + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", startYear=" + startYear +
                ", GPA=" + GPA +
                ", learningAbility=" + this.learningAbility +
                '}';
    }
    public void setLearningAbility(){
        if(this.GPA < 3){
            this.learningAbility = LearningAbility.KEM;
        }else if(this.GPA >= 3 && this.GPA < 5){
            this.learningAbility = LearningAbility.YEU;
        }else if(this.GPA >= 5 && this.GPA < 6.5){
            this.learningAbility = LearningAbility.TRUNG_BINH;
        }else if(this.GPA >= 6.5 && this.GPA < 7.5){
            this.learningAbility = LearningAbility.KHA;
        } else if (this.GPA >= 7.5 && this.GPA < 9) {
            this.learningAbility = LearningAbility.GIOI;
        } else {
            this.learningAbility = LearningAbility.XUAT_SAC;
        }
    }
}
