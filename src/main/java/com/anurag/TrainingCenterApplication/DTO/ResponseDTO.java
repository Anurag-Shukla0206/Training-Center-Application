package com.anurag.TrainingCenterApplication.DTO;

import com.anurag.TrainingCenterApplication.Model.TrainingCenter;
import lombok.Data;

@Data
public class ResponseDTO {
    private TrainingCenter trainingCenter;

    private String message;
}
