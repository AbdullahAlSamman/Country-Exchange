package com.aals.countriesexchange.UI;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.aals.countriesexchange.R;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.scrollTo;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

@RunWith(AndroidJUnit4.class)
public class CountryViewUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule
            = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void init() {
        onView(withId(R.id.rv_countries)).perform(RecyclerViewActions.actionOnItemAtPosition(249, click()));
    }

    @Test
    public void assertions() {
        onView(withId(R.id.iv_cs_image)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_nativename)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_area)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_population)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_callingcodes)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_capital)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_borders)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_languages)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_alpah2code)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_alpah3code)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_region)).check(matches(isDisplayed()));
        onView(withId(R.id.tv_cs_timezones)).check(matches(isDisplayed()));
        onView(withId(R.id.ll_currencies_list)).perform(scrollTo()).check(matches(isDisplayed()));
    }

    @Test
    public void exchangeMenuTest() {
        onView(withId(R.id.sp_cs_country_exchange)).perform(scrollTo()).perform(click());

        onData(allOf(is(instanceOf(String.class)))).atPosition(2).perform(click());

        onView(withId(R.id.tv_cs_currency_exchange_value)).perform(click()).check(matches(isDisplayed()));

    }

    @Test
    public void baseMenuTest() {
        onView(withId(R.id.sp_cs_base_exchange)).perform(scrollTo()).perform(click());

        onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());

        onView(withId(R.id.tv_cs_currency_exchange_value)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void baseExchangeMenuTest() {
        onView(withId(R.id.sp_cs_base_exchange)).perform(scrollTo()).perform(click());

        onData(allOf(is(instanceOf(String.class)))).atPosition(1).perform(click());

        onView(withId(R.id.sp_cs_country_exchange)).perform(scrollTo()).perform(click());

        onData(allOf(is(instanceOf(String.class)))).atPosition(4).perform(click());

        onView(withId(R.id.tv_cs_currency_exchange_value)).perform(click()).check(matches(isDisplayed()));
    }

}
