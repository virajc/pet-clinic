package dev.viraj.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.viraj.petclinic.services.OwnerService;

@RequestMapping("/owners")
@Controller
public class OwnerController {
	private final OwnerService ownerService;

	public OwnerController(OwnerService ownerService) {
		super();
		this.ownerService = ownerService;
	}

	@RequestMapping({ "", "/", "/index", "/index.html" })
	public String listVets(Model model) {
		ownerService.findAll().stream().forEach((owner)->{System.out.println(owner.toString());});
		model.addAttribute("owners", ownerService.findAll());
		return "owners/index";
	}

}
