package indi.wu.controller;

import indi.wu.entity.Block;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuzichao on 2018/3/14.
 */

@RestController
public class ExpandController {


    @GetMapping("/expand")
    public ResponseEntity expand() {

        return null;
    }
}
