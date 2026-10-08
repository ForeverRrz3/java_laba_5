import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Schoolchild> schoolchildren = createSchoolchildren();
        ArrayList<Student> students = createStudents();

        System.out.println("Девочки с первыми местами на олимпиадах:");
        for (Schoolchild s : schoolchildren)
            if (s.isFemale() && s.hasFirstPlace())
                System.out.println(s);

        System.out.println("\nСтуденты с оценками за курсовые:");
        for (Student s : students)
            if (s.hasCourseworks())
                System.out.println(s);

        ArrayList<Learner> all = new ArrayList<>();
        all.addAll(schoolchildren);
        all.addAll(students);

        System.out.println("\nКандидаты на специальную стипендию:");
        ArrayList<Learner> candidates = new ArrayList<>();
        for (Learner l : all)
            if (l.hasSpecialScholarship()){
                candidates.add(l);
                System.out.println(l);
            }
    }

    private static Schoolchild createSchoolchild(String name, String gender, int age,
                                                 int math, int russian, int history, int english,
                                                 int literature, int physics, int biology) {
        Schoolchild s = new Schoolchild(name, gender, age);
        s.addGrade("Математика", math);
        s.addGrade("Русский язык", russian);
        s.addGrade("История", history);
        s.addGrade("Английский язык", english);
        s.addGrade("Литература", literature);
        s.addGrade("Физика", physics);
        s.addGrade("Биология", biology);
        return s;
    }

    private static ArrayList<Schoolchild> createSchoolchildren() {
        ArrayList<Schoolchild> list = new ArrayList<>();

        Schoolchild anya = createSchoolchild("Аня", "ж", 15, 5, 5, 5, 5, 4, 5, 5);
        anya.addOlympiad("Математика", "школьная", 1);
        list.add(anya);

        Schoolchild masha = createSchoolchild("Маша", "ж", 14, 5, 5, 5, 5, 5, 3, 4);
        masha.addOlympiad("История", "городская", 1);
        list.add(masha);


        Schoolchild ivan = createSchoolchild("Иван", "м", 16, 5, 5, 5, 5, 4, 4, 4);
        ivan.addOlympiad("Физика", "областная", 0);
        list.add(ivan);

        Schoolchild olya = createSchoolchild("Оля", "ж", 13, 5, 5, 5, 5, 5, 5, 5);
        olya.addOlympiad("Английский язык", "школьная", 2);
        list.add(olya);

        Schoolchild vanya = createSchoolchild("Ваня", "м", 15, 5, 5, 4, 5, 5, 5, 5);
        vanya.addOlympiad("Математика", "городская", 1);
        list.add(vanya);

        Schoolchild veronika = createSchoolchild("Вероника", "ж", 16, 5, 5, 5, 5, 4, 5, 4);
        veronika.addOlympiad("Русский язык", "городская", 3);
        veronika.addOlympiad("Литература", "областная", 1);
        list.add(veronika);

        return list;
    }

    private static Student createStudent(String name, String gender, int age,
                                         int math, int programming, int physics, int history) {
        Student s = new Student(name, gender, age);
        s.addSessionGrade("Математика", math);
        s.addSessionGrade("Программирование", programming);
        s.addSessionGrade("Физика", physics);
        s.addSessionGrade("История", history);
        return s;
    }

    private static ArrayList<Student> createStudents() {
        ArrayList<Student> list = new ArrayList<>();

        Student lesha = createStudent("Лёша", "м", 20, 5, 5, 5, 5);
        lesha.addCourseworkGrade("Программирование", 5);
        list.add(lesha);

        Student dasha = createStudent("Даша", "ж", 19, 5, 5, 5, 4);
        dasha.addCourseworkGrade("Математика", 5);
        dasha.addCourseworkGrade("Программирование", 5);
        list.add(dasha);

        Student seryozha = createStudent("Серёжа", "м", 18, 5, 5, 5, 5);
        list.add(seryozha);

        Student katya = createStudent("Катя", "ж", 21, 5, 5, 5, 5);
        katya.addCourseworkGrade("Программирование", 4);
        list.add(katya);

        Student dima = createStudent("Дима", "м", 20, 5, 4, 4, 5);
        dima.addCourseworkGrade("Математика", 5);
        list.add(dima);

        return list;
    }
}
