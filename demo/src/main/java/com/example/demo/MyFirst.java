package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyFirst {
    //say hello=> say hello
    @RequestMapping("/say-hello")
    @ResponseBody   ///return the respond
    public String sayHello(){
//        return "hello how are you";
        StringBuffer string =new StringBuffer();
        string.append("<html>");
        string.append("<head>");
        string.append("<title>my first</title>");
        string.append("</head>");
        string.append("<body>");
        string.append("hello i am saijal gupta");
        string.append("</body>");
        string.append("</html>");
        return string.toString();



    }
}
