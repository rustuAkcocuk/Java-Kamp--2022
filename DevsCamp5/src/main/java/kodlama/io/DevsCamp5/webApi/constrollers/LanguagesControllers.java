package kodlama.io.DevsCamp5.webApi.constrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.DevsCamp5.businnes.abstracts.LanguagesService;
import kodlama.io.DevsCamp5.businnes.requests.CreateLanguageRequest;
import kodlama.io.DevsCamp5.businnes.responses.GetAllLeanguageResponse;

@RestController
@RequestMapping("/api/languages")
public class LanguagesControllers {
 public LanguagesService languagesService;

	@Autowired
	public LanguagesControllers(LanguagesService languagesService) {
		this.languagesService=languagesService;
		
	}
	
	@RequestMapping("/getAll")
	public List<GetAllLeanguageResponse> getAll(){
		return languagesService.getAll();
	}
	@RequestMapping("/add")
	public void add(CreateLanguageRequest createLengithRequest) {
		this.languagesService.add(createLengithRequest);
		
	}
	
	
}
