package com.dong.baomidou.controller;


import com.dong.baomidou.entity.Bill;
import com.dong.baomidou.service.IBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author DONG
 * @since 2021-03-28
 */
@RestController
@RequestMapping("/baomidou/bill")
public class BillController {
    @Autowired
    IBillService billService;

    @GetMapping("/")
    public String getOne() {
        Bill one = billService.getOne(null);
        System.out.println(one);
        return "ok";
    }
}
