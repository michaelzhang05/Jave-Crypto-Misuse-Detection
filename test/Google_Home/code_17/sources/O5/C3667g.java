package o5;

import O5.I;
import P5.AbstractC1378t;
import a5.C1639f;
import a5.O;
import a6.InterfaceC1668n;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.Y;
import l6.M;
import o5.C3667g;

/* renamed from: o5.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3667g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36491a = new a(null);

    /* renamed from: o5.g$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: o5.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0810a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                boolean z8;
                C1639f.c c02 = ((C1639f) obj).c0();
                C1639f.c cVar = C1639f.c.OUTDATED;
                boolean z9 = false;
                if (c02 != cVar) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Boolean valueOf = Boolean.valueOf(z8);
                if (((C1639f) obj2).c0() != cVar) {
                    z9 = true;
                }
                return R5.a.a(valueOf, Boolean.valueOf(z9));
            }
        }

        /* renamed from: o5.g$a$b */
        /* loaded from: classes5.dex */
        static final class b extends AbstractC3256z implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            public static final b f36492a = new b();

            b() {
                super(2);
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(C1639f app1, C1639f app2) {
                AbstractC3255y.i(app1, "app1");
                AbstractC3255y.i(app2, "app2");
                return Integer.valueOf(AbstractC3255y.l(app2.v(), app1.v()));
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int d(C1639f app1, C1639f app2) {
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
            return j6.n.m(z8, z9, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int f(InterfaceC1668n tmp0, Object obj, Object obj2) {
            AbstractC3255y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        public final void c(ArrayList tmpUserApps, Context context) {
            AbstractC3255y.i(tmpUserApps, "tmpUserApps");
            AbstractC3255y.i(context, "context");
            AbstractC1378t.B(tmpUserApps, new Comparator() { // from class: o5.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int d8;
                    d8 = C3667g.a.d((C1639f) obj, (C1639f) obj2);
                    return d8;
                }
            });
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            ArrayList<O> v02 = a8.v0();
            a8.l();
            Iterator it = v02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                O o8 = (O) it.next();
                int size = tmpUserApps.size();
                for (int i8 = 0; i8 < size; i8++) {
                    long f02 = ((C1639f) tmpUserApps.get(i8)).f0();
                    if (j6.n.s(o8.s(), ((C1639f) tmpUserApps.get(i8)).J(), true) && o8.w() > f02) {
                        ((C1639f) tmpUserApps.get(i8)).J0(C1639f.c.OUTDATED);
                    }
                }
            }
            Iterator it2 = tmpUserApps.iterator();
            while (it2.hasNext()) {
                C1639f c1639f = (C1639f) it2.next();
                for (O o9 : v02) {
                    if (c1639f.i() == 1 || (AbstractC3255y.d(c1639f.J(), o9.s()) && o9.h() == 1)) {
                        c1639f.J0(C1639f.c.UPDATED);
                    }
                }
            }
            AbstractC1378t.B(tmpUserApps, new C0810a());
            int i9 = 0;
            while (i9 < tmpUserApps.size() && (!j6.n.s(context.getPackageName(), ((C1639f) tmpUserApps.get(i9)).J(), true) || ((C1639f) tmpUserApps.get(i9)).c0() != C1639f.c.OUTDATED)) {
                i9++;
            }
            if (i9 < tmpUserApps.size()) {
                Object remove = tmpUserApps.remove(i9);
                AbstractC3255y.h(remove, "tmpUserApps.removeAt(i)");
                tmpUserApps.add(0, (C1639f) remove);
            }
        }

        public final void e(ArrayList tmpUserApps) {
            AbstractC3255y.i(tmpUserApps, "tmpUserApps");
            final b bVar = b.f36492a;
            AbstractC1378t.B(tmpUserApps, new Comparator() { // from class: o5.e
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f8;
                    f8 = C3667g.a.f(InterfaceC1668n.this, obj, obj2);
                    return f8;
                }
            });
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: o5.g$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36493a = new b();

        b() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(String app1, String app2) {
            AbstractC3255y.i(app1, "app1");
            AbstractC3255y.i(app2, "app2");
            return Integer.valueOf(j6.n.m(app1, app2, true));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o5.g$c */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f36494a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f36495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ApplicationInfo f36496c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, ApplicationInfo applicationInfo, S5.d dVar) {
            super(2, dVar);
            this.f36495b = context;
            this.f36496c = applicationInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f36495b, this.f36496c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f36494a == 0) {
                O5.t.b(obj);
                C3655A.f36474a.k(this.f36495b, this.f36496c.packageName, R.drawable.vector_uptodown_logo_bag_disabled);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    private final boolean B(String str) {
        if (!j6.n.C(str, "com.miui.", false, 2, null) && !j6.n.C(str, "com.xiaomi.", false, 2, null)) {
            return false;
        }
        return true;
    }

    private final String D(String str) {
        Normalizer.Form form = Normalizer.Form.NFD;
        if (!Normalizer.isNormalized(str, form)) {
            String normalize = Normalizer.normalize(str, form);
            AbstractC3255y.h(normalize, "normalize(s, Normalizer.Form.NFD)");
            return new j6.j("[\\p{InCombiningDiacriticalMarks}]").f(normalize, "");
        }
        return str;
    }

    private final long b(ApplicationInfo applicationInfo) {
        File parentFile = new File(applicationInfo.sourceDir).getParentFile();
        if (parentFile != null && parentFile.isDirectory()) {
            long h8 = new Q4.e().h(parentFile);
            String str = applicationInfo.packageName;
            AbstractC3255y.h(str, "aPackage.packageName");
            long p8 = h8 + p(str);
            String str2 = applicationInfo.packageName;
            AbstractC3255y.h(str2, "aPackage.packageName");
            return p8 + o(str2);
        }
        return 0L;
    }

    private final void c(C1639f c1639f, C3674n c3674n, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        ArrayList U8;
        if (c1639f.w() == null && c1639f.l() == 0) {
            try {
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                applicationInfo = Q4.q.a(packageManager, J8, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                Q4.d dVar = Q4.d.f9161a;
                String str = applicationInfo.sourceDir;
                AbstractC3255y.h(str, "aPackage.sourceDir");
                c1639f.A0(dVar.h(str));
            }
            if (c1639f.w() != null) {
                AbstractC3255y.f(applicationInfo);
                c1639f.I0(b(applicationInfo));
                c3674n.p1(c1639f);
            } else {
                c1639f.u0(1);
                c3674n.n1(c1639f);
            }
            if (c1639f.l() == 0 && (U8 = c3674n.U(c1639f)) != null) {
                Iterator it = U8.iterator();
                while (it.hasNext()) {
                    a5.r appFile = (a5.r) it.next();
                    if (appFile.b() == null || appFile.d() == null) {
                        if (appFile.a() != null) {
                            Q4.d dVar2 = Q4.d.f9161a;
                            String a8 = appFile.a();
                            AbstractC3255y.f(a8);
                            appFile.g(dVar2.h(a8));
                            String a9 = appFile.a();
                            AbstractC3255y.f(a9);
                            appFile.h(dVar2.e(a9));
                            AbstractC3255y.h(appFile, "appFile");
                            c3674n.o1(appFile);
                        }
                    }
                }
            }
        }
    }

    private final void d(C1639f c1639f, C3674n c3674n, PackageManager packageManager) {
        ApplicationInfo applicationInfo;
        if (c1639f.X() == null && c1639f.l() == 0) {
            try {
                String J8 = c1639f.J();
                AbstractC3255y.f(J8);
                applicationInfo = Q4.q.a(packageManager, J8, 128);
            } catch (PackageManager.NameNotFoundException unused) {
                applicationInfo = null;
            }
            if (applicationInfo != null) {
                c1639f.G0(Q4.d.f9161a.e(applicationInfo.sourceDir));
            }
            if (c1639f.X() != null) {
                c3674n.q1(c1639f);
            } else {
                c1639f.u0(1);
                c3674n.m1(c1639f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(InterfaceC1668n tmp0, Object obj, Object obj2) {
        AbstractC3255y.i(tmp0, "$tmp0");
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
            signingInfo = Q4.q.d(packageManager, str, 134217728).signingInfo;
            hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            if (hasPastSigningCertificates) {
                signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                AbstractC3255y.h(signingCertificateHistory, "signingInfo.signingCertificateHistory");
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
            Signature[] signatureArr = Q4.q.d(packageManager, str, 64).signatures;
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
            if (AbstractC3255y.d(str2, SameMD5.TAG)) {
                return Q4.d.f9161a.g(m8);
            }
            if (AbstractC3255y.d(str2, "SHA256")) {
                return Q4.d.f9161a.d(m8);
            }
        }
        return null;
    }

    private final long o(String str) {
        try {
            return new Q4.e().h(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/" + str + '/'));
        } catch (Exception e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    private final long p(String str) {
        try {
            return new Q4.e().h(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + str + '/'));
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

    private final boolean u(C1639f c1639f) {
        if (c1639f.J() != null && (c1639f.l0() || c1639f.n0())) {
            String J8 = c1639f.J();
            AbstractC3255y.f(J8);
            if (B(J8)) {
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
    private final a5.C1639f y(android.content.pm.ApplicationInfo r21, a5.C1639f r22, android.content.pm.PackageInfo r23, o5.C3674n r24, android.content.Context r25, android.content.pm.PackageManager r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.C3667g.y(android.content.pm.ApplicationInfo, a5.f, android.content.pm.PackageInfo, o5.n, android.content.Context, android.content.pm.PackageManager, boolean, boolean):a5.f");
    }

    public final ArrayList A(Context context) {
        ArrayList arrayList;
        PackageInfo packageInfo;
        AbstractC3255y.i(context, "context");
        synchronized (UptodownApp.f29058B.i()) {
            arrayList = new ArrayList();
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            PackageManager pm = context.getPackageManager();
            AbstractC3255y.h(pm, "pm");
            List<ApplicationInfo> b8 = Q4.q.b(pm, 128);
            ArrayList V7 = a8.V();
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            boolean h02 = aVar.h0(context);
            boolean i02 = aVar.i0(context);
            for (ApplicationInfo applicationInfo : b8) {
                C1639f c1639f = null;
                try {
                    String str = applicationInfo.packageName;
                    AbstractC3255y.h(str, "aPackage.packageName");
                    packageInfo = Q4.q.d(pm, str, 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    Iterator it = V7.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i9 = i8 + 1;
                            C1639f c1639f2 = (C1639f) it.next();
                            Iterator it2 = it;
                            if (j6.n.t(c1639f2.J(), applicationInfo.packageName, false, 2, null)) {
                                c1639f = c1639f2;
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
                    arrayList.add(y(applicationInfo, c1639f, packageInfo, a8, context, pm, h02, i02));
                }
            }
            Iterator it3 = V7.iterator();
            while (it3.hasNext()) {
                C1639f app = (C1639f) it3.next();
                AbstractC3255y.h(app, "app");
                a8.u(app);
                if (app.J() != null) {
                    String J8 = app.J();
                    AbstractC3255y.f(J8);
                    a8.M(J8);
                }
            }
            a8.l();
        }
        return arrayList;
    }

    public final void C(C1639f appTmp, PackageInfo pInfo, Context context) {
        AbstractC3255y.i(appTmp, "appTmp");
        AbstractC3255y.i(pInfo, "pInfo");
        AbstractC3255y.i(context, "context");
        try {
            appTmp.C0(pInfo.applicationInfo.loadLabel(context.getPackageManager()).toString());
        } catch (Exception unused) {
            appTmp.C0(appTmp.J());
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setLocale(new Locale("xx"));
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(pInfo.applicationInfo.packageName);
            AbstractC3255y.h(resourcesForApplication, "context.packageManager.g…licationInfo.packageName)");
            resourcesForApplication.updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            appTmp.r0(resourcesForApplication.getString(pInfo.applicationInfo.labelRes));
        } catch (Exception unused2) {
            appTmp.r0(appTmp.z());
        }
        String g8 = appTmp.g();
        AbstractC3255y.f(g8);
        int length = g8.length();
        int i8 = 0;
        while (true) {
            if (i8 < length) {
                if (s(g8.charAt(i8))) {
                    appTmp.r0(appTmp.J());
                    break;
                }
                i8++;
            } else {
                String g9 = appTmp.g();
                AbstractC3255y.f(g9);
                appTmp.r0(D(g9));
                break;
            }
        }
        if (j6.n.s(appTmp.g(), "null", true)) {
            appTmp.u0(1);
        }
    }

    public final void e(ArrayList apps, Context context) {
        AbstractC3255y.i(apps, "apps");
        AbstractC3255y.i(context, "context");
        synchronized (UptodownApp.f29058B.j()) {
            try {
                PackageManager packageManager = context.getPackageManager();
                C3674n a8 = C3674n.f36505t.a(context);
                a8.a();
                Iterator it = apps.iterator();
                while (it.hasNext()) {
                    C1639f app = (C1639f) it.next();
                    AbstractC3255y.h(app, "app");
                    AbstractC3255y.h(packageManager, "packageManager");
                    c(app, a8, packageManager);
                }
                a8.l();
                I i8 = I.f8278a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ArrayList f(ArrayList arrayList, Context context) {
        AbstractC3255y.i(context, "context");
        synchronized (UptodownApp.f29058B.k()) {
            if (arrayList != null) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    C3674n a8 = C3674n.f36505t.a(context);
                    a8.a();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C1639f app = (C1639f) it.next();
                        AbstractC3255y.h(app, "app");
                        AbstractC3255y.h(packageManager, "packageManager");
                        d(app, a8, packageManager);
                    }
                    a8.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public final ArrayList g(ArrayList apps) {
        AbstractC3255y.i(apps, "apps");
        ArrayList arrayList = new ArrayList();
        Iterator it = apps.iterator();
        while (it.hasNext()) {
            C1639f c1639f = (C1639f) it.next();
            if (c1639f.l() == 0) {
                arrayList.add(c1639f);
            }
        }
        return arrayList;
    }

    public final String h(Context context, String packageName) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(packageName, "packageName");
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
        AbstractC3255y.i(apps, "apps");
        ArrayList arrayList = new ArrayList();
        Iterator it = apps.iterator();
        while (it.hasNext()) {
            C1639f c1639f = (C1639f) it.next();
            String w8 = c1639f.w();
            AbstractC3255y.f(w8);
            arrayList.add(w8);
            if (c1639f.b0() != null) {
                AbstractC3255y.f(c1639f.b0());
                if (!r4.isEmpty()) {
                    ArrayList b02 = c1639f.b0();
                    AbstractC3255y.f(b02);
                    Iterator it2 = b02.iterator();
                    while (it2.hasNext()) {
                        a5.r rVar = (a5.r) it2.next();
                        if (rVar.b() != null) {
                            String b8 = rVar.b();
                            AbstractC3255y.f(b8);
                            arrayList.add(b8);
                        }
                    }
                }
            }
            if (c1639f.H() != null) {
                AbstractC3255y.f(c1639f.H());
                if (!r4.isEmpty()) {
                    ArrayList H8 = c1639f.H();
                    AbstractC3255y.f(H8);
                    Iterator it3 = H8.iterator();
                    while (it3.hasNext()) {
                        a5.r rVar2 = (a5.r) it3.next();
                        if (rVar2.b() != null) {
                            String b9 = rVar2.b();
                            AbstractC3255y.f(b9);
                            arrayList.add(b9);
                        }
                    }
                }
            }
        }
        final b bVar = b.f36493a;
        AbstractC1378t.B(arrayList, new Comparator() { // from class: o5.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int j8;
                j8 = C3667g.j(InterfaceC1668n.this, obj, obj2);
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
                Y y8 = Y.f34167a;
                str = String.format("%s%s", Arrays.copyOf(new Object[]{str, str2}, 2));
                AbstractC3255y.h(str, "format(...)");
            }
        }
        if (str != null) {
            return Q4.d.f9161a.f(str + Build.VERSION.SDK_INT);
        }
        return str;
    }

    public final String k(PackageManager pm, String packagename) {
        AbstractC3255y.i(pm, "pm");
        AbstractC3255y.i(packagename, "packagename");
        return n(pm, packagename, SameMD5.TAG);
    }

    public final String l(PackageManager pm, String packagename) {
        AbstractC3255y.i(pm, "pm");
        AbstractC3255y.i(packagename, "packagename");
        return n(pm, packagename, "SHA256");
    }

    public final String q(String sha256) {
        AbstractC3255y.i(sha256, "sha256");
        return "https://www.virustotal.com/gui/file/" + sha256 + "/detection";
    }

    public final boolean r(String str, Context context) {
        PackageInfo packageInfo = null;
        if (str != null && context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageInfo = Q4.q.d(packageManager, str, 0);
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
        if (str == null || j6.n.B(str, "org.chromium.webapk.", true)) {
            return false;
        }
        return Pattern.compile("^[a-zA-Z]\\w*(\\.\\w+)+$").matcher(str).matches();
    }

    public final boolean x(Context context) {
        AbstractC3255y.i(context, "context");
        String str = Build.BRAND;
        String str2 = Build.MANUFACTURER;
        if (j6.n.s(str, "Xiaomi", true) || j6.n.s(str2, "Xiaomi", true) || j6.n.s(str, "Poco", true)) {
            return true;
        }
        C3674n a8 = C3674n.f36505t.a(context);
        a8.a();
        ArrayList V7 = a8.V();
        a8.l();
        Iterator it = V7.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            C1639f app = (C1639f) it.next();
            AbstractC3255y.h(app, "app");
            if (u(app) && (i8 = i8 + 1) > 5) {
                break;
            }
        }
        if (i8 > 5) {
            return true;
        }
        return false;
    }

    public final C1639f z(Context context, String str) {
        PackageInfo packageInfo;
        AbstractC3255y.i(context, "context");
        synchronized (UptodownApp.f29058B.i()) {
            C1639f c1639f = null;
            if (str == null) {
                return null;
            }
            C3674n a8 = C3674n.f36505t.a(context);
            a8.a();
            PackageManager pm = context.getPackageManager();
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3255y.h(packageManager, "context.packageManager");
                packageInfo = Q4.q.d(packageManager, str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (packageInfo != null) {
                SettingsPreferences.a aVar = SettingsPreferences.f30353b;
                boolean h02 = aVar.h0(context);
                boolean i02 = aVar.i0(context);
                PackageManager packageManager2 = context.getPackageManager();
                AbstractC3255y.h(packageManager2, "context.packageManager");
                ApplicationInfo a9 = Q4.q.a(packageManager2, str, 128);
                String str2 = a9.packageName;
                AbstractC3255y.h(str2, "aPackage.packageName");
                C1639f S8 = a8.S(str2);
                AbstractC3255y.h(pm, "pm");
                c1639f = y(a9, S8, packageInfo, a8, context, pm, h02, i02);
            }
            a8.l();
            return c1639f;
        }
    }
}
