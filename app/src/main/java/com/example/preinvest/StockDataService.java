package com.example.preinvest;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class StockDataService {
    Context context;
    String StockTag = null;

    public StockDataService(Context context) {
        this.context = context;
    }

    public interface StockByTagResponse {
        void onError(String message);

        void onResponse(List<StockReportModel> stockReportModel);
    }


    public void getStockPriceByTag(String StockTag, StockByTagResponse stockByTagResponse) {
        List<StockReportModel> report = new ArrayList<>();
        String url = "https://financialmodelingprep.com/api/v3/quote/"+StockTag+"?apikey=836208c60bb2ef6e03af06343765509a";
        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try{
                    for(int i=0; i<response.length(); i++) {
                        StockReportModel stock_one = new StockReportModel();
                        JSONObject stock_from_api = (JSONObject) response.get(i);

                        stock_one.setSymbol(stock_from_api.getString("symbol"));
                        stock_one.setName(stock_from_api.getString("name"));
                        stock_one.setPrice(stock_from_api.getDouble("price"));
                        stock_one.setChangesPercentage(stock_from_api.getDouble("changesPercentage"));
                        stock_one.setChange(stock_from_api.getDouble("change"));
                        stock_one.setDayLow(stock_from_api.getDouble("dayLow"));
                        stock_one.setDayHigh(stock_from_api.getDouble("dayHigh"));
                        stock_one.setYearHigh(stock_from_api.getDouble("yearHigh"));
                        stock_one.setYearLow(stock_from_api.getDouble("yearLow"));
                        stock_one.setMarketCap(stock_from_api.getDouble("marketCap"));
                        stock_one.setOpen(stock_from_api.getDouble("open"));
                        stock_one.setPreviousClose(stock_from_api.getDouble("previousClose"));
                        report.add(stock_one);
                    }
                    stockByTagResponse.onResponse(report);

                } catch(JSONException e){
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(context).addToRequestQueue(request);
    }


}