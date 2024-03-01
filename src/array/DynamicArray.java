package array;

import model.Students;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.List;
import java.util.Map;

public class DynamicArray {
    private List<Students> studentsList= new ArrayList<Students>();
    private Map<Double, Double> mediumScoreMap = new TreeMap<Double, Double>();
    public List<Students> getStudentsList(){
        return this.studentsList;
    }
    public Map<Double, Double> getMediumScoreMap(){
        return this.mediumScoreMap;
    }
}
