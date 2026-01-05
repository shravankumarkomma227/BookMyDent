package com.dentalcare.adminService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dentalcare.adminService.entity.ClinicTiming;

public interface ClinicTimingRepository
        extends MongoRepository<ClinicTiming, String> {

    List<ClinicTiming> findAllByOrderByStartHourAsc();
}