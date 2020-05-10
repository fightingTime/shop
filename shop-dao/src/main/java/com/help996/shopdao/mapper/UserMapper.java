package com.help996.shopdao.mapper;

import com.help996.shopdao.entity.po.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zzf
 * @date 2020/5/9 16:28
 */
@Mapper
public interface UserMapper {
    User getUser( String userId );
}
