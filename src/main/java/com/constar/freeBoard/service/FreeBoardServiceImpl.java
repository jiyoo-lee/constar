package com.constar.freeBoard.service;

import com.constar.freeBoard.domain.FreeBoardDTO;
import com.constar.freeBoard.repository.FreeBoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class FreeBoardServiceImpl implements FreeBoardService{

    private final FreeBoardRepository freeBoardRepository;

    @Override
    public List<FreeBoardDTO> retrieveBoard() {
        return freeBoardRepository.retrieveBoard();
    }
}
