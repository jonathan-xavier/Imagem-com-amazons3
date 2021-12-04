package jhon.apiimagem.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jhon.apiimagem.model.Imagem;
import jhon.apiimagem.repositories.ImagemRepository;

@Service
public class ImagemService {
	
	@Autowired
	private ImagemRepository repository;
	
	@Autowired
	private S3Service s3Service;
	
	
	//upload de foto
	
	public URI uploadPicture(MultipartFile multipartFile) {
		URI uri =  s3Service.uploadFile(multipartFile);
		Imagem img = new Imagem();
		img.setUrl(uri.toString());
		repository.save(img);
		
		return uri;
	}

}
