package com.archelo.Crud.App.repo;

import com.archelo.Crud.App.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface CarRepository extends JpaRepository<Car,Long> {

}
