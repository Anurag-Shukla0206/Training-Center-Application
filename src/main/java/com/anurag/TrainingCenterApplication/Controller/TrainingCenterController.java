package com.anurag.TrainingCenterApplication.Controller;

import com.anurag.TrainingCenterApplication.DTO.ResponseDTO;
import com.anurag.TrainingCenterApplication.Model.TrainingCenter;
import com.anurag.TrainingCenterApplication.Repository.TrainingCenterRepository;
import com.anurag.TrainingCenterApplication.Service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrainingCenterController {

    @Autowired
    TrainingCenterService trainingCenterService;

    @PostMapping("/addCenter")
    public ResponseDTO addCenter(@Valid @RequestBody TrainingCenter trainingCenter){
        return trainingCenterService.addCenter(trainingCenter);
    }

    @GetMapping("/getAllCenters")
    public List<TrainingCenter> getAllCenters(){
        return trainingCenterService.getAllCenters();
    }
}
