package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wuhen on 2019/5/14.
 */
@CrossOrigin
@Controller
public class FileUploadController {
//单文件上传
    //跳转到上传文件的页面
    @RequestMapping(value="/gouploadimg", method = RequestMethod.GET)
    public String goUploadImg() {
        //跳转到 templates 目录下的 uploadimg.html
        return "uploadimg";
    }
    //处理文件上传
    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
    public @ResponseBody
    String uploadImg(@RequestParam("file") MultipartFile file,
                     HttpServletRequest request) {
    //        String contentType = file.getContentType();
    //        String fileName = file.getOriginalFilename();
        /*System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);*/
        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        try {
//            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return filePath;
    }
//    //处理文件上传
//    @RequestMapping(value = "/uploadimg",method = RequestMethod.POST)
////    知识点：
//
////    后台：将上传的图片写入指定服务器路径，保存起来，
//// 返回上传后的图片路径（在springBoot中，参考博客：
//// http://blog.csdn.net/change_on/article/details/59529034）
////
////    前端：在Vue.js前端框架中，使用Vue_Core_Image_Upload插件，
//// 上传图片 （github地址：https://github.com/Vanthink-UED/vue-core-image-upload）
//public  @ResponseBody String uploadImg(@RequestParam("file")
//                                               MultipartFile file, HttpServletRequest request
//
//                                       ){
//        //图片文件类型
//        String contentType = file.getContentType();
//        //图片名字
//        String fileName = file.getOriginalFilename();
//        //文件存放路径
//        String filePath = "D:\\vueProject";
//        //调用文件处理类FileUtil，处理文件。将文件写入指定位置
//        try {
//            FileUtil.uploadFile(file.getBytes(),filePath,fileName);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        //返回图片的存放路径
//        return filePath;
//
//    }


}
