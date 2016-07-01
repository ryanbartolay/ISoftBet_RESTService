package com.isoftbet.util.model;

import java.util.List;

public interface DAObject<T> {
	List<T> findAll();
	T find(long id);
	T find(T t);
	T add(final T t);
	void set(final T t);
	void delete(final T t);
}
