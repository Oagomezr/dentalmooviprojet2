package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Actions;

public interface IActionsRep extends JpaRepository<Actions,Long>{
    
}
