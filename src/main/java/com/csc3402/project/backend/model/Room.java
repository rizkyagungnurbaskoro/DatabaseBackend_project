package com.csc3402.project.backend.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_num")
    private Integer roomNum;

    @Column(name = "room_type")
    private String roomType;

    @Column(name = "nights")
    private Integer nights;

    @Column(name = "desc")
    private String desc;

    @ManyToMany(mappedBy = "rooms")
    private List<Booking> bookings;

    public Room() {}

    public Room(String roomType, Integer nights, String desc) {
        this.roomType = roomType;
        this.nights = nights;
        this.desc = desc;
    }

    // Getters and Setters
    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public Integer getNights() {
        return nights;
    }

    public void setNights(Integer nights) {
        this.nights = nights;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
