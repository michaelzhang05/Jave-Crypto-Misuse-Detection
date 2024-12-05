package cm.aptoide.pt.app.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.R;
import cm.aptoide.pt.app.view.displayable.OtherVersionDisplayable;
import cm.aptoide.pt.dataprovider.WebService;
import cm.aptoide.pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.pt.dataprovider.interfaces.SuccessRequestListener;
import cm.aptoide.pt.dataprovider.model.v7.listapp.App;
import cm.aptoide.pt.dataprovider.model.v7.listapp.ListAppVersions;
import cm.aptoide.pt.dataprovider.ws.BodyInterceptor;
import cm.aptoide.pt.dataprovider.ws.v7.BaseBody;
import cm.aptoide.pt.dataprovider.ws.v7.listapps.ListAppVersionsRequest;
import cm.aptoide.pt.logger.Logger;
import cm.aptoide.pt.networking.image.ImageLoader;
import cm.aptoide.pt.preferences.managed.ManagerPreferences;
import cm.aptoide.pt.store.RoomStoreRepository;
import cm.aptoide.pt.store.StoreUtils;
import cm.aptoide.pt.themes.ThemeManager;
import cm.aptoide.pt.util.AppBarStateChangeListener;
import cm.aptoide.pt.view.fragment.AptoideBaseFragment;
import cm.aptoide.pt.view.recycler.BaseAdapter;
import cm.aptoide.pt.view.recycler.EndlessRecyclerOnScrollListener;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class OtherVersionsFragment extends AptoideBaseFragment<BaseAdapter> {
    private static final String TAG = OtherVersionsFragment.class.getSimpleName();
    private String appImgUrl;
    private String appName;
    private String appPackge;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Converter.Factory converterFactory;
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private ViewHeader header;
    private OkHttpClient httpClient;
    private SharedPreferences sharedPreferences;

    @Inject
    RoomStoreRepository storeRepository;
    private ThemeManager themeManager;

    /* renamed from: cm.aptoide.pt.app.view.OtherVersionsFragment$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        static {
            int[] iArr = new int[AppBarStateChangeListener.State.values().length];
            $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = iArr;
            try {
                iArr[AppBarStateChangeListener.State.EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.IDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[AppBarStateChangeListener.State.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class BundleCons {
        public static final String APP_IMG_URL = "app_img_url";
        public static final String APP_NAME = "app_name";
        public static final String APP_PACKAGE = "app_package";

        public BundleCons() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class ViewHeader {
        private final boolean animationsEnabled;
        private final AppBarLayout appBarLayout;
        private final ImageView appIcon;
        private final TextView otherVersionsTitle;
        private final View view;

        ViewHeader(View view, SharedPreferences sharedPreferences) {
            this.view = view;
            this.animationsEnabled = ManagerPreferences.getAnimationsEnabledStatus(sharedPreferences);
            this.otherVersionsTitle = (TextView) view.findViewById(R.id.other_versions_title);
            AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.app_bar);
            this.appBarLayout = appBarLayout;
            this.appIcon = (ImageView) view.findViewById(R.id.app_icon);
            appBarLayout.b(new AppBarStateChangeListener() { // from class: cm.aptoide.pt.app.view.OtherVersionsFragment.ViewHeader.1
                @Override // cm.aptoide.pt.util.AppBarStateChangeListener
                public void onStateChanged(AppBarLayout appBarLayout2, AppBarStateChangeListener.State state) {
                    if (AnonymousClass1.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()] != 1) {
                        if (!ViewHeader.this.animationsEnabled) {
                            ViewHeader.this.appIcon.setVisibility(4);
                        } else {
                            ViewHeader.this.appIcon.animate().alpha(0.0f).start();
                        }
                        ViewHeader.this.otherVersionsTitle.setVisibility(4);
                        return;
                    }
                    if (!ViewHeader.this.animationsEnabled) {
                        ViewHeader.this.appIcon.setVisibility(0);
                    } else {
                        ViewHeader.this.appIcon.animate().alpha(1.0f).start();
                    }
                    ViewHeader.this.otherVersionsTitle.setVisibility(0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImage(String str) {
            ImageLoader.with(this.view.getContext()).load(str, this.appIcon);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$fetchOtherVersions$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(ListAppVersions listAppVersions) {
        List<App> list = listAppVersions.getList();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<App> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new OtherVersionDisplayable(it.next(), this.themeManager));
        }
        addDisplayables(arrayList);
        getRecyclerView().setVisibility(0);
    }

    public static OtherVersionsFragment newInstance(String str, String str2, String str3) {
        OtherVersionsFragment otherVersionsFragment = new OtherVersionsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("app_name", str);
        bundle.putString(BundleCons.APP_IMG_URL, str2);
        bundle.putString(BundleCons.APP_PACKAGE, str3);
        otherVersionsFragment.setArguments(bundle);
        return otherVersionsFragment;
    }

    private void setTitle(String str) {
        if (hasToolbar()) {
            getToolbar().setTitle(str);
            this.collapsingToolbarLayout.setTitle(str);
            this.collapsingToolbarLayout.setExpandedTitleColor(getView().getResources().getColor(this.themeManager.getAttributeForTheme(R.attr.textColorGrey900).resourceId));
        }
    }

    @Override // cm.aptoide.pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cm.aptoide.pt.view.recycler.BaseAdapter] */
    protected void fetchOtherVersions() {
        this.endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(getAdapter(), ListAppVersionsRequest.of(this.appPackge, StoreUtils.getSubscribedStoresAuthMap(this.storeRepository), this.baseBodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources()), new SuccessRequestListener() { // from class: cm.aptoide.pt.app.view.xf
            @Override // cm.aptoide.pt.dataprovider.interfaces.SuccessRequestListener, rx.m.b
            public final void call(Object obj) {
                OtherVersionsFragment.this.e((ListAppVersions) obj);
            }
        }, new ErrorRequestListener() { // from class: cm.aptoide.pt.app.view.yf
            @Override // cm.aptoide.pt.dataprovider.interfaces.ErrorRequestListener
            public final void onError(Throwable th) {
                th.printStackTrace();
            }
        });
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(false, false);
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.UiComponent
    public int getContentViewId() {
        return R.layout.fragment_other_versions;
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(getClass().getSimpleName());
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.BaseLoaderFragment, cm.aptoide.pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        Logger.getInstance().d(TAG, "Other versions should refresh? " + z);
        fetchOtherVersions();
        setHeader();
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.appName = bundle.getString("app_name");
        this.appImgUrl = bundle.getString(BundleCons.APP_IMG_URL);
        this.appPackge = bundle.getString(BundleCons.APP_PACKAGE);
    }

    @Override // cm.aptoide.pt.view.fragment.AptoideBaseFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.fragment.FragmentView, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.themeManager = new ThemeManager(getActivity(), ((AptoideApplication) getActivity().getApplicationContext()).getDefaultSharedPreferences());
        this.sharedPreferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_empty, menu);
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null && (endlessRecyclerOnScrollListener = this.endlessRecyclerOnScrollListener) != null) {
            recyclerView.removeOnScrollListener(endlessRecyclerOnScrollListener);
        }
        this.endlessRecyclerOnScrollListener = null;
        this.header = null;
        this.collapsingToolbarLayout = null;
        super.onDestroyView();
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            getActivity().onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.BaseLoaderFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.header = new ViewHeader(view, this.sharedPreferences);
        this.collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(R.id.collapsing_toolbar);
        super.onViewCreated(view, bundle);
    }

    protected void setHeader() {
        ViewHeader viewHeader = this.header;
        if (viewHeader != null) {
            viewHeader.setImage(this.appImgUrl);
            setTitle(this.appName);
        }
    }
}
