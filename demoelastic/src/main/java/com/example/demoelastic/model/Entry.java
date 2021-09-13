package com.example.demoelastic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "e")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Entry {
    @Id
    private String id;
    private String name;
    private String description;
    private boolean status;
}
