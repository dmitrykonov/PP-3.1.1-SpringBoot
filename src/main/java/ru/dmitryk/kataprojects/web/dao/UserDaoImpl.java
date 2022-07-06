//package ru.dmitryk.kataprojects.web.dao;
//
//import org.springframework.stereotype.Repository;
//import ru.dmitryk.kataprojects.web.model.User;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//public class UserDaoImpl implements UserDao {
//
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    @Override
//    public List<User> getAllUsers() {
//        return entityManager.createQuery("FROM User", User.class).getResultList();
//    }
//
//    public User getUserById(final int id) {
//        return entityManager.find(User.class, id);
//    }
//
//    @Override
//    public void addUser(User user) {
//        entityManager.persist(user);
//    }
//
//    @Override
//    public void deleteUser(int id) {
//        entityManager.createQuery("DELETE FROM User u WHERE u.id = :id")
//                .setParameter("id", id).executeUpdate();
//    }
//
//    @Override
//    public void updateUser(User updatedUser) {
//        entityManager.merge(updatedUser);
//    }
//}
