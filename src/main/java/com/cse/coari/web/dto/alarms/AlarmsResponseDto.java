package com.cse.coari.web.dto.alarms;

import com.cse.coari.domain.alarms.Alarms;
import lombok.Getter;

@Getter
public class AlarmsResponseDto {
    private Long alarm_id;
    private String title;
    private String content;
    private String author;
    private String send_time;
    private String read_mark;
    private String visibility;


    public AlarmsResponseDto(Alarms entity) {
        this.alarm_id = entity.getAlarm_id();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.send_time = entity.getSend_time();
        this.read_mark = entity.getRead_mark();
        this.visibility = entity.getVisibility();
    }

}
