package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.repo.DocumentRepository;
import com.example.demo.model.Document;
import com.example.demo.service.IDocumentService;



@Service
public class DocumentServiceImpl implements IDocumentService {

	@Autowired
	private DocumentRepository repo;
	
	public void saveDocument(Document doc) {
		repo.save(doc);
	}

	@Override
	public List<Object[]> getDocIdAndNames() {
		return repo.getDocIdAndNames();
	}
	
	@Override
	public Optional<Document> getDocumentById(Integer id) {
		return repo.findById(id);
	}
}
