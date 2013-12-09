package br.com.gabrielmolter.homework02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	public static final String idExtra = "id";

	private MainActivity activity;

	private OnItemClickListener itemClickListener = new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> adapter, View view,
				int position, long id) {
			Intent intent = new Intent(activity, NewsActivity.class);
			intent.putExtra(idExtra, position);
			startActivity(intent);

		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listView = (ListView) findViewById(R.id.list_view);

		NewsAdapter adapter = new NewsAdapter(this);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(itemClickListener);

		activity = this;

	}

}
