package nick.xxx.com.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;
/**
 * Created by Nick on 2017/9/5.
 */

public class MyAdapter extends BaseAdapter {

    private Context mContext;
    private List<String> mData;

    public MyAdapter(Context context, List<String> list) {
        mContext = context;
        mData = list;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (convertView==null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_layout,viewGroup,false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.mTv_content.setText(mData.get(i));
        return convertView;
    }

    static class ViewHolder{
        TextView mTv_content;
        private ViewHolder(View view){
            mTv_content = view.findViewById(R.id.tv_name);
        }
    }


}
