package com.sip.ams.repositories;

import com.sip.ams.entities.Article;
import com.sip.ams.entities.Provider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
}
