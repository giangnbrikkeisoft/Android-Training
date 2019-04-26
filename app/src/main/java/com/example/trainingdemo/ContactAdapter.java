package com.example.trainingdemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private List<Contact> contacts;
    private Context context;
    private LayoutInflater layoutInflater;

    public ContactAdapter(Context context, List<Contact> contacts)
    {
        this.contacts = contacts;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return contacts.get(position);
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
            convertView = layoutInflater.inflate(R.layout.row, null);
            holder = new ViewHolder();
            holder.tvName = (TextView) convertView.findViewById(R.id.tvName);
            holder.tvAddress = (TextView) convertView.findViewById(R.id.tvAddress);
            holder.ivAvatar = (ImageView)  convertView.findViewById(R.id.ivAvatar);

            convertView.setTag(holder);
        } else
            holder = (ViewHolder) convertView.getTag();

        holder.tvName.setText(contacts.get(position).getName());
        holder.tvAddress.setText(contacts.get(position).getAddress());
        holder.ivAvatar.setImageResource(contacts.get(position).getImage());

        return convertView;
    }

    static class ViewHolder
    {
        TextView tvName;
        TextView tvAddress;
        ImageView ivAvatar;
    }
}
