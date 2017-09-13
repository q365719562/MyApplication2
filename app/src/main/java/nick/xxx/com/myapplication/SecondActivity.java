package nick.xxx.com.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 2017/9/5.
 */

public class SecondActivity extends AppCompatActivity implements OnRefreshListener,OnLoadmoreListener{
    private SmartRefreshLayout mSmartRefreshLayout;
    private ListView mListView;
    private List<String> mData=new ArrayList<>();;
    private MyAdapter mMyAdapter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initData();
        initview();
        initListener();

    }
    private void initData(){
        mData.add("new balance");
        mData.add("nike");
        mData.add("adidas");
        mData.add("vans");
        mData.add("LINING");
        mData.add("361");
        mData.add("BPA");
        mData.add("new balance");
        mData.add("nike");
        mData.add("adidas");
        mData.add("vans");
        mData.add("LINING");
        mData.add("361");
        mData.add("BPA");
        mData.add("new balance");
        mData.add("nike");
        mData.add("adidas");
        mData.add("vans");
        mData.add("LINING");
        mData.add("361");
        mData.add("BPA");

    }

    private void initview(){
        mListView = (ListView) findViewById(R.id.lv_list);
        mSmartRefreshLayout = (SmartRefreshLayout) findViewById(R.id.refreshlayout);
        mMyAdapter = new MyAdapter(this, mData);
        mListView.setAdapter(mMyAdapter);
    }
    private void initListener(){
        mSmartRefreshLayout.setOnRefreshListener(this);
        mSmartRefreshLayout.setOnLoadmoreListener(this);
    }
    @Override
    public void onLoadmore(RefreshLayout refreshlayout) {
        if (mListView!=null&&mMyAdapter!=null){
            mData.add("张三");
            mData.add("李四");
            mData.add("王五");
            mMyAdapter.notifyDataSetChanged();
        }
        refreshlayout.finishLoadmore(2000);
    }


    @Override
    public void onRefresh(RefreshLayout refreshlayout) {
        if (mData!=null){
            mData.clear();
            initData();
            mMyAdapter.notifyDataSetChanged();
        }
        refreshlayout.finishRefresh(2000);
    }
}
