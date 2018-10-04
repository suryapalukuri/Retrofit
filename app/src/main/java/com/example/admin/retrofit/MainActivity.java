package com.example.admin.retrofit;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApiService service = RetrofitClass.getApiService();
        Call<Categories> categoriesCall=service.getCategories();
        Log.i("URL", categoriesCall.request().url().toString());
        categoriesCall.enqueue(new Callback<Categories>() {
            @Override
            public void onResponse(Call<Categories> call, Response<Categories> response) {
                if (response.isSuccessful()){
                    List<Categories.Batsman> batsmen=response.body().getBatsman();
                    for (int i=0;i<batsmen.size();i++) {
                        //int statuscode = response.code();
                        String name = batsmen.get(i).getName();
                        String average = batsmen.get(i).getAverage();
                        String age = batsmen.get(i).getAge();
                        String inns = batsmen.get(i).getInns();
                        Log.i("cat", name + " @ " + average + " @ " + age + " @ " + inns);
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();

                    }
                }
            }

            @Override
            public void onFailure(Call<Categories> call, Throwable t) {
                Log.e("Error", t.getMessage());
            }
        });



    }
}