package cm.aptoide.pt.bottomNavigation;

import androidx.fragment.app.Fragment;
import cm.aptoide.pt.dataprovider.model.v7.Event;
import cm.aptoide.pt.dataprovider.ws.v7.store.StoreContext;
import cm.aptoide.pt.editorialList.EditorialListFragment;
import cm.aptoide.pt.home.HomeContainerFragment;
import cm.aptoide.pt.home.apps.AppsFragment;
import cm.aptoide.pt.navigator.FragmentNavigator;
import cm.aptoide.pt.search.analytics.SearchAnalytics;
import cm.aptoide.pt.search.analytics.SearchSource;
import cm.aptoide.pt.search.view.SearchResultFragment;
import cm.aptoide.pt.store.view.my.MyStoresFragment;
import cm.aptoide.pt.themes.ThemeManager;
import java.util.ArrayList;
import java.util.Collections;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BottomNavigationNavigator {
    private static final String EVENT_ACTION = "https://ws75-cache.aptoide.com/api/7.20240701/getStoreWidgets/store_id=15/context=stores";
    private final BottomNavigationAnalytics bottomNavigationAnalytics;
    private ArrayList<Integer> bottomNavigationItems = new ArrayList<>();
    private final FragmentNavigator fragmentNavigator;
    private final SearchAnalytics searchAnalytics;
    private final ThemeManager themeManager;

    public BottomNavigationNavigator(FragmentNavigator fragmentNavigator, BottomNavigationAnalytics bottomNavigationAnalytics, SearchAnalytics searchAnalytics, ThemeManager themeManager) {
        this.bottomNavigationAnalytics = bottomNavigationAnalytics;
        this.searchAnalytics = searchAnalytics;
        this.fragmentNavigator = fragmentNavigator;
        this.themeManager = themeManager;
    }

    private Event getStoreEvent() {
        Event event = new Event();
        event.setAction(EVENT_ACTION);
        event.setData(null);
        event.setName(Event.Name.myStores);
        event.setType(Event.Type.CLIENT);
        return event;
    }

    private void navigateBackToBottomNavigationItem(int i2) {
        Fragment homeContainerFragment;
        if (i2 == 0) {
            homeContainerFragment = new HomeContainerFragment();
        } else if (i2 == 1) {
            homeContainerFragment = new EditorialListFragment();
        } else if (i2 == 2) {
            homeContainerFragment = SearchResultFragment.newInstance(true);
        } else if (i2 != 3) {
            homeContainerFragment = i2 != 4 ? null : new AppsFragment();
        } else {
            homeContainerFragment = MyStoresFragment.newInstance(getStoreEvent(), HttpUrl.FRAGMENT_ENCODE_SET, "stores", StoreContext.home);
        }
        if (homeContainerFragment != null) {
            this.fragmentNavigator.navigateToCleaningBackStack(homeContainerFragment, true);
        }
    }

    private void navigateToSelectedFragment(int i2, Fragment fragment) {
        Fragment fragment2 = this.fragmentNavigator.getFragment();
        if (fragment2 == null || fragment2.getClass() != fragment.getClass()) {
            if (this.bottomNavigationItems.size() > 0 && this.bottomNavigationItems.get(0).intValue() == i2) {
                this.fragmentNavigator.cleanBackStack();
            } else {
                this.fragmentNavigator.cleanBackStack();
                this.fragmentNavigator.navigateToWithoutBackSave(fragment, true);
            }
            updateBottomNavigationItemsList(i2);
            Collections.rotate(this.bottomNavigationItems, 1);
        }
    }

    private void updateBottomNavigationItemsList(int i2) {
        int indexOf = this.bottomNavigationItems.indexOf(Integer.valueOf(i2));
        if (indexOf != -1) {
            this.bottomNavigationItems.remove(indexOf);
        }
        this.bottomNavigationItems.add(Integer.valueOf(i2));
    }

    public boolean canNavigateBack() {
        return this.bottomNavigationItems.size() > 1;
    }

    public ArrayList<Integer> getBottomNavigationItems() {
        return this.bottomNavigationItems;
    }

    public void navigateBack() {
        int intValue = this.bottomNavigationItems.get(1).intValue();
        this.bottomNavigationItems.remove(0);
        navigateBackToBottomNavigationItem(intValue);
    }

    public void navigateToApps() {
        navigateToSelectedFragment(4, new AppsFragment());
    }

    public void navigateToBottomNavigationItem(int i2) {
        if (i2 == 0) {
            this.bottomNavigationAnalytics.sendNavigateToHomeClickEvent();
            navigateToHome();
            return;
        }
        if (i2 == 1) {
            this.bottomNavigationAnalytics.sendNavigateToCurationClickEvent();
            navigateToCuration();
            return;
        }
        if (i2 == 2) {
            this.bottomNavigationAnalytics.sendNavigateToSearchClickEvent();
            this.searchAnalytics.searchStart(SearchSource.BOTTOM_NAVIGATION, true);
            navigateToSearch(SearchResultFragment.newInstance(true));
        } else if (i2 == 3) {
            this.bottomNavigationAnalytics.sendNavigateToStoresClickEvent();
            navigateToStore();
        } else {
            if (i2 != 4) {
                return;
            }
            this.bottomNavigationAnalytics.sendNavigateToAppsClickEvent();
            navigateToApps();
        }
    }

    public void navigateToCuration() {
        navigateToSelectedFragment(1, new EditorialListFragment());
    }

    public void navigateToHome() {
        navigateToSelectedFragment(0, new HomeContainerFragment());
    }

    public void navigateToSearch(SearchResultFragment searchResultFragment) {
        navigateToSelectedFragment(2, searchResultFragment);
    }

    public void navigateToStore() {
        navigateToSelectedFragment(3, MyStoresFragment.newInstance(getStoreEvent(), this.themeManager.getBaseTheme().getThemeName(), "stores", StoreContext.home));
    }

    public void setBottomNavigationItems(ArrayList<Integer> arrayList) {
        this.bottomNavigationItems = arrayList;
    }
}
