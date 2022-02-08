package com.project.noteking.web.file;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.UUID;

public class FileWriteService {

  public String writeFile (MultipartFile file, String uploadDir) throws Exception {
    if (file.isEmpty())
      return null;
    String fileName = UUID.randomUUID().toString();
    file.transferTo(new File(uploadDir + "/" + fileName));
    System.out.println("uploadDir@@@@@@@@@@@@@@@@@@@ = " + uploadDir);
    return fileName;
  }

}
