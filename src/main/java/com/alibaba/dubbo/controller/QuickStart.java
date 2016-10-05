package com.alibaba.dubbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wuxing on 16/8/23.
 */
@Controller
public class QuickStart {

    @RequestMapping(value="/",method = RequestMethod.HEAD)
    public String head() {
        return "quickStart.jsp";
    }

    @RequestMapping(value={"/index","/"},method = RequestMethod.GET)
    public String index(Model model) throws Exception {
        model.addAttribute("msg", "QuickStart");
        return "quickStart.jsp";
    }

//    @RequestMapping(value={"/index","/"},method = RequestMethod.GET)
//    public Object getUser(@ModelAttribute RequestDto dto) {
//        Map<String,Object> map = new HashMap<>();
//        map.put("ParamType", "java.lang.String");  //后端接口参数类型
//        map.put("Object", dto.getMethodParams()[0].get("id"));  //用以调用后端接口的实参
//
//        List<Map<String, Object>> paramInfos= new ArrayList<>();
//        paramInfos.add(map);
//
//        DubboServiceFactory dubbo = DubboServiceFactory.getInstance();
//
//        return dubbo.genericInvoke(dto.getInterfaceName(), dto.getMethodName(), paramInfos);
//    }
}
