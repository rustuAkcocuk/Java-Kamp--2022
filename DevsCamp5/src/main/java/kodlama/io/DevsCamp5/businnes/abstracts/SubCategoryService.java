package kodlama.io.DevsCamp5.businnes.abstracts;

import java.util.List;

import kodlama.io.DevsCamp5.businnes.requests.CreateSubCategoryRequest;
import kodlama.io.DevsCamp5.businnes.responses.GetAllSubCategoryResponse;

public interface SubCategoryService {
	 List<GetAllSubCategoryResponse> getAlls();
	 void adds(CreateSubCategoryRequest CreateSubCategoryRequest);
}
