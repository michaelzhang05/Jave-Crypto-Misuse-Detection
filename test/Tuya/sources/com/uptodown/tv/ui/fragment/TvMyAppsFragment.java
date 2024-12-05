package com.uptodown.tv.ui.fragment;

import E4.i;
import E4.j;
import L5.I;
import L5.t;
import M5.AbstractC1246t;
import W4.D;
import W4.r;
import X4.C1496f;
import X4.C1498h;
import X4.O;
import X5.n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.leanback.app.VerticalGridSupportFragment;
import androidx.leanback.widget.ArrayObjectAdapter;
import androidx.leanback.widget.OnItemViewClickedListener;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.Row;
import androidx.leanback.widget.RowPresenter;
import androidx.leanback.widget.VerticalGridPresenter;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.MBridgeConstans;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.tv.ui.activity.TvOldVersionsActivity;
import com.uptodown.tv.ui.fragment.TvMyAppsFragment;
import g5.m;
import i6.AbstractC2825i;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.J0;
import i6.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l5.C3313a;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;
import l5.C3330r;

/* loaded from: classes5.dex */
public final class TvMyAppsFragment extends VerticalGridSupportFragment {

    /* renamed from: b, reason: collision with root package name */
    private C3330r f29916b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayObjectAdapter f29917c;

    /* renamed from: d, reason: collision with root package name */
    private AlertDialog f29918d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29919e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f29920f;

    /* renamed from: a, reason: collision with root package name */
    private final LifecycleCoroutineScope f29915a = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: g, reason: collision with root package name */
    private final int f29921g = 5;

