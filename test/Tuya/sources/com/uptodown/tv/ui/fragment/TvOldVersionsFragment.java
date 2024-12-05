package com.uptodown.tv.ui.fragment;

import E4.i;
import L5.I;
import L5.t;
import N4.q;
import W4.w;
import X4.C1496f;
import X4.C1498h;
import X4.C1505o;
import X4.z;
import X5.n;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.widget.Toast;
import androidx.compose.runtime.ComposerKt;
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
import com.uptodown.tv.ui.fragment.TvOldVersionsFragment;
import com.uptodown.workers.DownloadApkWorker;
import g5.o;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import i6.N;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import l5.C3313a;
import l5.C3319g;
import l5.C3326n;
import l5.C3329q;

/* loaded from: classes5.dex */
public final class TvOldVersionsFragment extends VerticalGridSupportFragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f29947f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1498h f29948a;

    /* renamed from: b, reason: collision with root package name */
    private C1496f f29949b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f29950c;

    /* renamed from: d, reason: collision with root package name */
    private b f29951d;

    /* renamed from: e, reason: collision with root package name */
    private String f29952e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends ArrayObjectAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o presenter) {
            super(presenter);
            AbstractC3159y.i(presenter, "presenter");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public final class c implements OnItemViewClickedListener {
        public c() {
        }

        @Override // androidx.leanback.widget.BaseOnItemViewClickedListener
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onItemClicked(Presenter.ViewHolder viewHolder, Object obj, RowPresenter.ViewHolder viewHolder2, Row row) {
            if (obj instanceof z) {
                if (TvOldVersionsFragment.this.f29949b != null) {
                    long j8 = ((z) obj).j();
                    C1496f c1496f = TvOldVersionsFragment.this.f29949b;
                    AbstractC3159y.f(c1496f);
                    if (j8 == c1496f.f0()) {
                        return;
                    }
                }
                TvOldVersionsFragment.this.f29952e = null;
                C3326n.a aVar = C3326n.f34504t;
                Context requireContext = TvOldVersionsFragment.this.requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C3326n a8 = aVar.a(requireContext);
                a8.a();
                z zVar = (z) obj;
                C1505o Z7 = a8.Z(String.valueOf(zVar.b()));
                a8.g();
                if (Z7 != null) {
                    if (Z7.X() != null) {
                        int Z8 = Z7.Z();
                        if (1 <= Z8 && Z8 < 100) {
                            C3313a c3313a = new C3313a();
                            Context context = TvOldVersionsFragment.this.getContext();
                            AbstractC3159y.f(context);
                            c3313a.a(context, Z7.X());
                            return;
                        }
                        TvOldVersionsFragment.this.f29952e = Z7.X();
                        if (Z7.Z() != 100) {
                            TvOldVersionsFragment.this.y(Z7);
                            return;
                        }
                        TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                        C1498h c1498h = tvOldVersionsFragment.f29948a;
                        AbstractC3159y.f(c1498h);
                        String y02 = c1498h.y0();
                        long e02 = Z7.e0();
                        String X7 = Z7.X();
                        AbstractC3159y.f(X7);
                        tvOldVersionsFragment.C(y02, e02, X7);
                        return;
                    }
                    return;
                }
                C1505o c1505o = new C1505o();
                c1505o.w0(String.valueOf(zVar.b()));
                c1505o.J0(zVar.j());
                c1505o.G0(zVar.i());
                TvOldVersionsFragment.this.y(c1505o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29954a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29955b;

        /* renamed from: d, reason: collision with root package name */
        int f29957d;

        d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29955b = obj;
            this.f29957d |= Integer.MIN_VALUE;
            return TvOldVersionsFragment.this.z(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29958a;

        /* loaded from: classes5.dex */
        public static final class a implements w {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TvOldVersionsFragment f29960a;

            a(TvOldVersionsFragment tvOldVersionsFragment) {
                this.f29960a = tvOldVersionsFragment;
            }

            @Override // W4.w
            public void a() {
            }

            @Override // W4.x
            public void b(C1498h appInfo, C1496f c1496f) {
                AbstractC3159y.i(appInfo, "appInfo");
                this.f29960a.f29949b = c1496f;
                this.f29960a.f29948a = appInfo;
                if (this.f29960a.f29948a != null) {
                    C1498h c1498h = this.f29960a.f29948a;
                    AbstractC3159y.f(c1498h);
                    if (c1498h.w0() != null) {
                        TvOldVersionsFragment tvOldVersionsFragment = this.f29960a;
                        C1498h c1498h2 = tvOldVersionsFragment.f29948a;
                        AbstractC3159y.f(c1498h2);
                        tvOldVersionsFragment.B(c1498h2.w0());
                    }
                }
            }

            @Override // W4.w
            public void c(int i8) {
            }

            @Override // W4.w
            public void d(int i8) {
            }

            @Override // W4.x
            public void e(String appName) {
                AbstractC3159y.i(appName, "appName");
            }

            @Override // W4.w
            public void f() {
            }
        }

        e(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new e(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            Q5.b.e();
            if (this.f29958a == 0) {
                t.b(obj);
                if (TvOldVersionsFragment.this.f29948a != null && TvOldVersionsFragment.this.getContext() != null) {
                    C1498h c1498h = TvOldVersionsFragment.this.f29948a;
                    AbstractC3159y.f(c1498h);
                    if (c1498h.w0() != null) {
                        C1498h c1498h2 = TvOldVersionsFragment.this.f29948a;
                        AbstractC3159y.f(c1498h2);
                        ArrayList w02 = c1498h2.w0();
                        AbstractC3159y.f(w02);
                        if (w02.size() != 0) {
                            C1498h c1498h3 = TvOldVersionsFragment.this.f29948a;
                            AbstractC3159y.f(c1498h3);
                            ArrayList w03 = c1498h3.w0();
                            AbstractC3159y.f(w03);
                            i8 = w03.size();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(TvOldVersionsFragment.this);
                            Context requireContext = TvOldVersionsFragment.this.requireContext();
                            AbstractC3159y.h(requireContext, "requireContext()");
                            C1496f c1496f = TvOldVersionsFragment.this.f29949b;
                            C1498h c1498h4 = TvOldVersionsFragment.this.f29948a;
                            AbstractC3159y.f(c1498h4);
                            new S4.f(lifecycleScope, requireContext, c1496f, c1498h4, new a(TvOldVersionsFragment.this), i8);
                        }
                    }
                    i8 = 0;
                    LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(TvOldVersionsFragment.this);
                    Context requireContext2 = TvOldVersionsFragment.this.requireContext();
                    AbstractC3159y.h(requireContext2, "requireContext()");
                    C1496f c1496f2 = TvOldVersionsFragment.this.f29949b;
                    C1498h c1498h42 = TvOldVersionsFragment.this.f29948a;
                    AbstractC3159y.f(c1498h42);
                    new S4.f(lifecycleScope2, requireContext2, c1496f2, c1498h42, new a(TvOldVersionsFragment.this), i8);
                }
                TvOldVersionsFragment.this.x();
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29961a;

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
            Q5.b.e();
            if (this.f29961a == 0) {
                t.b(obj);
                try {
                    if (TvOldVersionsFragment.this.f29948a != null) {
                        C1498h c1498h = TvOldVersionsFragment.this.f29948a;
                        AbstractC3159y.f(c1498h);
                        if (c1498h.w0() != null) {
                            TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                            C1498h c1498h2 = tvOldVersionsFragment.f29948a;
                            AbstractC3159y.f(c1498h2);
                            tvOldVersionsFragment.B(c1498h2.w0());
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f29963a;

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
            int i8 = this.f29963a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                this.f29963a = 1;
                if (tvOldVersionsFragment.z(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    private final boolean A(String str, long j8) {
        if (getActivity() != null) {
            PackageManager pm = requireActivity().getPackageManager();
            try {
                AbstractC3159y.h(pm, "pm");
                AbstractC3159y.f(str);
                if (j8 >= new N4.f().m(q.d(pm, str, 1))) {
                    return false;
                }
                return true;
            } catch (PackageManager.NameNotFoundException e8) {
                e8.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B(ArrayList arrayList) {
        b bVar = this.f29951d;
        AbstractC3159y.f(bVar);
        bVar.clear();
        AbstractC3159y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar2 = this.f29951d;
            AbstractC3159y.f(bVar2);
            bVar2.add(arrayList.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str, long j8, String str2) {
        if (A(str, j8)) {
            u(str);
            return;
        }
        C3329q c3329q = new C3329q();
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        File file = new File(c3329q.f(requireContext), str2);
        UptodownApp.a aVar = UptodownApp.f28003B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3159y.h(requireActivity, "requireActivity()");
        UptodownApp.a.Z(aVar, file, requireActivity, null, 4, null);
    }

    private final void D() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: i5.L
            @Override // java.lang.Runnable
            public final void run() {
                TvOldVersionsFragment.E(TvOldVersionsFragment.this);
            }
        }, 500L);
        setOnItemViewClickedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TvOldVersionsFragment this$0) {
        AbstractC3159y.i(this$0, "this$0");
        this$0.startEntranceTransition();
    }

    private final void F(String str) {
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3159y.h(requireActivity, "requireActivity()");
            i iVar = new i(requireActivity);
            AbstractC3159y.f(str);
            iVar.h(str);
        }
    }

    private final void u(final String str) {
        AlertDialog alertDialog = this.f29950c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(getString(R.string.warning_title));
        builder.setMessage(R.string.msg_warning_old_versions);
        builder.setCancelable(false);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: i5.M
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvOldVersionsFragment.v(TvOldVersionsFragment.this, str, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: i5.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvOldVersionsFragment.w(dialogInterface, i8);
            }
        });
        AlertDialog create = builder.create();
        this.f29950c = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TvOldVersionsFragment this$0, String str, DialogInterface dialog, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        AbstractC3159y.i(dialog, "dialog");
        dialog.dismiss();
        this$0.F(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialog, int i8) {
        AbstractC3159y.i(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        C3326n.a aVar = C3326n.f34504t;
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        C3326n a8 = aVar.a(requireContext);
        a8.a();
        ArrayList c02 = a8.c0();
        if (c02.size() > 0) {
            C3329q c3329q = new C3329q();
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            ArrayList d8 = c3329q.d(requireContext2);
            Iterator it = c02.iterator();
            while (it.hasNext()) {
                C1505o c1505o = (C1505o) it.next();
                Iterator it2 = d8.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (g6.n.s(((File) it2.next()).getName(), c1505o.X(), true)) {
                            break;
                        }
                    } else {
                        a8.x(c1505o);
                        break;
                    }
                }
            }
        }
        a8.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(C1505o c1505o) {
        C1498h c1498h = this.f29948a;
        AbstractC3159y.f(c1498h);
        c1505o.b(c1498h);
        Context requireContext = requireContext();
        AbstractC3159y.h(requireContext, "requireContext()");
        int l02 = c1505o.l0(requireContext);
        if (l02 >= 0) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f30002k;
            Context requireContext2 = requireContext();
            AbstractC3159y.h(requireContext2, "requireContext()");
            if (!aVar.f(requireContext2, l02)) {
                Context context = getContext();
                Y y8 = Y.f33766a;
                String string = getString(R.string.msg_added_to_downlads_queue);
                AbstractC3159y.h(string, "getString(R.string.msg_added_to_downlads_queue)");
                C1498h c1498h2 = this.f29948a;
                AbstractC3159y.f(c1498h2);
                String format = String.format(string, Arrays.copyOf(new Object[]{c1498h2.s0()}, 1));
                AbstractC3159y.h(format, "format(...)");
                Toast.makeText(context, format, 1).show();
                return;
            }
            return;
        }
        Toast.makeText(getContext(), getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.tv.ui.fragment.TvOldVersionsFragment.d
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d r0 = (com.uptodown.tv.ui.fragment.TvOldVersionsFragment.d) r0
            int r1 = r0.f29957d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29957d = r1
            goto L18
        L13:
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d r0 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f29955b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f29957d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f29954a
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment r2 = (com.uptodown.tv.ui.fragment.TvOldVersionsFragment) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            i6.I r7 = i6.C2812b0.b()
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$e r2 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$e
            r2.<init>(r5)
            r0.f29954a = r6
            r0.f29957d = r4
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            i6.J0 r7 = i6.C2812b0.c()
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$f r4 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$f
            r4.<init>(r5)
            r0.f29954a = r5
            r0.f29957d = r3
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvOldVersionsFragment.z(P5.d):java.lang.Object");
    }

    public final void G(int i8) {
        switch (i8) {
            case ComposerKt.providerKey /* 201 */:
                b bVar = this.f29951d;
                AbstractC3159y.f(bVar);
                b bVar2 = this.f29951d;
                AbstractC3159y.f(bVar2);
                bVar.notifyArrayItemRangeChanged(0, bVar2.size());
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
                b bVar3 = this.f29951d;
                AbstractC3159y.f(bVar3);
                b bVar4 = this.f29951d;
                AbstractC3159y.f(bVar4);
                bVar3.notifyArrayItemRangeChanged(0, bVar4.size());
                return;
            default:
                return;
        }
    }

    @Override // androidx.leanback.app.BaseSupportFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null && (extras = activity.getIntent().getExtras()) != null) {
            if (extras.containsKey(MBridgeConstans.DYNAMIC_VIEW_WX_APP)) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, C1496f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
                this.f29949b = (C1496f) parcelable3;
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1498h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f29948a = (C1498h) parcelable;
                C3319g c3319g = new C3319g();
                Context requireContext = requireContext();
                AbstractC3159y.h(requireContext, "requireContext()");
                C1498h c1498h = this.f29948a;
                AbstractC3159y.f(c1498h);
                this.f29949b = c3319g.z(requireContext, c1498h.y0());
            }
        }
        if (this.f29949b != null) {
            C1496f c1496f = this.f29949b;
            AbstractC3159y.f(c1496f);
            this.f29951d = new b(new o(c1496f));
        } else if (this.f29948a != null) {
            C1498h c1498h2 = this.f29948a;
            AbstractC3159y.f(c1498h2);
            this.f29951d = new b(new o(c1498h2.y0()));
        }
        setAdapter(this.f29951d);
        setTitle(getString(R.string.rollback_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        D();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC2829k.d(N.a(C2812b0.b()), null, null, new g(null), 3, null);
    }
}
