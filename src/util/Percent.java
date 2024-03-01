package util;

import model.LearningAbility;

public class Percent {
    private LearningAbility learningAbility;
    private Double persent;
    public Percent(LearningAbility learningAbility, Double persent){
        this.learningAbility = learningAbility;
        this.persent = persent;
    }
    public LearningAbility getLearningAbility() {
        return learningAbility;
    }
    public void setLearningAbility(LearningAbility learningAbility) {
        this.learningAbility = learningAbility;
    }
    public Double getPersent() {
        return persent;
    }

    public void setPersent(Double persent) {
        this.persent = persent;
    }

    @Override
    public String toString() {
        return "Percent{" +
                "learningAbility=" + learningAbility +
                ", persent=" + persent +
                '}';
    }


}
