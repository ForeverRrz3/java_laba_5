abstract public class Learner {
    private String name, gender;
    private int age;

    public Learner(String name, String gender, int age){
        if (age <= 0)
            throw new IllegalArgumentException("Возраст должен быть положительным");
        this.age = age;
        this.gender = gender;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public boolean isFemale() {
        return gender.equals("ж");
    }

    public abstract boolean hasSpecialScholarship();

    public abstract double getAverageMark();

    protected static double average(java.util.ArrayList<SubjectGrade> grades) {
        if (grades.isEmpty())
            return 0;
        int sum = 0;
        for (SubjectGrade g : grades)
            sum += g.getGrade();
        return (double) sum / grades.size();
    }

    @Override
    public String toString() {
        return name + ", пол: " + gender + ", возраст: " + age
                + String.format(", средний балл: %.2f", getAverageMark());
    }
}
