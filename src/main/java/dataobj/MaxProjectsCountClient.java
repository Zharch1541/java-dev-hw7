package dataobj;

public class MaxProjectsCountClient {
    private String name;
    private int projectCount;

    public MaxProjectsCountClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "MaxProjectsCountClient{name='" + name + "', projectCount=" + projectCount + "}";
    }
}
