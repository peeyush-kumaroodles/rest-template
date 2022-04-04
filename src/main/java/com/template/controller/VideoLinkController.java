package com.template.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.template.dto.VideoLinks;
import com.template.service.VideoLinkService;

@RestController
public class VideoLinkController {
	@Autowired private VideoLinkService linkService;
	@RequestMapping("/video_LinkApi")
	public ResponseEntity<?> useRestTemplate() {
		ResponseEntity<VideoLinks> videoEntity;
		videoEntity = linkService.exchangeMethodOfRestTemplate();
		if(videoEntity!=null) {
			return new ResponseEntity<String>(HttpStatus.OK);
		}else
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
