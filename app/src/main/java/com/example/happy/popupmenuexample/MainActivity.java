package com.example.happy.popupmenuexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.MenuInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showPopup(View view){
        PopupMenu popupMenu = new PopupMenu(this,view);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popupmenu,popupMenu.getMenu());
        popupMenu.show();
    }
}
