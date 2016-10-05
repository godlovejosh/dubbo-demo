package com.alibaba.dubbo.service;

import java.util.Map;

/**
 * Created by wuxing on 16/8/22.
 */
public class RequestDto {

    private String interfaceName;
    private String methodName;
    private Map[] methodParams;

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Map[] getMethodParams() {
        return methodParams;
    }

    public void setMethodParam(Map[] methodParams) {
        this.methodParams = methodParams;
    }
}
