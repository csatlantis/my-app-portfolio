package com.example.clchai.udaport;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class Portfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my spotify streamer app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage2(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage3(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage4(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my build it bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage5(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my xyz reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessage6(View view) {
        // Do something in response to button click
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
