package com.ictec.mobapp.repo;

import com.ictec.mobapp.entities.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepo extends JpaRepository <Business, Long> {

}
