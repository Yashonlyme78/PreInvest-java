package com.example.preinvest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

public class CurrentPrice extends AppCompatActivity {
    Button btn_getPrice;
    EditText et_dataInput;
    ListView  lv_stockReport;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_price);

        btn_getPrice = findViewById(R.id.btn_getPrice);
        et_dataInput = findViewById(R.id.et_dataInput);
        lv_stockReport = findViewById(R.id.lv_stockReports);

        final StockDataService stockDataService = new StockDataService(CurrentPrice.this);

        btn_getPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StockDataService stockDataService = new StockDataService(CurrentPrice.this);
                stockDataService.getStockPriceByTag(et_dataInput.getText().toString(), new StockDataService.StockByTagResponse() {
                    @Override
                    public void onError(String message) {
                        Toast.makeText(CurrentPrice.this, "Wrong", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onResponse(List<StockReportModel> StockReportModel) {

                        ArrayAdapter arrayAdapter = new ArrayAdapter(CurrentPrice.this, android.R.layout.simple_list_item_1,StockReportModel);
                        lv_stockReport.setAdapter(arrayAdapter);
                    }
                });{

                };
            }
        });}}