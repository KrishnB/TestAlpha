package core;

/**
 * Created by tvserver on 19/10/16.
 */
public class Department {

    String depId;
    String depName;

    public Department(String id, String name)
    {
        this.depId = id;
        this.depName = name;
    }

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
