package com.ljheee.fragment;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Fragment;
import android.app.FragmentTransaction;
/**
 * Tab事件监听
 * 用户点击不同的Tab，响应不同事件
 * @author ljheee
 *
 */
public class MyTabListener implements TabListener{
	
	Fragment mFragment;

	public MyTabListener(Fragment mFragment) {
		this.mFragment = mFragment;
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		//页面的main_root标签中，添加对应的fragment
		ft.add(R.id.main_root, mFragment);//把当前mFragment“挂”到指定布局上
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		ft.remove(mFragment);
	}

}
