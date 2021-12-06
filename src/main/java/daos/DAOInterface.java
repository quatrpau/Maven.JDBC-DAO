package daos;

import java.util.List;

public interface DAOInterface<E> {
    public E findById(int id);
    public List findAll();
    public E update(E dto);
    public E create(E dto);
    public void delete(int id);
}
