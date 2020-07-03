package com.aiz.zhelimall.thirdparty;

import com.aliyun.oss.OSSClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class ZheliThirdPartyApplicationTests {

    @Autowired
    OSSClient ossClient;

    @Test
    public void testUpdateUseSpringCloud() throws FileNotFoundException {
        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator\\Desktop\\atm.jpg");
        ossClient.putObject("zheli-mall", "atm1.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("上传成功....");
    }

    @Test
    void contextLoads() {

    }

}
