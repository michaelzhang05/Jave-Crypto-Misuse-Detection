package com.uptodown.core.activities;

import H4.j;
import O5.I;
import P5.AbstractC1378t;
import Q4.r;
import a6.InterfaceC1668n;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.InterfaceC3390x0;
import l6.J0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public final class InstallerActivity extends I4.r {

    /* renamed from: q0, reason: collision with root package name */
    public static final a f30706q0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    private TextView f30707A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f30708B;

    /* renamed from: C, reason: collision with root package name */
    private ImageView f30709C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f30710D;

    /* renamed from: E, reason: collision with root package name */
    private String f30711E;

    /* renamed from: F, reason: collision with root package name */
    private ArrayList f30712F;

    /* renamed from: G, reason: collision with root package name */
    private File f30713G;

    /* renamed from: H, reason: collision with root package name */
    private String f30714H;

    /* renamed from: I, reason: collision with root package name */
    private Uri f30715I;

    /* renamed from: J, reason: collision with root package name */
    private Q4.w f30716J;

    /* renamed from: K, reason: collision with root package name */
    private String f30717K;

    /* renamed from: L, reason: collision with root package name */
    private AlertDialog f30718L;

    /* renamed from: M, reason: collision with root package name */
    private AlertDialog f30719M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f30720N;

    /* renamed from: O, reason: collision with root package name */
    private InterfaceC3390x0 f30721O;

    /* renamed from: P, reason: collision with root package name */
    private M4.h f30722P;

    /* renamed from: Q, reason: collision with root package name */
    private M4.m f30723Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f30724R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f30725S;

    /* renamed from: T, reason: collision with root package name */
    private String f30726T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f30727U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f30728V;

    /* renamed from: W, reason: collision with root package name */
    private final BroadcastReceiver f30729W = new t();

    /* renamed from: X, reason: collision with root package name */
    private final n f30730X = new n();

    /* renamed from: Y, reason: collision with root package name */
    private final c f30731Y = new c();

    /* renamed from: Z, reason: collision with root package name */
    private final s f30732Z = new s();

    /* renamed from: o, reason: collision with root package name */
    private ProgressBar f30733o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f30734p;

    /* renamed from: p0, reason: collision with root package name */
    private final ActivityResultLauncher f30735p0;

    /* renamed from: q, reason: collision with root package name */
    private TextView f30736q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f30737r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f30738s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f30739t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f30740u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f30741v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f30742w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f30743x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f30744y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f30745z;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f30746a;

        /* renamed from: b, reason: collision with root package name */
        private String f30747b;

        /* renamed from: c, reason: collision with root package name */
        private File f30748c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f30749d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f30750e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private ArrayList f30751f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f30752g = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f30754a = new a();

            a() {
                super(2);
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(N4.d o12, N4.d o22) {
                AbstractC3255y.i(o12, "o1");
                AbstractC3255y.i(o22, "o2");
                return Integer.valueOf(Boolean.compare(!o12.a(), !o22.a()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.InstallerActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0704b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0704b f30755a = new C0704b();

            C0704b() {
                super(2);
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(N4.d o12, N4.d o22) {
                AbstractC3255y.i(o12, "o1");
                AbstractC3255y.i(o22, "o2");
                return Integer.valueOf(Boolean.compare(!o12.a(), !o22.a()));
            }
        }

        public b() {
        }

        private final void o() {
            AbstractC1378t.B(this.f30749d, new Comparator() { // from class: I4.C0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p8;
                    p8 = InstallerActivity.b.p((N4.d) obj, (N4.d) obj2);
                    return p8;
                }
            });
            AbstractC1378t.B(this.f30749d, new Comparator() { // from class: I4.D0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int q8;
                    q8 = InstallerActivity.b.q((N4.d) obj, (N4.d) obj2);
                    return q8;
                }
            });
            AbstractC1378t.B(this.f30750e, new Comparator() { // from class: I4.E0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int r8;
                    r8 = InstallerActivity.b.r((N4.d) obj, (N4.d) obj2);
                    return r8;
                }
            });
            ArrayList arrayList = this.f30750e;
            final a aVar = a.f30754a;
            AbstractC1378t.B(arrayList, new Comparator() { // from class: I4.F0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int s8;
                    s8 = InstallerActivity.b.s(InterfaceC1668n.this, obj, obj2);
                    return s8;
                }
            });
            AbstractC1378t.B(this.f30751f, new Comparator() { // from class: I4.G0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int t8;
                    t8 = InstallerActivity.b.t((N4.d) obj, (N4.d) obj2);
                    return t8;
                }
            });
            ArrayList arrayList2 = this.f30751f;
            final C0704b c0704b = C0704b.f30755a;
            AbstractC1378t.B(arrayList2, new Comparator() { // from class: I4.H0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int u8;
                    u8 = InstallerActivity.b.u(InterfaceC1668n.this, obj, obj2);
                    return u8;
                }
            });
            AbstractC1378t.B(this.f30752g, new Comparator() { // from class: I4.I0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int v8;
                    v8 = InstallerActivity.b.v((N4.d) obj, (N4.d) obj2);
                    return v8;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int p(N4.d o12, N4.d o22) {
            AbstractC3255y.i(o12, "o1");
            AbstractC3255y.i(o22, "o2");
            if (o12.d() == null) {
                return 1;
            }
            if (o22.d() == null) {
                return -1;
            }
            File d8 = o12.d();
            AbstractC3255y.f(d8);
            String name = d8.getName();
            AbstractC3255y.h(name, "o1.file!!.name");
            File d9 = o22.d();
            AbstractC3255y.f(d9);
            String name2 = d9.getName();
            AbstractC3255y.h(name2, "o2.file!!.name");
            return j6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int q(N4.d o12, N4.d o22) {
            AbstractC3255y.i(o12, "o1");
            AbstractC3255y.i(o22, "o2");
            if (o12.d() == null) {
                return 1;
            }
            if (o22.d() == null) {
                return -1;
            }
            return Boolean.compare(!o12.a(), !o22.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int r(N4.d d12, N4.d d22) {
            AbstractC3255y.i(d12, "d1");
            AbstractC3255y.i(d22, "d2");
            if (d12.d() == null) {
                return 1;
            }
            if (d22.d() == null) {
                return -1;
            }
            File d8 = d12.d();
            AbstractC3255y.f(d8);
            String name = d8.getName();
            AbstractC3255y.h(name, "d1.file!!.name");
            File d9 = d22.d();
            AbstractC3255y.f(d9);
            String name2 = d9.getName();
            AbstractC3255y.h(name2, "d2.file!!.name");
            return j6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int s(InterfaceC1668n tmp0, Object obj, Object obj2) {
            AbstractC3255y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int t(N4.d d12, N4.d d22) {
            AbstractC3255y.i(d12, "d1");
            AbstractC3255y.i(d22, "d2");
            if (d12.d() == null) {
                return 1;
            }
            if (d22.d() == null) {
                return -1;
            }
            File d8 = d12.d();
            AbstractC3255y.f(d8);
            String name = d8.getName();
            AbstractC3255y.h(name, "d1.file!!.name");
            File d9 = d22.d();
            AbstractC3255y.f(d9);
            String name2 = d9.getName();
            AbstractC3255y.h(name2, "d2.file!!.name");
            return j6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int u(InterfaceC1668n tmp0, Object obj, Object obj2) {
            AbstractC3255y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int v(N4.d f12, N4.d f22) {
            AbstractC3255y.i(f12, "f1");
            AbstractC3255y.i(f22, "f2");
            if (f12.d() == null) {
                return 1;
            }
            if (f22.d() == null) {
                return -1;
            }
            File d8 = f12.d();
            AbstractC3255y.f(d8);
            String name = d8.getName();
            AbstractC3255y.h(name, "f1.file!!.name");
            File d9 = f22.d();
            AbstractC3255y.f(d9);
            String name2 = d9.getName();
            AbstractC3255y.h(name2, "f2.file!!.name");
            return j6.n.m(name, name2, true);
        }

        private final void x() {
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            AbstractC3255y.h(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            boolean z8 = false;
            for (String str : SUPPORTED_ABIS) {
                Iterator it = this.f30749d.iterator();
                while (it.hasNext()) {
                    N4.d dVar = (N4.d) it.next();
                    if (dVar.e() != null) {
                        String e8 = dVar.e();
                        AbstractC3255y.f(e8);
                        if (j6.n.s(str, new j6.j("_").f(e8, "-"), true)) {
                            if (!z8) {
                                dVar.f(true);
                                z8 = true;
                            }
                            dVar.g(true);
                        }
                    }
                }
            }
        }

        public final ArrayList h() {
            return this.f30749d;
        }

        public final File i() {
            return this.f30748c;
        }

        public final ArrayList j() {
            return this.f30750e;
        }

        public final ArrayList k() {
            return this.f30752g;
        }

        public final ArrayList l() {
            return this.f30751f;
        }

        public final String m() {
            return this.f30746a;
        }

        public final String n() {
            return this.f30747b;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0196. Please report as an issue. */
        public final void w(ArrayList files) {
            AbstractC3255y.i(files, "files");
            String string = InstallerActivity.this.getString(H4.h.f3756E);
            AbstractC3255y.h(string, "getString(R.string.dpi_device)");
            this.f30749d = new ArrayList();
            this.f30750e = new ArrayList();
            this.f30751f = new ArrayList();
            this.f30752g = new ArrayList();
            String E12 = InstallerActivity.this.E1();
            PackageManager pm = InstallerActivity.this.getPackageManager();
            Iterator it = files.iterator();
            while (true) {
                int i8 = 0;
                if (it.hasNext()) {
                    File file = (File) it.next();
                    AbstractC3255y.h(pm, "pm");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3255y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = Q4.q.c(pm, absolutePath, 128);
                    if (c8 != null && this.f30748c == null) {
                        try {
                            if (c8.applicationInfo != null) {
                                this.f30746a = c8.packageName;
                                this.f30747b = c8.versionName + '(' + new Q4.f().m(c8) + ')';
                                if (new Q4.e().k(c8)) {
                                    this.f30748c = file;
                                } else {
                                    String f8 = new Q4.a().f(file.getAbsolutePath());
                                    if (f8 != null && j6.n.H(f8, "name=\"com.android.vending.splits\"", false, 2, null)) {
                                        this.f30748c = file;
                                    } else {
                                        N4.d dVar = new N4.d();
                                        dVar.i(file);
                                        dVar.j(file.getName());
                                        dVar.h(file.getName());
                                        dVar.f(true);
                                        dVar.g(true);
                                        this.f30752g.add(dVar);
                                    }
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    } else {
                        String f9 = new Q4.a().f(file.getAbsolutePath());
                        if (f9 != null) {
                            if (j6.n.H(f9, "isFeatureSplit=\"resourceID 0xffffffff\"", false, 2, null)) {
                                N4.d dVar2 = new N4.d();
                                dVar2.i(file);
                                dVar2.j("");
                                dVar2.h(file.getName());
                                dVar2.f(true);
                                dVar2.g(true);
                                this.f30752g.add(dVar2);
                            } else if (j6.n.H(f9, "configForSplit=", false, 2, null) && !j6.n.H(f9, "configForSplit=\"\"", false, 2, null)) {
                                String name = file.getName();
                                AbstractC3255y.h(name, "file.name");
                                N4.d dVar3 = new N4.d();
                                dVar3.i(file);
                                dVar3.j(name);
                                dVar3.h(file.getName());
                                dVar3.f(true);
                                dVar3.g(true);
                                this.f30752g.add(dVar3);
                            } else if (j6.n.H(f9, "split=\"config.", false, 2, null)) {
                                String substring = f9.substring(j6.n.S(f9, "split=\"config.", 0, false, 6, null) + 14);
                                AbstractC3255y.h(substring, "this as java.lang.String).substring(startIndex)");
                                String substring2 = substring.substring(0, j6.n.S(substring, "\"", 0, false, 6, null));
                                AbstractC3255y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                switch (substring2.hashCode()) {
                                    case -1619189395:
                                        if (!substring2.equals("xxxhdpi")) {
                                            N4.d dVar4 = new N4.d();
                                            try {
                                                Locale build = new Locale.Builder().setLanguage(substring2).build();
                                                dVar4.h(build.getDisplayLanguage(build));
                                            } catch (Exception e9) {
                                                e9.printStackTrace();
                                            }
                                            dVar4.i(file);
                                            dVar4.j(substring2);
                                            dVar4.f(j6.n.s(substring2, E12, true));
                                            dVar4.g(true);
                                            this.f30751f.add(dVar4);
                                            break;
                                        } else {
                                            N4.d dVar5 = new N4.d();
                                            dVar5.i(file);
                                            dVar5.j(substring2);
                                            dVar5.h(substring2);
                                            dVar5.f(j6.n.s(substring2, string, true));
                                            dVar5.g(true);
                                            this.f30750e.add(dVar5);
                                            break;
                                        }
                                    case -1073971299:
                                        if (substring2.equals("mips64")) {
                                            N4.d dVar6 = new N4.d();
                                            dVar6.i(file);
                                            dVar6.j(substring2);
                                            dVar6.h(substring2);
                                            this.f30749d.add(dVar6);
                                            break;
                                        } else {
                                            N4.d dVar42 = new N4.d();
                                            Locale build2 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42.h(build2.getDisplayLanguage(build2));
                                            dVar42.i(file);
                                            dVar42.j(substring2);
                                            dVar42.f(j6.n.s(substring2, E12, true));
                                            dVar42.g(true);
                                            this.f30751f.add(dVar42);
                                            break;
                                        }
                                    case -806050265:
                                        if (substring2.equals("x86_64")) {
                                            N4.d dVar62 = new N4.d();
                                            dVar62.i(file);
                                            dVar62.j(substring2);
                                            dVar62.h(substring2);
                                            this.f30749d.add(dVar62);
                                            break;
                                        } else {
                                            N4.d dVar422 = new N4.d();
                                            Locale build22 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422.h(build22.getDisplayLanguage(build22));
                                            dVar422.i(file);
                                            dVar422.j(substring2);
                                            dVar422.f(j6.n.s(substring2, E12, true));
                                            dVar422.g(true);
                                            this.f30751f.add(dVar422);
                                            break;
                                        }
                                    case -745448715:
                                        if (!substring2.equals("xxhdpi")) {
                                            N4.d dVar4222 = new N4.d();
                                            Locale build222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222.h(build222.getDisplayLanguage(build222));
                                            dVar4222.i(file);
                                            dVar4222.j(substring2);
                                            dVar4222.f(j6.n.s(substring2, E12, true));
                                            dVar4222.g(true);
                                            this.f30751f.add(dVar4222);
                                            break;
                                        } else {
                                            N4.d dVar52 = new N4.d();
                                            dVar52.i(file);
                                            dVar52.j(substring2);
                                            dVar52.h(substring2);
                                            dVar52.f(j6.n.s(substring2, string, true));
                                            dVar52.g(true);
                                            this.f30750e.add(dVar52);
                                            break;
                                        }
                                    case -738963905:
                                        if (substring2.equals("armeabi")) {
                                            N4.d dVar622 = new N4.d();
                                            dVar622.i(file);
                                            dVar622.j(substring2);
                                            dVar622.h(substring2);
                                            this.f30749d.add(dVar622);
                                            break;
                                        } else {
                                            N4.d dVar42222 = new N4.d();
                                            Locale build2222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222.h(build2222.getDisplayLanguage(build2222));
                                            dVar42222.i(file);
                                            dVar42222.j(substring2);
                                            dVar42222.f(j6.n.s(substring2, E12, true));
                                            dVar42222.g(true);
                                            this.f30751f.add(dVar42222);
                                            break;
                                        }
                                    case 117110:
                                        if (substring2.equals("x86")) {
                                            N4.d dVar6222 = new N4.d();
                                            dVar6222.i(file);
                                            dVar6222.j(substring2);
                                            dVar6222.h(substring2);
                                            this.f30749d.add(dVar6222);
                                            break;
                                        } else {
                                            N4.d dVar422222 = new N4.d();
                                            Locale build22222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422222.h(build22222.getDisplayLanguage(build22222));
                                            dVar422222.i(file);
                                            dVar422222.j(substring2);
                                            dVar422222.f(j6.n.s(substring2, E12, true));
                                            dVar422222.g(true);
                                            this.f30751f.add(dVar422222);
                                            break;
                                        }
                                    case 3197941:
                                        if (!substring2.equals("hdpi")) {
                                            N4.d dVar4222222 = new N4.d();
                                            Locale build222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222222.h(build222222.getDisplayLanguage(build222222));
                                            dVar4222222.i(file);
                                            dVar4222222.j(substring2);
                                            dVar4222222.f(j6.n.s(substring2, E12, true));
                                            dVar4222222.g(true);
                                            this.f30751f.add(dVar4222222);
                                            break;
                                        } else {
                                            N4.d dVar522 = new N4.d();
                                            dVar522.i(file);
                                            dVar522.j(substring2);
                                            dVar522.h(substring2);
                                            dVar522.f(j6.n.s(substring2, string, true));
                                            dVar522.g(true);
                                            this.f30750e.add(dVar522);
                                            break;
                                        }
                                    case 3317105:
                                        if (!substring2.equals("ldpi")) {
                                            N4.d dVar42222222 = new N4.d();
                                            Locale build2222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222222.h(build2222222.getDisplayLanguage(build2222222));
                                            dVar42222222.i(file);
                                            dVar42222222.j(substring2);
                                            dVar42222222.f(j6.n.s(substring2, E12, true));
                                            dVar42222222.g(true);
                                            this.f30751f.add(dVar42222222);
                                            break;
                                        } else {
                                            N4.d dVar5222 = new N4.d();
                                            dVar5222.i(file);
                                            dVar5222.j(substring2);
                                            dVar5222.h(substring2);
                                            dVar5222.f(j6.n.s(substring2, string, true));
                                            dVar5222.g(true);
                                            this.f30750e.add(dVar5222);
                                            break;
                                        }
                                    case 3346896:
                                        if (!substring2.equals("mdpi")) {
                                            N4.d dVar422222222 = new N4.d();
                                            Locale build22222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422222222.h(build22222222.getDisplayLanguage(build22222222));
                                            dVar422222222.i(file);
                                            dVar422222222.j(substring2);
                                            dVar422222222.f(j6.n.s(substring2, E12, true));
                                            dVar422222222.g(true);
                                            this.f30751f.add(dVar422222222);
                                            break;
                                        } else {
                                            N4.d dVar52222 = new N4.d();
                                            dVar52222.i(file);
                                            dVar52222.j(substring2);
                                            dVar52222.h(substring2);
                                            dVar52222.f(j6.n.s(substring2, string, true));
                                            dVar52222.g(true);
                                            this.f30750e.add(dVar52222);
                                            break;
                                        }
                                    case 3351711:
                                        if (substring2.equals("mips")) {
                                            N4.d dVar62222 = new N4.d();
                                            dVar62222.i(file);
                                            dVar62222.j(substring2);
                                            dVar62222.h(substring2);
                                            this.f30749d.add(dVar62222);
                                            break;
                                        } else {
                                            N4.d dVar4222222222 = new N4.d();
                                            Locale build222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222222222.h(build222222222.getDisplayLanguage(build222222222));
                                            dVar4222222222.i(file);
                                            dVar4222222222.j(substring2);
                                            dVar4222222222.f(j6.n.s(substring2, E12, true));
                                            dVar4222222222.g(true);
                                            this.f30751f.add(dVar4222222222);
                                            break;
                                        }
                                    case 110743451:
                                        if (!substring2.equals("tvdpi")) {
                                            N4.d dVar42222222222 = new N4.d();
                                            Locale build2222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222222222.h(build2222222222.getDisplayLanguage(build2222222222));
                                            dVar42222222222.i(file);
                                            dVar42222222222.j(substring2);
                                            dVar42222222222.f(j6.n.s(substring2, E12, true));
                                            dVar42222222222.g(true);
                                            this.f30751f.add(dVar42222222222);
                                            break;
                                        } else {
                                            N4.d dVar522222 = new N4.d();
                                            dVar522222.i(file);
                                            dVar522222.j(substring2);
                                            dVar522222.h(substring2);
                                            dVar522222.f(j6.n.s(substring2, string, true));
                                            dVar522222.g(true);
                                            this.f30750e.add(dVar522222);
                                            break;
                                        }
                                    case 114020461:
                                        if (!substring2.equals("xhdpi")) {
                                            N4.d dVar422222222222 = new N4.d();
                                            Locale build22222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar422222222222.h(build22222222222.getDisplayLanguage(build22222222222));
                                            dVar422222222222.i(file);
                                            dVar422222222222.j(substring2);
                                            dVar422222222222.f(j6.n.s(substring2, E12, true));
                                            dVar422222222222.g(true);
                                            this.f30751f.add(dVar422222222222);
                                            break;
                                        } else {
                                            N4.d dVar5222222 = new N4.d();
                                            dVar5222222.i(file);
                                            dVar5222222.j(substring2);
                                            dVar5222222.h(substring2);
                                            dVar5222222.f(j6.n.s(substring2, string, true));
                                            dVar5222222.g(true);
                                            this.f30750e.add(dVar5222222);
                                            break;
                                        }
                                    case 146933760:
                                        if (substring2.equals("armeabi_v7a")) {
                                            N4.d dVar622222 = new N4.d();
                                            dVar622222.i(file);
                                            dVar622222.j(substring2);
                                            dVar622222.h(substring2);
                                            this.f30749d.add(dVar622222);
                                            break;
                                        } else {
                                            N4.d dVar4222222222222 = new N4.d();
                                            Locale build222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar4222222222222.h(build222222222222.getDisplayLanguage(build222222222222));
                                            dVar4222222222222.i(file);
                                            dVar4222222222222.j(substring2);
                                            dVar4222222222222.f(j6.n.s(substring2, E12, true));
                                            dVar4222222222222.g(true);
                                            this.f30751f.add(dVar4222222222222);
                                            break;
                                        }
                                    case 1433054842:
                                        if (substring2.equals("arm64_v8a")) {
                                            N4.d dVar6222222 = new N4.d();
                                            dVar6222222.i(file);
                                            dVar6222222.j(substring2);
                                            dVar6222222.h(substring2);
                                            this.f30749d.add(dVar6222222);
                                            break;
                                        } else {
                                            N4.d dVar42222222222222 = new N4.d();
                                            Locale build2222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            dVar42222222222222.h(build2222222222222.getDisplayLanguage(build2222222222222));
                                            dVar42222222222222.i(file);
                                            dVar42222222222222.j(substring2);
                                            dVar42222222222222.f(j6.n.s(substring2, E12, true));
                                            dVar42222222222222.g(true);
                                            this.f30751f.add(dVar42222222222222);
                                            break;
                                        }
                                    default:
                                        N4.d dVar422222222222222 = new N4.d();
                                        Locale build22222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                        dVar422222222222222.h(build22222222222222.getDisplayLanguage(build22222222222222));
                                        dVar422222222222222.i(file);
                                        dVar422222222222222.j(substring2);
                                        dVar422222222222222.f(j6.n.s(substring2, E12, true));
                                        dVar422222222222222.g(true);
                                        this.f30751f.add(dVar422222222222222);
                                        break;
                                }
                            } else {
                                String name2 = file.getName();
                                AbstractC3255y.h(name2, "file.name");
                                N4.d dVar7 = new N4.d();
                                dVar7.i(file);
                                dVar7.j(name2);
                                dVar7.h(file.getName());
                                dVar7.f(true);
                                dVar7.g(true);
                                this.f30752g.add(dVar7);
                            }
                        }
                    }
                } else {
                    if (this.f30748c == null) {
                        Iterator it2 = this.f30752g.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int i9 = i8 + 1;
                                N4.d dVar8 = (N4.d) it2.next();
                                File d8 = dVar8.d();
                                AbstractC3255y.f(d8);
                                if (d8.getName().equals("base.apk")) {
                                    this.f30748c = dVar8.d();
                                } else {
                                    i8 = i9;
                                }
                            } else {
                                i8 = -1;
                            }
                        }
                        if (i8 >= 0) {
                            this.f30752g.remove(i8);
                        }
                    }
                    x();
                    o();
                    return;
                }
            }
        }

        public final ArrayList y() {
            ArrayList arrayList = new ArrayList();
            File file = this.f30748c;
            if (file != null) {
                AbstractC3255y.f(file);
                arrayList.add(file);
            }
            Iterator it = this.f30749d.iterator();
            while (it.hasNext()) {
                N4.d dVar = (N4.d) it.next();
                if (dVar.a()) {
                    File d8 = dVar.d();
                    AbstractC3255y.f(d8);
                    arrayList.add(d8);
                }
            }
            Iterator it2 = this.f30750e.iterator();
            while (it2.hasNext()) {
                N4.d dVar2 = (N4.d) it2.next();
                if (dVar2.a()) {
                    File d9 = dVar2.d();
                    AbstractC3255y.f(d9);
                    arrayList.add(d9);
                }
            }
            Iterator it3 = this.f30751f.iterator();
            while (it3.hasNext()) {
                N4.d dVar3 = (N4.d) it3.next();
                if (dVar3.a()) {
                    File d10 = dVar3.d();
                    AbstractC3255y.f(d10);
                    arrayList.add(d10);
                }
            }
            Iterator it4 = this.f30752g.iterator();
            while (it4.hasNext()) {
                N4.d dVar4 = (N4.d) it4.next();
                if (dVar4.a()) {
                    File d11 = dVar4.d();
                    AbstractC3255y.f(d11);
                    arrayList.add(d11);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements M4.a {
        c() {
        }

        @Override // M4.a
        public void a(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.f2();
        }

        @Override // M4.a
        public void b(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.finish();
        }

        @Override // M4.a
        public void c(String filename, String str) {
            AbstractC3255y.i(filename, "filename");
            if (str != null) {
                InstallerActivity.this.e2(str);
                return;
            }
            InstallerActivity installerActivity = InstallerActivity.this;
            String string = installerActivity.getString(H4.h.f3761J);
            AbstractC3255y.h(string, "getString(R.string.error_unknown)");
            installerActivity.e2(string);
        }

        @Override // M4.a
        public void d(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.e2(filename + " could not be parsed.");
        }

        @Override // M4.a
        public void e(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.e2("invalid version code");
        }

        @Override // M4.a
        public void f(String str) {
            InstallerActivity.this.e2("error: not system permissions");
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements M4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30757a;

        d(b bVar) {
            this.f30757a = bVar;
        }

        @Override // M4.l
        public void a(View view, int i8) {
            ((N4.d) this.f30757a.h().get(i8)).f(!((N4.d) this.f30757a.h().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements M4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30758a;

        e(b bVar) {
            this.f30758a = bVar;
        }

        @Override // M4.l
        public void a(View view, int i8) {
            ((N4.d) this.f30758a.j().get(i8)).f(!((N4.d) this.f30758a.j().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements M4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30759a;

        f(b bVar) {
            this.f30759a = bVar;
        }

        @Override // M4.l
        public void a(View view, int i8) {
            ((N4.d) this.f30759a.k().get(i8)).f(!((N4.d) this.f30759a.k().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class g implements M4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30760a;

        g(b bVar) {
            this.f30760a = bVar;
        }

        @Override // M4.l
        public void a(View view, int i8) {
            ((N4.d) this.f30760a.l().get(i8)).f(!((N4.d) this.f30760a.l().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class h implements M4.h {
        h() {
        }

        @Override // M4.h
        public void a() {
            IntentFilter intentFilter = new IntentFilter("com.uptodown.core.custom_action_installation_status");
            InstallerActivity installerActivity = InstallerActivity.this;
            ContextCompat.registerReceiver(installerActivity, installerActivity.f30729W, intentFilter, 2);
            InstallerActivity.this.f2();
        }

        @Override // M4.h
        public void b(String str) {
            InstallerActivity.this.Q1(str);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i implements M4.m {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InstallerActivity this$0, View view) {
            AbstractC3255y.i(this$0, "this$0");
            this$0.finish();
        }

        @Override // M4.m
        public void a(File fileZipped, ArrayList files) {
            AbstractC3255y.i(fileZipped, "fileZipped");
            AbstractC3255y.i(files, "files");
            if (new J4.a(InstallerActivity.this).r()) {
                InstallerActivity.this.B1(fileZipped, files);
                return;
            }
            b bVar = new b();
            bVar.w(files);
            ArrayList y8 = bVar.y();
            InstallerActivity installerActivity = InstallerActivity.this;
            installerActivity.O1(installerActivity, y8);
        }

        @Override // M4.m
        public void b(File file) {
            AbstractC3255y.i(file, "file");
            InstallerActivity installerActivity = InstallerActivity.this;
            installerActivity.N1(installerActivity, file);
        }

        @Override // M4.m
        public void c(int i8) {
            ProgressBar progressBar = InstallerActivity.this.f30733o;
            if (progressBar != null) {
                progressBar.setProgress(i8);
            }
            TextView textView = InstallerActivity.this.f30734p;
            if (textView != null) {
                Y y8 = Y.f34167a;
                String format = String.format("%s%%", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3255y.h(format, "format(format, *args)");
                textView.setText(format);
            }
        }

        @Override // M4.m
        public void d(File file) {
            if (file != null) {
                Q4.f fVar = new Q4.f();
                InstallerActivity installerActivity = InstallerActivity.this;
                String absolutePath = file.getAbsolutePath();
                AbstractC3255y.h(absolutePath, "file.absolutePath");
                Drawable h8 = fVar.h(installerActivity, absolutePath);
                ImageView imageView = InstallerActivity.this.f30709C;
                AbstractC3255y.f(imageView);
                imageView.setImageDrawable(h8);
                InstallerActivity.this.f30713G = file;
            }
        }

        @Override // M4.m
        public void e(File file) {
            if (InstallerActivity.this.f30712F == null) {
                InstallerActivity.this.f30712F = new ArrayList();
            }
            ArrayList arrayList = InstallerActivity.this.f30712F;
            AbstractC3255y.f(arrayList);
            arrayList.add(file);
            c(0);
            TextView textView = InstallerActivity.this.f30745z;
            if (textView != null) {
                textView.setText(H4.h.f3815s0);
            }
        }

        @Override // M4.m
        public void f() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f30745z;
            if (textView != null) {
                textView.setText(H4.h.f3759H);
            }
        }

        @Override // M4.m
        public void g() {
            c(0);
            TextView textView = InstallerActivity.this.f30745z;
            if (textView != null) {
                textView.setText(H4.h.f3813r0);
            }
        }

        @Override // M4.m
        public void h() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f30736q;
            if (textView != null) {
                InstallerActivity installerActivity = InstallerActivity.this;
                textView.setText(installerActivity.getString(H4.h.f3820x, installerActivity.getString(H4.h.f3782c)));
            }
            TextView textView2 = InstallerActivity.this.f30736q;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = InstallerActivity.this.f30708B;
            if (textView3 != null) {
                final InstallerActivity installerActivity2 = InstallerActivity.this;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.J0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.i.l(InstallerActivity.this, view);
                    }
                });
            }
        }

        @Override // M4.m
        public void i() {
            TextView textView = InstallerActivity.this.f30745z;
            if (textView != null) {
                textView.setText(H4.h.f3762K);
            }
        }

        @Override // M4.m
        public void j() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f30736q;
            if (textView != null) {
                InstallerActivity installerActivity = InstallerActivity.this;
                textView.setText(installerActivity.getString(H4.h.f3777Z, installerActivity.getString(H4.h.f3782c)));
            }
            InstallerActivity.this.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30763a;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30763a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                this.f30763a = 1;
                if (installerActivity.Y1(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30765a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f30767c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30768d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Uri uri, String str, S5.d dVar) {
            super(2, dVar);
            this.f30767c = uri;
            this.f30768d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new k(this.f30767c, this.f30768d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30765a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                Uri uri = this.f30767c;
                String str = this.f30768d;
                this.f30765a = 1;
                if (installerActivity.c2(uri, str, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30769a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, S5.d dVar) {
            super(2, dVar);
            this.f30771c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new l(this.f30771c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30769a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                String str = this.f30771c;
                this.f30769a = 1;
                if (installerActivity.l2(str, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30772a;

        /* renamed from: b, reason: collision with root package name */
        int f30773b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30775a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30776b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f30777c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, Q q8, S5.d dVar) {
                super(2, dVar);
                this.f30776b = installerActivity;
                this.f30777c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30776b, this.f30777c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30775a == 0) {
                    O5.t.b(obj);
                    TextView textView = this.f30776b.f30736q;
                    if (textView != null) {
                        ArrayList arrayList = this.f30776b.f30720N;
                        AbstractC3255y.f(arrayList);
                        textView.setText((CharSequence) arrayList.get(this.f30777c.f34160a));
                    }
                    TextView textView2 = this.f30776b.f30736q;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        m(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: Exception -> 0x0012, LOOP:0: B:10:0x0049->B:12:0x004d, LOOP_END, TryCatch #0 {Exception -> 0x0012, blocks: (B:6:0x000d, B:8:0x007b, B:9:0x002f, B:10:0x0049, B:12:0x004d, B:14:0x0063, B:23:0x001f), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[EDGE_INSN: B:13:0x0063->B:14:0x0063 BREAK  A[LOOP:0: B:10:0x0049->B:12:0x004d], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:8:0x007b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r7.f30773b
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                int r1 = r7.f30772a
                O5.t.b(r8)     // Catch: java.lang.Exception -> L12
                r8 = r1
                goto L7b
            L12:
                r8 = move-exception
                goto L81
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                O5.t.b(r8)
                com.uptodown.core.activities.InstallerActivity r8 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r8 = com.uptodown.core.activities.InstallerActivity.T0(r8)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3255y.f(r8)     // Catch: java.lang.Exception -> L12
                int r8 = r8.size()     // Catch: java.lang.Exception -> L12
                if (r8 <= 0) goto L84
                r8 = -1
            L2f:
                kotlin.jvm.internal.Q r1 = new kotlin.jvm.internal.Q     // Catch: java.lang.Exception -> L12
                r1.<init>()     // Catch: java.lang.Exception -> L12
                e6.c$a r3 = e6.AbstractC2806c.f31797a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r4 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r4 = com.uptodown.core.activities.InstallerActivity.T0(r4)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3255y.f(r4)     // Catch: java.lang.Exception -> L12
                int r4 = r4.size()     // Catch: java.lang.Exception -> L12
                int r3 = r3.c(r4)     // Catch: java.lang.Exception -> L12
                r1.f34160a = r3     // Catch: java.lang.Exception -> L12
            L49:
                int r3 = r1.f34160a     // Catch: java.lang.Exception -> L12
                if (r3 != r8) goto L63
                e6.c$a r3 = e6.AbstractC2806c.f31797a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r4 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r4 = com.uptodown.core.activities.InstallerActivity.T0(r4)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3255y.f(r4)     // Catch: java.lang.Exception -> L12
                int r4 = r4.size()     // Catch: java.lang.Exception -> L12
                int r3 = r3.c(r4)     // Catch: java.lang.Exception -> L12
                r1.f34160a = r3     // Catch: java.lang.Exception -> L12
                goto L49
            L63:
                l6.J0 r8 = l6.C3347b0.c()     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity$m$a r4 = new com.uptodown.core.activities.InstallerActivity$m$a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r5 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                r6 = 0
                r4.<init>(r5, r1, r6)     // Catch: java.lang.Exception -> L12
                r7.f30772a = r3     // Catch: java.lang.Exception -> L12
                r7.f30773b = r2     // Catch: java.lang.Exception -> L12
                java.lang.Object r8 = l6.AbstractC3360i.g(r8, r4, r7)     // Catch: java.lang.Exception -> L12
                if (r8 != r0) goto L7a
                return r0
            L7a:
                r8 = r3
            L7b:
                r3 = 7000(0x1b58, double:3.4585E-320)
                java.lang.Thread.sleep(r3)     // Catch: java.lang.Exception -> L12
                goto L2f
            L81:
                r8.printStackTrace()
            L84:
                O5.I r8 = O5.I.f8278a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class n extends OnBackPressedCallback {
        n() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            InstallerActivity.this.t1();
        }
    }

    /* loaded from: classes5.dex */
    static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30779a;

        o(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30779a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                this.f30779a = 1;
                if (installerActivity.k2(2, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30781a;

        /* renamed from: b, reason: collision with root package name */
        Object f30782b;

        /* renamed from: c, reason: collision with root package name */
        Object f30783c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30784d;

        /* renamed from: f, reason: collision with root package name */
        int f30786f;

        p(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30784d = obj;
            this.f30786f |= Integer.MIN_VALUE;
            return InstallerActivity.this.c2(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30787a;

        q(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new q(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30787a == 0) {
                O5.t.b(obj);
                TextView textView = InstallerActivity.this.f30745z;
                if (textView != null) {
                    textView.setText(H4.h.f3811q0);
                }
                ProgressBar progressBar = InstallerActivity.this.f30733o;
                if (progressBar != null) {
                    progressBar.setIndeterminate(true);
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30790b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallerActivity f30791c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f30792d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30793a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30794b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f30795c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, T t8, S5.d dVar) {
                super(2, dVar);
                this.f30794b = installerActivity;
                this.f30795c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30794b, this.f30795c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30793a == 0) {
                    O5.t.b(obj);
                    ProgressBar progressBar = this.f30794b.f30733o;
                    if (progressBar != null) {
                        progressBar.setIndeterminate(false);
                    }
                    TextView textView = this.f30794b.f30745z;
                    if (textView != null) {
                        textView.setText("");
                    }
                    TextView textView2 = this.f30794b.f30708B;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = this.f30794b.f30707A;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    if (this.f30795c.f34162a != null) {
                        TextView textView4 = this.f30794b.f30745z;
                        if (textView4 != null) {
                            textView4.setText((CharSequence) this.f30795c.f34162a);
                        }
                    } else {
                        InstallerActivity installerActivity = this.f30794b;
                        Intent intent = new Intent();
                        intent.putExtra("realPath", this.f30794b.f30714H);
                        I i8 = I.f8278a;
                        installerActivity.setResult(10, intent);
                        this.f30794b.finish();
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, InstallerActivity installerActivity, Uri uri, S5.d dVar) {
            super(2, dVar);
            this.f30790b = str;
            this.f30791c = installerActivity;
            this.f30792d = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new r(this.f30790b, this.f30791c, this.f30792d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00dd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r14.f30789a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                O5.t.b(r15)
                goto Lde
            L10:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L18:
                O5.t.b(r15)
                kotlin.jvm.internal.T r15 = new kotlin.jvm.internal.T
                r15.<init>()
                Q4.f r1 = new Q4.f
                r1.<init>()
                java.lang.String r3 = r14.f30790b
                boolean r1 = r1.o(r3)
                r3 = 0
                if (r1 == 0) goto Lca
                com.uptodown.core.activities.InstallerActivity r1 = r14.f30791c     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                android.net.Uri r4 = r14.f30792d     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                java.io.InputStream r1 = r1.openInputStream(r4)     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                goto L5b
            L3b:
                r1 = move-exception
                goto L3f
            L3d:
                r1 = move-exception
                goto L4d
            L3f:
                r1.printStackTrace()
                com.uptodown.core.activities.InstallerActivity r1 = r14.f30791c
                int r4 = H4.h.f3785d0
                java.lang.String r1 = r1.getString(r4)
                r15.f34162a = r1
                goto L5a
            L4d:
                r1.printStackTrace()
                com.uptodown.core.activities.InstallerActivity r1 = r14.f30791c
                int r4 = H4.h.f3763L
                java.lang.String r1 = r1.getString(r4)
                r15.f34162a = r1
            L5a:
                r1 = r3
            L5b:
                if (r1 == 0) goto Lca
                r4 = 8192(0x2000, float:1.148E-41)
                byte[] r5 = new byte[r4]
                kotlin.jvm.internal.Q r6 = new kotlin.jvm.internal.Q
                r6.<init>()
                Q4.f r7 = new Q4.f
                r7.<init>()
                com.uptodown.core.activities.InstallerActivity r8 = r14.f30791c
                java.io.File r7 = r7.g(r8)
                long r8 = r7.getUsableSpace()
                int r10 = r1.available()
                double r10 = (double) r10
                r12 = 4608308318706860032(0x3ff4000000000000, double:1.25)
                double r10 = r10 * r12
                double r8 = (double) r8
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto Lbd
                java.io.File r8 = new java.io.File
                java.lang.String r9 = r14.f30790b
                r8.<init>(r7, r9)
                java.io.FileOutputStream r7 = new java.io.FileOutputStream
                r7.<init>(r8)
            L8f:
                r9 = 0
                int r10 = r1.read(r5, r9, r4)
                r6.f34160a = r10
                if (r10 <= 0) goto La4
                r7.write(r5, r9, r10)     // Catch: java.io.IOException -> L9c
                goto L8f
            L9c:
                r9 = move-exception
                java.lang.String r9 = r9.getLocalizedMessage()
                r15.f34162a = r9
                goto L8f
            La4:
                r7.close()     // Catch: java.io.IOException -> La8
                goto Lb3
            La8:
                r4 = move-exception
                java.lang.Object r5 = r15.f34162a
                if (r5 != 0) goto Lb3
                java.lang.String r4 = r4.getLocalizedMessage()
                r15.f34162a = r4
            Lb3:
                com.uptodown.core.activities.InstallerActivity r4 = r14.f30791c
                java.lang.String r5 = r8.getAbsolutePath()
                com.uptodown.core.activities.InstallerActivity.o1(r4, r5)
                goto Lc7
            Lbd:
                com.uptodown.core.activities.InstallerActivity r4 = r14.f30791c
                int r5 = H4.h.f3759H
                java.lang.String r4 = r4.getString(r5)
                r15.f34162a = r4
            Lc7:
                r1.close()
            Lca:
                l6.J0 r1 = l6.C3347b0.c()
                com.uptodown.core.activities.InstallerActivity$r$a r4 = new com.uptodown.core.activities.InstallerActivity$r$a
                com.uptodown.core.activities.InstallerActivity r5 = r14.f30791c
                r4.<init>(r5, r15, r3)
                r14.f30789a = r2
                java.lang.Object r15 = l6.AbstractC3360i.g(r1, r4, r14)
                if (r15 != r0) goto Lde
                return r0
            Lde:
                O5.I r15 = O5.I.f8278a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class s implements M4.k {
        s() {
        }

        @Override // M4.k
        public void a(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.f2();
        }

        @Override // M4.k
        public void b(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.finish();
        }

        @Override // M4.k
        public void c(String filename, String str) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity installerActivity = InstallerActivity.this;
            String string = installerActivity.getString(H4.h.f3809p0);
            AbstractC3255y.h(string, "getString(R.string.xapk_installation_failed)");
            installerActivity.e2(string);
        }

        @Override // M4.k
        public void d(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.e2(filename + " could not be parsed.");
        }

        @Override // M4.k
        public void e(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.e2("invalid version code");
        }

        @Override // M4.k
        public void f(String filename) {
            AbstractC3255y.i(filename, "filename");
            InstallerActivity.this.e2(filename + " not found.");
        }
    }

    /* loaded from: classes5.dex */
    public static final class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(intent, "intent");
            int intExtra = intent.getIntExtra("com.uptodown.core.installation_status", -1);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    if (intExtra == 2) {
                        InstallerActivity.this.Q1(intent.getStringExtra("com.uptodown.core.error"));
                        return;
                    }
                    return;
                }
                InstallerActivity.this.f2();
                return;
            }
            InstallerActivity.this.P1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30798a;

        /* renamed from: b, reason: collision with root package name */
        Object f30799b;

        /* renamed from: c, reason: collision with root package name */
        int f30800c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30801d;

        /* renamed from: f, reason: collision with root package name */
        int f30803f;

        u(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30801d = obj;
            this.f30803f |= Integer.MIN_VALUE;
            return InstallerActivity.this.k2(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class v extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30804a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f30806c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(T t8, S5.d dVar) {
            super(2, dVar);
            this.f30806c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new v(this.f30806c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30804a == 0) {
                O5.t.b(obj);
                Intent intent = InstallerActivity.this.getIntent();
                if (intent != null) {
                    InstallerActivity.this.f30715I = intent.getData();
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.containsKey("realPath")) {
                        InstallerActivity.this.f30714H = extras.getString("realPath");
                        T t8 = this.f30806c;
                        String str = InstallerActivity.this.f30714H;
                        AbstractC3255y.f(str);
                        String str2 = InstallerActivity.this.f30714H;
                        AbstractC3255y.f(str2);
                        String substring = str.substring(j6.n.X(str2, "/", 0, false, 6, null) + 1);
                        AbstractC3255y.h(substring, "this as java.lang.String).substring(startIndex)");
                        t8.f34162a = substring;
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((v) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class w extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30807a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30809c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f30810d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i8, T t8, S5.d dVar) {
            super(2, dVar);
            this.f30809c = i8;
            this.f30810d = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new w(this.f30809c, this.f30810d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            String str;
            T5.b.e();
            if (this.f30807a == 0) {
                O5.t.b(obj);
                if (InstallerActivity.this.f30725S && ((i8 = this.f30809c) == 1 || i8 == 2)) {
                    TextView textView = InstallerActivity.this.f30707A;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    ProgressBar progressBar = InstallerActivity.this.f30733o;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    TextView textView2 = InstallerActivity.this.f30744y;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = InstallerActivity.this.f30737r;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = InstallerActivity.this.f30743x;
                    if (textView4 != null) {
                        textView4.setText(InstallerActivity.this.getString(H4.h.f3816t));
                    }
                    if (this.f30810d.f34162a != null) {
                        TextView textView5 = InstallerActivity.this.f30740u;
                        if (textView5 != null) {
                            textView5.setText((CharSequence) this.f30810d.f34162a);
                        }
                        TextView textView6 = InstallerActivity.this.f30740u;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                    } else {
                        TextView textView7 = InstallerActivity.this.f30740u;
                        if (textView7 != null) {
                            textView7.setText("");
                        }
                    }
                    String str2 = InstallerActivity.this.f30714H;
                    if (str2 != null && str2.length() != 0) {
                        PackageManager packageManager = InstallerActivity.this.getPackageManager();
                        AbstractC3255y.h(packageManager, "packageManager");
                        String str3 = InstallerActivity.this.f30714H;
                        AbstractC3255y.f(str3);
                        PackageInfo c8 = Q4.q.c(packageManager, str3, 128);
                        if (c8 != null && (str = InstallerActivity.this.f30714H) != null && str.length() != 0) {
                            Q4.f fVar = new Q4.f();
                            String str4 = InstallerActivity.this.f30714H;
                            AbstractC3255y.f(str4);
                            PackageManager packageManager2 = InstallerActivity.this.getPackageManager();
                            AbstractC3255y.h(packageManager2, "this@InstallerActivity.packageManager");
                            String b8 = fVar.b(c8, str4, packageManager2);
                            TextView textView8 = InstallerActivity.this.f30739t;
                            if (textView8 != null) {
                                textView8.setText(b8);
                            }
                            TextView textView9 = InstallerActivity.this.f30739t;
                            if (textView9 != null) {
                                textView9.setVisibility(0);
                            }
                        }
                        ImageView imageView = InstallerActivity.this.f30738s;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        String str5 = InstallerActivity.this.f30714H;
                        AbstractC3255y.f(str5);
                        if (j6.n.r(str5, ".xapk", false, 2, null)) {
                            ImageView imageView2 = InstallerActivity.this.f30738s;
                            if (imageView2 != null) {
                                imageView2.setImageResource(H4.d.f3569q);
                            }
                        } else {
                            ImageView imageView3 = InstallerActivity.this.f30738s;
                            if (imageView3 != null) {
                                Q4.f fVar2 = new Q4.f();
                                InstallerActivity installerActivity = InstallerActivity.this;
                                String str6 = installerActivity.f30714H;
                                AbstractC3255y.f(str6);
                                imageView3.setImageDrawable(fVar2.h(installerActivity, str6));
                            }
                        }
                    }
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((w) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30811a;

        /* renamed from: b, reason: collision with root package name */
        Object f30812b;

        /* renamed from: c, reason: collision with root package name */
        Object f30813c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30814d;

        /* renamed from: f, reason: collision with root package name */
        int f30816f;

        x(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30814d = obj;
            this.f30816f |= Integer.MIN_VALUE;
            return InstallerActivity.this.l2(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class y extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30817a;

        y(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new y(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30817a == 0) {
                O5.t.b(obj);
                InstallerActivity.this.f30713G = null;
                TextView textView = InstallerActivity.this.f30708B;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((y) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class z extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30819a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30820b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallerActivity f30821c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O f30822d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30823a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30824b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, S5.d dVar) {
                super(2, dVar);
                this.f30824b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30824b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30823a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f30824b.f30723Q;
                    if (mVar != null) {
                        mVar.h();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30825a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30826b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InstallerActivity installerActivity, S5.d dVar) {
                super(2, dVar);
                this.f30826b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new b(this.f30826b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30825a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f30826b.f30723Q;
                    if (mVar != null) {
                        mVar.j();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30827a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30828b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InstallerActivity installerActivity, S5.d dVar) {
                super(2, dVar);
                this.f30828b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new c(this.f30828b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f30827a == 0) {
                    O5.t.b(obj);
                    M4.m mVar = this.f30828b.f30723Q;
                    if (mVar != null) {
                        mVar.i();
                        return I.f8278a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, InstallerActivity installerActivity, O o8, S5.d dVar) {
            super(2, dVar);
            this.f30820b = str;
            this.f30821c = installerActivity;
            this.f30822d = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new z(this.f30820b, this.f30821c, this.f30822d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object g8;
            Object g9;
            Object g10;
            Object e8 = T5.b.e();
            int i8 = this.f30819a;
            try {
            } catch (Exception e9) {
                e9.printStackTrace();
                J0 c8 = C3347b0.c();
                c cVar = new c(this.f30821c, null);
                this.f30819a = 4;
                g8 = AbstractC3360i.g(c8, cVar, this);
                if (g8 == e8) {
                    return e8;
                }
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                O5.t.b(obj);
                                g8 = obj;
                                return (I) g8;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        O5.t.b(obj);
                        g9 = obj;
                        return (I) g9;
                    }
                    O5.t.b(obj);
                    g10 = obj;
                    return (I) g10;
                }
                O5.t.b(obj);
                return I.f8278a;
            }
            O5.t.b(obj);
            H4.j.f3824g.c(this.f30820b);
            File g11 = new Q4.f().g(this.f30821c);
            File file = new File(this.f30820b);
            String name = file.getName();
            AbstractC3255y.h(name, "fileZipped.name");
            String name2 = file.getName();
            AbstractC3255y.h(name2, "fileZipped.name");
            String substring = name.substring(0, j6.n.X(name2, ".", 0, false, 6, null));
            AbstractC3255y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            File file2 = new File(g11, substring);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            this.f30821c.f30716J = new Q4.w();
            Q4.w wVar = this.f30821c.f30716J;
            AbstractC3255y.f(wVar);
            if (wVar.c(file)) {
                File e10 = new Q4.f().e();
                this.f30822d.f34158a = e10.canWrite();
            }
            if (this.f30822d.f34158a) {
                Q4.w wVar2 = this.f30821c.f30716J;
                AbstractC3255y.f(wVar2);
                M4.m mVar = this.f30821c.f30723Q;
                this.f30819a = 1;
                if (wVar2.g(file, file2, mVar, this) == e8) {
                    return e8;
                }
                return I.f8278a;
            }
            if (this.f30821c.W()) {
                J0 c9 = C3347b0.c();
                a aVar = new a(this.f30821c, null);
                this.f30819a = 2;
                g10 = AbstractC3360i.g(c9, aVar, this);
                if (g10 == e8) {
                    return e8;
                }
                return (I) g10;
            }
            J0 c10 = C3347b0.c();
            b bVar = new b(this.f30821c, null);
            this.f30819a = 3;
            g9 = AbstractC3360i.g(c10, bVar, this);
            if (g9 == e8) {
                return e8;
            }
            return (I) g9;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((z) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public InstallerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: I4.l0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                InstallerActivity.R1(InstallerActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul… {\n        finish()\n    }");
        this.f30735p0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(InstallerActivity this$0, ArrayList files, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(files, "$files");
        J4.a aVar = new J4.a(this$0);
        aVar.M(true);
        aVar.B(false);
        this$0.O1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(File file, ArrayList arrayList) {
        Window window;
        AlertDialog alertDialog = this.f30718L;
        if (alertDialog != null) {
            AbstractC3255y.f(alertDialog);
            if (alertDialog.isShowing()) {
                AlertDialog alertDialog2 = this.f30718L;
                AbstractC3255y.f(alertDialog2);
                alertDialog2.dismiss();
            }
        }
        final b bVar = new b();
        bVar.w(arrayList);
        View inflate = getLayoutInflater().inflate(H4.f.f3744p, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(H4.e.f3697p0);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        AbstractC3255y.f(file);
        textView.setText(file.getName());
        ((TextView) inflate.findViewById(H4.e.f3710t1)).setTypeface(aVar.t());
        TextView textView2 = (TextView) inflate.findViewById(H4.e.f3590F1);
        textView2.setTypeface(aVar.u());
        textView2.setText(bVar.m());
        ((TextView) inflate.findViewById(H4.e.f3713u1)).setTypeface(aVar.t());
        TextView textView3 = (TextView) inflate.findViewById(H4.e.f3641W1);
        textView3.setTypeface(aVar.u());
        textView3.setText(bVar.n());
        ((TextView) inflate.findViewById(H4.e.f3695o1)).setTypeface(aVar.t());
        CheckBox checkBox = (CheckBox) inflate.findViewById(H4.e.f3672h);
        if (bVar.i() != null) {
            checkBox.setTypeface(aVar.u());
            File i8 = bVar.i();
            AbstractC3255y.f(i8);
            checkBox.setText(i8.getName());
        }
        TextView textView4 = (TextView) inflate.findViewById(H4.e.f3698p1);
        textView4.setTypeface(aVar.t());
        TextView textView5 = (TextView) inflate.findViewById(H4.e.f3613N0);
        textView5.setTypeface(aVar.u());
        View findViewById = inflate.findViewById(H4.e.f3645Y);
        AbstractC3255y.h(findViewById, "view.findViewById(R.id.r…quitecture_dialog_splits)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (bVar.h().size() > 0) {
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView.addItemDecoration(new Q4.s((int) getResources().getDimension(H4.c.f3552a)));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(new K4.c(bVar.h(), new d(bVar)));
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                if (!(strArr.length == 0)) {
                    StringBuilder sb = new StringBuilder();
                    int length = strArr.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 == 0) {
                            sb = new StringBuilder('(' + strArr[i9]);
                        } else {
                            sb.append(",");
                            sb.append(strArr[i9]);
                        }
                    }
                    sb.append(")");
                    Y y8 = Y.f34167a;
                    String string = getString(H4.h.f3754C);
                    AbstractC3255y.h(string, "getString(R.string.devic…rted_abis_split_selector)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{sb.toString()}, 1));
                    AbstractC3255y.h(format, "format(format, *args)");
                    textView5.setText(format);
                }
            }
            textView5.setVisibility(8);
        } else {
            recyclerView.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            inflate.findViewById(H4.e.f3667f0).setVisibility(8);
        }
        TextView textView6 = (TextView) inflate.findViewById(H4.e.f3701q1);
        j.a aVar2 = H4.j.f3824g;
        textView6.setTypeface(aVar2.t());
        TextView textView7 = (TextView) inflate.findViewById(H4.e.f3616O0);
        textView7.setTypeface(aVar2.u());
        View findViewById2 = inflate.findViewById(H4.e.f3652a0);
        AbstractC3255y.h(findViewById2, "view.findViewById(R.id.rv_dpi_dialog_splits)");
        RecyclerView recyclerView2 = (RecyclerView) findViewById2;
        if (bVar.j().size() > 0) {
            recyclerView2.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView2.addItemDecoration(new Q4.s((int) getResources().getDimension(H4.c.f3552a)));
            recyclerView2.setItemAnimator(new DefaultItemAnimator());
            recyclerView2.setAdapter(new K4.c(bVar.j(), new e(bVar)));
            Y y9 = Y.f34167a;
            String string2 = getString(H4.h.f3755D);
            AbstractC3255y.h(string2, "getString(R.string.devic…rted_dpis_split_selector)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{getString(H4.h.f3756E)}, 1));
            AbstractC3255y.h(format2, "format(format, *args)");
            textView7.setText(format2);
        } else {
            recyclerView2.setVisibility(8);
            textView6.setVisibility(8);
            textView7.setVisibility(8);
            inflate.findViewById(H4.e.f3670g0).setVisibility(8);
        }
        TextView textView8 = (TextView) inflate.findViewById(H4.e.f3707s1);
        textView8.setTypeface(aVar2.t());
        TextView textView9 = (TextView) inflate.findViewById(H4.e.f3607L0);
        textView9.setTypeface(aVar2.u());
        View findViewById3 = inflate.findViewById(H4.e.f3661d0);
        AbstractC3255y.h(findViewById3, "view.findViewById(R.id.rv_lang_dialog_splits)");
        RecyclerView recyclerView3 = (RecyclerView) findViewById3;
        if (bVar.l().size() > 0) {
            recyclerView3.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView3.addItemDecoration(new Q4.s((int) getResources().getDimension(H4.c.f3552a)));
            recyclerView3.setItemAnimator(new DefaultItemAnimator());
            recyclerView3.setAdapter(new K4.c(bVar.l(), new g(bVar)));
            textView9.setText(getString(H4.h.f3753B));
        } else {
            recyclerView3.setVisibility(8);
            textView8.setVisibility(8);
            textView9.setVisibility(8);
            inflate.findViewById(H4.e.f3676i0).setVisibility(8);
        }
        TextView textView10 = (TextView) inflate.findViewById(H4.e.f3704r1);
        textView10.setTypeface(aVar2.t());
        TextView textView11 = (TextView) inflate.findViewById(H4.e.f3604K0);
        textView11.setTypeface(aVar2.u());
        View findViewById4 = inflate.findViewById(H4.e.f3655b0);
        AbstractC3255y.h(findViewById4, "view.findViewById(R.id.rv_features_dialog_splits)");
        RecyclerView recyclerView4 = (RecyclerView) findViewById4;
        if (bVar.k().size() > 0) {
            recyclerView4.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView4.addItemDecoration(new Q4.s((int) getResources().getDimension(H4.c.f3552a)));
            recyclerView4.setItemAnimator(new DefaultItemAnimator());
            recyclerView4.setAdapter(new K4.c(bVar.k(), new f(bVar)));
        } else {
            recyclerView4.setVisibility(8);
            textView10.setVisibility(8);
            textView11.setVisibility(8);
            inflate.findViewById(H4.e.f3673h0).setVisibility(8);
        }
        TextView textView12 = (TextView) inflate.findViewById(H4.e.f3683k1);
        textView12.setTypeface(aVar2.t());
        textView12.setOnClickListener(new View.OnClickListener() { // from class: I4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.C1(InstallerActivity.this, bVar, view);
            }
        });
        TextView textView13 = (TextView) inflate.findViewById(H4.e.f3721x0);
        textView13.setTypeface(aVar2.t());
        textView13.setOnClickListener(new View.OnClickListener() { // from class: I4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.D1(InstallerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(true);
        this.f30718L = builder.create();
        if (isFinishing()) {
            return;
        }
        AlertDialog alertDialog3 = this.f30718L;
        if (alertDialog3 != null && (window = alertDialog3.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog4 = this.f30718L;
        if (alertDialog4 != null) {
            alertDialog4.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C1(InstallerActivity this$0, b splits, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(splits, "$splits");
        AlertDialog alertDialog = this$0.f30718L;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
        this$0.O1(this$0, splits.y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30718L;
        AbstractC3255y.f(alertDialog);
        alertDialog.dismiss();
        this$0.t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String E1() {
        String language = Locale.getDefault().getLanguage();
        AbstractC3255y.h(language, "getDefault().language");
        return language;
    }

    private final void F1() {
        TextView textView;
        setContentView(H4.f.f3748t);
        try {
            this.f30724R = false;
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                this.f30715I = data;
                if (data != null) {
                    Q4.f fVar = new Q4.f();
                    Uri uri = this.f30715I;
                    AbstractC3255y.f(uri);
                    this.f30711E = fVar.j(uri, this);
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (extras.containsKey("realPath")) {
                        this.f30714H = extras.getString("realPath");
                    }
                    if (extras.containsKey("newFeatures")) {
                        this.f30726T = extras.getString("newFeatures");
                    }
                    if (extras.containsKey("requireUserAction")) {
                        this.f30727U = extras.getBoolean("requireUserAction");
                    }
                    if (extras.containsKey("action")) {
                        this.f30717K = extras.getString("action");
                    }
                    if (extras.containsKey("notificationId")) {
                        u1(this, extras.getInt("notificationId"));
                    }
                    if (extras.containsKey("backgroundInstallation")) {
                        this.f30728V = extras.getBoolean("backgroundInstallation");
                    }
                }
            }
            ImageView imageView = (ImageView) findViewById(H4.e.f3702r);
            this.f30710D = imageView;
            if (imageView != null) {
                imageView.setOnClickListener(new View.OnClickListener() { // from class: I4.w0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.G1(InstallerActivity.this, view);
                    }
                });
            }
            this.f30709C = (ImageView) findViewById(H4.e.f3708t);
            TextView textView2 = (TextView) findViewById(H4.e.f3671g1);
            this.f30741v = textView2;
            if (textView2 != null) {
                textView2.setTypeface(H4.j.f3824g.u());
            }
            TextView textView3 = (TextView) findViewById(H4.e.f3700q0);
            this.f30742w = textView3;
            if (textView3 != null) {
                textView3.setTypeface(H4.j.f3824g.t());
            }
            String str = this.f30711E;
            if (str != null) {
                TextView textView4 = this.f30741v;
                if (textView4 != null) {
                    textView4.setText(str);
                }
                String str2 = this.f30711E;
                AbstractC3255y.f(str2);
                if (j6.n.r(str2, ".apk", false, 2, null)) {
                    ImageView imageView2 = this.f30709C;
                    AbstractC3255y.f(imageView2);
                    imageView2.setImageResource(H4.d.f3553a);
                } else {
                    String str3 = this.f30711E;
                    AbstractC3255y.f(str3);
                    if (j6.n.r(str3, ".xapk", false, 2, null)) {
                        ImageView imageView3 = this.f30709C;
                        AbstractC3255y.f(imageView3);
                        imageView3.setImageResource(H4.d.f3569q);
                    }
                }
            } else {
                String str4 = this.f30714H;
                if (str4 != null && (textView = this.f30741v) != null) {
                    AbstractC3255y.f(str4);
                    String str5 = this.f30714H;
                    AbstractC3255y.f(str5);
                    String substring = str4.substring(j6.n.X(str5, "/", 0, false, 6, null) + 1);
                    AbstractC3255y.h(substring, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring);
                }
            }
            this.f30733o = (ProgressBar) findViewById(H4.e.f3588F);
            TextView textView5 = (TextView) findViewById(H4.e.f3599I1);
            this.f30734p = textView5;
            if (textView5 != null) {
                textView5.setTypeface(H4.j.f3824g.u());
            }
            TextView textView6 = (TextView) findViewById(H4.e.f3725y1);
            this.f30736q = textView6;
            if (textView6 != null) {
                textView6.setTypeface(H4.j.f3824g.u());
            }
            TextView textView7 = (TextView) findViewById(H4.e.f3575A1);
            this.f30745z = textView7;
            if (textView7 != null) {
                textView7.setTypeface(H4.j.f3824g.u());
            }
            TextView textView8 = (TextView) findViewById(H4.e.f3686l1);
            this.f30707A = textView8;
            if (textView8 != null) {
                textView8.setTypeface(H4.j.f3824g.t());
            }
            TextView textView9 = this.f30707A;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            TextView textView10 = this.f30707A;
            if (textView10 != null) {
                textView10.setOnClickListener(new View.OnClickListener() { // from class: I4.x0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.H1(InstallerActivity.this, view);
                    }
                });
            }
            TextView textView11 = (TextView) findViewById(H4.e.f3724y0);
            this.f30708B = textView11;
            if (textView11 != null) {
                textView11.setTypeface(H4.j.f3824g.t());
            }
            TextView textView12 = this.f30708B;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
            TextView textView13 = this.f30708B;
            if (textView13 != null) {
                textView13.setOnClickListener(new View.OnClickListener() { // from class: I4.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.I1(InstallerActivity.this, view);
                    }
                });
            }
            String str6 = this.f30726T;
            if (str6 != null && str6.length() != 0) {
                TextView textView14 = this.f30736q;
                AbstractC3255y.f(textView14);
                textView14.setVisibility(8);
                final O o8 = new O();
                LinearLayout linearLayout = (LinearLayout) findViewById(H4.e.f3576B);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(H4.e.f3579C);
                final TextView textView15 = (TextView) findViewById(H4.e.f3644X1);
                final ImageView imageView4 = (ImageView) findViewById(H4.e.f3714v);
                j.a aVar = H4.j.f3824g;
                textView15.setTypeface(aVar.t());
                final TextView textView16 = (TextView) findViewById(H4.e.f3647Y1);
                textView16.setTypeface(aVar.u());
                textView16.setText(this.f30726T);
                textView16.setVisibility(8);
                linearLayout2.setVisibility(0);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: I4.z0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.J1(kotlin.jvm.internal.O.this, textView15, this, imageView4, textView16, view);
                    }
                });
            }
            L1();
            String str7 = this.f30717K;
            if (str7 != null && j6.n.s(str7, "delete", true)) {
                TextView textView17 = this.f30707A;
                if (textView17 != null) {
                    textView17.setVisibility(0);
                }
                TextView textView18 = this.f30707A;
                if (textView18 != null) {
                    textView18.setText(H4.h.f3797j0);
                }
                TextView textView19 = this.f30707A;
                if (textView19 != null) {
                    textView19.setTag(this.f30714H);
                }
                TextView textView20 = this.f30707A;
                if (textView20 != null) {
                    textView20.setOnClickListener(new View.OnClickListener() { // from class: I4.A0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InstallerActivity.K1(InstallerActivity.this, view);
                        }
                    });
                }
                TextView textView21 = this.f30708B;
                if (textView21 != null) {
                    textView21.setVisibility(0);
                    return;
                }
                return;
            }
            this.f30720N = X1();
            if (this.f30715I != null && this.f30711E != null) {
                Q4.f fVar2 = new Q4.f();
                String str8 = this.f30711E;
                AbstractC3255y.f(str8);
                if (fVar2.o(str8)) {
                    Uri uri2 = this.f30715I;
                    AbstractC3255y.f(uri2);
                    String str9 = this.f30711E;
                    AbstractC3255y.f(str9);
                    V1(uri2, str9);
                    return;
                }
            }
            b2(this.f30714H);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(InstallerActivity this$0, View view) {
        CharSequence charSequence;
        AbstractC3255y.i(this$0, "this$0");
        TextView textView = this$0.f30742w;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        Bundle bundle = new Bundle();
        bundle.putString("appNameAndVersion", valueOf);
        Application application = this$0.getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((H4.j) application).J().send(222, bundle);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        TextView textView = this$0.f30707A;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this$0.b2(this$0.f30714H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I1(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(O expanded, TextView textView, InstallerActivity this$0, ImageView imageView, TextView textView2, View view) {
        AbstractC3255y.i(expanded, "$expanded");
        AbstractC3255y.i(this$0, "this$0");
        if (!expanded.f34158a) {
            textView.setText(this$0.getString(H4.h.f3818v));
            imageView.setImageDrawable(ContextCompat.getDrawable(this$0, H4.d.f3572t));
            textView2.setVisibility(0);
            expanded.f34158a = true;
            return;
        }
        textView.setText(this$0.getString(H4.h.f3817u));
        imageView.setImageDrawable(ContextCompat.getDrawable(this$0, H4.d.f3571s));
        textView2.setVisibility(8);
        expanded.f34158a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K1(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(view, "view");
        Object tag = view.getTag();
        AbstractC3255y.g(tag, "null cannot be cast to non-null type kotlin.String");
        String str = (String) tag;
        TextView textView = this$0.f30707A;
        if (textView != null) {
            textView.setVisibility(8);
        }
        new File(str).delete();
        this$0.finish();
    }

    private final void L1() {
        this.f30722P = new h();
        this.f30723Q = new i();
    }

    private final void M1(File file) {
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        new Q4.h(applicationContext, this.f30722P).t(file, this.f30727U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(InstallerActivity this$0, ActivityResult activityResult) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    private final boolean S1(File file) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        return T1(arrayList);
    }

    private final boolean T1(ArrayList arrayList) {
        try {
            if (!new J4.a(this).N() || arrayList.size() != 1) {
                return false;
            }
            String name = ((File) arrayList.get(0)).getName();
            AbstractC3255y.h(name, "files[0].name");
            if (!j6.n.r(name, ".apk", false, 2, null)) {
                return false;
            }
            PackageManager packageManager = getPackageManager();
            AbstractC3255y.h(packageManager, "packageManager");
            String absolutePath = ((File) arrayList.get(0)).getAbsolutePath();
            AbstractC3255y.h(absolutePath, "files[0].absolutePath");
            PackageInfo c8 = Q4.q.c(packageManager, absolutePath, 0);
            if (c8 == null) {
                return false;
            }
            PackageManager packageManager2 = getPackageManager();
            AbstractC3255y.h(packageManager2, "packageManager");
            String str = c8.packageName;
            AbstractC3255y.h(str, "piFileToInstall.packageName");
            if (new Q4.f().m(Q4.q.d(packageManager2, str, 0)) != new Q4.f().m(c8)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final void U1() {
        InterfaceC3390x0 d8;
        if (this.f30721O == null) {
            d8 = AbstractC3364k.d(N.a(C3347b0.b()), null, null, new j(null), 3, null);
            this.f30721O = d8;
        }
    }

    private final void V1(Uri uri, String str) {
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new k(uri, str, null), 3, null);
    }

    private final void W1(String str) {
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new l(str, null), 3, null);
    }

    private final ArrayList X1() {
        String str;
        String str2;
        String string = getString(H4.h.f3782c);
        AbstractC3255y.h(string, "getString(R.string.app_name)");
        ArrayList arrayList = new ArrayList();
        try {
            String[] stringArray = getResources().getStringArray(H4.b.f3550a);
            AbstractC3255y.h(stringArray, "resources.getStringArray(R.array.messages_info)");
            int length = stringArray.length;
            int i8 = 0;
            while (true) {
                str = TypedValues.Custom.S_STRING;
                if (i8 >= length) {
                    break;
                }
                String string2 = stringArray[i8];
                AbstractC3255y.h(string2, "string");
                if (string2.length() > 0) {
                    if (j6.n.H(string2, "%s", false, 2, null)) {
                        arrayList.add(j6.n.A(string2, "%s", string, false, 4, null));
                    } else {
                        arrayList.add(string2);
                    }
                }
                i8++;
            }
            String[] stringArray2 = getResources().getStringArray(H4.b.f3551b);
            AbstractC3255y.h(stringArray2, "resources.getStringArray…array.messages_info_core)");
            int length2 = stringArray2.length;
            int i9 = 0;
            while (i9 < length2) {
                String str3 = stringArray2[i9];
                AbstractC3255y.h(str3, str);
                if (str3.length() > 0) {
                    if (j6.n.H(str3, "%s", false, 2, null)) {
                        str2 = str;
                        arrayList.add(j6.n.A(str3, "%s", string, false, 4, null));
                    } else {
                        str2 = str;
                        arrayList.add(str3);
                    }
                } else {
                    str2 = str;
                }
                i9++;
                str = str2;
            }
        } catch (Resources.NotFoundException e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y1(S5.d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new m(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z1(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Application application = this$0.getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((H4.j) application).J().send(225, null);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a2(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        Application application = this$0.getApplication();
        AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((H4.j) application).J().send(226, null);
        this$0.F1();
    }

    private final void b2(String str) {
        if (str != null && new File(str).exists()) {
            if (Q4.w.f9241b.a(str)) {
                W1(str);
                return;
            } else if (j6.n.r(str, ".apk", false, 2, null)) {
                N1(this, new File(str));
                return;
            } else {
                Toast.makeText(this, H4.h.f3763L, 0).show();
                finish();
                return;
            }
        }
        Toast.makeText(this, H4.h.f3763L, 0).show();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c2(android.net.Uri r7, java.lang.String r8, S5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.p
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$p r0 = (com.uptodown.core.activities.InstallerActivity.p) r0
            int r1 = r0.f30786f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30786f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$p r0 = new com.uptodown.core.activities.InstallerActivity$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30784d
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30786f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f30783c
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.f30782b
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r2 = r0.f30781a
            com.uptodown.core.activities.InstallerActivity r2 = (com.uptodown.core.activities.InstallerActivity) r2
            O5.t.b(r9)
            goto L62
        L46:
            O5.t.b(r9)
            l6.J0 r9 = l6.C3347b0.c()
            com.uptodown.core.activities.InstallerActivity$q r2 = new com.uptodown.core.activities.InstallerActivity$q
            r2.<init>(r5)
            r0.f30781a = r6
            r0.f30782b = r7
            r0.f30783c = r8
            r0.f30786f = r4
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r2, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            l6.I r9 = l6.C3347b0.b()
            com.uptodown.core.activities.InstallerActivity$r r4 = new com.uptodown.core.activities.InstallerActivity$r
            r4.<init>(r8, r2, r7, r5)
            r0.f30781a = r5
            r0.f30782b = r5
            r0.f30783c = r5
            r0.f30786f = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r9, r4, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.c2(android.net.Uri, java.lang.String, S5.d):java.lang.Object");
    }

    private final void d2() {
        String str = this.f30714H;
        if (str != null) {
            AbstractC3255y.f(str);
            if (j6.n.r(str, ".apk", false, 2, null)) {
                PackageManager pm = getPackageManager();
                AbstractC3255y.h(pm, "pm");
                String str2 = this.f30714H;
                AbstractC3255y.f(str2);
                PackageInfo c8 = Q4.q.c(pm, str2, 128);
                if (c8 != null) {
                    ImageView imageView = this.f30709C;
                    AbstractC3255y.f(imageView);
                    Q4.f fVar = new Q4.f();
                    String str3 = this.f30714H;
                    AbstractC3255y.f(str3);
                    imageView.setImageDrawable(fVar.h(this, str3));
                    Q4.f fVar2 = new Q4.f();
                    String str4 = this.f30714H;
                    AbstractC3255y.f(str4);
                    String b8 = fVar2.b(c8, str4, pm);
                    long m8 = new Q4.f().m(c8);
                    Q4.e eVar = new Q4.e();
                    String str5 = this.f30714H;
                    AbstractC3255y.f(str5);
                    long f8 = eVar.f(str5);
                    j.a aVar = H4.j.f3824g;
                    String str6 = c8.packageName;
                    AbstractC3255y.h(str6, "pi.packageName");
                    aVar.v(str6, m8, b8, f8);
                    TextView textView = this.f30742w;
                    if (textView != null) {
                        textView.setText(getString(H4.h.f3780b, b8, c8.versionName));
                    }
                    TextView textView2 = this.f30742w;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                }
            }
        }
        TextView textView3 = this.f30741v;
        if (textView3 != null) {
            textView3.setText(this.f30711E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e2(String str) {
        TextView textView = this.f30745z;
        if (textView != null) {
            textView.setText(str);
        }
        ProgressBar progressBar = this.f30733o;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(InstallerActivity this$0) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.d2();
        this$0.U1();
        LinearLayout linearLayout = (LinearLayout) this$0.findViewById(H4.e.f3723y);
        if (!this$0.f30728V) {
            linearLayout.setVisibility(0);
            TextView textView = this$0.f30734p;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this$0.f30745z;
            if (textView2 != null) {
                textView2.setText(H4.h.f3770S);
            }
            ProgressBar progressBar = this$0.f30733o;
            if (progressBar != null) {
                progressBar.setIndeterminate(true);
            }
            this$0.getWindow().addFlags(128);
            ImageView imageView = this$0.f30710D;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            TextView textView3 = this$0.f30708B;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        this$0.finish();
    }

    private final void h2(final ArrayList arrayList) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f30719M;
        if (alertDialog2 != null) {
            AbstractC3255y.f(alertDialog2);
            if (alertDialog2.isShowing()) {
                AlertDialog alertDialog3 = this.f30719M;
                AbstractC3255y.f(alertDialog3);
                alertDialog3.dismiss();
            }
        }
        Window window = null;
        View inflate = getLayoutInflater().inflate(H4.f.f3740l, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(H4.e.f3728z1);
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.u());
        final CheckBox checkBox = (CheckBox) inflate.findViewById(H4.e.f3678j);
        checkBox.setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(H4.e.f3680j1);
        textView2.setTypeface(aVar.t());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: I4.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.i2(InstallerActivity.this, checkBox, arrayList, view);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(H4.e.f3712u0);
        textView3.setTypeface(aVar.t());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: I4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.j2(InstallerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.f30719M = create;
        if (create != null) {
            window = create.getWindow();
        }
        AbstractC3255y.f(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (!isFinishing() && (alertDialog = this.f30719M) != null) {
            alertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i2(InstallerActivity this$0, CheckBox checkBox, ArrayList files, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(files, "$files");
        this$0.f30724R = true;
        AlertDialog alertDialog = this$0.f30719M;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (checkBox.isChecked()) {
            new J4.a(this$0).J(false);
        }
        this$0.O1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(InstallerActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30719M;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.t1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[PHI: r9
      0x0082: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:17:0x007f, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l2(java.lang.String r8, S5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.x
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$x r0 = (com.uptodown.core.activities.InstallerActivity.x) r0
            int r1 = r0.f30816f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30816f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$x r0 = new com.uptodown.core.activities.InstallerActivity$x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30814d
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30816f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r9)
            goto L82
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f30813c
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r2 = r0.f30812b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f30811a
            com.uptodown.core.activities.InstallerActivity r4 = (com.uptodown.core.activities.InstallerActivity) r4
            O5.t.b(r9)
            r9 = r8
            r8 = r2
            goto L6a
        L47:
            O5.t.b(r9)
            kotlin.jvm.internal.O r9 = new kotlin.jvm.internal.O
            r9.<init>()
            r9.f34158a = r4
            l6.J0 r2 = l6.C3347b0.c()
            com.uptodown.core.activities.InstallerActivity$y r6 = new com.uptodown.core.activities.InstallerActivity$y
            r6.<init>(r5)
            r0.f30811a = r7
            r0.f30812b = r8
            r0.f30813c = r9
            r0.f30816f = r4
            java.lang.Object r2 = l6.AbstractC3360i.g(r2, r6, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r7
        L6a:
            l6.I r2 = l6.C3347b0.b()
            com.uptodown.core.activities.InstallerActivity$z r6 = new com.uptodown.core.activities.InstallerActivity$z
            r6.<init>(r8, r4, r9, r5)
            r0.f30811a = r5
            r0.f30812b = r5
            r0.f30813c = r5
            r0.f30816f = r3
            java.lang.Object r9 = l6.AbstractC3360i.g(r2, r6, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.l2(java.lang.String, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1() {
        Q4.w wVar = this.f30716J;
        if (wVar != null) {
            wVar.b();
        }
        H4.j.f3824g.b();
        ArrayList arrayList = this.f30712F;
        if (arrayList != null) {
            AbstractC3255y.f(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file != null && file.exists()) {
                    file.delete();
                }
            }
        }
        finish();
    }

    private final void u1(Context context, int i8) {
        Object systemService = context.getSystemService("notification");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i8);
    }

    private final void v1(final File file) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(H4.h.f3805n0));
        builder.setMessage(H4.h.f3775X);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: I4.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.x1(InstallerActivity.this, file, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: I4.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.y1(InstallerActivity.this, file, dialogInterface, i8);
            }
        });
        builder.create().show();
    }

    private final void w1(final ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(H4.h.f3805n0));
        builder.setMessage(H4.h.f3775X);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: I4.n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.z1(InstallerActivity.this, arrayList, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: I4.o0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.A1(InstallerActivity.this, arrayList, dialogInterface, i8);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(InstallerActivity this$0, File file, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(file, "$file");
        J4.a aVar = new J4.a(this$0);
        aVar.M(true);
        aVar.B(true);
        this$0.N1(this$0, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(InstallerActivity this$0, File file, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(file, "$file");
        J4.a aVar = new J4.a(this$0);
        aVar.M(true);
        aVar.B(false);
        this$0.N1(this$0, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(InstallerActivity this$0, ArrayList files, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(files, "$files");
        J4.a aVar = new J4.a(this$0);
        aVar.M(true);
        aVar.B(true);
        this$0.O1(this$0, files);
    }

    public final void N1(Activity activity, File file) {
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(file, "file");
        J4.a aVar = new J4.a(activity);
        boolean l8 = aVar.l();
        boolean s8 = aVar.s();
        if (!this.f30724R && S1(file)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            h2(arrayList);
            return;
        }
        if (!l8 && !s8) {
            M1(file);
            return;
        }
        if (!aVar.t()) {
            v1(file);
            return;
        }
        if (!aVar.m()) {
            M1(file);
            return;
        }
        if (aVar.l()) {
            r.a aVar2 = Q4.r.f9197a;
            String absolutePath = file.getAbsolutePath();
            AbstractC3255y.h(absolutePath, "file.absolutePath");
            aVar2.b(absolutePath, activity, this.f30732Z);
            return;
        }
        if (aVar.s()) {
            new Q4.v(activity, this.f30731Y).f(file);
        }
    }

    public final void O1(Activity activity, ArrayList files) {
        AbstractC3255y.i(activity, "activity");
        AbstractC3255y.i(files, "files");
        J4.a aVar = new J4.a(activity);
        boolean l8 = aVar.l();
        boolean s8 = aVar.s();
        if (!this.f30724R && T1(files)) {
            h2(files);
        } else if ((l8 || s8) && !aVar.t()) {
            w1(files);
        } else {
            new Q4.h(activity, this.f30722P).v(files, this.f30727U);
        }
    }

    public final void P1() {
        try {
            unregisterReceiver(this.f30729W);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        H4.j.f3824g.b();
        finish();
    }

    public final void Q1(String str) {
        try {
            unregisterReceiver(this.f30729W);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        Toast.makeText(this, str, 0).show();
        t1();
    }

    @Override // I4.r
    public void b0() {
    }

    @Override // I4.r
    public void c0() {
    }

    @Override // I4.r
    public void d0() {
    }

    @Override // I4.r
    public void e0() {
    }

    public final void f2() {
        runOnUiThread(new Runnable() { // from class: I4.v0
            @Override // java.lang.Runnable
            public final void run() {
                InstallerActivity.g2(InstallerActivity.this);
            }
        });
    }

    @Override // I4.r
    public void g0() {
    }

    @Override // I4.r
    public void k0() {
        M4.m mVar;
        if (W() && !new File("/Android/obb").canRead() && (mVar = this.f30723Q) != null) {
            mVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k2(int r8, S5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.u
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$u r0 = (com.uptodown.core.activities.InstallerActivity.u) r0
            int r1 = r0.f30803f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30803f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$u r0 = new com.uptodown.core.activities.InstallerActivity$u
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30801d
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30803f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.f30800c
            java.lang.Object r2 = r0.f30799b
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r4 = r0.f30798a
            com.uptodown.core.activities.InstallerActivity r4 = (com.uptodown.core.activities.InstallerActivity) r4
            O5.t.b(r9)
            goto L64
        L43:
            O5.t.b(r9)
            kotlin.jvm.internal.T r2 = new kotlin.jvm.internal.T
            r2.<init>()
            l6.I r9 = l6.C3347b0.b()
            com.uptodown.core.activities.InstallerActivity$v r6 = new com.uptodown.core.activities.InstallerActivity$v
            r6.<init>(r2, r5)
            r0.f30798a = r7
            r0.f30799b = r2
            r0.f30800c = r8
            r0.f30803f = r4
            java.lang.Object r9 = l6.AbstractC3360i.g(r9, r6, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r4 = r7
        L64:
            l6.J0 r9 = l6.C3347b0.c()
            com.uptodown.core.activities.InstallerActivity$w r6 = new com.uptodown.core.activities.InstallerActivity$w
            r6.<init>(r8, r2, r5)
            r0.f30798a = r5
            r0.f30799b = r5
            r0.f30803f = r3
            java.lang.Object r8 = l6.AbstractC3360i.g(r9, r6, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            O5.I r8 = O5.I.f8278a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.k2(int, S5.d):java.lang.Object");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        j.a aVar = H4.j.f3824g;
        if (aVar.h() == null) {
            F1();
        } else {
            setContentView(H4.f.f3749u);
            this.f30725S = true;
            Application application = getApplication();
            AbstractC3255y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
            String str = null;
            ((H4.j) application).J().send(224, null);
            TextView textView2 = (TextView) findViewById(H4.e.f3677i1);
            this.f30737r = textView2;
            AbstractC3255y.f(textView2);
            textView2.setTypeface(aVar.t());
            this.f30738s = (ImageView) findViewById(H4.e.f3696p);
            TextView textView3 = (TextView) findViewById(H4.e.f3706s0);
            this.f30739t = textView3;
            AbstractC3255y.f(textView3);
            textView3.setTypeface(aVar.t());
            TextView textView4 = (TextView) findViewById(H4.e.f3703r0);
            this.f30740u = textView4;
            AbstractC3255y.f(textView4);
            textView4.setTypeface(aVar.u());
            TextView textView5 = (TextView) findViewById(H4.e.f3692n1);
            this.f30743x = textView5;
            AbstractC3255y.f(textView5);
            textView5.setTypeface(aVar.u());
            TextView textView6 = (TextView) findViewById(H4.e.f3724y0);
            this.f30708B = textView6;
            AbstractC3255y.f(textView6);
            textView6.setTypeface(aVar.t());
            TextView textView7 = this.f30708B;
            AbstractC3255y.f(textView7);
            textView7.setOnClickListener(new View.OnClickListener() { // from class: I4.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InstallerActivity.Z1(InstallerActivity.this, view);
                }
            });
            TextView textView8 = (TextView) findViewById(H4.e.f3686l1);
            this.f30707A = textView8;
            AbstractC3255y.f(textView8);
            textView8.setTypeface(aVar.t());
            TextView textView9 = this.f30707A;
            AbstractC3255y.f(textView9);
            textView9.setOnClickListener(new View.OnClickListener() { // from class: I4.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InstallerActivity.a2(InstallerActivity.this, view);
                }
            });
            this.f30733o = (ProgressBar) findViewById(H4.e.f3588F);
            TextView textView10 = (TextView) findViewById(H4.e.f3689m1);
            this.f30744y = textView10;
            AbstractC3255y.f(textView10);
            textView10.setTypeface(aVar.u());
            N4.a h8 = aVar.h();
            if (h8 != null) {
                str = h8.a();
            }
            if (str != null && (textView = this.f30744y) != null) {
                textView.setText(str);
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f30730X);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC3390x0 interfaceC3390x0 = this.f30721O;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        TextView textView;
        super.onResume();
        if (H4.j.f3824g.h() == null && (textView = this.f30743x) != null && textView.getVisibility() == 0) {
            AbstractC3364k.d(N.a(C3347b0.c()), null, null, new o(null), 3, null);
        }
    }
}
