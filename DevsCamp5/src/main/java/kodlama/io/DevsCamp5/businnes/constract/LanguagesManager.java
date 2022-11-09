package kodlama.io.DevsCamp5.businnes.constract;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.DevsCamp5.businnes.abstracts.LanguagesService;
import kodlama.io.DevsCamp5.businnes.requests.CreateLanguageRequest;
import kodlama.io.DevsCamp5.businnes.responses.GetAllLeanguageResponse;
import kodlama.io.DevsCamp5.dataAccess.abstracts.LanguageRepository;
import kodlama.io.DevsCamp5.entities.controllers.Languages;

@Service
public final class LanguagesManager implements LanguagesService{
   LanguageRepository languageRepository;
	@Autowired
	public LanguagesManager( LanguageRepository languageRpository) {
		this.languageRepository=languageRpository;
	}
	/**
	 *
	 */
	
	@Override
	public List<GetAllLeanguageResponse> getAll() {
		List<Languages> languages=languageRepository.findAll();
		List<GetAllLeanguageResponse> languageResponse=new ArrayList<GetAllLeanguageResponse>();
		for(Languages lan :languages) {
			GetAllLeanguageResponse responsItem=new GetAllLeanguageResponse();
			responsItem.setId(lan.getId());
			responsItem.setName(lan.getName());
			languageResponse.add(responsItem);
		}
		
		return languageResponse;

	} 
	
	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
	  Languages languages=new Languages();
	  languages.setName(createLanguageRequest.getName());
	 this.languageRepository.save(languages);
		
	}

	

 
}
