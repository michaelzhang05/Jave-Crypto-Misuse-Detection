package i5;

import X4.C1498h;
import X4.C1501k;
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
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i5.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2796n extends RowsSupportFragment {

    /* renamed from: a, reason: collision with root package name */
    private boolean f31636a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayObjectAdapter f31637b;

    /* renamed from: i5.n$a */
    /* loaded from: classes5.dex */
    public static final class a implements W4.o {
        a() {
        }

        @Override // W4.o
        public void a(ArrayList featuredByCategory) {
            AbstractC3159y.i(featuredByCategory, "featuredByCategory");
            if (!featuredByCategory.isEmpty()) {
                C2796n c2796n = C2796n.this;
                Object obj = featuredByCategory.get(0);
                AbstractC3159y.h(obj, "featuredByCategory[0]");
                c2796n.q((C1498h) obj);
                C2796n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C2796n.this.getMainFragmentAdapter());
            }
        }

        @Override // W4.o
        public void b(ArrayList categoryChildren) {
            AbstractC3159y.i(categoryChildren, "categoryChildren");
            C2796n.this.l(categoryChildren);
            C2796n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C2796n.this.getMainFragmentAdapter());
        }

        @Override // W4.o
        public void c(ArrayList featuredByCategory, ArrayList categoryChildren, ArrayList miniTops, int i8) {
            FragmentManager supportFragmentManager;
            FragmentTransaction beginTransaction;
            FragmentTransaction replace;
            FragmentTransaction addToBackStack;
            AbstractC3159y.i(featuredByCategory, "featuredByCategory");
            AbstractC3159y.i(categoryChildren, "categoryChildren");
            AbstractC3159y.i(miniTops, "miniTops");
            if (i8 > 1) {
                C2796n.this.f31636a = false;
                C2784b c2784b = new C2784b();
                FragmentActivity activity = C2796n.this.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (beginTransaction = supportFragmentManager.beginTransaction()) != null && (replace = beginTransaction.replace(R.id.fragmentContainer, c2784b)) != null && (addToBackStack = replace.addToBackStack(null)) != null) {
                    addToBackStack.commit();
                    return;
                }
                return;
            }
            C2796n.this.t(featuredByCategory, categoryChildren, miniTops);
            C2796n.this.getMainFragmentAdapter().getFragmentHost().notifyDataReady(C2796n.this.getMainFragmentAdapter());
        }
    }

    public C2796n() {
        ListRowPresenter listRowPresenter = new ListRowPresenter(0);
        listRowPresenter.setShadowEnabled(false);
        listRowPresenter.setSelectEffectEnabled(false);
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(listRowPresenter);
        this.f31637b = arrayObjectAdapter;
        setAdapter(arrayObjectAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ArrayList arrayList) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.g());
        arrayObjectAdapter.addAll(0, arrayList);
        this.f31637b.add(new ListRow(arrayObjectAdapter));
    }

    private final void m(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X4.N miniTop = (X4.N) it.next();
            if (miniTop.b().c() == i8) {
                AbstractC3159y.h(miniTop, "miniTop");
                r(miniTop);
                arrayList.remove(miniTop);
                return;
            }
        }
    }

    private final void n(C1498h c1498h) {
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.d(requireContext));
            arrayObjectAdapter.add(c1498h);
            this.f31637b.add(new ListRow(arrayObjectAdapter));
            return;
        }
        this.f31636a = false;
    }

    private final void o(ArrayList arrayList, int i8) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X4.N miniTop = (X4.N) it.next();
            if (miniTop.b().c() == i8) {
                AbstractC3159y.h(miniTop, "miniTop");
                p(miniTop);
                arrayList.remove(miniTop);
                return;
            }
        }
    }

    private final void p(X4.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().f());
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.h(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            e5.c cVar = new e5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f31637b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f31636a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(C1498h c1498h) {
        ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.q());
        arrayObjectAdapter.add(c1498h);
        this.f31637b.add(new ListRow(arrayObjectAdapter));
    }

    private final void r(X4.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().f());
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.i(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            e5.c cVar = new e5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f31637b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f31636a = false;
    }

    private final void s(X4.N n8) {
        if (getContext() != null) {
            HeaderItem headerItem = new HeaderItem(n8.b().f());
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            ArrayObjectAdapter arrayObjectAdapter = new ArrayObjectAdapter(new g5.f(requireContext));
            arrayObjectAdapter.addAll(0, n8.a());
            e5.c cVar = new e5.c();
            cVar.b(n8.b());
            arrayObjectAdapter.add(cVar);
            this.f31637b.add(new ListRow(headerItem, arrayObjectAdapter));
            return;
        }
        this.f31636a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(C2796n this$0, Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
        AbstractC3159y.i(this$0, "this$0");
        if (obj instanceof C1498h) {
            if (viewHolder != null && this$0.getContext() != null) {
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
            intent4.putExtra("category", ((C1501k) obj).c());
            this$0.startActivity(intent4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.f31636a) {
            this.f31637b.clear();
            u();
        }
    }

    @Override // androidx.leanback.app.RowsSupportFragment, androidx.leanback.app.BaseRowSupportFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3159y.i(view, "view");
        super.onViewCreated(view, bundle);
        setOnItemViewClickedListener(new OnItemViewClickedListener() { // from class: i5.m
            @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
            public final void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
                C2796n.v(C2796n.this, viewHolder, obj, viewHolder2, row);
            }
        });
    }

    public final void t(ArrayList featuredByCategory, ArrayList categories, ArrayList miniTops) {
        AbstractC3159y.i(featuredByCategory, "featuredByCategory");
        AbstractC3159y.i(categories, "categories");
        AbstractC3159y.i(miniTops, "miniTops");
        this.f31636a = true;
        if (!miniTops.isEmpty()) {
            m(miniTops, -2);
        }
        if (!miniTops.isEmpty()) {
            o(miniTops, -1);
        }
        if ((!featuredByCategory.isEmpty()) && featuredByCategory.size() > 1) {
            Object obj = featuredByCategory.get(1);
            AbstractC3159y.h(obj, "featuredByCategory[1]");
            n((C1498h) obj);
        }
        if ((!categories.isEmpty()) && ((C1501k) categories.get(0)).i() == 523) {
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
                X4.N miniTop = (X4.N) it.next();
                AbstractC3159y.h(miniTop, "miniTop");
                s(miniTop);
            }
        }
    }

    public final void u() {
        a aVar = new a();
        if (getContext() != null) {
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            new S4.d(requireContext, aVar, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* renamed from: i5.n$b */
    /* loaded from: classes5.dex */
    public static final class b implements W4.r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f31640b;

        b(Presenter.ViewHolder viewHolder) {
            this.f31640b = viewHolder;
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (C2796n.this.getActivity() != null && (C2796n.this.getActivity() instanceof h5.b)) {
                try {
                    h5.b bVar = (h5.b) C2796n.this.getActivity();
                    AbstractC3159y.f(bVar);
                    Presenter.ViewHolder itemViewHolder = this.f31640b;
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
