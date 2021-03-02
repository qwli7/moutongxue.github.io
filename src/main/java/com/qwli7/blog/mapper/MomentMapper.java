package com.qwli7.blog.mapper;

import com.qwli7.blog.entity.Moment;
import com.qwli7.blog.entity.vo.MomentQueryParam;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

/**
 * @author qwli7
 * @date 2021/2/22 13:49
 * 功能：blog8
 **/
@Mapper
public interface MomentMapper {

    void insert(Moment moment);

    void update(Moment moment);

    Optional<Moment> selectById(int id);

    void deleteById(int id);

    List<Moment> selectPage(MomentQueryParam queryParam);

    int count(MomentQueryParam queryParam);
}
