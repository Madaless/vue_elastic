package com.example.demoelastic;

import com.example.demoelastic.model.Entry;
import com.example.demoelastic.repo.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
@RestController
@CrossOrigin
@RequestMapping("/entries/")
public class DemoelasticApplication implements CommandLineRunner {

    @Autowired
    EntryRepository repository;

    @DeleteMapping("{id}")
    public void deleteEntry(@PathVariable String id) {
        repository.deleteById(id);
    }

    @PostMapping()
    public Entry saveEntry(@RequestBody Entry customer) {
        return repository.save(customer);
    }

    @GetMapping()
    public Iterable<Entry> findAllEntry() {
        return repository.findAll();
    }

    @GetMapping("/filter")
    public Iterable<Entry> filter(@RequestParam(required = false, name = "status") Optional<Boolean> status, @RequestParam(required = false , name = "name") Optional <String> name) {
        if(name.isPresent()  && status.isPresent())
            return repository.findByStatus(status.get());
        else if (name.isPresent())
            return  repository.findByName(name.get());
        else if (status.isPresent())
            return repository.findByStatus(status.get());
        else
            return repository.findAll();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoelasticApplication.class, args);
    }

    @Override
    public void run(String...args) throws Exception {
        List<Entry> entryList = new ArrayList<>();
        entryList.add(new Entry("1","entry name 1","description1",true));
        entryList.add(new Entry("2","entry name 2","description2",true));
        entryList.add(new Entry("3","entry name 3","description3",false));
        entryList.add(new Entry("4","entry name 4","description4",false));
        entryList.add(new Entry("5","Asd","hajjhj gyty jhhjhj",false));
        repository.saveAll(entryList);
    }

}
