package jhon.apiimagem;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiImagemApplication implements CommandLineRunner {

//	@Autowired
//	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(ApiImagemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//	 s3Service.uploadFile("C:\\Users\\natan\\Pictures\\Saved Pictures\\k.jpg");

	}

}
