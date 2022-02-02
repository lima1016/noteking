package com.project.noteking.config;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.util.UUID;

public class FileWrite {

  public static String uploadDir;

  public String writeFile (MultipartFile file) throws Exception {
    if (file.isEmpty())
      return null;
    String fileName = UUID.randomUUID().toString();
    file.transferTo(new File(uploadDir + "/" + fileName));
    System.out.println("uploadDir@@@@@@@@@@@@@@@@@@@ = " + uploadDir);
    return fileName;
  }
}
