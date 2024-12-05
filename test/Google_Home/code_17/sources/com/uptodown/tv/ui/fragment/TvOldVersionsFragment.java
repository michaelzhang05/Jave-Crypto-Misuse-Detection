package com.uptodown.tv.ui.fragment;

import H4.i;
import O5.I;
import O5.t;
import Q4.q;
import Z4.w;
import a5.C1639f;
import a5.C1641h;
import a5.C1648o;
import a5.z;
import a6.InterfaceC1668n;
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
import j5.o;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import l6.N;
import o5.C3661a;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;

/* loaded from: classes5.dex */
public final class TvOldVersionsFragment extends VerticalGridSupportFragment {

    /* renamed from: f, reason: collision with root package name */
    public static final a f30979f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private C1641h f30980a;

    /* renamed from: b, reason: collision with root package name */
    private C1639f f30981b;

    /* renamed from: c, reason: collision with root package name */
    private AlertDialog f30982c;

    /* renamed from: d, reason: collision with root package name */
    private b f30983d;

    /* renamed from: e, reason: collision with root package name */
    private String f30984e;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b extends ArrayObjectAdapter {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o presenter) {
            super(presenter);
            AbstractC3255y.i(presenter, "presenter");
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
                if (TvOldVersionsFragment.this.f30981b != null) {
                    long l8 = ((z) obj).l();
                    C1639f c1639f = TvOldVersionsFragment.this.f30981b;
                    AbstractC3255y.f(c1639f);
                    if (l8 == c1639f.f0()) {
                        return;
                    }
                }
                TvOldVersionsFragment.this.f30984e = null;
                C3674n.a aVar = C3674n.f36505t;
                Context requireContext = TvOldVersionsFragment.this.requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C3674n a8 = aVar.a(requireContext);
                a8.a();
                z zVar = (z) obj;
                C1648o Z7 = a8.Z(String.valueOf(zVar.a()));
                a8.l();
                if (Z7 != null) {
                    if (Z7.X() != null) {
                        int Z8 = Z7.Z();
                        if (1 <= Z8 && Z8 < 100) {
                            C3661a c3661a = new C3661a();
                            Context context = TvOldVersionsFragment.this.getContext();
                            AbstractC3255y.f(context);
                            c3661a.a(context, Z7.X());
                            return;
                        }
                        TvOldVersionsFragment.this.f30984e = Z7.X();
                        if (Z7.Z() != 100) {
                            TvOldVersionsFragment.this.y(Z7);
                            return;
                        }
                        TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                        C1641h c1641h = tvOldVersionsFragment.f30980a;
                        AbstractC3255y.f(c1641h);
                        String y02 = c1641h.y0();
                        long e02 = Z7.e0();
                        String X7 = Z7.X();
                        AbstractC3255y.f(X7);
                        tvOldVersionsFragment.C(y02, e02, X7);
                        return;
                    }
                    return;
                }
                C1648o c1648o = new C1648o();
                c1648o.w0(String.valueOf(zVar.a()));
                c1648o.J0(zVar.l());
                c1648o.G0(zVar.i());
                TvOldVersionsFragment.this.y(c1648o);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30986a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f30987b;

        /* renamed from: d, reason: collision with root package name */
        int f30989d;

        d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30987b = obj;
            this.f30989d |= Integer.MIN_VALUE;
            return TvOldVersionsFragment.this.z(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30990a;

        /* loaded from: classes5.dex */
        public static final class a implements w {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ TvOldVersionsFragment f30992a;

            a(TvOldVersionsFragment tvOldVersionsFragment) {
                this.f30992a = tvOldVersionsFragment;
            }

            @Override // Z4.w
            public void a() {
            }

            @Override // Z4.w
            public void b(int i8) {
            }

            @Override // Z4.x
            public void c(C1641h appInfo, C1639f c1639f) {
                AbstractC3255y.i(appInfo, "appInfo");
                this.f30992a.f30981b = c1639f;
                this.f30992a.f30980a = appInfo;
                if (this.f30992a.f30980a != null) {
                    C1641h c1641h = this.f30992a.f30980a;
                    AbstractC3255y.f(c1641h);
                    if (c1641h.w0() != null) {
                        TvOldVersionsFragment tvOldVersionsFragment = this.f30992a;
                        C1641h c1641h2 = tvOldVersionsFragment.f30980a;
                        AbstractC3255y.f(c1641h2);
                        tvOldVersionsFragment.B(c1641h2.w0());
                    }
                }
            }

            @Override // Z4.w
            public void d(int i8) {
            }

            @Override // Z4.x
            public void e(String appName) {
                AbstractC3255y.i(appName, "appName");
            }

            @Override // Z4.w
            public void f() {
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            T5.b.e();
            if (this.f30990a == 0) {
                t.b(obj);
                if (TvOldVersionsFragment.this.f30980a != null && TvOldVersionsFragment.this.getContext() != null) {
                    C1641h c1641h = TvOldVersionsFragment.this.f30980a;
                    AbstractC3255y.f(c1641h);
                    if (c1641h.w0() != null) {
                        C1641h c1641h2 = TvOldVersionsFragment.this.f30980a;
                        AbstractC3255y.f(c1641h2);
                        ArrayList w02 = c1641h2.w0();
                        AbstractC3255y.f(w02);
                        if (w02.size() != 0) {
                            C1641h c1641h3 = TvOldVersionsFragment.this.f30980a;
                            AbstractC3255y.f(c1641h3);
                            ArrayList w03 = c1641h3.w0();
                            AbstractC3255y.f(w03);
                            i8 = w03.size();
                            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(TvOldVersionsFragment.this);
                            Context requireContext = TvOldVersionsFragment.this.requireContext();
                            AbstractC3255y.h(requireContext, "requireContext()");
                            C1639f c1639f = TvOldVersionsFragment.this.f30981b;
                            C1641h c1641h4 = TvOldVersionsFragment.this.f30980a;
                            AbstractC3255y.f(c1641h4);
                            new V4.f(lifecycleScope, requireContext, c1639f, c1641h4, new a(TvOldVersionsFragment.this), i8);
                        }
                    }
                    i8 = 0;
                    LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(TvOldVersionsFragment.this);
                    Context requireContext2 = TvOldVersionsFragment.this.requireContext();
                    AbstractC3255y.h(requireContext2, "requireContext()");
                    C1639f c1639f2 = TvOldVersionsFragment.this.f30981b;
                    C1641h c1641h42 = TvOldVersionsFragment.this.f30980a;
                    AbstractC3255y.f(c1641h42);
                    new V4.f(lifecycleScope2, requireContext2, c1639f2, c1641h42, new a(TvOldVersionsFragment.this), i8);
                }
                TvOldVersionsFragment.this.x();
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30993a;

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30993a == 0) {
                t.b(obj);
                try {
                    if (TvOldVersionsFragment.this.f30980a != null) {
                        C1641h c1641h = TvOldVersionsFragment.this.f30980a;
                        AbstractC3255y.f(c1641h);
                        if (c1641h.w0() != null) {
                            TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                            C1641h c1641h2 = tvOldVersionsFragment.f30980a;
                            AbstractC3255y.f(c1641h2);
                            tvOldVersionsFragment.B(c1641h2.w0());
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30995a;

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
            int i8 = this.f30995a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                TvOldVersionsFragment tvOldVersionsFragment = TvOldVersionsFragment.this;
                this.f30995a = 1;
                if (tvOldVersionsFragment.z(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    private final boolean A(String str, long j8) {
        if (getActivity() != null) {
            PackageManager pm = requireActivity().getPackageManager();
            try {
                AbstractC3255y.h(pm, "pm");
                AbstractC3255y.f(str);
                if (j8 >= new Q4.f().m(q.d(pm, str, 1))) {
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
        b bVar = this.f30983d;
        AbstractC3255y.f(bVar);
        bVar.clear();
        AbstractC3255y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar2 = this.f30983d;
            AbstractC3255y.f(bVar2);
            bVar2.add(arrayList.get(i8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(String str, long j8, String str2) {
        if (A(str, j8)) {
            u(str);
            return;
        }
        C3677q c3677q = new C3677q();
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        File file = new File(c3677q.f(requireContext), str2);
        UptodownApp.a aVar = UptodownApp.f29058B;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3255y.h(requireActivity, "requireActivity()");
        UptodownApp.a.Z(aVar, file, requireActivity, null, 4, null);
    }

    private final void D() {
        VerticalGridPresenter verticalGridPresenter = new VerticalGridPresenter();
        verticalGridPresenter.setNumberOfColumns(2);
        setGridPresenter(verticalGridPresenter);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: l5.L
            @Override // java.lang.Runnable
            public final void run() {
                TvOldVersionsFragment.E(TvOldVersionsFragment.this);
            }
        }, 500L);
        setOnItemViewClickedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(TvOldVersionsFragment this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.startEntranceTransition();
    }

    private final void F(String str) {
        if (getActivity() != null) {
            FragmentActivity requireActivity = requireActivity();
            AbstractC3255y.h(requireActivity, "requireActivity()");
            i iVar = new i(requireActivity);
            AbstractC3255y.f(str);
            iVar.h(str);
        }
    }

    private final void u(final String str) {
        AlertDialog alertDialog = this.f30982c;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(getString(R.string.warning_title));
        builder.setMessage(R.string.msg_warning_old_versions);
        builder.setCancelable(false);
        builder.setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: l5.M
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvOldVersionsFragment.v(TvOldVersionsFragment.this, str, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: l5.N
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvOldVersionsFragment.w(dialogInterface, i8);
            }
        });
        AlertDialog create = builder.create();
        this.f30982c = create;
        if (create != null) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TvOldVersionsFragment this$0, String str, DialogInterface dialog, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(dialog, "dialog");
        dialog.dismiss();
        this$0.F(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialog, int i8) {
        AbstractC3255y.i(dialog, "dialog");
        dialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        C3674n.a aVar = C3674n.f36505t;
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        C3674n a8 = aVar.a(requireContext);
        a8.a();
        ArrayList c02 = a8.c0();
        if (c02.size() > 0) {
            C3677q c3677q = new C3677q();
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            ArrayList d8 = c3677q.d(requireContext2);
            Iterator it = c02.iterator();
            while (it.hasNext()) {
                C1648o c1648o = (C1648o) it.next();
                Iterator it2 = d8.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (n.s(((File) it2.next()).getName(), c1648o.X(), true)) {
                            break;
                        }
                    } else {
                        a8.A(c1648o);
                        break;
                    }
                }
            }
        }
        a8.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(C1648o c1648o) {
        C1641h c1641h = this.f30980a;
        AbstractC3255y.f(c1641h);
        c1648o.a(c1641h);
        Context requireContext = requireContext();
        AbstractC3255y.h(requireContext, "requireContext()");
        int l02 = c1648o.l0(requireContext);
        if (l02 >= 0) {
            DownloadApkWorker.a aVar = DownloadApkWorker.f31034k;
            Context requireContext2 = requireContext();
            AbstractC3255y.h(requireContext2, "requireContext()");
            if (!aVar.f(requireContext2, l02)) {
                Context context = getContext();
                Y y8 = Y.f34167a;
                String string = getString(R.string.msg_added_to_downlads_queue);
                AbstractC3255y.h(string, "getString(R.string.msg_added_to_downlads_queue)");
                C1641h c1641h2 = this.f30980a;
                AbstractC3255y.f(c1641h2);
                String format = String.format(string, Arrays.copyOf(new Object[]{c1641h2.s0()}, 1));
                AbstractC3255y.h(format, "format(...)");
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
    public final java.lang.Object z(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.uptodown.tv.ui.fragment.TvOldVersionsFragment.d
            if (r0 == 0) goto L13
            r0 = r7
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d r0 = (com.uptodown.tv.ui.fragment.TvOldVersionsFragment.d) r0
            int r1 = r0.f30989d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30989d = r1
            goto L18
        L13:
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d r0 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30987b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30989d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L69
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f30986a
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment r2 = (com.uptodown.tv.ui.fragment.TvOldVersionsFragment) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            l6.I r7 = l6.C3347b0.b()
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$e r2 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$e
            r2.<init>(r5)
            r0.f30986a = r6
            r0.f30989d = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            l6.J0 r7 = l6.C3347b0.c()
            com.uptodown.tv.ui.fragment.TvOldVersionsFragment$f r4 = new com.uptodown.tv.ui.fragment.TvOldVersionsFragment$f
            r4.<init>(r5)
            r0.f30986a = r5
            r0.f30989d = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r4, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.tv.ui.fragment.TvOldVersionsFragment.z(S5.d):java.lang.Object");
    }

    public final void G(int i8) {
        switch (i8) {
            case ComposerKt.providerKey /* 201 */:
                b bVar = this.f30983d;
                AbstractC3255y.f(bVar);
                b bVar2 = this.f30983d;
                AbstractC3255y.f(bVar2);
                bVar.notifyArrayItemRangeChanged(0, bVar2.size());
                return;
            case ComposerKt.compositionLocalMapKey /* 202 */:
            case ComposerKt.providerValuesKey /* 203 */:
                b bVar3 = this.f30983d;
                AbstractC3255y.f(bVar3);
                b bVar4 = this.f30983d;
                AbstractC3255y.f(bVar4);
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
                    parcelable4 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP, C1639f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                }
                this.f30981b = (C1639f) parcelable3;
            }
            if (extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C1641h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f30980a = (C1641h) parcelable;
                C3667g c3667g = new C3667g();
                Context requireContext = requireContext();
                AbstractC3255y.h(requireContext, "requireContext()");
                C1641h c1641h = this.f30980a;
                AbstractC3255y.f(c1641h);
                this.f30981b = c3667g.z(requireContext, c1641h.y0());
            }
        }
        if (this.f30981b != null) {
            C1639f c1639f = this.f30981b;
            AbstractC3255y.f(c1639f);
            this.f30983d = new b(new o(c1639f));
        } else if (this.f30980a != null) {
            C1641h c1641h2 = this.f30980a;
            AbstractC3255y.f(c1641h2);
            this.f30983d = new b(new o(c1641h2.y0()));
        }
        setAdapter(this.f30983d);
        setTitle(getString(R.string.rollback_title));
        if (bundle == null) {
            prepareEntranceTransition();
        }
        D();
    }

    @Override // androidx.leanback.app.BrandedSupportFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new g(null), 3, null);
    }
}
