package com.project.noteking.config;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

public class FileWrite {
  private String uploadDir;

  private String writeFile (MultipartFile file) throws Exception {
    if (file.isEmpty())
      return null;
    String fileName = UUID.randomUUID().toString();
    file.transferTo(new File(uploadDir + "/" + fileName));
    return fileName;
  }
}
