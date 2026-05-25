package cag.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

//@Service
public class BlobStorageService {

//	private final BlobContainerClient containerClient;
//	
//	public BlobStorageService(
//			@Value("${azure.storage.connection-string}") String connectionString,
//			@Value("${azure.storage.container-name}") String containerName) {
//		
//		BlobServiceClient serviceClient = new BlobServiceClientBuilder()
//				.connectionString(connectionString)
//				.buildClient();
//				
//		this.containerClient = serviceClient.getBlobContainerClient(containerName);
//	}
//	
//	public String uploadFile(MultipartFile file) throws IOException
//	{
//		BlobClient blobClient = this.containerClient.getBlobClient(file.getOriginalFilename());
//		
//		blobClient.upload(file.getInputStream(), file.getSize(), true);
//		
//		return blobClient.getBlobUrl();
//	}
}
