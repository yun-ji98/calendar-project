package com.example.calendar.service;

import com.example.calendar.dto.ResponseDto;
import com.example.calendar.entity.Schedule;
import com.example.calendar.repository.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Transactional(readOnly = true)
    public List<ResponseDto> getAll() {
        List<Schedule> schedules = scheduleRepository.findAll();
        List<ResponseDto> dtos = new ArrayList<>();

        for (Schedule schedule : schedules) {
            ResponseDto dto = new ResponseDto(
                    schedule.getId(),
                    schedule.getWriter(),
                    schedule.getTitle(),
                    schedule.getMessage()
            );
            dtos.add(dto);
        }
        return dtos;
    }


}