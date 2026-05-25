package cag.controller;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import cag.service.BlobStorageService;

//@RestController
//@RequestMapping("/blob")
public class BlobController {

//	private final BlobStorageService blobStorageService;
//	
//	public BlobController(BlobStorageService blobStorageService) {
//		this.blobStorageService = blobStorageService;
//	}
//	
//	@PostMapping("/upload")
//	public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
//		try {
//			String fileUrl = this.blobStorageService.uploadFile(file);
//			return ResponseEntity.ok("Blob uploaded successfully. URL: " + fileUrl);
//		}
//		catch(IOException io) {
//			return ResponseEntity.status(500).body("Failed to upload blob: " + io.getMessage());
//        }
//	}
	
}
