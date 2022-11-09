package kodlama.io.DevsCamp5.businnes.constract;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import kodlama.io.DevsCamp5.businnes.abstracts.SubCategoryService;
import kodlama.io.DevsCamp5.businnes.requests.CreateSubCategoryRequest;
import kodlama.io.DevsCamp5.businnes.responses.GetAllSubCategoryResponse;
import kodlama.io.DevsCamp5.dataAccess.abstracts.SubCategoryResponsive;
import kodlama.io.DevsCamp5.entities.controllers.SubCategory;

public class SubCategoryManager implements SubCategoryService {
	 SubCategoryResponsive subResponsive;
	
	@Autowired
	public SubCategoryManager(SubCategoryResponsive subResponsive) {
		this.subResponsive = subResponsive;
	}

	@Override
	public List<GetAllSubCategoryResponse> getAlls() {
		List<SubCategory> subCat=subResponsive.findAll();
		List<GetAllSubCategoryResponse> SubCategoryResponse = new ArrayList<GetAllSubCategoryResponse>();
		for (SubCategory subcat :subCat) {
			GetAllSubCategoryResponse subItem =new GetAllSubCategoryResponse();
			subItem.setId(subcat.getIdl());
			subItem.setName(subcat.getNames());
			subItem.setIdl(subcat.getIdl());
			SubCategoryResponse.add(subItem);
		}
		return SubCategoryResponse;
	}

	@Override
	public void adds(CreateSubCategoryRequest createSubCategoryRequest) {
		SubCategory subcat= new SubCategory();
		subcat.setNames(createSubCategoryRequest.getName());
		subcat.setIdl(createSubCategoryRequest.getIdl());
	}
}
