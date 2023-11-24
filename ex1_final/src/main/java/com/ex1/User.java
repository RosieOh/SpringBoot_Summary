package com.ex1;

import lombok.Data;

// 구조패턴 예시 - 필드에서 빼내와서 필드에서 수행하는 역할
@Data
public class User {
    private Student student;
    private Part part;
}
