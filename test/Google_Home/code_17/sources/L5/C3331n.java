package l5;

import a5.C1641h;
import a5.C1644k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.leanback.app.RowsSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.ListRow;
import androidx.leanback.widget.ListRowPresenter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.R;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.tv.ui.activity.TvAppsListActivity;
import com.uptodown.tv.ui.activity.TvMyAppsActivity;
import com.uptodown.tv.ui.activity.TvMyDownloadsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: l5.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3331n extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private boolean f34488a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f34489b;

    /* renamed from: l5.n$a */
    /* loaded from: classes5.dex */
    public static final class a implements Z4.o {
        a() {
        }

        @Override // Z4.o
        public void a(ArrayList featuredByCategory) {
            AbstractC3255y.i(featuredByCategory, "featuredByCategory");
            if (!featuredByCategory.isEmpty()) {
                C3331n c3331n = C3331n.this;
                Object obj = featuredByCategory.get(0);
                AbstractC3255y.h(obj, "featuredByCategory[0]");
                c3331n.q((C1641h) obj);
                C3331n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3331n.this.getMainFragmentAdapter());
            }
        }

        @Override // Z4.o
        public void b(ArrayList categoryChildren) {
            AbstractC3255y.i(categoryChildren, "categoryChildren");
            C3331n.this.l(categoryChildren);
            C3331n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3331n.this.getMainFragmentAdapter());
        }

        @Override // Z4.o
        public void c(ArrayList featuredByCategory, ArrayList categoryChildren, ArrayList miniTops, int i8) {
            FragmentManager supportFragmentManager;
            FragmentTransaction beginTransaction;
            FragmentTransaction replace;
            FragmentTransaction addToBackStack;
            AbstractC3255y.i(featuredByCategory, "featuredByCategory");
            AbstractC3255y.i(categoryChildren, "categoryChildren");
            AbstractC3255y.i(miniTops, "miniTops");
            if (i8 > 1) {
                C3331n.this.f34488a = false;
                C3319b c3319b = new C3319b();
                FragmentActivity activity = C3331n.this.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (replace = beginTransaction.replace(R.id.fragmentContainer, c3319b)) != null && (addToBackStack = replace.addToBackStack(null)) != null) {
                    addToBackStack.commit();
                    return;
                }
                return;
            }
            C3331n.this.t(featuredByCategory, categoryChildren, miniTops);
            C3331n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C3331n.this.getMainFragmentAdapter());
        }
    }

    public C3331n() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f34489b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ArrayList arrayList) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.g());
        arrayObjectAdapter.addAll(0, arrayList);
        this.f34489b.add(new ListRow(arrayObjectAdapter));
    }

    private final void m(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a5.N miniTop = (a5.N) it.next();
            if (miniTop.b().b() == i8) {
                AbstractC3255y.h(miniTop, "miniTop");
                r(miniTop);
                arrayList.remove(miniTop);
                return;
            }
        }
    }

    private final void n(C1641h c1641h) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.d(requireContext));
            arrayObjectAdapter.add(c1641h);
            this.f34489b.add(new ListRow(arrayObjectAdapter));
            return;
        }
        this.f34488a = false;
    }

    private final void o(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a5.N miniTop = (a5.N) it.next();
            if (miniTop.b().b() == i8) {
                AbstractC3255y.h(miniTop, "miniTop");
                p(miniTop);
                arrayList.remove(miniTop);
                return;
            }
        }
    }

    private final void p(a5.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().h());
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.h(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            h5.c cVar = new h5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f34489b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f34488a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(C1641h c1641h) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.q());
        arrayObjectAdapter.add(c1641h);
        this.f34489b.add(new ListRow(arrayObjectAdapter));
    }

    private final void r(a5.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().h());
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.i(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            h5.c cVar = new h5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f34489b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f34488a = false;
    }

    private final void s(a5.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().h());
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new j5.f(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            h5.c cVar = new h5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f34489b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f34488a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C3331n this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3255y.i(this$0, "this$0");
        if (obj instanceof C1641h) {
            if (viewHolder != null && this$0.getContext() != null) {
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
            intent4.putExtra("category", ((C1644k) obj).b());
            this$0.startActivity(intent4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f34488a) {
            this.f34489b.clear();
            u();
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3255y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: l5.m
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C3331n.v(C3331n.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }

    public final void t(ArrayList featuredByCategory, ArrayList categories, ArrayList miniTops) {
        AbstractC3255y.i(featuredByCategory, "featuredByCategory");
        AbstractC3255y.i(categories, "categories");
        AbstractC3255y.i(miniTops, "miniTops");
        this.f34488a = true;
        if (!miniTops.isEmpty()) {
            m(miniTops, -2);
        }
        if (!miniTops.isEmpty()) {
            o(miniTops, -1);
        }
        if ((!featuredByCategory.isEmpty()) && featuredByCategory.size() > 1) {
            Object obj = featuredByCategory.get(1);
            AbstractC3255y.h(obj, "featuredByCategory[1]");
            n((C1641h) obj);
        }
        if ((!categories.isEmpty()) && ((C1644k) categories.get(0)).i() == 523) {
            if (!miniTops.isEmpty()) {
                o(miniTops, 558);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 566);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 562);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 564);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 559);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 645);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 560);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 561);
            }
            if (!miniTops.isEmpty()) {
                o(miniTops, 565);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 593);
            }
            if (!miniTops.isEmpty()) {
                m(miniTops, 568);
            }
        }
        if (!miniTops.isEmpty()) {
            Iterator it = miniTops.iterator();
            while (it.hasNext()) {
                a5.N miniTop = (a5.N) it.next();
                AbstractC3255y.h(miniTop, "miniTop");
                s(miniTop);
            }
        }
    }

    public final void u() {
        a aVar = new a();
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            new V4.d(requireContext, aVar, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* renamed from: l5.n$b */
    /* loaded from: classes5.dex */
    public static final class b implements Z4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f34492b;

        b(Presenter.ViewHolder viewHolder) {
            this.f34492b = viewHolder;
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (C3331n.this.getActivity() != null && (C3331n.this.getActivity() instanceof k5.b)) {
                try {
                    k5.b bVar = (k5.b) C3331n.this.getActivity();
                    AbstractC3255y.f(bVar);
                    Presenter.ViewHolder itemViewHolder = this.f34492b;
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
