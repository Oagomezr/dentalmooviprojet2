package com.dentalmoovi.webpage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dentalmoovi.webpage.models.Invoices;

public interface IInvoicesRep extends JpaRepository<Invoices,Long>{
    
}
