package me.kimjunhee.springbootdeveloper.repository;

import me.kimjunhee.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}