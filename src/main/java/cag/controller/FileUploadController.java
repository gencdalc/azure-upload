package cag.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cag.service.FileUploadService;

@RestController
@RequestMapping("/file")
public class FileUploadController {

	private final FileUploadService fileUploadService;
	
	public FileUploadController(FileUploadService fileUploadService) {
		this.fileUploadService = fileUploadService;
	}
	
	@PostMapping("/upload")
	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
		try {
			String fileUrl = this.fileUploadService.uploadFile(file);
			return ResponseEntity.ok("File uploaded successfully. URL: " + fileUrl);
		}
		catch(IOException io) {
			return ResponseEntity.status(500).body("Failed to upload file: " + io.getMessage());
        }
	}
}
