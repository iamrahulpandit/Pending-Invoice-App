package com.invoicepending.server.dao;

import com.invoicepending.server.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceDao extends JpaRepository<Invoice, Long> {
}
