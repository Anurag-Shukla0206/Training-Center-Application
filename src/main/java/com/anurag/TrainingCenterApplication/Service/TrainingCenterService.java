package com.anurag.TrainingCenterApplication.Service;

import com.anurag.TrainingCenterApplication.DTO.ResponseDTO;
import com.anurag.TrainingCenterApplication.Model.TrainingCenter;
import com.anurag.TrainingCenterApplication.Repository.TrainingCenterRepository;
import com.anurag.TrainingCenterApplication.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrainingCenterService {

    @Autowired
    TrainingCenterRepository trainingCenterRepository;

    public ResponseDTO addCenter(TrainingCenter trainingCenter) {
        ResponseDTO responseDTO = new ResponseDTO();

        if (trainingCenterRepository.existsByEmail(trainingCenter.getEmail())){
            responseDTO.setTrainingCenter(null);
            responseDTO.setMessage("Email already present");
            return responseDTO;
        }

        trainingCenterRepository.save(trainingCenter);
        responseDTO.setTrainingCenter(trainingCenter);
        responseDTO.setMessage("Training center added successfully");
        return responseDTO;

    }

    public List<TrainingCenter> getAllCenters() {
        List<TrainingCenter> trainingCenterList = trainingCenterRepository.findAll();
        return trainingCenterList;
    }
}
