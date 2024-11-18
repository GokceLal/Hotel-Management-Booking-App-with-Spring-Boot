package org.example.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.example.dto.BookingDto;
import org.example.dto.RoomDto;
import org.example.dto.UserDto;

import java.util.List;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private int statusCode;
    private String message;
    private String token;
    private String role;
    private String expirationDate;
    private String bookingConfirmationCode;
    private UserDto user;
    private RoomDto room;
    private List<UserDto> userList;
    private List<RoomDto> roomList;
    private List<BookingDto> bookingList;



}
