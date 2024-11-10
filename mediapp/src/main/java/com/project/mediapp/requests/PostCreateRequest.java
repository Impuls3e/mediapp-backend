package com.project.mediapp.requests;

import lombok.Data;

@Data
public class PostCreateRequest {

   Long id;
    String text;
    String title;
    Long userId;
}
