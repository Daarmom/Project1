package com.example.hospitalmanagement.repository;

import com.example.hospitalmanagement.model.PatientData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDataRepository extends JpaRepository<PatientData,Integer> {
    List<PatientData> findAllByName(String name);

    List<PatientData> findAllByCovidStatus(String status);

    void deleteById(Integer id);
}
