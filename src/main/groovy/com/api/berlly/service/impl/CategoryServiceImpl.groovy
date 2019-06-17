package com.api.mhusein.service.impl
import com.api.mhusein.entity.Category
import com.api.mhusein.repository.CategoryRepository
import com.api.mhusein.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryService implements CategoryService{
    @Autowired
    private final CategoryRepository CategoryRepository

    @Override
    List<Category> findAll(){
        CategoryRepository.findAll()
    }

    @Override
    Category findById(int id){
        CategoryRepository.findById(id)
    }

    @Override
    Category save(Category category){
        CategoryRepository.save(category)
    }

    @Override
    Category update(Category category, int id){
        def record = CategoryRepository.findById(id)
        record.with{
            name = category.name
            description = category.description
            subcategory = category.subcategory
        }

        CategoryRepository.save(record)
        record
    }

    @Override
    Category delete(int id){
        def record = CategoryRepository.findById(id)
        CategoryRepository.delete(record)
        record
    }
}