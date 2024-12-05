package com.uptodown.tv.ui.fragment;

import H4.i;
import H4.j;
import O5.I;
import O5.t;
import P5.AbstractC1378t;
import Z4.D;
import Z4.r;
import a5.C1639f;
import a5.C1641h;
import a5.O;
import a6.InterfaceC1668n;
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
import j5.m;
import j6.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import o5.C3661a;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;
import o5.C3678r;

/* loaded from: classes5.dex */
public final class TvMyAppsFragment extends VerticalGridSupportFragment {

    /* renamed from: b, reason: collision with root package name */
    private C3678r f30948b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayObjectAdapter f30949c;

    /* renamed from: d, reason: collision with root package name */
    private AlertDialog f30950d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30951e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30952f;

    /* renamed from: a, reason: collision with root package name */
    private final LifecycleCoroutineScope f30947a = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: g, reason: collision with root package name */
    private final int f30953g = 5;

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
            AbstractC3255y.i(itemViewHolder, "itemViewHolder");
            AbstractC3255y.i(item, "item");
            if (item instanceof C1639f) {
                if (!TvMyAppsFragment.this.f30952f) {
                    TvMyAppsFragment.this.G((C1639f) item, itemViewHolder);
                    return;
                }
                Intent intent = new Intent(TvMyAppsFragment.this.getContext(), (Class<?>) TvOldVersionsActivity.class);
                intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, (Parcelable) item);
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                FragmentActivity activity = tvMyAppsFragment.getActivity();
                if (activity != null) {
                    bundle = UptodownApp.f29058B.a(activity);
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

        @Override // Z4.D
        public void a(String appName) {
            AbstractC3255y.i(appName, "appName");
            TvMyAppsFragment.this.D(appName);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements r {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Presenter.ViewHolder f30957b;

        d(Presenter.ViewHolder viewHolder) {
            this.f30957b = viewHolder;
        }

        @Override // Z4.r
        public void c(int i8) {
        }

        @Override // Z4.r
        public void e(C1641h appInfo) {
            AbstractC3255y.i(appInfo, "appInfo");
            if (TvMyAppsFragment.this.getActivity() != null) {
                k5.b bVar = (k5.b) TvMyAppsFragment.this.getActivity();
                AbstractC3255y.f(bVar);
                bVar.o(appInfo, this.f30957b);
            }
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements M4.b {
        e() {
        }

        @Override // M4.b
        public void a(N4.b app) {
            AbstractC3255y.i(app, "app");
        }

        @Override // M4.b
        public void b(N4.b app) {
            AbstractC3255y.i(app, "app");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.D(tvMyAppsFragment.getString(R.string.core_msg_cannot_write_path));
            }
        }

        @Override // M4.b
        public void c(ArrayList apps) {
            AbstractC3255y.i(apps, "apps");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.D(tvMyAppsFragment.getString(R.string.backup_finished));
            }
        }

        @Override // M4.b
        public void d(String appName) {
            AbstractC3255y.i(appName, "appName");
        }

        @Override // M4.b
        public void e(int i8) {
        }

        @Override // M4.b
        public void f(N4.b app) {
            AbstractC3255y.i(app, "app");
            if (TvMyAppsFragment.this.getContext() != null) {
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                tvMyAppsFragment.D(tvMyAppsFragment.getString(R.string.core_msg_cannot_write_path));
            }
        }

        @Override // M4.b
        public void g(N4.b app, int i8) {
            AbstractC3255y.i(app, "app");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30959a;

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30959a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvMyAppsFragment tvMyAppsFragment = TvMyAppsFragment.this;
                this.f30959a = 1;
                if (tvMyAppsFragment.X(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class g extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30961a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30963a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ TvMyAppsFragment f30964b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f30965c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TvMyAppsFragment tvMyAppsFragment, T t8, S5.d dVar) {
                super(2, dVar);
                this.f30964b = tvMyAppsFragment;
                this.f30965c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30964b, this.f30965c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30963a == 0) {
                    t.b(obj);
                    this.f30964b.Y((ArrayList) this.f30965c.f34162a);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        g(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30961a;
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
                    C3667g c3667g = new C3667g();
                    Context requireContext = TvMyAppsFragment.this.requireContext();
                    AbstractC3255y.h(requireContext, "requireContext()");
                    t8.f34162a = c3667g.A(requireContext);
                    if (TvMyAppsFragment.this.f30951e) {
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((ArrayList) t8.f34162a).iterator();
                        while (it.hasNext()) {
                            C1639f c1639f = (C1639f) it.next();
                            if (c1639f.c0() == C1639f.c.OUTDATED) {
                                arrayList.add(c1639f);
                            }
                        }
                        t8.f34162a = arrayList;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = ((ArrayList) t8.f34162a).iterator();
                        while (it2.hasNext()) {
                            C1639f c1639f2 = (C1639f) it2.next();
                            if (n.s(TvMyAppsFragment.this.requireContext().getPackageName(), c1639f2.J(), true)) {
                                arrayList2.add(c1639f2);
                            } else {
                                Context requireContext2 = TvMyAppsFragment.this.requireContext();
                                AbstractC3255y.h(requireContext2, "requireContext()");
                                if (c1639f2.i0(requireContext2)) {
                                    Q4.f fVar = new Q4.f();
                                    Context requireContext3 = TvMyAppsFragment.this.requireContext();
                                    AbstractC3255y.h(requireContext3, "requireContext()");
                                    String J8 = c1639f2.J();
                                    AbstractC3255y.f(J8);
                                    if (!fVar.p(requireContext3, J8)) {
                                        arrayList2.add(c1639f2);
                                    }
                                }
                            }
                        }
                        t8.f34162a = arrayList2;
                    }
                    TvMyAppsFragment.this.Z((ArrayList) t8.f34162a);
                    J0 c8 = C3347b0.c();
                    a aVar = new a(TvMyAppsFragment.this, t8, null);
                    this.f30961a = 1;
                    if (AbstractC3360i.g(c8, aVar, this) == e8) {
                        return e8;
                    }
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f30966a = new h();

        h() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(C1639f app1, C1639f app2) {
            AbstractC3255y.i(app1, "app1");
            AbstractC3255y.i(app2, "app2");
            return Integer.valueOf(app1.c0().compareTo(app2.c0()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(str);
            builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: l5.B
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
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void F(C1639f c1639f, O o8) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        LayoutInflater layoutInflater = getLayoutInflater();
        AbstractC3255y.h(layoutInflater, "layoutInflater");
        View inflate = layoutInflater.inflate(R.layout.version_details_dialog, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_title_vd);
        j.a aVar = j.f3824g;
        textView.setTypeface(aVar.u());
        ((TextView) inflate.findViewById(R.id.tv_label_app_name_vd)).setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_app_name_vd);
        textView2.setTypeface(aVar.u());
        textView2.setText(c1639f.z());
        ((TextView) inflate.findViewById(R.id.tv_label_installed_version_vd)).setTypeface(aVar.u());
        TextView textView3 = (TextView) inflate.findViewById(R.id.tv_installed_version_vd);
        textView3.setTypeface(aVar.u());
        Y y8 = Y.f34167a;
        String format = String.format("%s(%s)", Arrays.copyOf(new Object[]{c1639f.h0(), Long.valueOf(c1639f.f0())}, 2));
        AbstractC3255y.h(format, "format(...)");
        textView3.setText(format);
        ((TextView) inflate.findViewById(R.id.tv_label_update_version_vd)).setTypeface(aVar.u());
        TextView textView4 = (TextView) inflate.findViewById(R.id.tv_update_version_vd);
        textView4.setTypeface(aVar.u());
        String format2 = String.format("%s(%s)", Arrays.copyOf(new Object[]{o8.x(), Long.valueOf(o8.w())}, 2));
        AbstractC3255y.h(format2, "format(...)");
        textView4.setText(format2);
        ((TextView) inflate.findViewById(R.id.tv_label_packagename_vd)).setTypeface(aVar.u());
        TextView textView5 = (TextView) inflate.findViewById(R.id.tv_packagename_vd);
        textView5.setTypeface(aVar.u());
        textView5.setText(c1639f.J());
        ((TextView) inflate.findViewById(R.id.tv_label_size_vd)).setTypeface(aVar.u());
        TextView textView6 = (TextView) inflate.findViewById(R.id.tv_size_vd);
        textView6.setTypeface(aVar.u());
        textView6.setText(new Q4.g().c(o8.v()));
        ((TextView) inflate.findViewById(R.id.tv_label_filename_vd)).setTypeface(aVar.u());
        TextView textView7 = (TextView) inflate.findViewById(R.id.tv_filename_vd);
        textView7.setTypeface(aVar.u());
        textView7.setText(o8.l());
        builder.setView(inflate);
        AlertDialog create = builder.create();
        this.f30950d = create;
        AbstractC3255y.f(create);
        create.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(final C1639f c1639f, final Presenter.ViewHolder viewHolder) {
        boolean z8;
        if (!getParentFragmentManager().isDestroyed() && c1639f != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
            LayoutInflater layoutInflater = getLayoutInflater();
            AbstractC3255y.h(layoutInflater, "layoutInflater");
            View inflate = layoutInflater.inflate(R.layout.dialogo_app_selected, (ViewGroup) null, false);
            TextView textView = (TextView) inflate.findViewById(R.id.tv_title_das);
            j.a aVar = j.f3824g;
            textView.setTypeface(aVar.t());
            textView.setText(c1639f.z());
            TextView textView2 = (TextView) inflate.findViewById(R.id.tv_see_on_uptodown);
            boolean z9 = true;
            if (c1639f.b() > 0) {
                textView2.setTypeface(aVar.u());
                textView2.setOnClickListener(new View.OnClickListener() { // from class: l5.D
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.N(TvMyAppsFragment.this, c1639f, viewHolder, view);
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
            if (getContext() != null && !n.s(requireContext().getPackageName(), c1639f.J(), true)) {
                textView3.setTypeface(aVar.u());
                textView3.setOnClickListener(new View.OnClickListener() { // from class: l5.F
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.O(C1639f.this, this, view);
                    }
                });
                if (!c1639f.l0()) {
                    textView4.setTypeface(aVar.u());
                    textView4.setOnClickListener(new View.OnClickListener() { // from class: l5.G
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            TvMyAppsFragment.P(C1639f.this, this, view);
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
            if (UptodownApp.f29058B.M()) {
                textView3.setText("Debug Info App");
                textView3.setOnClickListener(new View.OnClickListener() { // from class: l5.H
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.Q(C1639f.this, this, view);
                    }
                });
                textView3.setVisibility(0);
                z8 = true;
            }
            TextView textView5 = (TextView) inflate.findViewById(R.id.tv_share);
            if (c1639f.e0() != null) {
                textView5.setTypeface(aVar.u());
                textView5.setOnClickListener(new View.OnClickListener() { // from class: l5.I
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.R(TvMyAppsFragment.this, c1639f, view);
                    }
                });
                z8 = true;
            } else {
                textView5.setVisibility(8);
            }
            TextView textView6 = (TextView) inflate.findViewById(R.id.tv_old_versions);
            if (getContext() != null && !n.s(requireContext().getPackageName(), c1639f.J(), true)) {
                textView6.setTypeface(aVar.u());
                textView6.setOnClickListener(new View.OnClickListener() { // from class: l5.v
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.H(TvMyAppsFragment.this, c1639f, view);
                    }
                });
            } else {
                textView6.setVisibility(8);
            }
            TextView textView7 = (TextView) inflate.findViewById(R.id.tv_exclude);
            if (c1639f.i() == 0) {
                textView7.setText(getString(R.string.not_offer_updates));
            } else {
                textView7.setText(getString(R.string.offer_updates_again));
            }
            textView7.setTypeface(aVar.u());
            textView7.setOnClickListener(new View.OnClickListener() { // from class: l5.w
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    TvMyAppsFragment.I(TvMyAppsFragment.this, c1639f, view);
                }
            });
            TextView textView8 = (TextView) inflate.findViewById(R.id.tv_check_updates);
            TextView textView9 = (TextView) inflate.findViewById(R.id.tv_version_details);
            if (c1639f.c0() == C1639f.c.OUTDATED) {
                textView8.setTypeface(aVar.u());
                textView8.setOnClickListener(new View.OnClickListener() { // from class: l5.x
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.J(TvMyAppsFragment.this, c1639f, view);
                    }
                });
                textView9.setTypeface(aVar.u());
                textView9.setOnClickListener(new View.OnClickListener() { // from class: l5.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.K(TvMyAppsFragment.this, c1639f, view);
                    }
                });
                TextView textView10 = (TextView) inflate.findViewById(R.id.tv_ignore_version);
                textView10.setVisibility(0);
                textView10.setTypeface(aVar.u());
                C3674n.a aVar2 = C3674n.f36505t;
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C3674n a8 = aVar2.a(requireContext);
                a8.a();
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                O u02 = a8.u0(J8);
                a8.l();
                if (u02 != null && u02.h() == 1) {
                    textView10.setText(R.string.reactivate_skipped_update);
                } else {
                    textView10.setText(R.string.skip_update);
                }
                textView10.setOnClickListener(new View.OnClickListener() { // from class: l5.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.L(TvMyAppsFragment.this, c1639f, view);
                    }
                });
                z8 = true;
            } else {
                textView8.setVisibility(8);
                textView9.setVisibility(8);
            }
            if (c1639f.J() != null) {
                TextView textView11 = (TextView) inflate.findViewById(R.id.tv_backup);
                textView11.setVisibility(0);
                textView11.setTypeface(aVar.u());
                textView11.setOnClickListener(new View.OnClickListener() { // from class: l5.E
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        TvMyAppsFragment.M(TvMyAppsFragment.this, c1639f, view);
                    }
                });
            } else {
                z9 = z8;
            }
            if (z9) {
                builder.setView(inflate);
                AlertDialog create = builder.create();
                this.f30950d = create;
                AbstractC3255y.f(create);
                create.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        Bundle bundle;
        AbstractC3255y.i(this$0, "this$0");
        Intent intent = new Intent(this$0.getContext(), (Class<?>) TvOldVersionsActivity.class);
        intent.putExtra(MBridgeConstans.DYNAMIC_VIEW_WX_APP, c1639f);
        FragmentActivity activity = this$0.getActivity();
        if (activity != null) {
            bundle = UptodownApp.f29058B.a(activity);
        } else {
            bundle = null;
        }
        this$0.startActivity(intent, bundle);
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        if (c1639f.i() == 0) {
            c1639f.t0(1);
            c1639f.J0(C1639f.c.UPDATED);
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            a8.M(J8);
            C3677q c3677q = new C3677q();
            Context requireContext2 = this$0.requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            c3677q.c(requireContext2);
        } else {
            c1639f.t0(0);
        }
        a8.j1(c1639f);
        a8.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        O u02 = a8.u0(J8);
        if (u02 != null) {
            u02.X(0);
            a8.r1(u02);
            C3661a c3661a = new C3661a();
            Context requireContext2 = this$0.requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            c3661a.b(requireContext2, u02.l());
        }
        a8.l();
        this$0.U();
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        O u02 = a8.u0(J8);
        if (u02 != null) {
            u02.X(0);
            a8.r1(u02);
        }
        a8.l();
        if (u02 != null) {
            this$0.F(c1639f, u02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        String J8 = c1639f.J();
        AbstractC3255y.f(J8);
        O u02 = a8.u0(J8);
        if (u02 != null) {
            if (u02.h() == 1) {
                u02.H(0);
            } else {
                u02.H(1);
            }
            a8.r1(u02);
            C3661a c3661a = new C3661a();
            Context requireContext2 = this$0.requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            c3661a.b(requireContext2, u02.l());
        }
        a8.l();
        this$0.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.V(c1639f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(TvMyAppsFragment this$0, C1639f c1639f, Presenter.ViewHolder itemViewHolder, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(itemViewHolder, "$itemViewHolder");
        this$0.T(c1639f.b(), itemViewHolder);
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(C1639f c1639f, TvMyAppsFragment this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        try {
            if (c1639f.J() != null) {
                PackageManager packageManager = this$0.requireContext().getPackageManager();
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                Intent leanbackLaunchIntentForPackage = packageManager.getLeanbackLaunchIntentForPackage(J8);
                if (leanbackLaunchIntentForPackage == null) {
                    PackageManager packageManager2 = this$0.requireContext().getPackageManager();
                    String J9 = c1639f.J();
                    AbstractC3255y.f(J9);
                    leanbackLaunchIntentForPackage = packageManager2.getLaunchIntentForPackage(J9);
                }
                if (leanbackLaunchIntentForPackage != null) {
                    this$0.startActivity(leanbackLaunchIntentForPackage);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(C1639f c1639f, TvMyAppsFragment this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (c1639f.J() != null) {
            Context requireContext = this$0.requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            i iVar = new i(requireContext);
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            iVar.h(J8);
        }
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(C1639f c1639f, TvMyAppsFragment this$0, View view) {
        Bundle bundle;
        AbstractC3255y.i(this$0, "this$0");
        if (c1639f.J() != null) {
            Intent intent = new Intent(this$0.getContext(), (Class<?>) E4.b.class);
            intent.putExtra("AppIndex", c1639f.J());
            FragmentActivity activity = this$0.getActivity();
            if (activity != null) {
                bundle = UptodownApp.f29058B.a(activity);
            } else {
                bundle = null;
            }
            this$0.startActivity(intent, bundle);
        }
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(TvMyAppsFragment this$0, C1639f c1639f, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Context requireContext = this$0.requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.r(requireContext, null, c1639f, new c(), LifecycleOwnerKt.getLifecycleScope(this$0));
        AlertDialog alertDialog = this$0.f30950d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    private final void T(long j8, Presenter.ViewHolder viewHolder) {
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        new V4.i(requireContext, j8, new d(viewHolder), LifecycleOwnerKt.getLifecycleScope(this));
    }

    private final void U() {
        if (getContext() != null) {
            UptodownApp.a aVar = UptodownApp.f29058B;
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            UptodownApp.a.N0(aVar, requireContext, false, 2, null);
        }
    }

    private final void V(C1639f c1639f) {
        if (getContext() != null) {
            ArrayList arrayList = new ArrayList();
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            String z8 = c1639f.z();
            AbstractC3255y.f(z8);
            arrayList.add(new N4.b(J8, z8));
            e eVar = new e();
            Context requireContext = requireContext();
            AbstractC3255y.h(requireContext, "requireContext()");
            new L4.a(requireContext, eVar).t(arrayList);
        }
    }

    private final void W() {
        AbstractC3364k.d(this.f30947a, null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object X(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new g(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(ArrayList arrayList) {
        ArrayObjectAdapter arrayObjectAdapter = this.f30949c;
        AbstractC3255y.f(arrayObjectAdapter);
        arrayObjectAdapter.clear();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ArrayObjectAdapter arrayObjectAdapter2 = this.f30949c;
                AbstractC3255y.f(arrayObjectAdapter2);
                arrayObjectAdapter2.add(arrayList.get(i8));
            }
        }
        ArrayObjectAdapter arrayObjectAdapter3 = this.f30949c;
        AbstractC3255y.f(arrayObjectAdapter3);
        if (arrayObjectAdapter3.size() == 0 && getContext() != null) {
            D(getString(R.string.no_data_available));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList Z(ArrayList arrayList) {
        AbstractC1378t.B(arrayList, new Comparator() { // from class: l5.u
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int a02;
                a02 = TvMyAppsFragment.a0((C1639f) obj, (C1639f) obj2);
                return a02;
            }
        });
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        ArrayList v02 = a8.v0();
        a8.l();
        Iterator it = v02.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            O o8 = (O) it.next();
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (n.s(o8.s(), ((C1639f) arrayList.get(i8)).J(), true) && o8.w() > ((C1639f) arrayList.get(i8)).f0()) {
                    ((C1639f) arrayList.get(i8)).J0(C1639f.c.OUTDATED);
                }
            }
        }
        final h hVar = h.f30966a;
        AbstractC1378t.B(arrayList, new Comparator() { // from class: l5.A
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b02;
                b02 = TvMyAppsFragment.b0(InterfaceC1668n.this, obj, obj2);
                return b02;
            }
        });
        Context context = getContext();
        if (context != null) {
            String packageName = context.getPackageName();
            int i9 = 0;
            while (i9 < arrayList.size() && (!n.s(packageName, ((C1639f) arrayList.get(i9)).J(), true) || ((C1639f) arrayList.get(i9)).c0() != C1639f.c.OUTDATED)) {
                i9++;
            }
            if (i9 < arrayList.size()) {
                Object remove = arrayList.remove(i9);
                AbstractC3255y.h(remove, "appsToShow.removeAt(i)");
                arrayList.add(0, (C1639f) remove);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a0(C1639f app1, C1639f app2) {
        AbstractC3255y.i(app1, "app1");
        AbstractC3255y.i(app2, "app2");
        if (app1.z() == null) {
            return 1;
        }
        if (app2.z() == null) {
            return -1;
        }
        String z8 = app1.z();
        AbstractC3255y.f(z8);
        String z9 = app2.z();
        AbstractC3255y.f(z9);
        return n.m(z8, z9, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b0(InterfaceC1668n tmp0, Object obj, Object obj2) {
        AbstractC3255y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    private final void c0() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(this.f30953g);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l5.C
            @Override // java.lang.Runnable
            public final void run() {
                TvMyAppsFragment.d0(TvMyAppsFragment.this);
            }
        }, 500L);
        setOnItemViewClickedListener(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(TvMyAppsFragment this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.startEntranceTransition();
    }

    public final void S() {
        W();
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        this.f30948b = new C3678r(requireContext());
        a aVar = new a(new m());
        this.f30949c = aVar;
        setAdapter(aVar);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey("updates")) {
                this.f30951e = extras.getBoolean("updates");
            }
            if (extras.containsKey("rollback")) {
                this.f30952f = extras.getBoolean("rollback");
            }
        }
        if (this.f30951e) {
            setTitle(getString(R.string.updates));
        } else if (this.f30952f) {
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
