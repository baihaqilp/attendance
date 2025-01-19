package id.hq.attendance.core.service;

import id.hq.attendance.core.model.Schedule;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ScheduleService {
    public Schedule createSchedule(Schedule schedule);
    public List<Schedule> getUserSchedules(Long userId);
}
