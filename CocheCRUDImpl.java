package Coninterfaces;

import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {


	@Override
	public void save(CocheCRUD coche) {
		System.out.println("Save");
		
	}

	@Override
	public List<CocheCRUD> findAll() {
		// TODO Auto-generated method stub
		System.out.println("FindAll");
		return null;
	}

	@Override
	public void delete(CocheCRUD coche) {
		System.out.println("Delete");
		
	}
	
	
	
}
