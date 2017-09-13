package nick.xxx.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import nick.xxx.com.myapplication.view.CalendarView;

public class CalendarActivity extends AppCompatActivity {

    private CalendarView mCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        mCalendarView= (CalendarView) findViewById(R.id.calendarview);
        mCalendarView.setDate("2016-12-31");
        mCalendarView.setOnDateSelectedListener(new CalendarView.OnDateSelectedListener() {
            @Override
            public void onDateSelected(int year, int month, int day) {
                Toast.makeText(CalendarActivity.this, year+"=" + month + "=" + day, Toast.LENGTH_SHORT).show();
            }
        });
    }



}
