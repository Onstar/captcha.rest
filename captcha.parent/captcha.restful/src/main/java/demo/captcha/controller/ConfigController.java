package demo.captcha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import demo.captcha.service.IConfigService;

@RequestMapping(value = "/command/config")
@Controller
public class ConfigController {

	private IConfigService configService;
	public void setConfigService(IConfigService configService) {
		this.configService = configService;
	}
	
	@RequestMapping(value = "/init.do", method=RequestMethod.GET)
	public String initConfig(Model model){
		
		model.addAttribute("configs", this.configService.listAll());
		return "preConfig";
	}
}
