import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 * Created by gaelen on 10/10/2016.
 */
public class ProgrammeClasses {

    String Course;
    ArrayList<Module> listOfModules = new ArrayList<Module>();
    LocalDate Start,End;

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }

    @Override
    public String toString() {
        return "ProgrammeClasses{" +
                "Course='" + Course + '\'' +
                '}';
    }

    public ArrayList<Module> getListOfModules() {
        return listOfModules;
    }

    public void setListOfModules(ArrayList<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public LocalDate getStart() {
        return Start;
    }

    public void setStart(LocalDate start) {
        Start = start;
    }

    public LocalDate getEnd() {
        return End;
    }

    public void setEnd(LocalDate end) {
        End = end;
    }
}
