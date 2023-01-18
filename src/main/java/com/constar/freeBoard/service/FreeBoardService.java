package com.constar.freeBoard.service;

import com.constar.freeBoard.domain.FreeBoardDTO;

import java.util.List;

public interface FreeBoardService {
    List<FreeBoardDTO> retrieveBoard();
}
