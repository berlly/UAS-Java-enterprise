package com.api.berlly.repository
import com.api.berlly.entity.Category
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository extends JpaRepository<Category, Integer>{
    List<Category> findAll()
    Category findById(Integer id)
    Category save(Category category)
    void delete(Category category)
}