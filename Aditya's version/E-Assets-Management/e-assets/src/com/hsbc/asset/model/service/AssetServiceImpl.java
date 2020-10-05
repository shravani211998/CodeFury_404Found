package com.hsbc.asset.model.service;

import com.hsbc.asset.model.beans.Asset;
import com.hsbc.asset.model.dao.AssetDao;
import com.hsbc.asset.utility.FactoryPattern;
import com.hsbc.asset.utility.Type;

public class AssetServiceImpl implements AssetService {
	private AssetDao dao = null;
	
	

	public AssetServiceImpl() {
		dao = (AssetDao)FactoryPattern.getInstance(Type.ASSETDAO);	
	}



	@Override
	public Asset addAsset(Asset asset) {
		Asset createdAsset = dao.storeAsset(asset);
		return createdAsset;
	}

}
