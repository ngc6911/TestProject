package com.test.testproject.data;

import com.test.testproject.data.local.db.entities.RecordEntity;
import com.test.testproject.data.remote.responses.SearchResponse;
import com.test.testproject.presentation.model.RecordModel;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    public static RecordModel entityToModel(RecordEntity recordEntity){
        RecordModel recordModel = new RecordModel();

        recordModel.setItemId(recordEntity.getItemId());
        recordModel.setPointId(recordEntity.getPointId());
        recordModel.setShopId(recordEntity.getShopId());
        recordModel.setProductImage(recordEntity.getProductImage());
        recordModel.setShopName(recordEntity.getShopName());
        recordModel.setProductName(recordEntity.getProductName());
        recordModel.setShopLogo(recordEntity.getShopLogo());
        recordModel.setShopRank(recordEntity.getShopRank());
        recordModel.setPrice(recordEntity.getPrice());
        return recordModel;
    }

    public static RecordEntity responseToEntity(SearchResponse searchResponse){
        RecordEntity recordEntity = new RecordEntity();
        recordEntity.setItemId(searchResponse.getItemId());
        recordEntity.setPointId(searchResponse.getPointId());
        recordEntity.setShopId(searchResponse.getShopId());
        recordEntity.setPrice(searchResponse.getItemPrice());
        recordEntity.setProductImage(searchResponse.getItemImage());
        recordEntity.setShopLogo(searchResponse.getShopLogo());
        recordEntity.setProductName(searchResponse.getItemName());
        recordEntity.setShopName(searchResponse.getShopName());
        recordEntity.setProductImage(searchResponse.getItemImage());
        recordEntity.setShopRank(searchResponse.getShopRank());

        return recordEntity;
    }

    public static List<RecordEntity> responsesToEntity(List<SearchResponse> searchResponses){
        List<RecordEntity> recordModels = new ArrayList<>(searchResponses.size());

        for(SearchResponse response: searchResponses){
            recordModels.add(responseToEntity(response));
        }

        return recordModels;
    }

    public static List<RecordModel> entitiesToModel(List<RecordEntity> recordEntities){
        List<RecordModel> recordModels = new ArrayList<>(recordEntities.size());

        for(RecordEntity entity: recordEntities){
            recordModels.add(entityToModel(entity));
        }

        return recordModels;
    }
}
