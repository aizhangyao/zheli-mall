package com.aiz.zhelimall.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 一.整合Mybatis-Plus
 *  (一).导入依赖
 *       <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *  (二).配置
 *      1.配置数据源
 *          (1).导入数据库驱动。
 *          (2).在application.yml配置数据源相关信息
 *      2.配置MyBatis-Plus
 *          (1).使用@MapperScan
 *          (2).高速MyBatis-Plus，sql映射文件位置
 *二.逻辑删除
 *  (一).配置全局的逻辑删除规则 (省略)
 *  (二).配置逻辑删除的组件Bean (高版本可以省略)
 *  (三).给Bean加上逻辑删除注解@TableLogic
 *
 * 三.JSR303
 *  (一).给Bean添加校验注解 @Email @NotNull在javax.validation.constraints包下
 *      @NotBlank
 *      private String name;
 *  (二).开启校验功能@Valid
 *      public R save(@Valid @RequestBody BrandEntity brand)
 *      效果：校验错误以后会有默认的响应；
 *  (三).给校验的Bean后紧跟一个BindingResult,就可以获取到校验的结果
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ZheliProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZheliProductApplication.class, args);
    }

}
