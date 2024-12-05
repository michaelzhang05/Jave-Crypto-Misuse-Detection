package l5;

import L5.I;
import M5.AbstractC1246t;
import X4.C1496f;
import X4.O;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.M;
import java.io.File;
import java.lang.Character;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.Y;
import l5.C3319g;

/* renamed from: l5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3319g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34490a = new a(null);

    /* renamed from: l5.g$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: l5.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0781a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                boolean z8;
                C1496f.c c02 = ((C1496f) obj).c0();
                C1496f.c cVar = C1496f.c.OUTDATED;
                boolean z9 = false;
                if (c02 != cVar) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                if (((C1496f) obj2).c0() != cVar) {
                    z9 = true;
                }
                return O5.a.a(valueOf, Boolean.valueOf(z9));
            }
        }

        /* renamed from: l5.g$a$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC3160z implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f34491a = new b();

            b() {
                super(2);
            }

            @Override // X5.n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(C1496f app1, C1496f app2) {
                AbstractC3159y.i(app1, "app1");
                AbstractC3159y.i(app2, "app2");
                return Integer.valueOf(AbstractC3159y.l(app2.s(), app1.s()));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(C1496f app1, C1496f app2) {
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
        public static final int f(X5.n tmp0, Object obj, Object obj2) {
            AbstractC3159y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        public final void c(ArrayList tmpUserApps, Context context) {
            AbstractC3159y.i(tmpUserApps, "tmpUserApps");
            AbstractC3159y.i(context, "context");
            AbstractC1246t.B(tmpUserApps, new Comparator() { // from class: l5.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int d8;
                    d8 = C3319g.a.d((C1496f) obj, (C1496f) obj2);
                    return d8;
                }
            });
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            ArrayList<O> v02 = a8.v0();
            a8.g();
            Iterator it = v02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                O o8 = (O) it.next();
                int size = tmpUserApps.size();
                for (int i8 = 0; i8 < size; i8++) {
                    long f02 = ((C1496f) tmpUserApps.get(i8)).f0();
                    if (g6.n.s(o8.n(), ((C1496f) tmpUserApps.get(i8)).Q(), true) && o8.u() > f02) {
                        ((C1496f) tmpUserApps.get(i8)).J0(C1496f.c.OUTDATED);
                    }
                }
            }
            Iterator it2 = tmpUserApps.iterator();
            while (it2.hasNext()) {
                C1496f c1496f = (C1496f) it2.next();
                for (O o9 : v02) {
                    if (c1496f.i() == 1 || (AbstractC3159y.d(c1496f.Q(), o9.n()) && o9.f() == 1)) {
                        c1496f.J0(C1496f.c.UPDATED);
                    }
                }
            }
            AbstractC1246t.B(tmpUserApps, new C0781a());
            int i9 = 0;
            while (i9 < tmpUserApps.size() && (!g6.n.s(context.getPackageName(), ((C1496f) tmpUserApps.get(i9)).Q(), true) || ((C1496f) tmpUserApps.get(i9)).c0() != C1496f.c.OUTDATED)) {
                i9++;
            }
            if (i9 < tmpUserApps.size()) {
                Object remove = tmpUserApps.remove(i9);
                AbstractC3159y.h(remove, "tmpUserApps.removeAt(i)");
                tmpUserApps.add(0, (C1496f) remove);
            }
        }

        public final void e(ArrayList tmpUserApps) {
            AbstractC3159y.i(tmpUserApps, "tmpUserApps");
            final b bVar = b.f34491a;
            AbstractC1246t.B(tmpUserApps, new Comparator() { // from class: l5.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f8;
                    f8 = C3319g.a.f(X5.n.this, obj, obj2);
                    return f8;
                }
            });
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: l5.g$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3160z implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34492a = new b();

        b() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String app1, String app2) {
            AbstractC3159y.i(app1, "app1");
            AbstractC3159y.i(app2, "app2");
            return Integer.valueOf(g6.n.m(app1, app2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l5.g$c */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f34493a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f34494b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ApplicationInfo f34495c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ApplicationInfo applicationInfo, P5.d dVar) {
            super(2, dVar);
            this.f34494b = context;
            this.f34495c = applicationInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f34494b, this.f34495c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f34493a == 0) {
                L5.t.b(obj);
                C3307A.f34473a.k(this.f34494b, this.f34495c.packageName, R.drawable.vector_uptodown_logo_bag_disabled);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final boolean B(String str) {
        if (!g6.n.C(str, "com.miui.", false, 2, null) && !g6.n.C(str, "com.xiaomi.", false, 2, null)) {
            return false;
        }
        return true;
    }

    private final String D(String str) {
        Normalizer.Form form = Normalizer.Form.NFD;
        if (!Normalizer.isNormalized(str, form)) {
            String normalize = Normalizer.normalize(str, form);
            AbstractC3159y.h(normalize, "normalize(s, Normalizer.Form.NFD)");
            return new g6.j("[\\p{InCombiningDiacriticalMarks}]").f(normalize, "");
        }
        return str;
    }

    private final long b(ApplicationInfo applicationInfo) {
        File parentFile = new File(applicationInfo.sourceDir).getParentFile();
        if (parentFile != null && parentFile.isDirectory()) {
            long h8 = new N4.e().h(parentFile);
            String str = applicationInfo.packageName;
            AbstractC3159y.h(str, "aPackage.packageName");
            long p8 = h8 + p(str);
            String str2 = applicationInfo.packageName;
            AbstractC3159y.h(str2, "aPackage.packageName");
            return p8 + o(str2);
        }
        return 0L;
    }

    private final void c(C1496f c1496f, C3326n c3326n, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        ArrayList U7;
        if (c1496f.u() == null && c1496f.j() == 0) {
            try {
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                applicationInfo = N4.q.a(packageManager, Q8, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                N4.d dVar = N4.d.f7201a;
                String str = applicationInfo.sourceDir;
                AbstractC3159y.h(str, "aPackage.sourceDir");
                c1496f.A0(dVar.h(str));
            }
            if (c1496f.u() != null) {
                AbstractC3159y.f(applicationInfo);
                c1496f.I0(b(applicationInfo));
                c3326n.p1(c1496f);
            } else {
                c1496f.u0(1);
                c3326n.n1(c1496f);
            }
            if (c1496f.j() == 0 && (U7 = c3326n.U(c1496f)) != null) {
                Iterator it = U7.iterator();
                while (it.hasNext()) {
                    X4.r appFile = (X4.r) it.next();
                    if (appFile.b() == null || appFile.d() == null) {
                        if (appFile.a() != null) {
                            N4.d dVar2 = N4.d.f7201a;
                            String a8 = appFile.a();
                            AbstractC3159y.f(a8);
                            appFile.g(dVar2.h(a8));
                            String a9 = appFile.a();
                            AbstractC3159y.f(a9);
                            appFile.h(dVar2.e(a9));
                            AbstractC3159y.h(appFile, "appFile");
                            c3326n.o1(appFile);
                        }
                    }
                }
            }
        }
    }

    private final void d(C1496f c1496f, C3326n c3326n, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        if (c1496f.X() == null && c1496f.j() == 0) {
            try {
                String Q8 = c1496f.Q();
                AbstractC3159y.f(Q8);
                applicationInfo = N4.q.a(packageManager, Q8, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                c1496f.G0(N4.d.f7201a.e(applicationInfo.sourceDir));
            }
            if (c1496f.X() != null) {
                c3326n.q1(c1496f);
            } else {
                c1496f.u0(1);
                c3326n.m1(c1496f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(X5.n tmp0, Object obj, Object obj2) {
        AbstractC3159y.i(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:12:0x0067). Please report as a decompilation issue!!! */
    private final byte[] m(PackageManager packageManager, String str) {
        byte[] bArr;
        SigningInfo signingInfo;
        boolean hasPastSigningCertificates;
        Signature[] apkContentsSigners;
        Signature[] signingCertificateHistory;
        boolean z8;
        Signature[] signingCertificateHistory2;
        Signature[] signingCertificateHistory3;
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            signingInfo = N4.q.d(packageManager, str, 134217728).signingInfo;
            hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            if (hasPastSigningCertificates) {
                signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                AbstractC3159y.h(signingCertificateHistory, "signingInfo.signingCertificateHistory");
                if (signingCertificateHistory.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                    int length = signingCertificateHistory2.length - 1;
                    signingCertificateHistory3 = signingInfo.getSigningCertificateHistory();
                    bArr = signingCertificateHistory3[length].toByteArray();
                }
            }
            apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null && apkContentsSigners.length != 0) {
                bArr = apkContentsSigners[0].toByteArray();
            }
            bArr = null;
        } else {
            Signature[] signatureArr = N4.q.d(packageManager, str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                bArr = signatureArr[0].toByteArray();
            }
            bArr = null;
        }
        return bArr;
    }

    private final String n(PackageManager packageManager, String str, String str2) {
        byte[] m8 = m(packageManager, str);
        if (m8 != null) {
            if (AbstractC3159y.d(str2, SameMD5.TAG)) {
                return N4.d.f7201a.g(m8);
            }
            if (AbstractC3159y.d(str2, "SHA256")) {
                return N4.d.f7201a.d(m8);
            }
        }
        return null;
    }

    private final long o(String str) {
        try {
            return new N4.e().h(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + str + '/'));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    private final long p(String str) {
        try {
            return new N4.e().h(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + str + '/'));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    private final boolean s(int i8) {
        Character.UnicodeScript of;
        Character.UnicodeScript unicodeScript;
        if (Build.VERSION.SDK_INT >= 24) {
            of = Character.UnicodeScript.of(i8);
            unicodeScript = Character.UnicodeScript.HAN;
            if (of == unicodeScript) {
                return true;
            }
            return false;
        }
        return Character.isIdeographic(i8);
    }

    private final boolean t(ApplicationInfo applicationInfo) {
        if ((applicationInfo.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    private final boolean u(C1496f c1496f) {
        if (c1496f.Q() != null && (c1496f.l0() || c1496f.n0())) {
            String Q8 = c1496f.Q();
            AbstractC3159y.f(Q8);
            if (B(Q8)) {
                return true;
            }
        }
        return false;
    }

    private final boolean v(String str, PackageManager packageManager) {
        if (str == null || packageManager.getLaunchIntentForPackage(str) == null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X4.C1496f y(android.content.pm.ApplicationInfo r21, X4.C1496f r22, android.content.pm.PackageInfo r23, l5.C3326n r24, android.content.Context r25, android.content.pm.PackageManager r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.C3319g.y(android.content.pm.ApplicationInfo, X4.f, android.content.pm.PackageInfo, l5.n, android.content.Context, android.content.pm.PackageManager, boolean, boolean):X4.f");
    }

    public final ArrayList A(Context context) {
        ArrayList arrayList;
        PackageInfo packageInfo;
        AbstractC3159y.i(context, "context");
        synchronized (UptodownApp.f28003B.i()) {
            arrayList = new ArrayList();
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            PackageManager pm = context.getPackageManager();
            AbstractC3159y.h(pm, "pm");
            List<ApplicationInfo> b8 = N4.q.b(pm, 128);
            ArrayList V7 = a8.V();
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            boolean h02 = aVar.h0(context);
            boolean i02 = aVar.i0(context);
            for (ApplicationInfo applicationInfo : b8) {
                C1496f c1496f = null;
                try {
                    String str = applicationInfo.packageName;
                    AbstractC3159y.h(str, "aPackage.packageName");
                    packageInfo = N4.q.d(pm, str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Iterator it = V7.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i9 = i8 + 1;
                            C1496f c1496f2 = (C1496f) it.next();
                            Iterator it2 = it;
                            if (g6.n.t(c1496f2.Q(), applicationInfo.packageName, false, 2, null)) {
                                c1496f = c1496f2;
                                break;
                            }
                            i8 = i9;
                            it = it2;
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    if (i8 >= 0) {
                        V7.remove(i8);
                    }
                    arrayList.add(y(applicationInfo, c1496f, packageInfo, a8, context, pm, h02, i02));
                }
            }
            Iterator it3 = V7.iterator();
            while (it3.hasNext()) {
                C1496f app = (C1496f) it3.next();
                AbstractC3159y.h(app, "app");
                a8.r(app);
                if (app.Q() != null) {
                    String Q8 = app.Q();
                    AbstractC3159y.f(Q8);
                    a8.M(Q8);
                }
            }
            a8.g();
        }
        return arrayList;
    }

    public final void C(C1496f appTmp, PackageInfo pInfo, Context context) {
        AbstractC3159y.i(appTmp, "appTmp");
        AbstractC3159y.i(pInfo, "pInfo");
        AbstractC3159y.i(context, "context");
        try {
            appTmp.C0(pInfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
        } catch (Exception unused) {
            appTmp.C0(appTmp.Q());
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setLocale(new Locale("xx"));
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(pInfo.applicationInfo.packageName);
            AbstractC3159y.h(resourcesForApplication, "context.packageManager.g…licationInfo.packageName)");
            resourcesForApplication.updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            appTmp.r0(resourcesForApplication.getString(pInfo.applicationInfo.labelRes));
        } catch (Exception unused2) {
            appTmp.r0(appTmp.I());
        }
        String e8 = appTmp.e();
        AbstractC3159y.f(e8);
        int length = e8.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (s(e8.charAt(i8))) {
                    appTmp.r0(appTmp.Q());
                    break;
                }
                i8++;
            } else {
                String e9 = appTmp.e();
                AbstractC3159y.f(e9);
                appTmp.r0(D(e9));
                break;
            }
        }
        if (g6.n.s(appTmp.e(), "null", true)) {
            appTmp.u0(1);
        }
    }

    public final void e(ArrayList apps, Context context) {
        AbstractC3159y.i(apps, "apps");
        AbstractC3159y.i(context, "context");
        synchronized (UptodownApp.f28003B.j()) {
            try {
                PackageManager packageManager = context.getPackageManager();
                C3326n a8 = C3326n.f34504t.a(context);
                a8.a();
                Iterator it = apps.iterator();
                while (it.hasNext()) {
                    C1496f app = (C1496f) it.next();
                    AbstractC3159y.h(app, "app");
                    AbstractC3159y.h(packageManager, "packageManager");
                    c(app, a8, packageManager);
                }
                a8.g();
                I i8 = I.f6487a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList f(ArrayList arrayList, Context context) {
        AbstractC3159y.i(context, "context");
        synchronized (UptodownApp.f28003B.k()) {
            if (arrayList != null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    C3326n a8 = C3326n.f34504t.a(context);
                    a8.a();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1496f app = (C1496f) it.next();
                        AbstractC3159y.h(app, "app");
                        AbstractC3159y.h(packageManager, "packageManager");
                        d(app, a8, packageManager);
                    }
                    a8.g();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList g(ArrayList apps) {
        AbstractC3159y.i(apps, "apps");
        ArrayList arrayList = new ArrayList();
        Iterator it = apps.iterator();
        while (it.hasNext()) {
            C1496f c1496f = (C1496f) it.next();
            if (c1496f.j() == 0) {
                arrayList.add(c1496f);
            }
        }
        return arrayList;
    }

    public final String h(Context context, String packageName) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(packageName);
                installingPackageName = installSourceInfo.getInstallingPackageName();
                return installingPackageName;
            }
            return context.getPackageManager().getInstallerPackageName(packageName);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final String i(ArrayList apps) {
        AbstractC3159y.i(apps, "apps");
        ArrayList arrayList = new ArrayList();
        Iterator it = apps.iterator();
        while (it.hasNext()) {
            C1496f c1496f = (C1496f) it.next();
            String u8 = c1496f.u();
            AbstractC3159y.f(u8);
            arrayList.add(u8);
            if (c1496f.b0() != null) {
                AbstractC3159y.f(c1496f.b0());
                if (!r4.isEmpty()) {
                    ArrayList b02 = c1496f.b0();
                    AbstractC3159y.f(b02);
                    Iterator it2 = b02.iterator();
                    while (it2.hasNext()) {
                        X4.r rVar = (X4.r) it2.next();
                        if (rVar.b() != null) {
                            String b8 = rVar.b();
                            AbstractC3159y.f(b8);
                            arrayList.add(b8);
                        }
                    }
                }
            }
            if (c1496f.L() != null) {
                AbstractC3159y.f(c1496f.L());
                if (!r4.isEmpty()) {
                    ArrayList L8 = c1496f.L();
                    AbstractC3159y.f(L8);
                    Iterator it3 = L8.iterator();
                    while (it3.hasNext()) {
                        X4.r rVar2 = (X4.r) it3.next();
                        if (rVar2.b() != null) {
                            String b9 = rVar2.b();
                            AbstractC3159y.f(b9);
                            arrayList.add(b9);
                        }
                    }
                }
            }
        }
        final b bVar = b.f34492a;
        AbstractC1246t.B(arrayList, new Comparator() { // from class: l5.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int j8;
                j8 = C3319g.j(X5.n.this, obj, obj2);
                return j8;
            }
        });
        Iterator it4 = arrayList.iterator();
        String str = null;
        while (it4.hasNext()) {
            String str2 = (String) it4.next();
            if (str == null) {
                str = str2;
            } else {
                Y y8 = Y.f33766a;
                str = String.format("%s%s", Arrays.copyOf(new Object[]{str, str2}, 2));
                AbstractC3159y.h(str, "format(...)");
            }
        }
        if (str != null) {
            return N4.d.f7201a.f(str + Build.VERSION.SDK_INT);
        }
        return str;
    }

    public final String k(PackageManager pm, String packagename) {
        AbstractC3159y.i(pm, "pm");
        AbstractC3159y.i(packagename, "packagename");
        return n(pm, packagename, SameMD5.TAG);
    }

    public final String l(PackageManager pm, String packagename) {
        AbstractC3159y.i(pm, "pm");
        AbstractC3159y.i(packagename, "packagename");
        return n(pm, packagename, "SHA256");
    }

    public final String q(String sha256) {
        AbstractC3159y.i(sha256, "sha256");
        return "https://www.virustotal.com/gui/file/" + sha256 + "/detection";
    }

    public final boolean r(String str, Context context) {
        PackageInfo packageInfo = null;
        if (str != null && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfo = N4.q.d(packageManager, str, 0);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (packageInfo == null) {
            return false;
        }
        return true;
    }

    public final boolean w(String str) {
        if (str == null || g6.n.B(str, "org.chromium.webapk.", true)) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z]\\w*(\\.\\w+)+$").matcher(str).matches();
    }

    public final boolean x(Context context) {
        AbstractC3159y.i(context, "context");
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        if (g6.n.s(str, "Xiaomi", true) || g6.n.s(str2, "Xiaomi", true) || g6.n.s(str, "Poco", true)) {
            return true;
        }
        C3326n a8 = C3326n.f34504t.a(context);
        a8.a();
        ArrayList V7 = a8.V();
        a8.g();
        Iterator it = V7.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C1496f app = (C1496f) it.next();
            AbstractC3159y.h(app, "app");
            if (u(app) && (i8 = i8 + 1) > 5) {
                break;
            }
        }
        if (i8 > 5) {
            return true;
        }
        return false;
    }

    public final C1496f z(Context context, String str) {
        PackageInfo packageInfo;
        AbstractC3159y.i(context, "context");
        synchronized (UptodownApp.f28003B.i()) {
            C1496f c1496f = null;
            if (str == null) {
                return null;
            }
            C3326n a8 = C3326n.f34504t.a(context);
            a8.a();
            PackageManager pm = context.getPackageManager();
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3159y.h(packageManager, "context.packageManager");
                packageInfo = N4.q.d(packageManager, str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                SettingsPreferences.a aVar = SettingsPreferences.f29323b;
                boolean h02 = aVar.h0(context);
                boolean i02 = aVar.i0(context);
                PackageManager packageManager2 = context.getPackageManager();
                AbstractC3159y.h(packageManager2, "context.packageManager");
                ApplicationInfo a9 = N4.q.a(packageManager2, str, 128);
                String str2 = a9.packageName;
                AbstractC3159y.h(str2, "aPackage.packageName");
                C1496f S7 = a8.S(str2);
                AbstractC3159y.h(pm, "pm");
                c1496f = y(a9, S7, packageInfo, a8, context, pm, h02, i02);
            }
            a8.g();
            return c1496f;
        }
    }
}
