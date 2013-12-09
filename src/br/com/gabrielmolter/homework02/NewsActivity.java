package br.com.gabrielmolter.homework02;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class NewsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_news);
		
		Integer id = getIntent().getExtras().getInt(MainActivity.idExtra);
		
		Log.i("Item_Clickado", String.valueOf(id));
		
		FakeDb fakeDb = FakeDb.connect();
		
		News news = fakeDb.load(id);
		
		TextView title = (TextView)
		findViewById(R.id.details_news_title);
		title.setText(news.getHeader());
		
		Toast.makeText(this, news.getHeader(), Toast.LENGTH_LONG).show();
		
		
		TextView expanded = (TextView)
				findViewById(R.id.details_news_expanded);
		expanded.setText(news.getExpanded());
		
		TextView source = (TextView)
				findViewById(R.id.details_news_source);
		source.setText(news.getSource());
		
		
		TextView link = (TextView)
				findViewById(R.id.details_news_link);
		
		link.setText(news.getLink());
		
	}

}
