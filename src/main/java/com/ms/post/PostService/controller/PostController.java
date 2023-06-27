package com.ms.post.PostService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.post.PostService.model.Post;

@RestController
@RequestMapping("/post")
public class PostController {
    
	@GetMapping("/{postId}")
	public Post postOne(@PathVariable("postId") String postId) {
		Post postOne = new Post(postId, "This is the description of postController");
		return postOne;
	}
}
