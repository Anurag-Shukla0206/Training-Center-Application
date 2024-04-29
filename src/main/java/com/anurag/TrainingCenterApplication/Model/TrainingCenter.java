package com.anurag.TrainingCenterApplication.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TrainingCenter {

    private static final String CODE_PATTERN = "^[a-zA-Z0-9]{12}$";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @NotBlank(message = "Center name is mandatory")
    @Length(max = 39,message = "maximum length Exceed.. ,Only Less than 40 characters Accepted.. ")
    private String centerName;

    @Pattern(regexp = CODE_PATTERN, message = "Username must be 12 alphanumeric characters")
    private String centerCode;

    private Integer studentCapacity;

    @Embedded
    private Address address;

    private List<String> coursesOffered;

    private Date createdOn;

    private static final String Email_PATTERN = "^[a-zA-Z0-9]+@gmail\\.com$";

    @Pattern(regexp = Email_PATTERN, message = "Email must be alphanumeric characters and end with @gmail.com")
    @NotBlank(message = "Email is mandatory")
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Phone number should be 10 digits")
    private String contactPhone;
}
