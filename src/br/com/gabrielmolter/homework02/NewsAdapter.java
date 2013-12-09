package br.com.gabrielmolter.homework02;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class NewsAdapter extends BaseAdapter{

	private ArrayList<News> mNews;
	private LayoutInflater mInflater;
	
	public NewsAdapter(Context context){
		FakeDb fakeDb = FakeDb.connect();
		
		mNews = fakeDb.loadAll();
		
		mInflater = 
		(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
	}
	
	@Override
	public int getCount() {
		return mNews.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View layout = mInflater.inflate(R.layout.item_lista, null);
		
		News news = mNews.get(position);
		
		TextView header = (TextView)layout.findViewById(R.id.news_header);
		header.setText(news.getHeader());
		
		TextView colapsed = (TextView)layout.findViewById(R.id.news_colapsed);
		colapsed.setText(news.getColapsed());
		
		return layout;
	}

}
