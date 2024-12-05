package H0;

import J0.B;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
public class r {

    /* renamed from: f, reason: collision with root package name */
    private static final Map f3395f;

    /* renamed from: g, reason: collision with root package name */
    static final String f3396g;

    /* renamed from: a, reason: collision with root package name */
    private final Context f3397a;

    /* renamed from: b, reason: collision with root package name */
    private final z f3398b;

    /* renamed from: c, reason: collision with root package name */
    private final C1168b f3399c;

    /* renamed from: d, reason: collision with root package name */
    private final P0.d f3400d;

    /* renamed from: e, reason: collision with root package name */
    private final O0.i f3401e;

    static {
        HashMap hashMap = new HashMap();
        f3395f = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f3396g = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.4.1");
    }

    public r(Context context, z zVar, C1168b c1168b, P0.d dVar, O0.i iVar) {
        this.f3397a = context;
        this.f3398b = zVar;
        this.f3399c = c1168b;
        this.f3400d = dVar;
        this.f3401e = iVar;
    }

    private B.a a(B.a aVar) {
        J0.C c8;
        if (this.f3401e.b().f7695b.f7704c && this.f3399c.f3281c.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (C1173g c1173g : this.f3399c.f3281c) {
                arrayList.add(B.a.AbstractC0072a.a().d(c1173g.c()).b(c1173g.a()).c(c1173g.b()).a());
            }
            c8 = J0.C.a(arrayList);
        } else {
            c8 = null;
        }
        return B.a.a().c(aVar.c()).e(aVar.e()).g(aVar.g()).i(aVar.i()).d(aVar.d()).f(aVar.f()).h(aVar.h()).j(aVar.j()).b(c8).a();
    }

    private B.b b() {
        return J0.B.b().j("18.4.1").f(this.f3399c.f3279a).g(this.f3398b.a().c()).e(this.f3398b.a().d()).c(this.f3399c.f3284f).d(this.f3399c.f3285g).i(4);
    }

    private static int f() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = (Integer) f3395f.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    private B.e.d.a.b.AbstractC0076a g() {
        return B.e.d.a.b.AbstractC0076a.a().b(0L).d(0L).c(this.f3399c.f3283e).e(this.f3399c.f3280b).a();
    }

    private J0.C h() {
        return J0.C.d(g());
    }

    private B.e.d.a i(int i8, B.a aVar) {
        boolean z8;
        if (aVar.c() != 100) {
            z8 = true;
        } else {
            z8 = false;
        }
        return B.e.d.a.a().b(Boolean.valueOf(z8)).f(i8).d(n(aVar)).a();
    }

    private B.e.d.a j(int i8, P0.e eVar, Thread thread, int i9, int i10, boolean z8) {
        Boolean bool;
        boolean z9;
        ActivityManager.RunningAppProcessInfo j8 = AbstractC1176j.j(this.f3399c.f3283e, this.f3397a);
        if (j8 != null) {
            if (j8.importance != 100) {
                z9 = true;
            } else {
                z9 = false;
            }
            bool = Boolean.valueOf(z9);
        } else {
            bool = null;
        }
        return B.e.d.a.a().b(bool).f(i8).d(o(eVar, thread, i9, i10, z8)).a();
    }

    private B.e.d.c k(int i8) {
        Double d8;
        C1172f a8 = C1172f.a(this.f3397a);
        Float b8 = a8.b();
        if (b8 != null) {
            d8 = Double.valueOf(b8.doubleValue());
        } else {
            d8 = null;
        }
        int c8 = a8.c();
        boolean p8 = AbstractC1176j.p(this.f3397a);
        long t8 = AbstractC1176j.t() - AbstractC1176j.a(this.f3397a);
        return B.e.d.c.a().b(d8).c(c8).f(p8).e(i8).g(t8).d(AbstractC1176j.b(Environment.getDataDirectory().getPath())).a();
    }

    private B.e.d.a.b.c l(P0.e eVar, int i8, int i9) {
        return m(eVar, i8, i9, 0);
    }

