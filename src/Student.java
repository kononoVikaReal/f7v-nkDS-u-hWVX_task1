import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String group;
    private Integer course;
    private Disciplines discs;
    private final List<Mark> marks;

    Student(String name, String group, Integer course, Disciplines disc) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = new ArrayList<>(disc.getCountOfDisciplines());
        this.discs = disc;
    }

    public double getAverageMark() throws Exception {
        if (marks.isEmpty()) {
            throw new Exception("No marks!");
        }
        double mark = 0;
        for (Mark el : marks) {
            mark += el.getMark();
        }
        return mark / marks.size();
    }

    public void addMark(Mark el) throws Exception {
        if (!discs.existsDiscipline(el.getDiscipline())) throw new Exception("No such discipline for this student!");
        marks.add(el);
    }

    public void transferToNewCourse() {
        course += 1;
        group = group.substring(0, group.length() - 1) + course;
    }

    public Integer getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return name + " - " + group;
    }
}
