package com.dharani.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dharani.model.Transfer;
import com.dharani.model.User;
import com.dharani.repository.TransferRepo;
import com.dharani.repository.Userrepo;

@Controller
public class HomeController {

	@Autowired
	private TransferRepo transferrepo;
	@Autowired
	private Userrepo userrrepo;
	@RequestMapping("/")
	public String Home(Model model)
	{
		List<Transfer> tran=new ArrayList<>();
		transferrepo.findByTop().forEach(tran::add);
		model.addAttribute("tran", tran);
		return "Home";
	}
	@RequestMapping("/transfer")
	public String transfer(User u,Transfer tran,@RequestParam("transferamount") int transferamount)
	{
		int a=(int)transferrepo.count();
		u=userrrepo.findByName("Dharani");
		tran.setTransferid(a+1);
		tran.setBalance(u.getBalance()-transferamount);
		transferrepo.save(tran);
		userrrepo.updatebalance(u.getBalance()-transferamount, 1);
		return "redirect:/";
	}
}
