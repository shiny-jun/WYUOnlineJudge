package com.zoctan.api.mapper;

import com.zoctan.api.core.mapper.MyMapper;
import com.zoctan.api.databaseModel.Favorite;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FavoriteMapper extends MyMapper<Favorite> {
    List<Favorite> findUserDetailFavoriteByUsername(@Param("username") String username);

    List<Favorite> findUserFavoriteByUsername(@Param("username") String username);
}