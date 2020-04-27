package com.asarao.service.impl;

import com.asarao.domain.File;
import com.asarao.repository.FileRepository;
import com.asarao.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * @ClassName: FileServiceImpl
 * @Description: TODO
 * @Author: Asarao
 * @Date: 2020/4/27 14:19
 * @Version: 1.0
 **/
@Service
public class FileServiceImpl implements FileService {

    @Autowired
    public FileRepository fileRepository;

    @Override
    public File saveFile(File file) {
        return fileRepository.save(file);
    }

    @Override
    public void removeFile(String id) {
        fileRepository.deleteById(id);
    }

    @Override
    public Optional<File> getFileById(String id) {
        return fileRepository.findById(id);
    }

    @Override
    public List<File> listFilesByPage(int pageIndex, int pageSize) {

        Sort sort = Sort.by(Sort.Direction.DESC, "uploadDate");

        Pageable pageable = PageRequest.of(pageIndex, pageSize, sort);

        Page<File> page = fileRepository.findAll(pageable);
        List<File> content = page.getContent();
        return content;
    }
}
