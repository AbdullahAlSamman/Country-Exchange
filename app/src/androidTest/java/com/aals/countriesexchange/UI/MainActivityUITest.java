package com.aals.countriesexchange.UI;

import android.widget.AutoCompleteTextView;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.aals.countriesexchange.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;


@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {


    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void recyclerViewOnItemClickTest() {
        //pressing at Second item
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));
        pressBack();
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.actionOnItemAtPosition(99, click()));
        pressBack();
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.actionOnItemAtPosition(199, click()));
        pressBack();
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.actionOnItemAtPosition(249, click()));
    }

    @Test
    public void searchTest() {
        onView(withId(R.id.action_search)).perform(click());
        onView(isAssignableFrom(AutoCompleteTextView.class)).perform(typeText("fra"));
        onView(isAssignableFrom(AutoCompleteTextView.class)).perform(clearText(), typeText("ger"));
        onView(isAssignableFrom(AutoCompleteTextView.class)).perform(clearText(), typeText("96"));
        onView(isAssignableFrom(AutoCompleteTextView.class)).perform(clearText(), typeText("15"));
    }

}