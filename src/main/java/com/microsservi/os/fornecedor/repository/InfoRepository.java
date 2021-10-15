package com.microsservi.os.fornecedor.repository;

import com.microsservi.os.fornecedor.model.InfoFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {

    InfoFornecedor findByEstado(String estado);
}
