package com.hotel_mgt_system.hotel_mgt_system.service.interfac;

import com.hotel_mgt_system.hotel_mgt_system.dto.LoginRequest;
import com.hotel_mgt_system.hotel_mgt_system.dto.Response;
import com.hotel_mgt_system.hotel_mgt_system.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
