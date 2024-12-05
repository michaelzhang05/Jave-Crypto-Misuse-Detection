package l5;

import P5.AbstractC1378t;
import a5.C1641h;
import a5.C1644k;
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
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l5.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3333p extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private C1641h f34494a;

    /* renamed from: b, reason: collision with root package name */
    private C1641h f34495b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f34496c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f34497d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f34498e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private ArrayObjectAdapter f34499f;

    /* renamed from: g, reason: collision with root package name */
    private int f34500g;

    public C3333p() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f34499f = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    private final void q(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                int i10 = i9 + 1;
                a5.N n8 = (a5.N) it.next();
                if (n8.b().b() == i8) {
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

    private final void r(C1641h c1641h) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.d(requireContext));
            arrayObjectAdapter.add(c1641h);
            this.f34499f.add(new ListRow(arrayObjectAdapter));
        }
    }

    private final void s(a5.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().h());
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.h(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            h5.c cVar = new h5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f34499f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(C1641h c1641h) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.q());
        arrayObjectAdapter.add(c1641h);
        this.f34499f.add(new ListRow(arrayObjectAdapter));
    }

    private final void u(a5.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().h());
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.i(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            h5.c cVar = new h5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f34499f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    private final void v(a5.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().h());
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.f(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            h5.c cVar = new h5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f34499f.add(new ListRow(headerItem, arrayObjectAdapter));
        }
    }

    private final void w() {
        if (!this.f34498e.isEmpty()) {
            Object obj = this.f34498e.get(0);
            AbstractC3255y.h(obj, "floatingMiniTops[0]");
            s((a5.N) obj);
        }
        if (!this.f34497d.isEmpty()) {
            q(this.f34497d, -2);
        }
        C1641h c1641h = this.f34495b;
        if (c1641h != null) {
            AbstractC3255y.f(c1641h);
            r(c1641h);
        }
        if ((!this.f34498e.isEmpty()) && this.f34498e.size() > 1) {
            Object obj2 = this.f34498e.get(1);
            AbstractC3255y.h(obj2, "floatingMiniTops[1]");
            s((a5.N) obj2);
        }
        if (!this.f34497d.isEmpty()) {
            q(this.f34497d, -1);
        }
        if ((!this.f34498e.isEmpty()) && this.f34498e.size() > 2) {
            Object obj3 = this.f34498e.get(2);
            AbstractC3255y.h(obj3, "floatingMiniTops[2]");
            s((a5.N) obj3);
        }
        if (!this.f34497d.isEmpty()) {
            q(this.f34497d, 521);
        }
        if (!this.f34497d.isEmpty()) {
            q(this.f34497d, 523);
        }
        if (!this.f34497d.isEmpty()) {
            q(this.f34497d, 524);
        }
        if (!this.f34497d.isEmpty()) {
            Iterator it = this.f34497d.iterator();
            while (it.hasNext()) {
                a5.N miniTop = (a5.N) it.next();
                AbstractC3255y.h(miniTop, "miniTop");
                v(miniTop);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        int i8 = this.f34500g;
        if (i8 < 4) {
            this.f34500g = i8 + 1;
        } else {
            w();
        }
    }

    private final void y() {
        a aVar = new a();
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            AbstractC3255y.h(viewLifecycleOwner, "viewLifecycleOwner");
            new V4.c(requireContext, aVar, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(C3333p this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3255y.i(this$0, "this$0");
        if (obj instanceof C1641h) {
            if (viewHolder != null) {
                Context requireContext = this$0.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                new V4.i(requireContext, ((C1641h) obj).i(), new b(viewHolder), LifecycleOwnerKt.getLifecycleScope(this$0));
                return;
            }
            return;
        }
        if (obj instanceof h5.b) {
            int b8 = ((h5.b) obj).b();
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
        if (obj instanceof h5.c) {
            Intent intent3 = new Intent(this$0.getContext(), (Class<?>) TvAppsListActivity.class);
            intent3.putExtra("category", ((h5.c) obj).a());
            this$0.startActivity(intent3);
        } else if (obj instanceof C1644k) {
            Intent intent4 = new Intent(this$0.getContext(), (Class<?>) TvAppsListActivity.class);
            intent4.putExtra("category", (Parcelable) obj);
            this$0.startActivity(intent4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f34494a == null || this.f34496c.isEmpty()) {
            y();
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: l5.o
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C3333p.z(C3333p.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }

    /* renamed from: l5.p$a */
    /* loaded from: classes5.dex */
    public static final class a implements Z4.n {
        a() {
        }

        @Override // Z4.n
        public void a(a5.N topHorizontalTopReceived) {
            AbstractC3255y.i(topHorizontalTopReceived, "topHorizontalTopReceived");
            C3333p.this.f34497d.add(topHorizontalTopReceived);
            C3333p.this.x();
        }

        @Override // Z4.n
        public void b(ArrayList miniTopsReceived) {
            AbstractC3255y.i(miniTopsReceived, "miniTopsReceived");
            C3333p.this.f34497d.addAll(miniTopsReceived);
            C3333p.this.x();
        }

        @Override // Z4.n
        public void c(C1641h appInfoReceived) {
            AbstractC3255y.i(appInfoReceived, "appInfoReceived");
        }

        @Override // Z4.n
        public void d(ArrayList homeFeaturesReceived) {
            AbstractC3255y.i(homeFeaturesReceived, "homeFeaturesReceived");
            if (homeFeaturesReceived.size() > 0) {
                C3333p.this.f34494a = (C1641h) AbstractC1378t.m0(homeFeaturesReceived);
                C3333p c3333p = C3333p.this;
                C1641h c1641h = c3333p.f34494a;
                AbstractC3255y.f(c1641h);
                c3333p.t(c1641h);
            }
            C3333p.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3333p.this.getMainFragmentAdapter());
        }

        @Override // Z4.n
        public void e(a5.N topByCategory) {
            AbstractC3255y.i(topByCategory, "topByCategory");
            C3333p.this.f34498e.add(topByCategory);
        }

        @Override // Z4.n
        public void f(a5.N topHorizontalLatestReceived) {
            AbstractC3255y.i(topHorizontalLatestReceived, "topHorizontalLatestReceived");
            C3333p.this.f34497d.add(topHorizontalLatestReceived);
            C3333p.this.x();
        }

        @Override // Z4.n
        public void g(a5.N topHorizontalNewReleasesReceived) {
            AbstractC3255y.i(topHorizontalNewReleasesReceived, "topHorizontalNewReleasesReceived");
            C3333p.this.f34497d.add(topHorizontalNewReleasesReceived);
        }

        @Override // Z4.n
        public void i(C1641h appReplacement) {
            AbstractC3255y.i(appReplacement, "appReplacement");
        }

        @Override // Z4.n
        public void j(ArrayList recentFeaturedReceived) {
            AbstractC3255y.i(recentFeaturedReceived, "recentFeaturedReceived");
            C3333p.this.f34495b = (C1641h) AbstractC1378t.m0(recentFeaturedReceived);
            C3333p.this.x();
        }

        @Override // Z4.n
        public void k(ArrayList floatingMiniTopsReceived) {
            AbstractC3255y.i(floatingMiniTopsReceived, "floatingMiniTopsReceived");
            C3333p.this.f34498e.addAll(floatingMiniTopsReceived);
            C3333p.this.x();
        }

        @Override // Z4.n
        public void l(ArrayList categoriesReceived) {
            AbstractC3255y.i(categoriesReceived, "categoriesReceived");
            C3333p.this.f34496c = categoriesReceived;
        }

        @Override // Z4.n
        public void h() {
        }
    }

    /* renamed from: l5.p$b */
    /* loaded from: classes5.dex */
    public static final class b implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f34503b;

        b(Presenter.ViewHolder viewHolder) {
            this.f34503b = viewHolder;
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (C3333p.this.getActivity() != null && (C3333p.this.getActivity() instanceof k5.b)) {
                try {
                    k5.b bVar = (k5.b) C3333p.this.getActivity();
                    AbstractC3255y.f(bVar);
                    Presenter.ViewHolder itemViewHolder = this.f34503b;
                    AbstractC3255y.h(itemViewHolder, "itemViewHolder");
                    bVar.o(appInfo, itemViewHolder);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }

        @Override // Z4.r
        public void c(int i8) {
        }
    }
}
