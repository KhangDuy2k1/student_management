package array;

import model.Students;

public class StaticArray {
    private Students[] students;
    public Students[] getArrayStudents() {
        return this.students;
    }
    public void setSize(Integer sizeArr){
        this.students = new Students[sizeArr];
    }
}
