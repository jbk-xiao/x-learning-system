package com.learning.learning.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.learning.learning.grpc.CommunityLoggedServiceGrpc;
import com.learning.learning.grpc.UserInfoRequest;
import com.learning.learning.grpc.UserInfoResponse;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jbk-xiao
 * @version 2021-05-16-23:44
 */
@GRpcService
@Slf4j
@Service
public class CommunityLoggedServiceImpl extends CommunityLoggedServiceGrpc.CommunityLoggedServiceImplBase {
    private final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private final CommunityLoggedUserInfo communityLoggedUserInfo;

    @Autowired
    public CommunityLoggedServiceImpl(CommunityLoggedUserInfo communityLoggedUserInfo) {
        this.communityLoggedUserInfo = communityLoggedUserInfo;
    }

    @Override
    public void getUserInfo(UserInfoRequest request, StreamObserver<UserInfoResponse> responseObserver) {
        String userId = request.getUserId();
        String userInfo = communityLoggedUserInfo.getUserInfo(userId);
        UserInfoResponse response = UserInfoResponse.newBuilder()
                .setUserInfo(userInfo).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}