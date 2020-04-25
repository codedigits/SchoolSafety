package ee.project.schoolsafety;

import java.util.Date;
import java.util.List;

public class SchoolAdministration {

    public static void main(String[] args) {
        SafetySchedule safetySchedule = new SafetySchedule();

        Student feyi = new Student("James", "Feyio");
        Student matthew = new Student("James", "Matthew");
        Staff mrsFaith = new Staff("Faith Akpabio");
        Guardian feyisMum = new Guardian("James", "Priscilla");


        AttendanceLog attendanceLog = new AttendanceLog(new Date(), null, feyi, feyisMum, mrsFaith);
        AttendanceLog seconAttendance = new AttendanceLog(new Date(), null, matthew, feyisMum, mrsFaith);

        safetySchedule.addArrival(attendanceLog);
        safetySchedule.addArrival(seconAttendance);

        // ------------------- At the end of assembly ---------
        List<AttendanceLog> attendanceLogAfterAss = safetySchedule.getAttendanceLog();
        for (AttendanceLog log: attendanceLogAfterAss) {
            System.out.println("---------------------------------------");
            System.out.println("Student name:" + log.getStudent().getSurnname() + " " + log.getStudent().getFirstname());
            System.out.println("Parent name:" + log.getGuardian().getSurnname() + " " + log.getGuardian().getFirstname());
            System.out.println("Date of entry:" + log.getDateIn());
            System.out.println("Acknowledged Staff:" + log.getStaff().getFullname());

            System.out.println("---------------------------------------");
        }

        System.out.println(safetySchedule.getAttendanceLog().size());
    }
}
