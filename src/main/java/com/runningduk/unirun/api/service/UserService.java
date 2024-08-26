package com.runningduk.unirun.api.service;

import com.runningduk.unirun.domain.model.KakaoLogoutModel;
import com.runningduk.unirun.domain.model.UserModel;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

public interface UserService {
    public UserModel getKakaoId(String code, HttpServletRequest request);
    public UserModel selectUser(String userId);
    public int insertUser(UserModel userModel);
    public int updateUser(UserModel userModel);
    public int deleteUser(String code);
    public int kakaoLogout(HttpServletRequest request);
    public KakaoLogoutModel getKakaLogOutInfo();
}
