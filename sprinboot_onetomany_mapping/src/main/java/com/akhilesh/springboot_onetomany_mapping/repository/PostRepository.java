package com.akhilesh.springboot_onetomany_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akhilesh.springboot_onetomany_mapping.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