    /* loaded from: classes5.dex */
    private static final class a extends ArrayObjectAdapter {
        public a(m mVar) {
            super(mVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class b implements OnItemViewClickedListener {
        public b() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder itemViewHolder, Object item, RowPresenter.ViewHolder viewHolder, Row row) {
            Bundle bundle;
            AbstractC3159y.i(itemViewHolder, "itemViewHolder");
            AbstractC3159y.i(item, "item");
            if (item instanceof C1496f) {
                if (!TvMyAppsFragment.this.f29920f) {
                    TvMyAppsFragment.this.G((C1496f) item, itemViewHolder);
                    return;
                }
                Intent intent = new Intent(TvMyAppsFragment.this.getContext(), (Class<?>) TvOldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, (Parcelable) item);
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                FragmentActivity activity = tvMyAppsFragment.getActivity();
                if (activity != null) {
                    bundle = UptodownApp.f28003B.a(activity);
                } else {
                    bundle = null;
                }
                tvMyAppsFragment.startActivity(intent, bundle);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements D {
        c() {
        }

        @Override // W4.D
        public void a(String appName) {
            AbstractC3159y.i(appName, "appName");
            TvMyAppsFragment.this.D(appName);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f29925b;

        d(Presenter.ViewHolder viewHolder) {
            this.f29925b = viewHolder;
        }

        @Override // W4.r
        public void c(int i8) {
        }

        @Override // W4.r
        public void f(C1498h appInfo) {
            AbstractC3159y.i(appInfo, "appInfo");
            if (TvMyAppsFragment.this.getActivity() != null) {
                h5.b bVar = (h5.b) TvMyAppsFragment.this.getActivity();
                AbstractC3159y.f(bVar);
                bVar.o(appInfo, this.f29925b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements J4.b {
        e() {
        }

        @Override // J4.b
        public void a(K4.b app, int i8) {
            AbstractC3159y.i(app, "app");
        }

        @Override // J4.b
        public void b(K4.b app) {
            AbstractC3159y.i(app, "app");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.D(tvMyAppsFragment.getString(R.string.core_msg_cannot_write_path));
            }
        }

        @Override // J4.b
        public void c(K4.b app) {
            AbstractC3159y.i(app, "app");
        }

        @Override // J4.b
        public void d(ArrayList apps) {
            AbstractC3159y.i(apps, "apps");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.D(tvMyAppsFragment.getString(R.string.backup_finished));
            }
        }

        @Override // J4.b
        public void e(String appName) {
            AbstractC3159y.i(appName, "appName");
        }

        @Override // J4.b
        public void f(int i8) {
        }

        @Override // J4.b
        public void g(K4.b app) {
            AbstractC3159y.i(app, "app");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.D(tvMyAppsFragment.getString(R.string.core_msg_cannot_write_path));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29927a;

        f(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new f(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29927a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                this.f29927a = 1;
                if (tvMyAppsFragment.X(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29929a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements n {

            /* renamed from: a, reason: collision with root package name */
            int f29931a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvMyAppsFragment f29932b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f29933c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvMyAppsFragment tvMyAppsFragment, T t8, P5.d dVar) {
                super(2, dVar);
                this.f29932b = tvMyAppsFragment;
                this.f29933c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f29932b, this.f29933c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f29931a == 0) {
                    t.b(obj);
                    this.f29932b.Y((ArrayList) this.f29933c.f33761a);
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        g(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new g(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f29929a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (TvMyAppsFragment.this.getContext() != null) {
                    T t8 = new T();
                    C3319g c3319g = new C3319g();
                    Context requireContext = TvMyAppsFragment.this.requireContext();
                    AbstractC3159y.h(requireContext, "requireContext()");
                    t8.f33761a = c3319g.A(requireContext);
                    if (TvMyAppsFragment.this.f29919e) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((ArrayList) t8.f33761a).iterator();
                        while (it.hasNext()) {
                            C1496f c1496f = (C1496f) it.next();
                            if (c1496f.c0() == C1496f.c.OUTDATED) {
                                arrayList.add(c1496f);
                            }
                        }
                        t8.f33761a = arrayList;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = ((ArrayList) t8.f33761a).iterator();
                        while (it2.hasNext()) {
                            C1496f c1496f2 = (C1496f) it2.next();
                            if (g6.n.s(TvMyAppsFragment.this.requireContext().getPackageName(), c1496f2.Q(), true)) {
                                arrayList2.add(c1496f2);
                            } else {
                                Context requireContext2 = TvMyAppsFragment.this.requireContext();
                                AbstractC3159y.h(requireContext2, "requireContext()");
                                if (c1496f2.i0(requireContext2)) {
                                    N4.f fVar = new N4.f();
                                    Context requireContext3 = TvMyAppsFragment.this.requireContext();
                                    AbstractC3159y.h(requireContext3, "requireContext()");
                                    String Q8 = c1496f2.Q();
                                    AbstractC3159y.f(Q8);
                                    if (!fVar.p(requireContext3, Q8)) {
                                        arrayList2.add(c1496f2);
                                    }
                                }
                            }
                        }
                        t8.f33761a = arrayList2;
                    }
                    TvMyAppsFragment.this.Z((ArrayList) t8.f33761a);
                    J0 c8 = C2812b0.c();
                    a aVar = new a(TvMyAppsFragment.this, t8, null);
                    this.f29929a = 1;
                    if (AbstractC2825i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f29934a = new h();

        h() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C1496f app1, C1496f app2) {
            AbstractC3159y.i(app1, "app1");
            AbstractC3159y.i(app2, "app2");
            return Integer.valueOf(app1.c0().compareTo(app2.c0()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: i5.B
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMyAppsFragment.E(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            builder.create().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void F(C1496f c1496f, O o8) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater layoutInflater = getLayoutInflater();
        AbstractC3159y.h(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_vd);
        j.a aVar = j.f2274g;
        textView.setTypeface(aVar.u());
        ((TextView) inflate.findViewById(R.id.tv_label_app_name_vd)).setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_app_name_vd);
        textView2.setTypeface(aVar.u());
        textView2.setText(c1496f.I());
        ((TextView) inflate.findViewById(R.id.tv_label_installed_version_vd)).setTypeface(aVar.u());
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_installed_version_vd);
        textView3.setTypeface(aVar.u());
        Y y8 = Y.f33766a;
        String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{c1496f.h0(), Long.valueOf(c1496f.f0())}, 2));
        AbstractC3159y.h(format, "format(...)");
        textView3.setText(format);
        ((TextView) inflate.findViewById(R.id.tv_label_update_version_vd)).setTypeface(aVar.u());
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_update_version_vd);
        textView4.setTypeface(aVar.u());
        String format2 = String.format("%s(%s)", Arrays.copyOf(new Object[]{o8.z(), Long.valueOf(o8.u())}, 2));
        AbstractC3159y.h(format2, "format(...)");
        textView4.setText(format2);
        ((TextView) inflate.findViewById(R.id.tv_label_packagename_vd)).setTypeface(aVar.u());
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_packagename_vd);
        textView5.setTypeface(aVar.u());
        textView5.setText(c1496f.Q());
        ((TextView) inflate.findViewById(R.id.tv_label_size_vd)).setTypeface(aVar.u());
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_size_vd);
        textView6.setTypeface(aVar.u());
        textView6.setText(new N4.g().c(o8.s()));
        ((TextView) inflate.findViewById(R.id.tv_label_filename_vd)).setTypeface(aVar.u());
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_filename_vd);
        textView7.setTypeface(aVar.u());
        textView7.setText(o8.j());
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f29918d = create;
        AbstractC3159y.f(create);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(final C1496f c1496f, final Presenter.ViewHolder viewHolder) {
        boolean z8;
        if (!getParentFragmentManager().isDestroyed() && c1496f != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3159y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.dialogo_app_selected, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_das);
            j.a aVar = j.f2274g;
            textView.setTypeface(aVar.t());
            textView.setText(c1496f.I());
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_see_on_uptodown);
            boolean z9 = true;
            if (c1496f.c() > 0) {
                textView2.setTypeface(aVar.u());
                textView2.setOnClickListener(new View.OnClickListener() { // from class: i5.D
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.N(TvMyAppsFragment.this, c1496f, viewHolder, view);
                    }
                });
                z8 = true;
            } else {
                textView2.setVisibility(8);
                z8 = false;
            }
            ((TextView) inflate.findViewById(R.id.tv_update)).setVisibility(8);
            TextView textView3 = (TextView) inflate.findViewById(R.id.tv_open);
            TextView textView4 = (TextView) inflate.findViewById(R.id.tv_uninstall);
            if (getContext() != null && !g6.n.s(requireContext().getPackageName(), c1496f.Q(), true)) {
                textView3.setTypeface(aVar.u());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: i5.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.O(C1496f.this, this, view);
                    }
                });
                if (!c1496f.l0()) {
                    textView4.setTypeface(aVar.u());
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: i5.G
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TvMyAppsFragment.P(C1496f.this, this, view);
                        }
                    });
                } else {
                    textView4.setVisibility(8);
                }
                z8 = true;
            } else {
                textView3.setVisibility(8);
                textView4.setVisibility(8);
            }
            if (UptodownApp.f28003B.M()) {
                textView3.setText("Debug Info App");
                textView3.setOnClickListener(new View.OnClickListener() { // from class: i5.H
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.Q(C1496f.this, this, view);
                    }
                });
                textView3.setVisibility(0);
                z8 = true;
            }
            TextView textView5 = (TextView) inflate.findViewById(R.id.tv_share);
            if (c1496f.e0() != null) {
                textView5.setTypeface(aVar.u());
                textView5.setOnClickListener(new View.OnClickListener() { // from class: i5.I
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.R(TvMyAppsFragment.this, c1496f, view);
                    }
                });
                z8 = true;
            } else {
                textView5.setVisibility(8);
            }
            TextView textView6 = (TextView) inflate.findViewById(R.id.tv_old_versions);
            if (getContext() != null && !g6.n.s(requireContext().getPackageName(), c1496f.Q(), true)) {
                textView6.setTypeface(aVar.u());
                textView6.setOnClickListener(new View.OnClickListener() { // from class: i5.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.H(TvMyAppsFragment.this, c1496f, view);
                    }
                });
            } else {
                textView6.setVisibility(8);
            }
            TextView textView7 = (TextView) inflate.findViewById(R.id.tv_exclude);
            if (c1496f.i() == 0) {
                textView7.setText(getString(R.string.not_offer_updates));
            } else {
                textView7.setText(getString(R.string.offer_updates_again));
            }
            textView7.setTypeface(aVar.u());
            textView7.setOnClickListener(new View.OnClickListener() { // from class: i5.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyAppsFragment.I(TvMyAppsFragment.this, c1496f, view);
                }
            });
            TextView textView8 = (TextView) inflate.findViewById(R.id.tv_check_updates);
            TextView textView9 = (TextView) inflate.findViewById(R.id.tv_version_details);
            if (c1496f.c0() == C1496f.c.OUTDATED) {
                textView8.setTypeface(aVar.u());
                textView8.setOnClickListener(new View.OnClickListener() { // from class: i5.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.J(TvMyAppsFragment.this, c1496f, view);
                    }
                });
                textView9.setTypeface(aVar.u());
                textView9.setOnClickListener(new View.OnClickListener() { // from class: i5.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.K(TvMyAppsFragment.this, c1496f, view);
                    }
                });
                TextView textView10 = (TextView) inflate.findViewById(R.id.tv_ignore_version);
                textView10.setVisibility(0);
                textView10.setTypeface(aVar.u());
                C3326n.a aVar2 = C3326n.f34504t;
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C3326n a8 = aVar2.a(requireContext);
                a8.a();
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                O u02 = a8.u0(Q8);
                a8.g();
                if (u02 != null && u02.f() == 1) {
                    textView10.setText(R.string.reactivate_skipped_update);
                } else {
                    textView10.setText(R.string.skip_update);
                }
                textView10.setOnClickListener(new View.OnClickListener() { // from class: i5.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.L(TvMyAppsFragment.this, c1496f, view);
                    }
                });
                z8 = true;
            } else {
                textView8.setVisibility(8);
                textView9.setVisibility(8);
            }
            if (c1496f.Q() != null) {
                TextView textView11 = (TextView) inflate.findViewById(R.id.tv_backup);
                textView11.setVisibility(0);
                textView11.setTypeface(aVar.u());
                textView11.setOnClickListener(new View.OnClickListener() { // from class: i5.E
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.M(TvMyAppsFragment.this, c1496f, view);
                    }
                });
            } else {
                z9 = z8;
            }
            if (z9) {
                builder.setView(inflate);
                AlertDialog create = builder.create();
                this.f29918d = create;
                AbstractC3159y.f(create);
                create.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        Bundle bundle;
        AbstractC3159y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) TvOldVersionsActivity.class);
        intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, c1496f);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            bundle = UptodownApp.f28003B.a(activity);
        } else {
            bundle = null;
        }
        this$0.startActivity(intent, bundle);
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        if (c1496f.i() == 0) {
            c1496f.t0(1);
            c1496f.J0(C1496f.c.UPDATED);
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            a8.M(Q8);
            C3329q c3329q = new C3329q();
            Context requireContext2 = this$0.requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            c3329q.c(requireContext2);
        } else {
            c1496f.t0(0);
        }
        a8.j1(c1496f);
        a8.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        O u02 = a8.u0(Q8);
        if (u02 != null) {
            u02.X(0);
            a8.r1(u02);
            C3313a c3313a = new C3313a();
            Context requireContext2 = this$0.requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            c3313a.b(requireContext2, u02.j());
        }
        a8.g();
        this$0.U();
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        O u02 = a8.u0(Q8);
        if (u02 != null) {
            u02.X(0);
            a8.r1(u02);
        }
        a8.g();
        if (u02 != null) {
            this$0.F(c1496f, u02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        String Q8 = c1496f.Q();
        AbstractC3159y.f(Q8);
        O u02 = a8.u0(Q8);
        if (u02 != null) {
            if (u02.f() == 1) {
                u02.L(0);
            } else {
                u02.L(1);
            }
            a8.r1(u02);
            C3313a c3313a = new C3313a();
            Context requireContext2 = this$0.requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            c3313a.b(requireContext2, u02.j());
        }
        a8.g();
        this$0.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.V(c1496f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(TvMyAppsFragment this$0, C1496f c1496f, Presenter.ViewHolder itemViewHolder, View view) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(itemViewHolder, "$itemViewHolder");
        this$0.T(c1496f.c(), itemViewHolder);
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(C1496f c1496f, TvMyAppsFragment this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        try {
            if (c1496f.Q() != null) {
                PackageManager packageManager = this$0.requireContext().getPackageManager();
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(Q8);
                if (leanbackLaunchIntentForPackage == null) {
                    PackageManager packageManager2 = this$0.requireContext().getPackageManager();
                    String Q9 = c1496f.Q();
                    AbstractC3159y.f(Q9);
                    leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(Q9);
                }
                if (leanbackLaunchIntentForPackage != null) {
                    this$0.startActivity(leanbackLaunchIntentForPackage);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(C1496f c1496f, TvMyAppsFragment this$0, View view) {
        AbstractC3159y.i(this$0, "this$0");
        if (c1496f.Q() != null) {
            Context requireContext = this$0.requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            i iVar = new i(requireContext);
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            iVar.h(Q8);
        }
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(C1496f c1496f, TvMyAppsFragment this$0, View view) {
        Bundle bundle;
        AbstractC3159y.i(this$0, "this$0");
        if (c1496f.Q() != null) {
            Intent intent = new Intent(this$0.getContext(), (Class<?>) B4.b.class);
            intent.putExtra("AppIndex", c1496f.Q());
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f28003B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
        }
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(TvMyAppsFragment this$0, C1496f c1496f, View view) {
        AbstractC3159y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.r(requireContext, null, c1496f, new c(), LifecycleOwnerKt.getLifecycleScope(this$0));
        AlertDialog alertDialog = this$0.f29918d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void T(long j8, Presenter.ViewHolder viewHolder) {
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        new S4.i(requireContext, j8, new d(viewHolder), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void U() {
        if (getContext() != null) {
            UptodownApp.a aVar = UptodownApp.f28003B;
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            UptodownApp.a.N0(aVar, requireContext, false, 2, null);
        }
    }

    private final void V(C1496f c1496f) {
        if (getContext() != null) {
            ArrayList arrayList = new ArrayList();
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            String I8 = c1496f.I();
            AbstractC3159y.f(I8);
            arrayList.add(new K4.b(Q8, I8));
            e eVar = new e();
            Context requireContext = requireContext();
            AbstractC3159y.h(requireContext, "requireContext()");
            new I4.a(requireContext, eVar).t(arrayList);
        }
    }

    private final void W() {
        AbstractC2829k.d(this.f29915a, null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X(P5.d dVar) {
        Object g8 = AbstractC2825i.g(C2812b0.b(), new g(null), dVar);
        if (g8 == Q5.b.e()) {
            return g8;
        }
        return I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(ArrayList arrayList) {
        ArrayObjectAdapter arrayObjectAdapter = this.f29917c;
        AbstractC3159y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ArrayObjectAdapter arrayObjectAdapter2 = this.f29917c;
                AbstractC3159y.f(arrayObjectAdapter2);
                arrayObjectAdapter2.add(arrayList.get(i8));
            }
        }
        ArrayObjectAdapter arrayObjectAdapter3 = this.f29917c;
        AbstractC3159y.f(arrayObjectAdapter3);
        if (arrayObjectAdapter3.size() == 0 && getContext() != null) {
            D(getString(R.string.no_data_available));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList Z(ArrayList arrayList) {
        AbstractC1246t.B(arrayList, new Comparator() { // from class: i5.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a02;
                a02 = TvMyAppsFragment.a0((C1496f) obj, (C1496f) obj2);
                return a02;
            }
        });
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        ArrayList v02 = a8.v0();
        a8.g();
        Iterator it = v02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            O o8 = (O) it.next();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (g6.n.s(o8.n(), ((C1496f) arrayList.get(i8)).Q(), true) && o8.u() > ((C1496f) arrayList.get(i8)).f0()) {
                    ((C1496f) arrayList.get(i8)).J0(C1496f.c.OUTDATED);
                }
            }
        }
        final h hVar = h.f29934a;
        AbstractC1246t.B(arrayList, new Comparator() { // from class: i5.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b02;
                b02 = TvMyAppsFragment.b0(X5.n.this, obj, obj2);
                return b02;
            }
        });
        Context context = getContext();
        if (context != null) {
            String packageName = context.getPackageName();
            int i9 = 0;
            while (i9 < arrayList.size() && (!g6.n.s(packageName, ((C1496f) arrayList.get(i9)).Q(), true) || ((C1496f) arrayList.get(i9)).c0() != C1496f.c.OUTDATED)) {
                i9++;
            }
            if (i9 < arrayList.size()) {
                Object remove = arrayList.remove(i9);
                AbstractC3159y.h(remove, "appsToShow.removeAt(i)");
                arrayList.add(0, (C1496f) remove);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a0(C1496f app1, C1496f app2) {
        AbstractC3159y.i(app1, "app1");
        AbstractC3159y.i(app2, "app2");
        if (app1.I() == null) {
            return 1;
        }
        if (app2.I() == null) {
            return -1;
        }
        String I8 = app1.I();
        AbstractC3159y.f(I8);
        String I9 = app2.I();
        AbstractC3159y.f(I9);
        return g6.n.m(I8, I9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b0(n tmp0, Object obj, Object obj2) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void c0() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(this.f29921g);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: i5.C
            @Override // java.lang.Runnable
            public final void run() {
                TvMyAppsFragment.d0(TvMyAppsFragment.this);
            }
        }, 500L);
        setOnItemViewClickedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(TvMyAppsFragment this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startEntranceTransition();
    }

    public final void S() {
        W();
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        this.f29916b = new C3330r(requireContext());
        a aVar = new a(new m());
        this.f29917c = aVar;
        setAdapter(aVar);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("updates")) {
                this.f29919e = extras.getBoolean("updates");
            }
            if (extras.containsKey("rollback")) {
                this.f29920f = extras.getBoolean("rollback");
            }
        }
        if (this.f29919e) {
            setTitle(getString(R.string.updates));
        } else if (this.f29920f) {
            setTitle(getString(R.string.rollback_title));
        } else {
            setTitle(getString(R.string.mis_apps_title));
        }
        if (bundle == null) {
            prepareEntranceTransition();
        }
        c0();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        W();
    }
}
