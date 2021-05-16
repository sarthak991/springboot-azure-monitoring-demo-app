package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Video;
import com.example.demo.repository.VideoRepository;

@RestController
public class VideoController
{
	@Autowired
	private VideoRepository videoRepository;

	@GetMapping("/videos")
	public List<Video> getVideos(){
		return videoRepository.findAll();
	}

	@PostMapping(value = "/videos",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveVideos(@RequestBody List<Video> videos){
		videoRepository.saveAll(videos);
	}
}
