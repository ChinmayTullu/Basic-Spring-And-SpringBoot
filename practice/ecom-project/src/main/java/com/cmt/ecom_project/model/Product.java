package com.cmt.ecom_project.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int stockQuantity;
    private String name;
    private String description;
    private String brand;
    private String category;
    private BigDecimal price;

    // @JsonFormat(pattern="dd/MM/yyyy")
    private Date releaseDate;
    private boolean productAvailable;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

}
