package com.amer.service.dal.dao;

import com.amer.service.dal.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amer Salah
 */
@Repository
public interface GuestRepository extends JpaRepository<Guest, Long> {
}
