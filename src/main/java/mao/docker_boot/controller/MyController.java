package mao.docker_boot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Project name(项目名称)：Docker_boot
 * Package(包名): mao.docker_boot.controller
 * Class(类名): MyController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/6/17
 * Time(创建时间)： 23:01
 * Version(版本): 1.0
 * Description(描述)： 业务类
 */

@RestController
public class MyController
{
    /**
     * 端口号，从配置文件里读
     */
    @Value("${server.port}")
    private String port;

    @RequestMapping("/docker")
    public String helloDocker()
    {
        return "hello docker and spring boot"+"<br>端口号："+port+"<br>"+ UUID.randomUUID();
    }

    @RequestMapping(value ="/index",method = RequestMethod.GET)
    public String index()
    {
        return "服务端口号: "+""+port+"<br>"+UUID.randomUUID();
    }
}
