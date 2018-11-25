package org.mashup.bluemoon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
public class ScheduleDto {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String name;

    @JsonProperty(value = "start_date")
    private LocalDateTime startDate;

    @JsonProperty(value ="end_date")
    private LocalDateTime endDate;

    @JsonProperty
    private String location;

    @JsonProperty
    private Boolean notification;

    @JsonProperty
    private String url;

    @Builder
    public ScheduleDto(long id, String name, LocalDateTime startDate, LocalDateTime endDate, String location, boolean notification, String url){
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.notification = notification;
        this.url = url;
    }

}
