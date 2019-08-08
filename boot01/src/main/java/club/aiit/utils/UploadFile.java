package club.aiit.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件上传类
 * @author ghostxbh
 * @DateTime 2018-12-05 14:54
 */
public class UploadFile {

    public static void getUpload(byte[] file,String filePath,String fileName) throws IOException {
        File targetFile = new File(filePath);
        if (!targetFile.exists())targetFile.mkdirs();
        FileOutputStream out = new FileOutputStream(filePath+fileName);
        out.write(file);
        out.flush();
        out.close();
    }
}
