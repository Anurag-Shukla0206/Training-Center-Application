package com.anurag.TrainingCenterApplication.Repository;

import com.anurag.TrainingCenterApplication.Model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingCenterRepository extends JpaRepository<TrainingCenter,Integer> {


    boolean existsByEmail(String email);
}
