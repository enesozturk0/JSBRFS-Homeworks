package week5.repository.abstracts;

import java.util.List;

public interface BaseRepository <T>{
    void add(T entity);
    List<T> getAll();
    void delete(T entity);
    void update(int id , String name);
    T getById(int id);
}
