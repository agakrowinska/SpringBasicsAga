package com.dci.spring.examples.exercise1.dog;

import com.dci.spring.examples.exercise1.dog.factory.DogFactory;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DogService {

  private final DogFactory dogFactory;

  @Autowired
  public DogService(DogFactory dogFactory) {
    this.dogFactory = dogFactory;
  }

  public List<Dog> getDogs() {
    ArrayList<Dog> dogs = new ArrayList<>();
     dogs.add(dogFactory.create(34l,"Buddy",Breed.GERMAN_SHEPHERD));
    dogs.add(dogFactory.create(67l,"Anna",Breed.BULLDOG));
    dogs.add(dogFactory.create(98l,"Bruno",Breed.LABRADOR));


    return dogs;
  }
}