    private B.e.d.a.b.c m(P0.e eVar, int i8, int i9, int i10) {
        String str = eVar.f7860b;
        String str2 = eVar.f7859a;
        StackTraceElement[] stackTraceElementArr = eVar.f7861c;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        P0.e eVar2 = eVar.f7862d;
        if (i10 >= i9) {
            P0.e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f7862d;
                i11++;
            }
        }
        B.e.d.a.b.c.AbstractC0079a d8 = B.e.d.a.b.c.a().f(str).e(str2).c(J0.C.a(q(stackTraceElementArr, i8))).d(i11);
        if (eVar2 != null && i11 == 0) {
            d8.b(m(eVar2, i8, i9, i10 + 1));
        }
        return d8.a();
    }

    private B.e.d.a.b n(B.a aVar) {
        return B.e.d.a.b.a().b(aVar).e(v()).c(h()).a();
    }

    private B.e.d.a.b o(P0.e eVar, Thread thread, int i8, int i9, boolean z8) {
        return B.e.d.a.b.a().f(y(eVar, thread, i8, z8)).d(l(eVar, i8, i9)).e(v()).c(h()).a();
    }

    private B.e.d.a.b.AbstractC0082e.AbstractC0084b p(StackTraceElement stackTraceElement, B.e.d.a.b.AbstractC0082e.AbstractC0084b.AbstractC0085a abstractC0085a) {
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
        return abstractC0085a.e(j8).f(str).b(fileName).d(j9).a();
    }

    private J0.C q(StackTraceElement[] stackTraceElementArr, int i8) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(p(stackTraceElement, B.e.d.a.b.AbstractC0082e.AbstractC0084b.a().c(i8)));
        }
        return J0.C.a(arrayList);
    }

    private B.e.a r() {
        return B.e.a.a().e(this.f3398b.f()).g(this.f3399c.f3284f).d(this.f3399c.f3285g).f(this.f3398b.a().c()).b(this.f3399c.f3286h.d()).c(this.f3399c.f3286h.e()).a();
    }

    private B.e s(String str, long j8) {
        return B.e.a().m(j8).j(str).h(f3396g).b(r()).l(u()).e(t()).i(3).a();
    }

    private B.e.c t() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int f8 = f();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long t8 = AbstractC1176j.t();
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean z8 = AbstractC1176j.z();
        int n8 = AbstractC1176j.n();
        return B.e.c.a().b(f8).f(Build.MODEL).c(availableProcessors).h(t8).d(blockCount).i(z8).j(n8).e(Build.MANUFACTURER).g(Build.PRODUCT).a();
    }

    private B.e.AbstractC0087e u() {
        return B.e.AbstractC0087e.a().d(3).e(Build.VERSION.RELEASE).b(Build.VERSION.CODENAME).c(AbstractC1176j.A()).a();
    }

    private B.e.d.a.b.AbstractC0080d v() {
        return B.e.d.a.b.AbstractC0080d.a().d(MBridgeConstans.ENDCARD_URL_TYPE_PL).c(MBridgeConstans.ENDCARD_URL_TYPE_PL).b(0L).a();
    }

    private B.e.d.a.b.AbstractC0082e w(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return x(thread, stackTraceElementArr, 0);
    }

    private B.e.d.a.b.AbstractC0082e x(Thread thread, StackTraceElement[] stackTraceElementArr, int i8) {
        return B.e.d.a.b.AbstractC0082e.a().d(thread.getName()).c(i8).b(J0.C.a(q(stackTraceElementArr, i8))).a();
    }

    private J0.C y(P0.e eVar, Thread thread, int i8, boolean z8) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(x(thread, eVar.f7861c, i8));
        if (z8) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(w(key, this.f3400d.a(entry.getValue())));
                }
            }
        }
        return J0.C.a(arrayList);
    }

    public B.e.d c(B.a aVar) {
        int i8 = this.f3397a.getResources().getConfiguration().orientation;
        return B.e.d.a().f("anr").e(aVar.i()).b(i(i8, a(aVar))).c(k(i8)).a();
    }

    public B.e.d d(Throwable th, Thread thread, String str, long j8, int i8, int i9, boolean z8) {
        int i10 = this.f3397a.getResources().getConfiguration().orientation;
        return B.e.d.a().f(str).e(j8).b(j(i10, new P0.e(th, this.f3400d), thread, i8, i9, z8)).c(k(i10)).a();
    }

    public J0.B e(String str, long j8) {
        return b().k(s(str, j8)).a();
    }
}
