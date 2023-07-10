package com.water.controller;

import com.water.controller.service.OneService;
import com.water.controller.service.TwoService;
import com.water.model.TeacherOne;
import com.water.model.TeacherTwo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author ZY
 * @Date 2023/7/5 16:17
 */
@RestController
public class Controller {
    @Resource
    private OneService oneService;
    @Resource
    private TwoService twoService;

    @GetMapping("/listDb1")
    public TeacherOne listDb1() {
        return oneService.get();
    }

    @GetMapping("/listDb2")
    public TeacherTwo listDb2() {
        return twoService.get();
    }

}
