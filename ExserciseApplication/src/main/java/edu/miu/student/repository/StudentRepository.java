package edu.miu.student.repository;

import edu.miu.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository  extends JpaRepository<Student,Long> {
//    @Query("select p from Product p where p.productName like %:searchString% and p.release='Yes'")
//    Page<Product> findByProductName(Pageable var1,String searchString);
//
//    //      @Query(value="select p from Product p where p.id=:categoryId")
////      List<Product> findAllByCategoryId(long categoryId);
//    List<Product> findAllByOrderByUpLoadedDate();
//
//    @Query("select p.user from Product p where p.id=: pId")
//    User findUserByProductId(Long pId);
//}
}
