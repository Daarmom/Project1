//package com.example.hospitalmanagement.controller;
//
//import com.example.hospitalmanagement.model.PatientData;
//import com.example.hospitalmanagement.repository.PatientDataRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class AdminController {
//
//    @Autowired
//    PatientDataRepository patientDataRepository;
//    @CrossOrigin(origins = "http://localhost:63342")
//    @GetMapping("/fetch-data")
//    public List<PatientData> fetchAllData(){
//       return patientDataRepository.findAll();
//    }
//    @CrossOrigin(origins = "http://localhost:63342")
//    @GetMapping("/fetchByName/{name}")
//    public List<PatientData> fetchByName(@PathVariable String name){
//        return patientDataRepository.findAllByName(name);
//    }
//    @CrossOrigin(origins = "http://localhost:63342")
//    @GetMapping("/fetchByCovidStatus/{status}")
//    public List<PatientData> fetchByCovidStatus(@PathVariable String status){
//        return patientDataRepository.findAllByCovidStatus(status);
//    }
//    @CrossOrigin(origins = "http://localhost:63342")
//    @PostMapping("/addPatient")
//    public String addPatient(@RequestBody PatientData data){
//        System.out.println(data);
//        patientDataRepository.save(data);
//        return "Patient ADDED ";
//    }
//    @CrossOrigin(origins = "http://localhost:63342")
//    @PostMapping("removePatient/{id}")
//    public String removePatient(@PathVariable Integer id){
//    patientDataRepository.deleteById(id);
//    return "Patient removed";
//    }
//}
package com.example.hospitalmanagement.controller;

import com.example.hospitalmanagement.model.PatientData;
import com.example.hospitalmanagement.repository.PatientDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    PatientDataRepository patientDataRepository;

    @CrossOrigin(origins = {"http://localhost:63342", "http://127.0.0.1:5500"})
    @GetMapping("/fetch-data")
    public List<PatientData> fetchAllData(){
        return patientDataRepository.findAll();
    }

    @CrossOrigin(origins = {"http://localhost:63342", "http://127.0.0.1:5500"})
    @GetMapping("/fetchByName/{name}")
    public List<PatientData> fetchByName(@PathVariable String name){
        return patientDataRepository.findAllByName(name);
    }

    @CrossOrigin(origins = {"http://localhost:63342", "http://127.0.0.1:5500"})
    @GetMapping("/fetchByCovidStatus/{status}")
    public List<PatientData> fetchByCovidStatus(@PathVariable String status){
        return patientDataRepository.findAllByCovidStatus(status);
    }

    @CrossOrigin(origins = {"http://localhost:63342", "http://127.0.0.1:5500"})
    @PostMapping("/addPatient")
    public String addPatient(@RequestBody PatientData data){
        System.out.println(data);
        patientDataRepository.save(data);
        return "Patient ADDED ";
    }

    @CrossOrigin(origins = {"http://localhost:63342", "http://127.0.0.1:5500"})
    @PostMapping("removePatient/{id}")
    public String removePatient(@PathVariable Integer id){
        System.out.println(id+" Inside Method ");
        patientDataRepository.deleteById(id);
        return "Patient removed";
    }
}
