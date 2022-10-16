package services;

import com.crowdar.api.rest.MethodsService;
import java.util.Map;

public class BaseService extends MethodsService {
    public static final ThreadLocal<Map<String, String>> PARAMS = new ThreadLocal<>();
    public static void addParams(String clave, String valor){
        PARAMS.get().put(clave,valor);
    }
}
