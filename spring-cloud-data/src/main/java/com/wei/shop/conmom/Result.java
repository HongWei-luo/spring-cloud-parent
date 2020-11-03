
package com.wei.shop.conmom;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(
    value = "接口返回对象",
    description = "接口返回对象"
)
public class Result<T> {
    private static final Integer STATUS_NORMAL = 200;
    private static final Integer SC_INTERNAL_SERVER_ERROR_500 = 500;
    private int code;
    @ApiModelProperty("成功标志")
    private boolean success = true;
    private String message;
    private T result;
    @ApiModelProperty("时间戳")
    private long timestamp = System.currentTimeMillis();

    public void error500(String message) {
        this.message = message;
        this.code = SC_INTERNAL_SERVER_ERROR_500;
        this.success = false;
    }

    public void success(String message) {
        this.message = message;
        this.code = STATUS_NORMAL;
        this.success = true;
    }

    public static Result ok(Object data) {
        Result result = new Result();
        result.success = true;
        result.code = STATUS_NORMAL;
        result.message = "请求成功！";
        result.result = data;
        return result;
    }

    public static Result ok() {
        return ok((String)null);
    }

    public static Result ok(String msg) {
        Result result = new Result();
        result.success = true;
        result.code = STATUS_NORMAL;
        result.message = msg;
        return result;
    }

    public static Result fail(Integer code, String errMsg, Object o) {
        Result result = new Result();
        result.code = code;
        result.message = errMsg;
        result.result = o;
        result.success = false;
        return result;
    }

    public static Result error(Integer code, String errMsg) {
        return fail(code, errMsg, (Object)null);
    }

    public static Result fail(Integer code, String errMsg) {
        return fail(code, errMsg, (Object)null);
    }

    public static Result error(String errMsg) {
        return fail(SC_INTERNAL_SERVER_ERROR_500, errMsg, (Object)null);
    }

    public int getCode() {
        return this.code;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMessage() {
        return this.message;
    }

    public T getResult() {
        return this.result;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

/*    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Result)) {
            return false;
        } else {
            Result<?> other = (Result)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCode() != other.getCode()) {
                return false;
            } else if (this.isSuccess() != other.isSuccess()) {
                return false;
            } else {
                label44: {
                    Object this$message = this.getMessage();
                    Object other$message = other.getMessage();
                    if (this$message == null) {
                        if (other$message == null) {
                            break label44;
                        }
                    } else if (this$message.equals(other$message)) {
                        break label44;
                    }

                    return false;
                }

                Object this$result = this.getResult();
                Object other$result = other.getResult();
                if (this$result == null) {
                    if (other$result != null) {
                        return false;
                    }
                } else if (!this$result.equals(other$result)) {
                    return false;
                }

                if (this.getTimestamp() != other.getTimestamp()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Result;
    }


    public int hashCode() {
        int PRIME = true;
        int result = 1;
        int result = result * 59 + this.getCode();
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $result = this.getResult();
        result = result * 59 + ($result == null ? 43 : $result.hashCode());
        long $timestamp = this.getTimestamp();
        result = result * 59 + (int)($timestamp >>> 32 ^ $timestamp);
        return result;
    }

    public String toString() {
        return "Result(code=" + this.getCode() + ", success=" + this.isSuccess() + ", message=" + this.getMessage() + ", result=" + this.getResult() + ", timestamp=" + this.getTimestamp() + ")";
    }*/

    public Result() {
    }
}
