import java.util.HashSet;
import java.util.Set;

public class Disciplines {
    private final Set<String> disciplines;

    {
        disciplines = new HashSet<>();
    }

    Disciplines() {}
    Disciplines(Set<String> readyDisc) {
        disciplines.addAll(readyDisc);
    }
    public void addDiscipline(String disc) {
        disciplines.add(disc);
    }

    public void removeDiscipline(String disc) {
        disciplines.remove(disc);
    }

    public Integer getCountOfDisciplines() {
        return disciplines.size();
    }

    public boolean existsDiscipline(String checkDisc) {
        for (String el : disciplines) {
            if (el.equals(checkDisc)) return true;
        }
        return false;
    }
}
