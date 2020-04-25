package ee.project.schoolsafety;

import java.util.ArrayList;
import java.util.List;

public class SafetySchedule {
    List<AttendanceLog> attendanceLogs;

    public SafetySchedule() {
        attendanceLogs = new ArrayList<>();
    }

    public List<AttendanceLog> getAttendanceLog() {
        return attendanceLogs;
    }

    public void addArrival(AttendanceLog attendanceLog) {
        attendanceLogs.add(attendanceLog);
    }
}
