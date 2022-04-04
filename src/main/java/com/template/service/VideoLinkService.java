package com.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.template.dto.VideoLinks;

@Service
public class VideoLinkService {
	
	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<VideoLinks> exchangeMethodOfRestTemplate(){
		VideoLinks videoLink=new VideoLinks();
		videoLink.setLink("https://message-file-upload-1.s3.ap-south-1.amazonaws.com/tWxaqygh_Fzxm_00NV_ceat_LTG45Syod2TR_Umang@Second_16022022103856.mp4");
		videoLink.setMessageId("624af54f6815a538250f25f7");
		videoLink.setRoomAccessKey("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiI0MTk4MTExNjQ5MDc5NjMxNDgxZmQ3NjBlIn0.p6v4FXXz3q-Rjdm1KrJWZEu0xXNWCopabIHyE8rSzig");
		videoLink.setRoomId("4198111649079631481fd760e");
		videoLink.setRoomType("CHATROOM");
		String baseURL = "http://localhost:8080//v1/user/room/videoLink";
		String auth = "";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setBearerAuth(auth);
		HttpEntity<Object> httpEntity = new HttpEntity<>(videoLink, headers);
		return restTemplate.exchange(baseURL, HttpMethod.POST, httpEntity,
				VideoLinks.class);
		}
}
