package com.aiz.common.constant;

/**
 * @ClassName ProductConstant
 * @Description 与商品模块有关的常量
 * @Author Zhang Yao
 * @Date Create in 12:34 2020/7/11 0011
 * @Version 1.0
 */

public class ProductConstant {
    public enum AttrEnum{
        ATTR_TYPE_BASE(1,"基本属性"),ATTR_TYPE_SALE(0,"销售属性");

        private int code;
        private String msg;
        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }
}
