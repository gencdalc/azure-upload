package cag.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

@Service
public class FileUploadService {

	private final BlobContainerClient containerClient;
	
	public FileUploadService(
			@Value("${azure.storage.blob-endpoint}") String blobEndPoint,
			@Value("${azure.storage.container-name}") String containerName) {
		
		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder()
				.endpoint(blobEndPoint)
				.credential(new DefaultAzureCredentialBuilder().build())
				.buildClient();
				
		this.containerClient = blobServiceClient.getBlobContainerClient(containerName);
	}
	
	public String uploadFile(MultipartFile file) throws IOException
	{
		BlobClient blobClient = this.containerClient.getBlobClient(file.getOriginalFilename());
		
		blobClient.upload(file.getInputStream(), file.getSize(), true);
		
		return blobClient.getBlobUrl();
	}
}
