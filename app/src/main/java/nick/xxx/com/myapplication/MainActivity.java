package nick.xxx.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import nick.xxx.com.myapplication.manager.ApatchManager;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTv_content;
    private Button mBtn_fix;
    private Button mBtn_second;
    private Button mBtn_Calendar;
    private static final String APATCH_NAME="/out.apatch";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTv_content = (TextView) findViewById(R.id.tv_content);
        mBtn_fix = (Button) findViewById(R.id.btn_fix);
        mBtn_second= (Button) findViewById(R.id.btn_second);
        mBtn_Calendar= (Button) findViewById(R.id.btn_calendar);

        mTv_content.setText("123");
        mBtn_fix.setOnClickListener(this);
        mBtn_second.setOnClickListener(this);
        mBtn_Calendar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_fix:
                String path = Environment.getExternalStorageDirectory().getAbsolutePath()+APATCH_NAME;
                ApatchManager.getInstance().addPatch(path);
                break;
            case R.id.btn_second:
                Intent intent = new Intent(this,SecondActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_calendar:
                Intent intent1 = new Intent(this,CalendarActivity.class);
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}
