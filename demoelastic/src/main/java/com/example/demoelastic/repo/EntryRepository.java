package com.example.demoelastic.repo;

import com.example.demoelastic.model.Entry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntryRepository extends ElasticsearchRepository<Entry,String> {
    List<Entry> findByName(String name);
    List<Entry> findByStatus(Boolean status);
}
