package com.nepxion.discovery.platform.mysql.mapper;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 *
 * @author Ning Zhang
 * @version 1.0
 */

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nepxion.discovery.platform.server.ui.entity.dto.SysDic;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DbDicMapper extends BaseMapper<SysDic> {

}