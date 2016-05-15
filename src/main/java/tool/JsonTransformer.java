package tool;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import spark.ResponseTransformer;

/**
 * 将response转换成json格式
 *
 * @author hujiawei
 */
public class JsonTransformer implements ResponseTransformer {

    @Override
    public String render(Object model) {
        return JSON.toJSONString(model, SerializerFeature.PrettyFormat);
    }

}