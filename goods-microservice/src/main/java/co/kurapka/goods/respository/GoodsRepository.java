package co.kurapka.goods.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.kurapka.goods.model.Goods;

public interface GoodsRepository extends MongoRepository<Goods, String> {

}
