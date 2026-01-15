package com.umutyenidil.springmcpdemo.conference;

public record Session(
        String day,
        String time,
        String title,
        String type,
        String[] speakers,
        String room
) {
}
