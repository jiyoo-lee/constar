package com.constar.freeBoard.repository;

import com.constar.freeBoard.domain.FreeBoardDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FreeBoardRepository {

    @Select("select * " +
            "from free_board " +
            "order by create_datetime desc " +
            "limit 0, 5")
    List<FreeBoardDTO> retrieveBoard();
}
