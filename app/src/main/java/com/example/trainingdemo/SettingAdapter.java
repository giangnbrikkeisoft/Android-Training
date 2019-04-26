package com.example.trainingdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SettingAdapter extends BaseAdapter {

    List<Setting> settings;
    private Context context;
    private LayoutInflater layoutInflater;

    public SettingAdapter(Context context, List<Setting> settings)
    {
        this.settings = settings;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return settings.size();
    }

    @Override
    public Object getItem(int position) {
        return settings.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null)
        {
            convertView = layoutInflater.inflate(R.layout.row_setting, null);
            holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.ivIcon);
            holder.text = (TextView)  convertView.findViewById(R.id.tvContent);

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.image.setImageResource(settings.get(position).getImage());
        holder.text.setText(settings.get(position).getText());

        return convertView;
    }

    static class ViewHolder
    {
        ImageView image;
        TextView text;
    }
}
