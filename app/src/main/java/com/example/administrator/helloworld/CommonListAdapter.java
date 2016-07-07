package com.example.administrator.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/7.
 */
public class CommonListAdapter extends BaseAdapter {
    Context context;
    LayoutInflater inflater;

    final  int view_type=5;
    final  int type_1=0;
    final  int type_2=1;
    final  int type_3=2;
    final  int type_4=3;
    final  int type_5=4;


    public CommonListAdapter(Context context) {
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int i) {
        return 1;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
        if (position==0){
            return type_1;
        }else if (position==1){
            return  type_2;
        }else if (position==2){
            return  type_3;
        }else if (position==3){
            return  type_4;
        }else{
            return  type_5;
        }
    }

    @Override
    public int getViewTypeCount() {
        return view_type;
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        ViewHolder1 holder1;
        ViewHolder2 holder2;
        ViewHolder3 holder3;
        ViewHolder4 holder4;
        ViewHolder5 holder5;

        int type = getItemViewType(position);
        if(contentView==null){
            switch (type){
                case  type_1:
                    contentView = inflater.inflate(R.layout.listview_item1, parent, false);
                    holder1 = new ViewHolder1();
                    holder1.editText = (EditText)contentView.findViewById(R.id.et);
                    contentView.setTag(holder1);
                    break;
                case  type_2:
                    contentView = inflater.inflate(R.layout.listview_item2, parent, false);
                    holder2 = new ViewHolder2();
                    holder2.textView = (TextView) contentView.findViewById(R.id.tv);
                    contentView.setTag(holder2);
                    break;
                case  type_3:
                    contentView = inflater.inflate(R.layout.listview_item3, parent, false);
                    holder3 = new ViewHolder3();
                    holder3.button = (Button) contentView.findViewById(R.id.btn);
                    contentView.setTag(holder3);
                    break;
                case  type_4:
                    contentView = inflater.inflate(R.layout.listview_item4, parent, false);
                    holder4 = new ViewHolder4();
                    holder4.view = (View) contentView.findViewById(R.id.v);
                    contentView.setTag(holder4);
                    break;
                case  type_5:
                    contentView = inflater.inflate(R.layout.listview_item5, parent, false);
                    holder5 = new ViewHolder5();
                    holder5.imageView = (ImageView) contentView.findViewById(R.id.iv);
                    contentView.setTag(holder5);
                    break;
            }
        }else{
            switch (type){
                case  type_1:
                    holder1= (ViewHolder1) contentView.getTag();
                    break;
                case  type_2:
                    holder2= (ViewHolder2) contentView.getTag();
                    break;
                case  type_3:
                    holder3= (ViewHolder3) contentView.getTag();
                    break;
                case  type_4:
                    holder4= (ViewHolder4) contentView.getTag();
                    break;
                case  type_5:
                    holder5= (ViewHolder5) contentView.getTag();
                    break;
            }
        }



        return contentView;
    }

    class  ViewHolder1 {
        EditText editText;
    }
    class  ViewHolder2 {
       TextView textView;
    }
    class  ViewHolder3 {
      Button button;
    }
    class  ViewHolder4 {
      View view;
    }
    class  ViewHolder5 {
       ImageView imageView;
    }
}
