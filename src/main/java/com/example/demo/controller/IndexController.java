package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class IndexController {
	@RequestMapping("/")
	public String viewindexlogin() {
		return "indexlogin";
		}
	@RequestMapping("restview")
	public String viewrestview() {
		return "restview";
		}
}
