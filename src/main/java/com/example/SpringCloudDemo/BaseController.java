package com.example.SpringCloudDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;



@Controller
public class BaseController {
	/*

	@Autowired
	private CategoryInfoManager categoryInfoManager;
	
	@Autowired
	private BrandManager brandManager;
	
	
	@Autowired
	private UnitManager unitManager;
	
	@Autowired
	private CategoryBrandManager categoryBrandManager;
	
	@Autowired
	private AreaManager areaManager;
	
	@Autowired
	private LocationManager locationManager;
	
	
	*//**
	 * 基础数据部分
	 *//*
	//类别数据
	private static List<CategoryInfo> listCate;
	
	//大类小类对应映射
	private static Map<CategoryInfo, List<CategoryInfo>> cate_subCateMap;
	
	private static List<Brand> brands;
	
	private static Map<String, Unit> unitMap;
	
	private static List<CategoryBrand> categoryBrandList;
	
	private static Map<String, Brand> brandMap;
	
	
	private static List<Area> areaList;
	
	private static List<Location> locations;
	
	public List<Area> getAreaList(){
		if (areaList==null) {
			areaList = areaManager.findAreaAll();
		}
		return areaList;
	}
	
	public List<Location> getLocationList(){
		if (locations==null) {
			locations = locationManager.findAllLocation();
		}
		return locations;
	}
	
	*//**
	 * 获取所有分类信息
	 * @return
	 *//*
	public List<CategoryInfo> getCategoryInfoList(){
		if (listCate==null) {
			listCate = categoryInfoManager.searchAll();
		}
		return listCate;
	}
	
	*//**
	 * 获取大类小类对应映射
	 * @return
	 *//*
	public Map<CategoryInfo, List<CategoryInfo>> getCate_subCateMap(){
		if (cate_subCateMap == null) {
			cate_subCateMap = handleCategoryInfo();
		} 
		return cate_subCateMap;
	}
	
	*//**
	 * @return Map<大类，对应小类的集合>
	 *//*
	private Map<CategoryInfo, List<CategoryInfo>> handleCategoryInfo(){
		List<CategoryInfo> cateList = getCategoryInfoList();
		Map<CategoryInfo, List<CategoryInfo>> map = new HashMap<CategoryInfo, List<CategoryInfo>>();
		Map<Long, CategoryInfo> handeSubCate = handleSubCate(cateList);
		for (CategoryInfo categoryInfo : cateList) {
			if (categoryInfo.getPid()==0) {
				List<CategoryInfo> sub_cate_list = new ArrayList<CategoryInfo>();
				for (Long subId : handeSubCate.keySet()) {
					if (handeSubCate.get(subId).getPid() == categoryInfo.getId()) {
						sub_cate_list.add(handeSubCate.get(subId));
					}
				}
				map.put(categoryInfo, sub_cate_list);
			}
		}
		return map;
	}
	
	*//**
	 * 处理所有小类
	 * @param list
	 * @return
	 *//*
	private static Map<Long, CategoryInfo> handleSubCate(List<CategoryInfo> list){
		Map<Long, CategoryInfo> map = new HashMap<Long, CategoryInfo>();
		for (CategoryInfo categoryInfo : list) {
			if (categoryInfo.getPid()!=0) {
				map.put(categoryInfo.getId().longValue(), categoryInfo);
			}
		}
		return map;
	}
	
	//处理所有单位信息
	public Map<String, Unit> handleUnit(){
		if (unitMap==null) {
			List<Unit> searchAllUnit = searchAllUnit();
			Map<String, Unit> map = new HashMap<String, Unit>();
			for (int i = 0; i < searchAllUnit.size(); i++) {
				map.put(searchAllUnit.get(i).getId()+"", searchAllUnit.get(i));
			}
			unitMap = map;
		}
		return unitMap;
	}
	
	
	//查询品牌信息
	public Brand searchBrand(Long brandId){
		return brandManager.searchById(brandId);
	}
	
	//查询所有品牌
	public List<Brand> getAllBrandInfo(){
		if (brands==null) {
			brands = brandManager.searchAll();
		}
		return brands;
	}
	
	//查询所有单位
	public List<Unit> searchAllUnit(){
		return unitManager.findAll();
	}
	
	public List<CategoryBrand> getCateBrandRelat(){
		if (categoryBrandList==null) {
			categoryBrandList = categoryBrandManager.findAll();
		}
		return categoryBrandList;
	}
	
	//处理品牌信息
	public Map<String, Brand> brandlistMap(){
		if (brands==null) {
			brands = brandManager.searchAll();
		}
		Map<String, Brand> map = new HashMap<String, Brand>();
		for (int i = 0; i < brands.size(); i++) {
			map.put(brands.get(i).getId().toString(), brands.get(i));
		}
		brandMap = map;
		return brandMap;
	}
	
	//类别List转map
	public Map<String,CategoryInfo> cateMapToMap(List<CategoryInfo> categoryInfos){
		Map<String, CategoryInfo> map = new HashMap<String,CategoryInfo>();
		for(CategoryInfo categoryInfo : categoryInfos){
			map.put(categoryInfo.getId().toString(), categoryInfo);
		}
		return map;
	}
	
	
	
	
	public Map<Long, Commodity> goodsListToMap(List<Commodity> list){
		Map<Long, Commodity> map = new HashMap<Long, Commodity>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i).getId(), list.get(i));
		}
		return map;
	}*/
	
}
