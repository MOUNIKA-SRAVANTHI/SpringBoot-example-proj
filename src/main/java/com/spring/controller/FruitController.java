package com.spring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 


public class FruitController {

		@RequestMapping(value = "/fruithome")
		public String getFruitHome() 
		{
			return "fruithome";
		}
		@RequestMapping(value = "/sweetfruits")
		public String getSweetFruits() 
		{
			return "sweet";
		}
		@RequestMapping(value = "/sourfruits")
		public String getSourFruits() 
		{
			return "sour";
		}
		

	}
