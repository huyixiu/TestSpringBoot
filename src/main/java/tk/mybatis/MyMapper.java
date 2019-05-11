package tk.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName:MyMapper
 * @Description 自己的mapper 特别注意，该接口不能被扫描到，否则会出错
 * @Author: hyx
 * @Date: 2019-04-13 15:46
 * @Version 1.0
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {
}
