package com.isoftbet.crud.model;

import java.util.List;

public interface CRUDService<T> {
	List<T> retrieveAll();
	T retrieve(long id);
	T retrieve(T t);
	void create(T t);
	void update(T t);
	void delete(T t);
}
