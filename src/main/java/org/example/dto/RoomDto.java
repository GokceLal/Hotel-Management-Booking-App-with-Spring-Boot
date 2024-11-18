package org.example.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.example.entity.Booking;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RoomDto {
    private Long id;
    private String roomType;
    private String roomPrice;
    private String roomPhotoUrl;
    private String roomDescription;
    private List<BookingDto> bookings;
}