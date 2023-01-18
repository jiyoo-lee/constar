package com.constar.freeBoard.controller;

import com.constar.commons.ResultDTO;
import com.constar.freeBoard.service.FreeBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/board")
public class FreeBoardController {

    private final FreeBoardService freeBoardService;

    @GetMapping("")
    public ResponseEntity<ResultDTO> retrieveBoard(){
        ResultDTO resultDTO = new ResultDTO(true, freeBoardService.retrieveBoard());
        return new ResponseEntity<>(resultDTO, HttpStatus.OK);
    }
}
