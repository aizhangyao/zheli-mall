package com.aiz.zhelimall.ware.feign;

import com.aiz.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ProductFeignService
 * @Description
 * @Author Yao
 * @Date Create in 13:25 2020/7/23 0023
 * @Version 1.0
 */
@FeignClient("zheli-product")
public interface ProductFeignService {

    /**
     *      /product/skuinfo/info/{skuId}
     *
     *   1).让所有请求过网关；
     *          1.@FeignClient("zheli-gateway")：给zheli-gateway所在的机器发请求
     *          2./api/product/skuinfo/info/{skuId}
     *   2）.直接让后台指定服务处理
     *          1.@FeignClient("zheli-gateway")
     *          2./product/skuinfo/info/{skuId}
     *
     * @return
     */
    @RequestMapping("/product/skuinfo/info/{skuId}")
    public R info(@PathVariable("skuId") Long skuId);
}