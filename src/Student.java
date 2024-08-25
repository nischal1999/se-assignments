import java.time.LocalDate;

public class Student {
    private String studentId;
    private String name;
    private LocalDate dateOfAdmission;

    // Default constructor
    public Student() {}

    // Constructor with all fields
    public Student(String studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    // Constructor with studentId and name
    public Student(String studentId, String name) {
        this(studentId, name, LocalDate.now());
    }

    // Getters and Setters
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", dateOfAdmission=" + dateOfAdmission +
                '}';
    }
}
