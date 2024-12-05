package i5;

import M5.AbstractC1246t;
import X4.C1498h;
import X4.C1501k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvAppsListActivity;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2798p extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private C1498h f31642a;

    /* renamed from: b, reason: collision with root package name */
    private C1498h f31643b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f31644c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f31645d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f31646e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayObjectAdapter f31647f;

    /* renamed from: g, reason: collision with root package name */
    private int f31648g;

    public C2798p() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f31647f = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    private final void q(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                int i10 = i9 + 1;
                X4.N n8 = (X4.N) it.next();
                if (n8.b().c() == i8) {
                    u(n8);
                    break;
                }
                i9 = i10;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0) {
            arrayList.remove(i9);
        }
    }

    private final void r(C1498h c1498h) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.d(requireContext));
            arrayObjectAdapter.add(c1498h);
            this.f31647f.add(new ListRow(arrayObjectAdapter));
        }
    }

    private final void s(X4.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().f());
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.h(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            e5.c cVar = new e5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f31647f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(C1498h c1498h) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.q());
        arrayObjectAdapter.add(c1498h);
        this.f31647f.add(new ListRow(arrayObjectAdapter));
    }

    private final void u(X4.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().f());
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.i(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            e5.c cVar = new e5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f31647f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    private final void v(X4.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().f());
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.f(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            e5.c cVar = new e5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f31647f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    private final void w() {
        if (!this.f31646e.isEmpty()) {
            Object obj = this.f31646e.get(0);
            AbstractC3159y.h(obj, "floatingMiniTops[0]");
            s((X4.N) obj);
        }
        if (!this.f31645d.isEmpty()) {
            q(this.f31645d, -2);
        }
        C1498h c1498h = this.f31643b;
        if (c1498h != null) {
            AbstractC3159y.f(c1498h);
            r(c1498h);
        }
        if ((!this.f31646e.isEmpty()) && this.f31646e.size() > 1) {
            Object obj2 = this.f31646e.get(1);
            AbstractC3159y.h(obj2, "floatingMiniTops[1]");
            s((X4.N) obj2);
        }
        if (!this.f31645d.isEmpty()) {
            q(this.f31645d, -1);
        }
        if ((!this.f31646e.isEmpty()) && this.f31646e.size() > 2) {
            Object obj3 = this.f31646e.get(2);
            AbstractC3159y.h(obj3, "floatingMiniTops[2]");
            s((X4.N) obj3);
        }
        if (!this.f31645d.isEmpty()) {
            q(this.f31645d, 521);
        }
        if (!this.f31645d.isEmpty()) {
            q(this.f31645d, 523);
        }
        if (!this.f31645d.isEmpty()) {
            q(this.f31645d, 524);
        }
        if (!this.f31645d.isEmpty()) {
            Iterator it = this.f31645d.iterator();
            while (it.hasNext()) {
                X4.N miniTop = (X4.N) it.next();
                AbstractC3159y.h(miniTop, "miniTop");
                v(miniTop);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        int i8 = this.f31648g;
        if (i8 < 4) {
            this.f31648g = i8 + 1;
        } else {
            w();
        }
    }

    private final void y() {
        a aVar = new a();
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC3159y.h(viewLifecycleOwner, "viewLifecycleOwner");
            new S4.c(requireContext, aVar, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(C2798p this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3159y.i(this$0, "this$0");
        if (obj instanceof C1498h) {
            if (viewHolder != null) {
                Context requireContext = this$0.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                new S4.i(requireContext, ((C1498h) obj).i(), new b(viewHolder), LifecycleOwnerKt.getLifecycleScope(this$0));
                return;
            }
            return;
        }
        if (obj instanceof e5.b) {
            int b8 = ((e5.b) obj).b();
            if (b8 != 0) {
                if (b8 != 1) {
                    if (b8 != 2) {
                        if (b8 != 3) {
                            if (b8 == 4) {
                                this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) SettingsPreferences.class));
                                return;
                            }
                            return;
                        }
                        this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) TvMyDownloadsActivity.class));
                        return;
                    }
                    Intent intent = new Intent(this$0.getContext(), (Class<?>) TvMyAppsActivity.class);
                    intent.putExtra("rollback", true);
                    this$0.startActivity(intent);
                    return;
                }
                this$0.startActivity(new Intent(this$0.getContext(), (Class<?>) TvMyAppsActivity.class));
                return;
            }
            Intent intent2 = new Intent(this$0.getContext(), (Class<?>) TvMyAppsActivity.class);
            intent2.putExtra("updates", true);
            this$0.startActivity(intent2);
            return;
        }
        if (obj instanceof e5.c) {
            Intent intent3 = new Intent(this$0.getContext(), (Class<?>) TvAppsListActivity.class);
            intent3.putExtra("category", ((e5.c) obj).a());
            this$0.startActivity(intent3);
        } else if (obj instanceof C1501k) {
            Intent intent4 = new Intent(this$0.getContext(), (Class<?>) TvAppsListActivity.class);
            intent4.putExtra("category", (Parcelable) obj);
            this$0.startActivity(intent4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f31642a == null || this.f31644c.isEmpty()) {
            y();
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: i5.o
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C2798p.z(C2798p.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }

    /* renamed from: i5.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements W4.n {
        a() {
        }

        @Override // W4.n
        public void a(X4.N topHorizontalTopReceived) {
            AbstractC3159y.i(topHorizontalTopReceived, "topHorizontalTopReceived");
            C2798p.this.f31645d.add(topHorizontalTopReceived);
            C2798p.this.x();
        }

        @Override // W4.n
        public void b(ArrayList miniTopsReceived) {
            AbstractC3159y.i(miniTopsReceived, "miniTopsReceived");
            C2798p.this.f31645d.addAll(miniTopsReceived);
            C2798p.this.x();
        }

        @Override // W4.n
        public void c(X4.N topHorizontalNewReleasesReceived) {
            AbstractC3159y.i(topHorizontalNewReleasesReceived, "topHorizontalNewReleasesReceived");
            C2798p.this.f31645d.add(topHorizontalNewReleasesReceived);
        }

        @Override // W4.n
        public void d(ArrayList homeFeaturesReceived) {
            AbstractC3159y.i(homeFeaturesReceived, "homeFeaturesReceived");
            if (homeFeaturesReceived.size() > 0) {
                C2798p.this.f31642a = (C1498h) AbstractC1246t.m0(homeFeaturesReceived);
                C2798p c2798p = C2798p.this;
                C1498h c1498h = c2798p.f31642a;
                AbstractC3159y.f(c1498h);
                c2798p.t(c1498h);
            }
            C2798p.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C2798p.this.getMainFragmentAdapter());
        }

        @Override // W4.n
        public void f(X4.N topHorizontalLatestReceived) {
            AbstractC3159y.i(topHorizontalLatestReceived, "topHorizontalLatestReceived");
            C2798p.this.f31645d.add(topHorizontalLatestReceived);
            C2798p.this.x();
        }

        @Override // W4.n
        public void g(ArrayList recentFeaturedReceived) {
            AbstractC3159y.i(recentFeaturedReceived, "recentFeaturedReceived");
            C2798p.this.f31643b = (C1498h) AbstractC1246t.m0(recentFeaturedReceived);
            C2798p.this.x();
        }

        @Override // W4.n
        public void h(X4.N topByCategory) {
            AbstractC3159y.i(topByCategory, "topByCategory");
            C2798p.this.f31646e.add(topByCategory);
        }

        @Override // W4.n
        public void i(ArrayList floatingMiniTopsReceived) {
            AbstractC3159y.i(floatingMiniTopsReceived, "floatingMiniTopsReceived");
            C2798p.this.f31646e.addAll(floatingMiniTopsReceived);
            C2798p.this.x();
        }

        @Override // W4.n
        public void j(C1498h appReplacement) {
            AbstractC3159y.i(appReplacement, "appReplacement");
        }

        @Override // W4.n
        public void k(C1498h appInfoReceived) {
            AbstractC3159y.i(appInfoReceived, "appInfoReceived");
        }

        @Override // W4.n
        public void l(ArrayList categoriesReceived) {
            AbstractC3159y.i(categoriesReceived, "categoriesReceived");
            C2798p.this.f31644c = categoriesReceived;
        }

        @Override // W4.n
        public void e() {
        }
    }

    /* renamed from: i5.p$b */
    /* loaded from: classes5.dex */
    public static final class b implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f31651b;

        b(Presenter.ViewHolder viewHolder) {
            this.f31651b = viewHolder;
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (C2798p.this.getActivity() != null && (C2798p.this.getActivity() instanceof h5.b)) {
                try {
                    h5.b bVar = (h5.b) C2798p.this.getActivity();
                    AbstractC3159y.f(bVar);
                    Presenter.ViewHolder itemViewHolder = this.f31651b;
                    AbstractC3159y.h(itemViewHolder, "itemViewHolder");
                    bVar.o(appInfo, itemViewHolder);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }

        @Override // W4.r
        public void c(int i8) {
        }
    }
}
