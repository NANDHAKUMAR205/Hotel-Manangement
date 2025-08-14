package com.nandy.springMaster.service.interfac;

import com.nandy.springMaster.dto.LoginRequest;
import com.nandy.springMaster.dto.Response;
import com.nandy.springMaster.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
