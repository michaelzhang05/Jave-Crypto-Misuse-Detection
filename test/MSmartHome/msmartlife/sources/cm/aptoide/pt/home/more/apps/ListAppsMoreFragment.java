package cm.aptoide.pt.home.more.apps;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import cm.aptoide.pt.home.more.base.ListAppsFragment;
import cm.aptoide.pt.home.more.base.ListAppsView;
import cm.aptoide.pt.view.app.Application;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.l;
import okhttp3.HttpUrl;

/* compiled from: ListAppsMoreFragment.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u001a\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\rH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreFragment;", "Lcm/aptoide/pt/home/more/base/ListAppsFragment;", "Lcm/aptoide/pt/view/app/Application;", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreViewHolder;", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "()V", "presenter", "Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;", "getPresenter", "()Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;", "setPresenter", "(Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;)V", "createViewHolder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", HttpUrl.FRAGMENT_ENCODE_SET, "getAdapterStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "getItemSizeHeight", "getItemSizeWidth", "onCreate", HttpUrl.FRAGMENT_ENCODE_SET, "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public class ListAppsMoreFragment extends ListAppsFragment<Application, ListAppsMoreViewHolder> implements ListAppsView<Application> {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    @Inject
    public ListAppsMorePresenter presenter;

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment
    public View _$_findCachedViewById(int i2) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i2)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment
    public Function2<ViewGroup, Integer, ListAppsMoreViewHolder> createViewHolder() {
        return ListAppsMoreFragment$createViewHolder$1.INSTANCE;
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment
    public GridRecyclerView.AdaptStrategy getAdapterStrategy() {
        return GridRecyclerView.AdaptStrategy.SCALE_KEEP_ASPECT_RATIO;
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment
    public int getItemSizeHeight() {
        return 158;
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment
    public int getItemSizeWidth() {
        return 104;
    }

    public final ListAppsMorePresenter getPresenter() {
        ListAppsMorePresenter listAppsMorePresenter = this.presenter;
        if (listAppsMorePresenter != null) {
            return listAppsMorePresenter;
        }
        l.v("presenter");
        return null;
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.fragment.FragmentView, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentComponent(savedInstanceState).inject(this);
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // cm.aptoide.pt.home.more.base.ListAppsFragment, cm.aptoide.pt.view.fragment.NavigationTrackFragment, cm.aptoide.pt.view.BaseFragment, com.trello.rxlifecycle.h.a.d, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        l.f(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getPresenter().present();
    }

    public final void setPresenter(ListAppsMorePresenter listAppsMorePresenter) {
        l.f(listAppsMorePresenter, "<set-?>");
        this.presenter = listAppsMorePresenter;
    }
}
