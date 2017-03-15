package th.co.mfec.chaiyapong.gradecalculator;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by landmark on 10/7/2016 AD.
 */
@LargeTest
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity>{

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception{
        super.setUp();
        getActivity();
    }

    public void testCalculateFunction(){
        onView(withId(R.id.score)).perform(typeText("60"));
        onView(withId(R.id.addButton)).check(matches(withText("Convert")));
        onView(withId(R.id.addButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Your grade = C")));

    }

    public void testCalculateFunctionA(){
        onView(withId(R.id.score)).perform(typeText("90"));
        onView(withId(R.id.addButton)).check(matches(withText("Convert")));
        onView(withId(R.id.addButton)).perform(click());
        onView(withId(R.id.result)).check(matches(withText("Your grade = A")));

    }
}