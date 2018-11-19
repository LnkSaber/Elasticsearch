package com.leyou.repository;

import com.leyou.pojo.Item;
import org.apache.lucene.util.automaton.LimitedFiniteStringsIterator;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
    List<Item> findAllByPriceBetween(Double begin,Double end);
}
