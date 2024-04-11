package com.TeamProject.users.post.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.TeamProject.users.apply.domain.ApplyVo;
import com.TeamProject.users.post.domain.PostVo;

@Mapper
public interface PostMapper {

	List<PostVo> getPostList();

	HashMap<String, Object> getView(PostVo postVo);

	HashMap<String, Object> getPost(PostVo postVo);

	void insertCom_Post(PostVo postVo);

	List<PostVo> getPostComList(PostVo postVo);


	void deleteComPost(PostVo postVo);


	
	
}
