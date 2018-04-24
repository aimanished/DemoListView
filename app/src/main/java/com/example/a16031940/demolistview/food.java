package com.example.a16031940.demolistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class food {
    private String name;
    private boolean star;

    public food(String name, boolean star) {
        this.name = name;
        this.star = star;
    }

    public String getName() {
        return name;
    }

    public boolean isStar() {
        return star;
    }
}

