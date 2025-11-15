package hello.servlet.web.frontcontroller.v4;

import jakarta.servlet.http.HttpServletRequest;

import java.util.Map;

public interface ControllerV4 {
    /*
    * @param paramMap
    * @param model
    * @return viewName
    * */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
