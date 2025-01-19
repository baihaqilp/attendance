package id.hq.attendance.core.service;

import id.hq.attendance.core.model.Attendance;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AttendanceService {
    public Attendance checkIn(Long userId, String location);
    public Attendance checkout(Long attendanceId);
    public List<Attendance> getAttendanceHistory(Long userId);
}
