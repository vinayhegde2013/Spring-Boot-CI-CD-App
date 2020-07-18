package com.vinay.hegde.springbootcicd.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.hegde.springbootcicd.dto.InformationDto;

@RestController
public class InformationResource {

	@RequestMapping("/information")
	public List<InformationDto> fetchInfo() {
		return Arrays.asList(new InformationDto(1, "Title1", "Content1"), new InformationDto(2, "Title2", "Content2"));
	}
}
