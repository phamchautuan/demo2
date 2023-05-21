package phamchautuan.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phamchautuan.demo.Entity.Category;

@Repository
public interface   ICategoryRepository extends JpaRepository<Category, Long> {
}