package com.isoftbet.util.model;

import java.util.List;

public interface DAObject<T> {
	List<T> findAll();
	T find(long id);
	T find(T t);
	void add(T t);
	void set(T t);
	void delete(T t);
}
