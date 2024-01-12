package com.akhilesh.springboot;

import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.akhilesh.springboot_onetomany_mapping.entity.Comment;
import com.akhilesh.springboot_onetomany_mapping.entity.Post;
import com.akhilesh.springboot_onetomany_mapping.repository.PostRepository;

@SpringBootApplication
public class SprinbootOnetomanyMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SprinbootOnetomanyMappingApplication.class, args);
		
	}	
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
    Post post=new Post("onetomany mapping","onetomany mapping using jpa & hibernate");
		
    Comment comment1=new Comment("First Comment");
    Comment comment2=new Comment("Second Comment");
    Comment comment3=new Comment("Third Comment");
    
    post.getComments.add(comment1);
    post.getComments.add(comment2);
    post.getComments.add(comment3);
    
    this.postRepository.save(post);
    
    
	}

}
