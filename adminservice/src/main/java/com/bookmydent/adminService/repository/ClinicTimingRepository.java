package com.bookmydent.adminService.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookmydent.adminService.entity.ClinicTiming;

public interface ClinicTimingRepository
        extends MongoRepository<ClinicTiming, String> {

    List<ClinicTiming> findAllByOrderByStartHourAsc();
}