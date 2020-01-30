package com.app.roadz.controller;


import com.app.roadz.model.BaseModel.BaseModel;
import com.app.roadz.model.BaseModel.ListBaseResponse;
import com.app.roadz.model.BaseModel.ObjectBaseResponse;
import com.app.roadz.model.NotificationStatus;
import com.app.roadz.model.TNotification;
import com.app.roadz.model.TUser;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserController {

    @FormUrlEncoded
    @POST("user/login")
    public Call<ObjectBaseResponse<TUser>> Login(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("user")
    public Call<ObjectBaseResponse<TUser>> SignUp(@FieldMap Map<String, String> params);

 @FormUrlEncoded
    @POST("user/check_register_data")
    public Call<ObjectBaseResponse<TUser>> checkRegisterData(@FieldMap Map<String, String> params);

 @FormUrlEncoded
    @POST("user/resend_verify_email")
    public Call<ObjectBaseResponse<TUser>> resendVerifyEmail(@FieldMap Map<String, String> params);


    @FormUrlEncoded
    @POST("password/email")
    public Call<ObjectBaseResponse<TUser>> ForgetPassword(@FieldMap Map<String, String> params);

    @GET("user")
    public Call<ObjectBaseResponse<TUser>> GetProfile();


    @POST("user/logout")
    public Call<ObjectBaseResponse<TUser>> Logout();

    @FormUrlEncoded
    @POST("user/update")
    public Call<ObjectBaseResponse<TUser>> UpdateProfile(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("user/password")
    public Call<ObjectBaseResponse<TUser>> UpdatePassword(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("user/token")
    public Call<ObjectBaseResponse<TUser>> SendFcmToken(@FieldMap Map<String, String> params);

    @GET("user/notification")
    public Call<ListBaseResponse<TNotification>> getNotification();

    @FormUrlEncoded
    @POST("user/notification/read")
    public Call<BaseModel> MakeNotificationRead(@FieldMap Map<String, String> params);
    @FormUrlEncoded
    @POST("user/notificationsetting")
    public Call<BaseModel> notificationsetting(@FieldMap Map<String, String> params);

    @FormUrlEncoded
    @POST("user/usernotification")
    public Call<NotificationStatus> usernotification(@FieldMap Map<String, String> params);
}