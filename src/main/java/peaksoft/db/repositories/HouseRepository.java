//package peaksoft.db.repositories;
//import org.springframework.stereotype.Repository;
//import peaksoft.db.model.House;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import java.util.List;
//
//@Repository
//public class HouseRepository {
//    @PersistenceContext
//    private EntityManager entityManager;
//
//    public List<House> getAllHouse() {
//        return entityManager.createQuery("select h from House h", House.class).getResultList();
//    }
//}
