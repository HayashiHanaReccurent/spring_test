package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FizzBuzzController {

	// <form action="/apply" method="post">
	@RequestMapping(value = "/apply", method = RequestMethod.POST)
	public ModelAndView apply(@RequestParam("num") int num, ModelAndView mv) {

		// Fizz Buzzの処理
		// 結果を格納する変数を作る
		String result = "";

		// 3の倍数の場合
		if (num % 3 == 0 && !(num == 0)) {
			result += "Fizz";
		}

		// 5の倍数の場合
		if (num % 5 == 0 && !(num == 0)) {
			result += "Buzz";
		}

		// 7の倍数の場合
		if (num % 7 == 0 && !(num == 0)) {
			result += "Ass";
		}

		// 上記のどれにも当てはまらない場合
		if (result.length() == 0) {
			result += "イッヌ";
		}

		// 結果を設定
		mv.addObject("result", result);
		mv.addObject("resulta", result);
		mv.addObject("resultb", result);
		mv.addObject("resultc", result);
		mv.addObject("num", num);

		// 表示するHTMLファイルの設定
		mv.setViewName("index");
		return mv;
	}
}
