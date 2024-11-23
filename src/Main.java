import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printStudents(List<Student> students, int course) {
        System.out.println("[+]List of students at course " + course + "[+]");
        for (Student el : students) {
            if (el.getCourse() == course) {
                System.out.println(el);
            }
        }
    }

    public static void checkStudents(List<Student> students) throws Exception {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageMark() < 3.0) {
                students.remove(students.get(i));
            } else {
                students.get(i).transferToNewCourse();
            }
        }
    }

    public static void main(String[] args) {
        Disciplines disciplines_1 = new Disciplines();
        disciplines_1.addDiscipline("Math");
        disciplines_1.addDiscipline("Russian Language");
        disciplines_1.addDiscipline("English Language");
        disciplines_1.addDiscipline("Physical Culture");
        Disciplines disciplines_2 = new Disciplines();
        disciplines_2.addDiscipline("Math");
        disciplines_2.addDiscipline("English Language");
        Student Anna = new Student("Anna", "3AS-1", 1, disciplines_1);
        Student Yuna = new Student("Yuna", "3DS-3", 3, disciplines_2);
        Student Masha = new Student("Masha", "2AS-1", 1, disciplines_2);
        List<Student> students = new ArrayList<>();
        students.add(Anna);
        students.add(Yuna);
        students.add(Masha);
        try {
            Anna.addMark(new Mark("Math", 5));
            Anna.addMark(new Mark("English Language", 5));
            Anna.addMark(new Mark("Physical Culture", 5));
            Yuna.addMark(new Mark("Math", 5));
            Yuna.addMark(new Mark("Math", 3));
            Masha.addMark(new Mark("Math", 2));
            Masha.addMark(new Mark("English Language", 3));
            System.out.println("[-]Before[-]");
            for (int i = 1; i < 6; i++) {
                printStudents(students, i);
            }
            checkStudents(students);
            System.out.println();
            System.out.println("[-]After[-]");
            for (int i = 1; i < 6; i++) {
                printStudents(students, i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
