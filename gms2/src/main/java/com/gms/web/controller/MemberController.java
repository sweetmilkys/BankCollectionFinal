package com.gms.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gms.web.domain.MemberDTO;
import com.gms.web.service.MemberService;

@Controller
@RequestMapping("/member")
@SessionAttributes("user")
public class MemberController {
	static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired MemberDTO member;
	@Autowired MemberService memberService;
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("member") MemberDTO member) {
		logger.info("MemberContoller add");
		memberService.add(member);
		return "redirect:/move/auth/member/login";
	}
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list() {
		logger.info("MemberContoller list");
		return "member:member/list.tiles";
	}
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String search() {
		logger.info("MemberContoller search");
		return "member:member/search.tiles";
	}
	@RequestMapping(value="/retrieve", method=RequestMethod.GET)
	public String retrieve() {
		logger.info("MemberContoller retrieve");
		return "member:member/retrieve.tiles";
	}
	@RequestMapping(value="/count", method=RequestMethod.GET)
	public String count(Model model) {
		logger.info("MemberContoller count");
		Map<String, String> map = new HashMap<>();
		map.put("column", "MEMBER");
		model.addAttribute("count", memberService.count(map));
		return "member:member/count.tiles";
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modify(@ModelAttribute("member") MemberDTO member, Model model) {
		logger.info("MemberContoller modify");
		Map<String, Object> map = new HashMap<>();
		String[] arr1 = {"userid", "password", "teamid", "roll"};
		String[] arr2 = {member.getUserid(), member.getPassword(), member.getTeamid(), member.getRoll()};
		for(int i = 0; i < arr1.length; i++){
			map.put(arr1[i],arr2[i]);
		}
		logger.info("확인중" + map);
		memberService.modify(map);
		model.addAttribute("user", memberService.retrieve(map));
		return "redirect:/move/member/member/modify";
	}
	@RequestMapping(value="/remove", method=RequestMethod.POST)
	public String remove(@ModelAttribute("member") MemberDTO member) {
		logger.info("MemberContoller remove");
		Map<String, String> map = new HashMap<>();
		map.put("userid", member.getUserid());
		map.put("password", member.getPassword());
		memberService.remove(map);
		return "redirect:/move/member/common/main";
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute("member") MemberDTO member, Model model) {
		logger.info("MemberContoller login");
		if(memberService.login(member)) {
			Map<String, String> map = new HashMap<>();
			map.put("userid", member.getUserid());
			model.addAttribute("user", memberService.retrieve(map));
			return "member:member/retrieve.tiles";
		}else {
			return "redirect:/move/auth/member/login";
		}
	}
	@RequestMapping(value="/logout")
	public String logout() {
		logger.info("MemberContoller logout");
		return "redirect:/move/public/common/content";
	}
	@RequestMapping("/fileupload")
	public void fileupload() {}
}
