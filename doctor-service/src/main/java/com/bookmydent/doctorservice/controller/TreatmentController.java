package com.bookmydent.doctorservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bookmydent.doctorservice.dto.Response;
import com.bookmydent.doctorservice.dto.TreatmentDTO;
import com.bookmydent.doctorservice.service.TreatmentService;

@RestController
@RequestMapping("/doctors")
@CrossOrigin(origins = {"http://localhost:3000", "http://localhost:3001"})
public class TreatmentController {

    @Autowired
    private TreatmentService treatmentService;

    @PostMapping("/addTreatment")
    public ResponseEntity<Response> addTreatment(@RequestBody TreatmentDTO dto) {
        return treatmentService.addTreatment(dto);
    }

    @GetMapping("/getAllTreatments")
    public ResponseEntity<Response> getAllTreatments() {
        return treatmentService.getAllTreatments();
    }

    @GetMapping("/getTreatmentById/{id}/{hospitalId}")
    public ResponseEntity<Response> getTreatmentById(@PathVariable String id, @PathVariable String hospitalId) {
        return treatmentService.getTreatmentById(id, hospitalId);
    }

    @DeleteMapping("/deleteTreatmentByIdAndHospitalId/{id}/{hospitalId}")
    public ResponseEntity<Response> deleteTreatment(@PathVariable String id, @PathVariable String hospitalId) {
        return treatmentService.deleteTreatmentById(id, hospitalId);
    }

    @PutMapping("/updateTreatmentByIdAndHospital/{id}/{hospitalId}")
    public ResponseEntity<Response> updateTreatment(@PathVariable String id,
                                                    @PathVariable String hospitalId,
                                                    @RequestBody TreatmentDTO dto) {
        return treatmentService.updateTreatmentById(id, hospitalId, dto);
    }
}
