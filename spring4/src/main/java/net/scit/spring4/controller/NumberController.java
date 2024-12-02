package net.scit.spring4.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/display")
public class NumberController {

	@GetMapping("/number")
	public String number(Model model) {
		// 숫자 데이터
		int intNum = 12345670;
		double doubleNum = 1234.45670;
		double percent = 0.0325;
		double money = 567800;
		
		// 날짜 데이터 (LocalDate, localDateTime)
		LocalDate today = LocalDate.now();
		LocalDateTime now = LocalDateTime.now();
		
		model.addAttribute("intNum", intNum);
		model.addAttribute("doubleNum", doubleNum);
		model.addAttribute("percent", percent);
		model.addAttribute("money", money);
		model.addAttribute("today", today);
		model.addAttribute("now", now);
		
		return "display/number";
	}
}
