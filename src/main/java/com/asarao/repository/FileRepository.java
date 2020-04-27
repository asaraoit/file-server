package com.asarao.repository;

import com.asarao.domain.File;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FileRepository extends MongoRepository<File,String> {
    
}
