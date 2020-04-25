package ee.project.schoolsafety;

import java.util.Date;

public class AttendanceLog {
    private Date dateIn; // arrival
    private Date dateOut;
    private Student student;
    private Guardian guardian;
    private Staff staff;


    public AttendanceLog(Date dateIn, Date dateOut, Student student, Guardian guardian, Staff acknowledger) {
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.student = student;
        this.guardian = guardian;
        this.staff = acknowledger;
    }

    public Date getDateIn() {
        return dateIn;
    }

    public void setDateIn(Date dateIn) {
        this.dateIn = dateIn;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Guardian getGuardian() {
        return guardian;
    }

    public void setGuardian(Guardian guardian) {
        this.guardian = guardian;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
