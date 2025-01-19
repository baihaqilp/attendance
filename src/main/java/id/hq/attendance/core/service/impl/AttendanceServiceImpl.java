package id.hq.attendance.core.service.impl;

import id.hq.attendance.core.model.Attendance;
import id.hq.attendance.core.model.User;
import id.hq.attendance.core.repository.AttendanceRepository;
import id.hq.attendance.core.service.AttendanceService;

import java.time.LocalDateTime;
import java.util.List;

public class AttendanceServiceImpl implements AttendanceService {
    private AttendanceRepository attendanceRepository;

    public AttendanceServiceImpl(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    @Override
    public Attendance checkIn(Long userId, String location) {
        Attendance attendance = new Attendance();
        attendance.setUser(new User(userId));
        attendance.setCheckInTime(LocalDateTime.now());
        attendance.setLocation(location);

        return attendanceRepository.save(attendance);
    }

    @Override
    public Attendance checkout(Long attendanceId) {
        Attendance attendance = attendanceRepository.findById(attendanceId).orElseThrow(() -> new RuntimeException("attendance not found")) ;
        attendance.setCheckOutTime(LocalDateTime.now());
        return attendanceRepository.save(attendance);
    }

    @Override
    public List<Attendance> getAttendanceHistory(Long userId) {
        return attendanceRepository.findByUserId(userId);
    }
}
