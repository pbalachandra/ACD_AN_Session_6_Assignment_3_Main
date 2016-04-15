package com.acadgild.balu.acd_an_session_6_assignment_3_main;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView tv_display_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_display_text = (TextView) findViewById(R.id.textView_display);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_colors, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (item.getItemId() == R.id.menu_red)
            tv_display_text.setTextColor(Color.RED);
        else if (item.getItemId() == R.id.menu_green)
            tv_display_text.setTextColor(Color.GREEN);
        else if (item.getItemId() == R.id.menu_blue)
            tv_display_text.setTextColor(Color.BLUE);

        return super.onOptionsItemSelected(item);
    }
}
