package com.aiz.zhelimall.order;

import com.aiz.zhelimall.order.entity.OrderEntity;
import com.aiz.zhelimall.order.service.OrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
class ZheliOrderApplicationTests {

    @Autowired
    OrderService orderService;

    @Test
    void contextLoads() {
    }

    @Test
    void saveOrder(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderSn("A11223344");
        orderEntity.setPayAmount(new BigDecimal(9.9));
        orderService.save(orderEntity);
        System.out.println("保存成功...");
    }

    @Test
    void updateOrder(){
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setId(1L);
        orderEntity.setBillContent("ddd");
        orderService.updateById(orderEntity);
        System.out.println("更新成功...");
    }

    @Test
    void queryOrder(){
        List<OrderEntity> list = orderService.list(new QueryWrapper<OrderEntity>().eq("id",1));
        list.forEach((item)->{
            System.out.println(item);
        });
    }

}
