package com.microsservi.os.fornecedor.service;

import com.microsservi.os.fornecedor.model.InfoFornecedor;
import com.microsservi.os.fornecedor.repository.InfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class InfoService {

    @Autowired
    private InfoRepository infoRepository;

    @RequestMapping("/{estado}")
    public InfoFornecedor getInfoPorEstado(String estado) {
        return infoRepository.findByEstado(estado);

    }
}
