package cm.aptoide.pt.store.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.pt.AptoideApplication;
import cm.aptoide.pt.R;
import cm.aptoide.pt.crashreports.CrashReport;
import cm.aptoide.pt.dataprovider.model.v7.Event;
import cm.aptoide.pt.dataprovider.model.v7.Layout;
import cm.aptoide.pt.dataprovider.ws.v7.V7;
import cm.aptoide.pt.dataprovider.ws.v7.store.StoreContext;
import cm.aptoide.pt.home.bundles.base.HomeEvent;
import cm.aptoide.pt.presenter.View;
import cm.aptoide.pt.store.RoomStoreRepository;
import cm.aptoide.pt.view.MainActivity;
import cm.aptoide.pt.view.Translator;
import cm.aptoide.pt.view.fragment.DisplayableManager;
import cm.aptoide.pt.view.fragment.GridRecyclerSwipeFragment;
import cm.aptoide.pt.view.recycler.displayable.Displayable;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public abstract class StoreTabGridRecyclerFragment extends GridRecyclerSwipeFragment {
    protected String action;
    protected HomeEvent.Type homeEventType;
    private boolean isESkills;
    protected Layout layout;

    @Inject
    @Named
    String marketName;
    protected Event.Name name;
    protected StoreContext storeContext;

    @Inject
    RoomStoreRepository storeRepository;
    protected String storeTheme;
    protected String tag;
    protected String title;
    protected Event.Type type;

    /* loaded from: classes.dex */
    public static class BundleCons {
        public static final String ACTION = "action";
        public static final String GROUP_ID = "group_id";
        public static final String HOME_EVENT_TYPE = "HomeEventType";
        public static final String LAYOUT = "layout";
        public static final String NAME = "name";
        public static String STORE_CONTEXT = "Store_context";
        public static final String STORE_NAME = "store_name";
        public static final String STORE_THEME = "storeTheme";
        public static final String TAG = "tag";
        public static final String TITLE = "title";
        public static final String TOOLBAR = "toolbar";
        public static final String TYPE = "type";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Bundle buildBundle(Event event, HomeEvent.Type type, String str, String str2, String str3, StoreContext storeContext, boolean z) {
        Bundle bundle = new Bundle();
        if (type != null) {
            bundle.putString(BundleCons.HOME_EVENT_TYPE, type.toString());
        }
        if (event.getType() != null) {
            bundle.putString("type", event.getType().toString());
        }
        if (event.getName() != null) {
            bundle.putString("name", event.getName().toString());
        }
        if (event.getData() != null && event.getData().getLayout() != null) {
            bundle.putString("layout", event.getData().getLayout().toString());
        }
        if (storeContext != null) {
            bundle.putSerializable(BundleCons.STORE_CONTEXT, storeContext);
        }
        bundle.putString("title", str);
        bundle.putString("action", event.getAction());
        bundle.putString("storeTheme", str2);
        bundle.putString(BundleCons.TAG, str3);
        bundle.putBoolean(BundleCons.TOOLBAR, z);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$load$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void e(Throwable th) {
        CrashReport.getInstance().log(th);
        finishLoading(th);
    }

    public static Fragment newInstance(Event event, String str, String str2, StoreContext storeContext, boolean z) {
        return newInstance(event, null, str, str2, storeContext, z);
    }

    private String replaceActionUrl(String str, SharedPreferences sharedPreferences) {
        if (V7.isUrlBaseCache(str)) {
            return str.replace(V7.getCacheHost(sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET);
        }
        return str.replace(V7.getHost(sharedPreferences), HttpUrl.FRAGMENT_ENCODE_SET);
    }

    protected abstract rx.e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2);

    @Override // cm.aptoide.pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.pt.view.fragment.GridRecyclerSwipeFragment, cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.UiComponent
    public int getContentViewId() {
        return this.title != null ? R.layout.recycler_swipe_fragment_with_toolbar : super.getContentViewId();
    }

    @Override // cm.aptoide.pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        String simpleName = getClass().getSimpleName();
        String str = this.tag;
        StoreContext storeContext = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, str, storeContext != null ? storeContext.name() : null);
    }

    public boolean isEskills() {
        return this.isESkills;
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.BaseLoaderFragment, cm.aptoide.pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (z || z2 || !hasDisplayables()) {
            String str = this.action;
            String replaceActionUrl = str != null ? replaceActionUrl(str, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()) : null;
            if (StoreTabFragmentChooser.validateAcceptedName(this.name)) {
                rx.e<List<Displayable>> buildDisplayables = buildDisplayables(z2, replaceActionUrl, z2);
                if (buildDisplayables != null) {
                    buildDisplayables.f(bindUntilEvent(View.LifecycleEvent.DESTROY)).H0(new rx.m.b() { // from class: cm.aptoide.pt.store.view.r1
                        @Override // rx.m.b
                        public final void call(Object obj) {
                            DisplayableManager.this.clearDisplayables().addDisplayables((List) obj, true);
                        }
                    }, new rx.m.b() { // from class: cm.aptoide.pt.store.view.s1
                        @Override // rx.m.b
                        public final void call(Object obj) {
                            StoreTabGridRecyclerFragment.this.e((Throwable) obj);
                        }
                    });
                    return;
                }
                return;
            }
            throw new RuntimeException("Invalid name(" + this.name + ") for event on " + getClass().getSimpleName() + "!");
        }
    }

    @Override // cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        if (bundle.containsKey(BundleCons.HOME_EVENT_TYPE)) {
            this.homeEventType = HomeEvent.Type.valueOf(bundle.getString(BundleCons.HOME_EVENT_TYPE));
        }
        if (bundle.containsKey("type")) {
            this.type = Event.Type.valueOf(bundle.getString("type"));
        }
        if (bundle.containsKey("name")) {
            this.name = Event.Name.valueOf(bundle.getString("name"));
        }
        if (bundle.containsKey("layout")) {
            this.layout = Layout.valueOf(bundle.getString("layout"));
        }
        if (bundle.containsKey(BundleCons.TAG)) {
            this.tag = bundle.getString(BundleCons.TAG);
        }
        if (bundle.containsKey(BundleCons.STORE_CONTEXT)) {
            this.storeContext = (StoreContext) bundle.getSerializable(BundleCons.STORE_CONTEXT);
        }
        this.title = bundle.getString(Translator.translate("title", getContext().getApplicationContext(), this.marketName));
        this.action = bundle.getString("action");
        this.storeTheme = bundle.getString("storeTheme");
    }

    @Override // cm.aptoide.pt.view.fragment.AptoideBaseFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.fragment.FragmentView, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ((MainActivity) getContext()).getActivityComponent().inject(this);
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.menu_empty, menu);
    }

    @Override // cm.aptoide.pt.view.fragment.BaseLoaderFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // cm.aptoide.pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            getActivity().onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // cm.aptoide.pt.view.fragment.BaseLoaderToolbarFragment
    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle(Translator.translate(this.title, getContext().getApplicationContext(), this.marketName));
        if (this.isESkills) {
            return;
        }
        toolbar.setLogo(R.drawable.logo_toolbar);
    }

    @Override // cm.aptoide.pt.view.fragment.GridRecyclerFragmentWithDecorator, cm.aptoide.pt.view.fragment.BaseRecyclerViewFragment, cm.aptoide.pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.pt.view.fragment.UIComponentFragment, cm.aptoide.pt.view.fragment.UiComponent
    public void setupViews() {
        super.setupViews();
        setupToolbar();
    }

    public static Fragment newInstance(Event event, String str, String str2, String str3, StoreContext storeContext, boolean z) {
        return newInstance(event, HomeEvent.Type.NO_OP, str, str2, str3, storeContext, z);
    }

    public static Fragment newInstance(Event event, HomeEvent.Type type, String str, String str2, String str3, StoreContext storeContext, boolean z) {
        Bundle buildBundle = buildBundle(event, type, str, str2, str3, storeContext, z);
        Fragment choose = StoreTabFragmentChooser.choose(event, type);
        Bundle arguments = choose.getArguments();
        if (arguments != null) {
            buildBundle.putAll(arguments);
        }
        choose.setArguments(buildBundle);
        return choose;
    }
}
