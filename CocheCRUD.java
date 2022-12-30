package Coninterfaces;

import java.util.List;

public interface CocheCRUD {

	void save(CocheCRUD coche);
	
	List<CocheCRUD> findAll();
	
	void delete(CocheCRUD coche);
	 
}
