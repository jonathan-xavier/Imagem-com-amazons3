package jhon.apiimagem.resource;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jhon.apiimagem.service.ImagemService;

@RestController
@RequestMapping({"/imagem"})
public class ImagemResource {
	
	@Autowired
	private ImagemService service;
	
	@PostMapping
	public ResponseEntity<?> uploadImagem(@RequestParam(name="file") MultipartFile file){
		URI uri = service.uploadPicture(file);
		return ResponseEntity.created(uri).build();
	}

}
