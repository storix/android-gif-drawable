package pl.droidsonroids.gif.sample;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;

import pl.droidsonroids.gif.sample.sources.GifSourcesFragment;

class MainPagerAdapter extends FragmentStatePagerAdapter {
	private final String[] mPageTitles;

	MainPagerAdapter(FragmentActivity act) {
		super(act.getSupportFragmentManager());
		mPageTitles = act.getResources().getStringArray(R.array.pages);
	}

	@Override
	public Fragment getItem(int position) {
		switch (position) {
			case 0:
				return new GifSourcesFragment();
			case 1:
				return new GifTextViewFragment();
			case 2:
				return new GifTextureFragment();
			case 3:
				return new ImageSpanFragment();
			case 4:
				return new AnimationControlFragment();
			case 5:
				return new GifMediaPlayerFragment();
			case 6:
				return new HttpFragment();
			case 7:
				return new TexturePlaceholderFragment();
			case 8:
				return new GifTexImage2DFragment();
			case 9:
				return new AnimatedSelectorFragment();
			case 10:
				return new AboutFragment();
			default:
				throw new IndexOutOfBoundsException("Invalid page index");
		}
	}

	@Override
	public int getCount() {
		return mPageTitles.length;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return mPageTitles[position];
	}
}
