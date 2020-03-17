package com.spring.security.service;


import com.spring.security.entity.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> getBlogs();
    void deleteBlog(long id);
}
