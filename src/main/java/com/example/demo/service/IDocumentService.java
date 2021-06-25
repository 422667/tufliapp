package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Document;



public interface IDocumentService {

	public void saveDocument(Document doc);
	public List<Object[]> getDocIdAndNames();
	public Optional<Document> getDocumentById(Integer id);
}
