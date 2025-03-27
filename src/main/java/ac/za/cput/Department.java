package ac.za.cput.domain;

public class Department {

    private String departmentId;
    private String departmentName;

private Department(Builder builder) {

    this.departmentId = builder.departmentId;
    this.departmentName = builder.departmentName;
}

public String getDepartmentIdId() {

    return departmentId;
}

public String getDepartmentName() {

    return departmentName;
}

@Override
public String toString() {
    return "Department{" +
            "DepartmentId='" + departmentId + '\'' +
            ", departmentName='" + departmentName + '\'' +
            '}';
}
    public static class Builder {

    }
        private String departmentId;

        private String departmentName;


        public Department.Builder setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Department.Builder setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
    }