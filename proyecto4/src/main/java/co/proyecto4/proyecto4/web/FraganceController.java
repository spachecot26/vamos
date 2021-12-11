package co.proyecto4.proyecto4.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.proyecto4.proyecto4.model.Fragance;
import co.proyecto4.proyecto4.service.FraganceService;

@RestController
@RequestMapping("/api/laptop")
@CrossOrigin("*")
public class FraganceController {
    @Autowired
    private FraganceService fraganceService;
       
     @GetMapping("/all")
    public List<Fragance> getAll() {
        return fraganceService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Fragance> getFragance(@PathVariable("id") int FraganceID) {
        return fraganceService.getFragance(FraganceID);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Fragance create(@RequestBody Fragance fragance) {
        return fraganceService.create(fragance);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Fragance update(@RequestBody Fragance fragance) {
        return fraganceService.update(fragance);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int FraganceId) {
        return fraganceService.delete(FraganceId);
    } 

}

