package com.example.oscar.oscarligthart_pset1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // set every body part to invisible, except for body
        ImageView hat = (ImageView) findViewById(R.id.imageHat);
        hat.setVisibility(View.INVISIBLE);

        ImageView eyes = (ImageView) findViewById(R.id.imageEyes);
        eyes.setVisibility(View.INVISIBLE);

        ImageView nose = (ImageView) findViewById(R.id.imageNose);
        nose.setVisibility(View.INVISIBLE);

        ImageView mouth = (ImageView) findViewById(R.id.imageMouth);
        mouth.setVisibility(View.INVISIBLE);

        ImageView ears = (ImageView) findViewById(R.id.imageEars);
        ears.setVisibility(View.INVISIBLE);

        ImageView eyebrows = (ImageView) findViewById(R.id.imageEyebrows);
        eyebrows.setVisibility(View.INVISIBLE);

        ImageView glasses = (ImageView) findViewById(R.id.imageGlasses);
        glasses.setVisibility(View.INVISIBLE);

        ImageView mustache = (ImageView) findViewById(R.id.imageMustache);
        mustache.setVisibility(View.INVISIBLE);

        ImageView arms = (ImageView) findViewById(R.id.imageArms);
        arms.setVisibility(View.INVISIBLE);

        ImageView shoes = (ImageView) findViewById(R.id.imageShoes);
        shoes.setVisibility(View.INVISIBLE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void CheckboxCheck(View view)
    {
        //check if clicked checkbox is arms
        if (view.getId() == R.id.checkHat) {
            ImageView hat = (ImageView) findViewById(R.id.imageHat);

            // if checkbox is checked, set hat to visible
            if (((CheckBox) view).isChecked()) {
                hat.setVisibility(View.VISIBLE);
            }
            // if checkbox is unchecked, set hat to invisible
            else {
                hat.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is eyes
        else if (view.getId() == R.id.checkEyes){
            ImageView eyes = (ImageView) findViewById(R.id.imageEyes);

            // if checkbox is checked, set eyes to visible
            if (((CheckBox) view).isChecked()) {
                eyes.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set eyes to invisible
            else {
                eyes.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is nose
        else if (view.getId() == R.id.checkNose){
            ImageView nose = (ImageView) findViewById(R.id.imageNose);

            // if checkbox is checked, set nose to visible
            if (((CheckBox) view).isChecked()) {
                nose.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set nose to invisible
            else {
                nose.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is mouth
        else if (view.getId() == R.id.checkMouth){
            ImageView mouth = (ImageView) findViewById(R.id.imageMouth);

            // if checkbox is checked, set mouth to visible
            if (((CheckBox) view).isChecked()) {
                mouth.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set mouth to invisble
            else {
                mouth.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is ears
        else if (view.getId() == R.id.checkEars){
            ImageView ears = (ImageView) findViewById(R.id.imageEars);

            // if checkbox is checked, set ears to visible
            if (((CheckBox) view).isChecked()) {
                ears.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set ears to invisible
            else {
                ears.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is eyebrows
        else if (view.getId() == R.id.checkEyebrows){
            ImageView eyebrows = (ImageView) findViewById(R.id.imageEyebrows);

            // if checkbox is checked, set eyebrows to visible
            if (((CheckBox) view).isChecked()) {
                eyebrows.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set eyebrows to invisible
            else {
                eyebrows.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is glasses
        else if (view.getId() == R.id.checkGlasses){
            ImageView glasses = (ImageView) findViewById(R.id.imageGlasses);

            // if checkbox is checked, set glasses to visible
            if (((CheckBox) view).isChecked()) {
                glasses.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set glasses to invisible
            else {
                glasses.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is mustache
        else if (view.getId() == R.id.checkMustache){
            ImageView mustache = (ImageView) findViewById(R.id.imageMustache);

            // if checkbox is checked, set mustache to visible
            if (((CheckBox) view).isChecked()) {
                mustache.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set mustache to invisible
            else {
                mustache.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is arms
        else if (view.getId() == R.id.checkArms){
            ImageView arms = (ImageView) findViewById(R.id.imageArms);

            // if checkbox is checked, set arms to visible
            if (((CheckBox) view).isChecked()) {
                arms.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked set arms to invisible
            else {
                arms.setVisibility(View.INVISIBLE);
            }
        }
        //check if clicked checkbox is shoes
        else if (view.getId() == R.id.checkShoes){
            ImageView shoes = (ImageView) findViewById(R.id.imageShoes);

            // if checkbox is checked, set shoes to visible
            if (((CheckBox) view).isChecked()) {
                shoes.setVisibility(View.VISIBLE);
            }

            // if checkbox is unchecked, set shoes to invisible
            else {
                shoes.setVisibility(View.INVISIBLE);
            }
        }
    }
}
