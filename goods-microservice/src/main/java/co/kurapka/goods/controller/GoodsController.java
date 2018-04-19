package co.kurapka.goods.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.kurapka.goods.model.Goods;
import co.kurapka.goods.respository.GoodsRepository;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsRepository goodsRepository;
	
	@RequestMapping(method = RequestMethod.POST)
	public Goods create(@RequestBody Goods goods) {
		return goodsRepository.save(goods);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{goodsId}")
	public Optional<Goods> get(@PathVariable String goodsId) {
		return goodsRepository.findById(goodsId);
	}
	
}
