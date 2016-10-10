import java.util.ArrayList;

/**
 * Created by gaelen on 10/10/2016.
 */
public class Module {

    String moduleName, moduleID;
    ArrayList<Student> Students = new ArrayList<Student>();

    public String getModuleName() {
        return moduleName;
    }

    @Override
    public String toString() {
        return "Module{" +
                "moduleName='" + moduleName + '\'' +
                '}';
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }

    public ArrayList<Student> getStudents() {
        return Students;
    }

    public void setStudents(ArrayList<Student> students) {
        Students = students;
    }
}
