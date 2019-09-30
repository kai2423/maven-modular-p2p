package web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import vo.Data;

@Controller
public class IpLogController {

	@PostMapping("/backstage/views/login")
	@ResponseBody
	public Data trunBackstageViewsMain(String username,String password)
	{
		System.out.println("你好");
		System.out.println(username + "--->" + password);
		Data data = new Data();
		data.setIsLogin("true");
		data.setMsg("用户名或者密码错误！");
		return data;
	}
}
