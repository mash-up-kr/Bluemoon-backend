package org.mashup.bluemoon.controller;

import org.mashup.bluemoon.dto.ScheduleDto;
import org.mashup.bluemoon.model.ApiResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class ScheduleController {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @GetMapping("/schedule/list")
    public ApiResponseModel<ScheduleDto> getSchedules(){
        ApiResponseModel<ScheduleDto> response = new ApiResponseModel<>();

        ScheduleDto scheduleDto1, scheduleDto2, scheduleDto3;

        scheduleDto1 = ScheduleDto.builder()
                .id(1L)
                .name("구로역 팬싸인회")
                .startDate(LocalDateTime.parse("2018-12-10 18:00:00", formatter))
                .endDate(LocalDateTime.parse("2018-12-10 20:00:00",formatter))
                .location("구로역 3번 출구")
                .notification(true)
                .url("http://bts.ibighit.com/")
                .build();

        scheduleDto2 = ScheduleDto.builder()
                .id(2L)
                .name("쇼케이스")
                .startDate(LocalDateTime.parse("2018-12-15 18:00:00",formatter))
                .endDate(LocalDateTime.parse("2018-12-15 22:00:00",formatter))
                .location("잠실 체조경기장")
                .notification(false)
                .url("http://bts.ibighit.com/")
                .build();

        scheduleDto3 = ScheduleDto.builder()
                .id(3L)
                .name("음악중심 사전 녹화")
                .startDate(LocalDateTime.parse("2018-12-31 18:00:00",formatter))
                .endDate(LocalDateTime.parse("2018-12-31 20:00:00",formatter))
                .location("일산 MBC")
                .notification(true)
                .url("http://bts.ibighit.com/")
                .build();

        List<ScheduleDto> schedules = new ArrayList<>();
        schedules.add(scheduleDto1);
        schedules.add(scheduleDto2);
        schedules.add(scheduleDto3);

        response.setCode(HttpStatus.OK.value());
        response.setMsg(HttpStatus.OK.toString());
        response.setResult(schedules);

        return response;
    }

}
