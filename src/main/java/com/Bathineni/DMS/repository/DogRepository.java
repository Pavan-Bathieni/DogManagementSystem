package com.Bathineni.DMS.repository;
import java.util.List;

/*
 * @Author Pavan Kumar Bathineni
 */
import org.springframework.data.repository.CrudRepository;

import com.Bathineni.DMS.Models.Dog;
/*
 * @Author Pavan Kumar Bathineni
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{

	List<Dog> findByName(String name);
}
