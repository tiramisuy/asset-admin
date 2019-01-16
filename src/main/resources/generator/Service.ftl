package ${targetPackage};

import ${tableClass.packageName}.${tableClass.shortClassName};
import com.jubao.modules.sys.service.BaseService;

<#assign dateTime = .now>
/**
 * @author yuanxianchu
 * @date ${dateTime?string["yyyy-MM-dd HH:mm:ss"]}
 */
public interface ${tableClass.shortClassName}${serviceSuffix} extends BaseService<${tableClass.shortClassName}>{

}