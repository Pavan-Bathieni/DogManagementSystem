package com.Bathineni.DMS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Bathineni.DMS.Models.Trainer;
/*
 * @Author Pavan Kumar Bathineni
 */
@Repository
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {

}
