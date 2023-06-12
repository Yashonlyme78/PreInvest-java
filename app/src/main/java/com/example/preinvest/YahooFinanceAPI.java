package com.example.preinvest;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface YahooFinanceAPI {
    @Headers({
            "x-rapidapi-host: apidojo-yahoo-finance-v1.p.rapidapi.com",
            "x-rapidapi-key: 58bcd3607cmsh25849bed599f6f1p179020jsndb8e51ec7831"
    })
    @GET("/stock/v2/get-historical-data")
    Call<HistoricalDataResponse> getHistoricalData(
            @Query("frequency") String frequency,
            @Query("filter") String filter,
            @Query("period1") String period1,
            @Query("period2") String period2,
            @Query("symbol") String symbol
    );
}