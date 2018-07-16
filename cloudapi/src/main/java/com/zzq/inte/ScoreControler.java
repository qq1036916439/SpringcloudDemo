package com.zzq.inte;

import com.zzq.pojo.Score;

import com.zzq.utils.SelectBean;


import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@FeignClient(value = "PROVIDERSTUD")
public interface ScoreControler
{


    @RequestMapping("/Score/select")
    public String selectScore(SelectBean selectBean,Model model);
    @RequestMapping("/Score/editView/{id}")
    public String deitScore(@PathVariable Integer id, Model model);


@ResponseBody
    @PostMapping("/Score/addScore")
    public String addScore(Score score);


}
