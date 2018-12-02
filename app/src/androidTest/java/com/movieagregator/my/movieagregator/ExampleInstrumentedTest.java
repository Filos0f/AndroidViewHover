package com.movieagregator.my.movieagregator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.movieagregator.my.movieagregator.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.movieagregator.my.movieagregator", appContext.getPackageName());
    }

    @Rule
    public ActivityTestRule<MainActivity> nActivityTestRule = new ActivityTestRule<MainActivity>(
            MainActivity.class, true, true
    ){};

    @Test
    public void validateRecyclerViewClickSecondElement() {
        onView(withId(R.id.rvMovies)).perform(
                RecyclerViewActions.actionOnItemAtPosition(2, click())));
    }

    @Test
    public void validateRecyclerViewClickThridElement() {
        onView(withId(R.id.rvMovies)).perform(
                RecyclerViewActions.actionOnItemAtPosition(3, click())));
    }
}
