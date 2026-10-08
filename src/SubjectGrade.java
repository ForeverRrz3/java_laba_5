// Оценка по одному предмету (годовая оценка, экзамен в сессии или курсовая)
public class SubjectGrade {
    private String subject;
    private int grade;

    public SubjectGrade(String subject, int grade) {
        if (grade < 2 || grade > 5)
            throw new IllegalArgumentException("Оценка должна быть от 2 до 5");
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return subject + ": " + grade;
    }
}
