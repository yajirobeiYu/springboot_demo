package com.yajirobei.springboot_demo.bean;

/**
 * @Author: yajirobei
 * @CREATE_DATE_TIME: 2024-10-23 16:57
 * @Description:
 */
public class ResultBean {
    private String status;
    private String message;
    private Object data;

    private ResultBean() {}
    public static ResultBean success(Object data) {
        ResultBean rb = new ResultBean();
        rb.setStatus("0000");
        rb.setMessage("SUCCESS");
        rb.setData(data);
        return rb;
    }
    public static ResultBean fail(String status,String message) {
        ResultBean rb = new ResultBean();
        rb.setStatus(status);
        rb.setMessage(message);
        return rb;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String code) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
