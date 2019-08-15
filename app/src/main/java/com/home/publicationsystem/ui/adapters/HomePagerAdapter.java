package com.home.publicationsystem.ui.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.home.publicationsystem.ui.fragments.DraftFragment;
import com.home.publicationsystem.ui.fragments.FavoriteFragment;
import com.home.publicationsystem.ui.fragments.HomeFragment;
import com.home.publicationsystem.ui.fragments.SettingsFragment;

/**
 * Adapter which proved show fragments on the home screen
 * @see com.home.publicationsystem.ui.activities.HomeActivity
 */
public class HomePagerAdapter extends FragmentStatePagerAdapter {
    /**
     * Constructor which provide to create the adapter from fragment manager
     * @param fm instance of {@link FragmentManager}
     */
    public HomePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Return the Fragment associated with a specified position.
     *
     * @param position
     */
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new DraftFragment();
            case 2:
                return new FavoriteFragment();
            case 3:
                return new SettingsFragment();
            default:
                return null;
        }
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return 4;
    }
}
