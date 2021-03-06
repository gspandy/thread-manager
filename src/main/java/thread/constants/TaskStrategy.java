package thread.constants;

/**
 * Created by wuhao on 15/11/3.
 */
public enum TaskStrategy {

    taskPriority(0, "按照优先级分配线程池"), taskGroup(1, "按照任务组来分配线程池");

    private int code;

    private String desc;

    TaskStrategy(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
