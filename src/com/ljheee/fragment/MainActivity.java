package com.ljheee.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Activity;

/**
 * 演示实验ActionBar
 * @author ljheee
 *
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ActionBar ab = getActionBar();
        
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);
        
        AFragment af = new AFragment();
        BFragment bf = new BFragment();
        
        //生成两个Tabs ，并设置标题
        Tab tab1 = ab.newTab().setText("基本信息");
        Tab tab2 = ab.newTab().setText("详细信息");
        tab1.setTabListener(new MyTabListener(af));//为两个Tabs设置监听器
        tab2.setTabListener(new MyTabListener(bf));

        //在actionBar中添加Tabs
        ab.addTab(tab1);
		ab.addTab(tab2);

    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
//        LinearLayout root = (LinearLayout) menu.findItem(
//        		R.id.action_exit).getActionView();
//        Log.v("SS", root.toString());//root为null
        //获取viewGroup中的各个控件，并设置对应的单击方法
        return true;
    }
    
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
		case R.id.action_exit:
			finish();
			break;
		case R.id.action_settings:
			Toast.makeText(this, "settings", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
    	return super.onOptionsItemSelected(item);
    }
}
