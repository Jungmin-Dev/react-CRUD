package com.example.reactboard.domain.board;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ItemForm {
    private String itemName;
    private MultipartFile attachFile;
    private List<MultipartFile> imageFiles;
}
