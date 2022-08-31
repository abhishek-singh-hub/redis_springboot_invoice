package com.redis.invoice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redis.invoice.modal.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer>{

}
