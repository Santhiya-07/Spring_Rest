package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Module;
import com.exception.InvalidModuleException;
import com.service.IModuleService;

import jakarta.validation.Valid;

//Provide necessary Annotation
@RestController

public class ModuleController {

    //Provide necessary Annotation
	@Autowired
    private IModuleService moduleService;

  // Provide necessary Annotation and fill code in the below methods
    
    @PostMapping("/addModule")
    public ResponseEntity<Module> addModule(@Valid @RequestBody Module module) {
        
        return ResponseEntity.ok(moduleService.addModule(module));
    }
    

    @PutMapping("/updateModuleFee/{moduleId}/{moduleFee}")
    public ResponseEntity<Module> updateModuleFee(@PathVariable String moduleId, @PathVariable double moduleFee) throws InvalidModuleException {
        return new ResponseEntity<Module>(moduleService.updateModuleFee(moduleId, moduleFee), HttpStatus.OK) ;
    }
    
   
    @GetMapping("viewModuleById/{moduleId}")
    public ResponseEntity<Module> viewModuleById(@PathVariable String moduleId) throws InvalidModuleException {
        return new ResponseEntity<Module>(moduleService.viewModuleById(moduleId), HttpStatus.OK);
    }
    
   
    @GetMapping("/viewAllModules")
    public ResponseEntity<List<Module>> viewAllModules () {
        return new ResponseEntity<List<Module>>(moduleService.viewAllModules(), HttpStatus.OK);
    }
    
   
    @DeleteMapping("/deleteModule/{moduleId}")
    public ResponseEntity<Module> deleteModule(@PathVariable String moduleId) throws InvalidModuleException {
        return new ResponseEntity<Module>(moduleService.deleteModule(moduleId), HttpStatus.OK);
    }
}
