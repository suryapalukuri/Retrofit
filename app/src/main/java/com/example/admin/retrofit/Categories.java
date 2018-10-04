package com.example.admin.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Categories {
    @SerializedName("batsman")
    @Expose    private List<Batsman> batsman = null;
    public List<Batsman> getBatsman() {
        return batsman;    }

 public class Batsman {


        public String getName() {
            return name;
        }

        public String getAverage() {
            return average;
        }

        public String getAge() {
            return age;
        }

        public String getInns() {
            return inns;
        }
        @SerializedName("name")
        @Expose String name;
        @SerializedName("average")
        @Expose String average;
        @SerializedName("age")
        @Expose String age;
        @SerializedName("inns")
        @Expose String inns;

    }
}