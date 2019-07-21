package com.wjx.user.service;


import com.alibaba.dubbo.config.annotation.Reference;
import com.wjx.tecket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * 1、引入dubbo相关依赖
 * 2、配置dubbo的注册中心地址
 * 3、引用服务
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了：" + ticket);
    }

}
