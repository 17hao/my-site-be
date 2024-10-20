package xyz.shiqihao.common;

public abstract class ControllerTemplate<T> {
    public abstract T biz();

    public Response<T> exec() {
        Response<T> res = new Response<>();
        try {
            T t = biz();
            res.setData(t);
            res.setCode("0");
            res.setMessage("ok");
        } catch (Exception e) {
            res.setCode("1");
            res.setMessage(e.getMessage());
        }
        return res;
    }
}