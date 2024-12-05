package J0;

import L0.F;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: J0.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1285u {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f4779g;

    /* renamed from: h, reason: collision with root package name */
    static final String f4780h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4781a;

    /* renamed from: b, reason: collision with root package name */
    private final D f4782b;

    /* renamed from: c, reason: collision with root package name */
    private final C1267b f4783c;

    /* renamed from: d, reason: collision with root package name */
    private final R0.d f4784d;

    /* renamed from: e, reason: collision with root package name */
    private final Q0.i f4785e;

    /* renamed from: f, reason: collision with root package name */
    private final G0.k f4786f = G0.k.f2916a;

    static {
        HashMap hashMap = new HashMap();
        f4779g = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f4780h = String.format(Locale.US, "Crashlytics Android SDK/%s", "19.1.0");
    }

    public C1285u(Context context, D d8, C1267b c1267b, R0.d dVar, Q0.i iVar) {
        this.f4781a = context;
        this.f4782b = d8;
        this.f4783c = c1267b;
        this.f4784d = dVar;
        this.f4785e = iVar;
    }

    private F.e.d.a.c A(F.a aVar) {
        return this.f4786f.a(aVar.e(), aVar.d(), aVar.c());
    }

    private F.a a(F.a aVar) {
        List list;
        if (this.f4785e.b().f9094b.f9103c && this.f4783c.f4657c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (C1272g c1272g : this.f4783c.f4657c) {
                arrayList.add(F.a.AbstractC0081a.a().d(c1272g.c()).b(c1272g.a()).c(c1272g.b()).a());
            }
            list = DesugarCollections.unmodifiableList(arrayList);
        } else {
            list = null;
        }
        return F.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(list).a();
    }

    private F.b b() {
        return L0.F.b().l("19.1.0").h(this.f4783c.f4655a).i(this.f4782b.a().c()).g(this.f4782b.a().e()).f(this.f4782b.a().d()).d(this.f4783c.f4660f).e(this.f4783c.f4661g).k(4);
    }

    private static long f(long j8) {
        if (j8 <= 0) {
            return 0L;
        }
        return j8;
    }

    private static int g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f4779g.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private F.e.d.a.b.AbstractC0085a h() {
        return F.e.d.a.b.AbstractC0085a.a().b(0L).d(0L).c(this.f4783c.f4659e).e(this.f4783c.f4656b).a();
    }

    private List i() {
        return Collections.singletonList(h());
    }

    private F.e.d.a j(int i8, F.a aVar) {
        boolean z8;
        if (aVar.c() != 100) {
            z8 = true;
        } else {
            z8 = false;
        }
        return F.e.d.a.a().c(Boolean.valueOf(z8)).d(A(aVar)).h(i8).f(o(aVar)).a();
    }

    private F.e.d.a k(int i8, R0.e eVar, Thread thread, int i9, int i10, boolean z8) {
        Boolean bool;
        boolean z9;
        F.e.d.a.c e8 = this.f4786f.e(this.f4781a);
        if (e8.b() > 0) {
            if (e8.b() != 100) {
                z9 = true;
            } else {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = null;
        }
        return F.e.d.a.a().c(bool).d(e8).b(this.f4786f.d(this.f4781a)).h(i8).f(p(eVar, thread, i9, i10, z8)).a();
    }

    private F.e.d.c l(int i8) {
        Double d8;
        C1271f a8 = C1271f.a(this.f4781a);
        Float b8 = a8.b();
        if (b8 != null) {
            d8 = Double.valueOf(b8.doubleValue());
        } else {
            d8 = null;
        }
        int c8 = a8.c();
        boolean n8 = AbstractC1275j.n(this.f4781a);
        long f8 = f(AbstractC1275j.b(this.f4781a) - AbstractC1275j.a(this.f4781a));
        return F.e.d.c.a().b(d8).c(c8).f(n8).e(i8).g(f8).d(AbstractC1275j.c(Environment.getDataDirectory().getPath())).a();
    }

    private F.e.d.a.b.c m(R0.e eVar, int i8, int i9) {
        return n(eVar, i8, i9, 0);
    }

    private F.e.d.a.b.c n(R0.e eVar, int i8, int i9, int i10) {
        String str = eVar.f9584b;
        String str2 = eVar.f9583a;
        StackTraceElement[] stackTraceElementArr = eVar.f9585c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        R0.e eVar2 = eVar.f9586d;
        if (i10 >= i9) {
            R0.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f9586d;
                i11++;
            }
        }
        F.e.d.a.b.c.AbstractC0088a d8 = F.e.d.a.b.c.a().f(str).e(str2).c(r(stackTraceElementArr, i8)).d(i11);
        if (eVar2 != null && i11 == 0) {
            d8.b(n(eVar2, i8, i9, i10 + 1));
        }
        return d8.a();
    }

    private F.e.d.a.b o(F.a aVar) {
        return F.e.d.a.b.a().b(aVar).e(w()).c(i()).a();
    }

    private F.e.d.a.b p(R0.e eVar, Thread thread, int i8, int i9, boolean z8) {
        return F.e.d.a.b.a().f(z(eVar, thread, i8, z8)).d(m(eVar, i8, i9)).e(w()).c(i()).a();
    }

    private F.e.d.a.b.AbstractC0091e.AbstractC0093b q(StackTraceElement stackTraceElement, F.e.d.a.b.AbstractC0091e.AbstractC0093b.AbstractC0094a abstractC0094a) {
        long j8;
        long j9 = 0;
        if (stackTraceElement.isNativeMethod()) {
            j8 = Math.max(stackTraceElement.getLineNumber(), 0L);
        } else {
            j8 = 0;
        }
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j9 = stackTraceElement.getLineNumber();
        }
        return abstractC0094a.e(j8).f(str).b(fileName).d(j9).a();
    }

    private List r(StackTraceElement[] stackTraceElementArr, int i8) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(q(stackTraceElement, F.e.d.a.b.AbstractC0091e.AbstractC0093b.a().c(i8)));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private F.e.a s() {
        return F.e.a.a().e(this.f4782b.f()).g(this.f4783c.f4660f).d(this.f4783c.f4661g).f(this.f4782b.a().c()).b(this.f4783c.f4662h.d()).c(this.f4783c.f4662h.e()).a();
    }

    private F.e t(String str, long j8) {
        return F.e.a().m(j8).j(str).h(f4780h).b(s()).l(v()).e(u()).i(3).a();
    }

    private F.e.c u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int g8 = g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long b8 = AbstractC1275j.b(this.f4781a);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean w8 = AbstractC1275j.w();
        int l8 = AbstractC1275j.l();
        return F.e.c.a().b(g8).f(Build.MODEL).c(availableProcessors).h(b8).d(blockCount).i(w8).j(l8).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private F.e.AbstractC0098e v() {
        return F.e.AbstractC0098e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC1275j.x()).a();
    }

    private F.e.d.a.b.AbstractC0089d w() {
        return F.e.d.a.b.AbstractC0089d.a().d(MBridgeConstans.ENDCARD_URL_TYPE_PL).c(MBridgeConstans.ENDCARD_URL_TYPE_PL).b(0L).a();
    }

    private F.e.d.a.b.AbstractC0091e x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return y(thread, stackTraceElementArr, 0);
    }

    private F.e.d.a.b.AbstractC0091e y(Thread thread, StackTraceElement[] stackTraceElementArr, int i8) {
        return F.e.d.a.b.AbstractC0091e.a().d(thread.getName()).c(i8).b(r(stackTraceElementArr, i8)).a();
    }

    private List z(R0.e eVar, Thread thread, int i8, boolean z8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(y(thread, eVar.f9585c, i8));
        if (z8) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(x(key, this.f4784d.a(entry.getValue())));
                }
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public F.e.d c(F.a aVar) {
        int i8 = this.f4781a.getResources().getConfiguration().orientation;
        return F.e.d.a().g("anr").f(aVar.i()).b(j(i8, a(aVar))).c(l(i8)).a();
    }

    public F.e.d d(Throwable th, Thread thread, String str, long j8, int i8, int i9, boolean z8) {
        int i10 = this.f4781a.getResources().getConfiguration().orientation;
        return F.e.d.a().g(str).f(j8).b(k(i10, R0.e.a(th, this.f4784d), thread, i8, i9, z8)).c(l(i10)).a();
    }

    public L0.F e(String str, long j8) {
        return b().m(t(str, j8)).a();
    }
}
