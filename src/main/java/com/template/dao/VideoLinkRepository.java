package com.template.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.template.dto.VideoLinks;

public interface VideoLinkRepository extends MongoRepository<VideoLinks, String>{

}
