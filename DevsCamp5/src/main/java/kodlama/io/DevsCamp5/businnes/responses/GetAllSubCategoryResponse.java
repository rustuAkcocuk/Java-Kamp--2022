package kodlama.io.DevsCamp5.businnes.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSubCategoryResponse {
	private int id;
	private String name;
	private int idl;

}
