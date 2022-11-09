package kodlama.io.DevsCamp5.businnes.abstracts;

import java.util.List;

import kodlama.io.DevsCamp5.businnes.requests.CreateLanguageRequest;
import kodlama.io.DevsCamp5.businnes.responses.GetAllLeanguageResponse;

public interface LanguagesService {
  List<GetAllLeanguageResponse> getAll();
  void add(CreateLanguageRequest createLanguageRequest);
 
}
