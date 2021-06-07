package com.learning.learning.controller;

import cn.dev33.satoken.exception.NotRoleException;
import cn.dev33.satoken.stp.StpUtil;
import com.learning.learning.config.satoken.AuthConst;
import com.learning.learning.grpc.ManagerOperationRequest;
import com.learning.learning.grpc.ManagerOperationResponse;
import com.learning.learning.grpc.ManagerOperationServiceGrpc;
import com.learning.learning.util.sg.AjaxJson;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author jbk-xiao
 * @version 2021-06-02-14:55
 */
@Slf4j
@CrossOrigin("*")
@RequestMapping("/managerOperation/")
@RestController
@Api(tags = "负责管理员用户的社群内活动api")
public class ManagerOperationController {
    private final ManagerOperationServiceGrpc.ManagerOperationServiceBlockingStub managerOperationServiceBlockingStub;

    public ManagerOperationController(ManagerOperationServiceGrpc.ManagerOperationServiceBlockingStub managerOperationServiceBlockingStub) {
        this.managerOperationServiceBlockingStub = managerOperationServiceBlockingStub;
    }

    @ApiOperation(value = "管理员进行评论、心得的审核")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "contentId", value = "心得/评论ID"),
            @ApiImplicitParam(name = "isChecked", value = "是否审核通过", dataType = "boolean")
    })
    @PutMapping("/ncStatus")
    public AjaxJson putNCStatus(@RequestParam("contentId") String contentId, @RequestParam("isChecked") boolean isChecked,
                                HttpServletResponse httpServletResponse) {
        try {
            StpUtil.hasRole(AuthConst.R1);
        } catch (NotRoleException notRoleException) {
            httpServletResponse.setStatus(AjaxJson.CODE_NOT_JUR);
            return AjaxJson.getNotJur("不是管理员。");
        }
        if (contentId.isEmpty() || (contentId.charAt(0) != 'n' && contentId.charAt(0) != 'c')) {
            httpServletResponse.setStatus(AjaxJson.CODE_INVALID_REQUEST);
            return AjaxJson.get(AjaxJson.CODE_INVALID_REQUEST, "Wrong contentId!");
        }
        ManagerOperationResponse managerOperationResponse = this.managerOperationServiceBlockingStub.putNCStatus(
                ManagerOperationRequest.newBuilder().setContentId(contentId).setIsChecked(isChecked).build());
        boolean isCompleted = managerOperationResponse.getIsCompleted();
        if (isCompleted) {
            return AjaxJson.getSuccess();
        } else {
            return AjaxJson.getError();
        }
    }

    @ApiOperation(value = "用户积分“强制管理”")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "deltaScore", value = "积分变化量，正或负", dataType = "double"),
            @ApiImplicitParam(name = "userId", value = "要修改积分的用户的ID")
    })
    @PutMapping("/score")
    public AjaxJson putScore(@RequestParam("deltaScore") double deltaScore, @RequestParam("userId") String userId,
                             HttpServletResponse httpServletResponse) {
        try {
            StpUtil.hasRole(AuthConst.R1);
        } catch (NotRoleException notRoleException) {
            httpServletResponse.setStatus(AjaxJson.CODE_NOT_JUR);
            return AjaxJson.getNotJur("不是管理员。");
        }
        ManagerOperationResponse managerOperationResponse = this.managerOperationServiceBlockingStub.putScore(
                ManagerOperationRequest.newBuilder().setDeltaScore(deltaScore).setUserId(userId).build());
        boolean isCompleted = managerOperationResponse.getIsCompleted();
        if (isCompleted) {
            return AjaxJson.getSuccess();
        } else {
            return AjaxJson.getError();
        }
    }
    /**
     *   一般用户增删改查：单用户/多用户，controller层获取传输的内容，service层进行单用户添加及循环单用户方法多用户添加。
     */

    @ApiOperation(value = "管理员添加单个一般用户")
    @PostMapping("/user")
    public AjaxJson postUser() {
        //TODO 完成管理员添加单个用户逻辑
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员批量添加一般用户")
    @PostMapping("/users")
    public AjaxJson postUsers() {
        //TODO 完成管理员批量添加用户逻辑
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员删除单个用户")
    @DeleteMapping("/user")
    public AjaxJson deleteUser() {
        //TODO 完成管理员删除单个用户逻辑
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员批量删除用户")
    @DeleteMapping("/users")
    public AjaxJson deleteUsers() {
        //TODO 完成管理员批量删除用户逻辑
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员更新单个用户信息")
    @PutMapping("/user")
    public AjaxJson putUser() {
        //TODO 完成管理员更新单个用户信息逻辑
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员批量更新用户信息")
    @PutMapping("/users")
    public AjaxJson putUsers() {
        //TODO 完成管理员批量更新用户信息逻辑
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员查询单个用户信息")
    @GetMapping("/user")
    public AjaxJson getUser() {
        //TODO 完成管理员查询单个用户信息接口
        return AjaxJson.getSuccess();
    }

    @ApiOperation(value = "管理员批量查询用户信息")
    @GetMapping("/users")
    public AjaxJson getUsers() {
        //TODO 完成管理员批量查询用户信息接口
        return AjaxJson.getSuccess();
    }
}
