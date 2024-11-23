public class Mark {
    private final String discipline;
    private Integer mark;
    Mark(String disc, Integer mark) {
        this.discipline = disc;
        this.mark = mark;
    }

    public String getDiscipline() {
        return discipline;
    }

    public Integer getMark() {
        return mark;
    }
}
