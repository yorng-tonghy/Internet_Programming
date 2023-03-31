package gic.i4c.tp16.tp16.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {
    @GetMapping(path = "/tp16")
    public String index(){
        return "<h1>hello</h1>";
    }
    @GetMapping(path="/tp16/hello")
    public ModelAndView task2(){
        return new ModelAndView("task2");
    }

}
