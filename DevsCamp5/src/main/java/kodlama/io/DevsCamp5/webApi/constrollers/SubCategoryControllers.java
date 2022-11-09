package kodlama.io.DevsCamp5.webApi.constrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.DevsCamp5.businnes.abstracts.SubCategoryService;
import kodlama.io.DevsCamp5.businnes.requests.CreateSubCategoryRequest;
import kodlama.io.DevsCamp5.businnes.responses.GetAllSubCategoryResponse;

@RestController
@RequestMapping("/api/subcategory")
public class SubCategoryControllers {
	 public SubCategoryService subCategoryService;
	 
	 @Autowired
	 public SubCategoryControllers(SubCategoryService subCategoryService) {
		 this.subCategoryService=subCategoryService;
	 }
	 
	  @RequestMapping("/getAll")
		public List<GetAllSubCategoryResponse> getAlls(){
			return subCategoryService.getAlls();
		}
	@RequestMapping("/add")
		public void add(CreateSubCategoryRequest createSubCategoryRequest) {
			this.subCategoryService.adds(createSubCategoryRequest);
			
		}
}
