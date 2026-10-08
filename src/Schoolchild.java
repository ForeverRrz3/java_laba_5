import java.util.ArrayList;

public class Schoolchild extends Learner {

    private ArrayList<SubjectGrade> yearGrades = new ArrayList<>();
    private ArrayList<Olympiad> olympiads = new ArrayList<>();

    public Schoolchild(String name, String gender, int age) {
        super(name, gender, age);
    }

    public void addGrade(String subject, int grade) {
        yearGrades.add(new SubjectGrade(subject, grade));
    }

    public void addOlympiad(String subject, String level, int place) {
        olympiads.add(new Olympiad(subject, level, place));
    }

    public boolean hasFirstPlace() {
        for (Olympiad o : olympiads)
            if (o.getPlace() == 1)
                return true;
        return false;
    }

    private boolean isKeySubject(String subject) {
        return subject.equals("Математика") || subject.equals("Русский язык") || subject.equals("История") || subject.equals("Английский язык");
    }

    private boolean hasGoodOlympiadResult() {
        for (Olympiad o : olympiads) {
            if (o.getLevel().equals("областная"))
                return true;
            if (o.getLevel().equals("школьная") && o.getPlace() == 1)
                return true;
            if (o.getLevel().equals("городская") && o.getPlace() >= 1 && o.getPlace() <= 3)
                return true;
        }
        return false;
    }

    @Override
    public double getAverageMark() {
        return average(yearGrades);
    }

    @Override
    public boolean hasSpecialScholarship() {
        int keyFives = 0;
        for (SubjectGrade g : yearGrades) {
            if (isKeySubject(g.getSubject())) {
                if (g.getGrade() != 5)
                    return false;
                keyFives++;
            } else if (g.getGrade() < 4) {
                return false;
            }
        }

        return keyFives == 4 && hasGoodOlympiadResult();
    }

    @Override
    public String toString() {
        return "Школьник " + super.toString() + "\n  Оценки: " + yearGrades + "\n  Олимпиады: " + olympiads;
    }
}
