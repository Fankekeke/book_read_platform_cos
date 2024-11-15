package cc.mrbird.febs.cos.dao;

import cc.mrbird.febs.cos.entity.BookLikeInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.LinkedHashMap;

/**
 * @author Fank gmail - fan1ke2ke@gmail.com
 */
public interface BookLikeInfoMapper extends BaseMapper<BookLikeInfo> {

    /**
     * 分页获取书籍点赞信息
     *
     * @param page         分页对象
     * @param bookLikeInfo 书籍点赞信息
     * @return 结果
     */
    IPage<LinkedHashMap<String, Object>> selectBookLikePage(Page<BookLikeInfo> page, @Param("bookLikeInfo") BookLikeInfo bookLikeInfo);
}
