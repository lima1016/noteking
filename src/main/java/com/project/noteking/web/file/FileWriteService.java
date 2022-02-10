package com.project.noteking.web.file;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.util.UUID;
@Service
public class FileWriteService {

  public String writeFile (MultipartFile file) throws Exception {
    if (file.isEmpty()) {
      // 파일 업로드 안되면
      return null;
    }
    String rootPath = FileSystemView.getFileSystemView().getHomeDirectory().toString();
    String basePath = rootPath + "/img";
    String fileName = UUID.randomUUID().toString();
    File dest = new File(basePath + "/" + fileName);
    file.transferTo(dest);

    System.out.println(basePath);
    return fileName;
  }

}
