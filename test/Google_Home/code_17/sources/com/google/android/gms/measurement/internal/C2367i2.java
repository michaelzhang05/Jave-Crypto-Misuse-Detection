package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.E7;

/* renamed from: com.google.android.gms.measurement.internal.i2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2367i2 extends AbstractC2444t3 {

    /* renamed from: c, reason: collision with root package name */
    private char f17630c;

    /* renamed from: d, reason: collision with root package name */
    private long f17631d;

    /* renamed from: e, reason: collision with root package name */
    private String f17632e;

    /* renamed from: f, reason: collision with root package name */
    private final C2381k2 f17633f;

    /* renamed from: g, reason: collision with root package name */
    private final C2381k2 f17634g;

    /* renamed from: h, reason: collision with root package name */
    private final C2381k2 f17635h;

    /* renamed from: i, reason: collision with root package name */
    private final C2381k2 f17636i;

    /* renamed from: j, reason: collision with root package name */
    private final C2381k2 f17637j;

    /* renamed from: k, reason: collision with root package name */
    private final C2381k2 f17638k;

    /* renamed from: l, reason: collision with root package name */
    private final C2381k2 f17639l;

    /* renamed from: m, reason: collision with root package name */
    private final C2381k2 f17640m;

    /* renamed from: n, reason: collision with root package name */
    private final C2381k2 f17641n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2367i2(R2 r22) {
        super(r22);
        this.f17630c = (char) 0;
        this.f17631d = -1L;
        this.f17633f = new C2381k2(this, 6, false, false);
        this.f17634g = new C2381k2(this, 6, true, false);
        this.f17635h = new C2381k2(this, 6, false, true);
        this.f17636i = new C2381k2(this, 5, false, false);
        this.f17637j = new C2381k2(this, 5, true, false);
        this.f17638k = new C2381k2(this, 5, false, true);
        this.f17639l = new C2381k2(this, 4, false, false);
        this.f17640m = new C2381k2(this, 3, false, false);
        this.f17641n = new C2381k2(this, 2, false, false);
    }

    private static String E(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            if (E7.a() && ((Boolean) H.f17060E0.a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    private final String P() {
        String str;
        String str2;
        synchronized (this) {
            try {
                if (this.f17632e == null) {
                    if (this.f17844a.O() != null) {
                        str2 = this.f17844a.O();
                    } else {
                        str2 = "FA";
                    }
                    this.f17632e = str2;
                }
                AbstractC1400p.l(this.f17632e);
                str = this.f17632e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object s(String str) {
        if (str == null) {
            return null;
        }
        return new C2402n2(str);
    }

    private static String t(boolean z8, Object obj) {
        String str;
        String th;
        String className;
        String str2 = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int i8 = 0;
        if (obj instanceof Long) {
            if (!z8) {
                return String.valueOf(obj);
            }
            Long l8 = (Long) obj;
            if (Math.abs(l8.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str2 = "-";
            }
            String valueOf = String.valueOf(Math.abs(l8.longValue()));
            return str2 + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str2 + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z8) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb = new StringBuilder(th);
            String E8 = E(R2.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i8];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && E(className).equals(E8)) {
                    sb.append(": ");
                    sb.append(stackTraceElement);
                    break;
                }
                i8++;
            }
            return sb.toString();
        }
        if (obj instanceof C2402n2) {
            str = ((C2402n2) obj).f17731a;
            return str;
        }
        if (z8) {
            return "-";
        }
        return String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String u(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String t8 = t(z8, obj);
        String t9 = t(z8, obj2);
        String t10 = t(z8, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(t8)) {
            sb.append(str2);
            sb.append(t8);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(t9)) {
            sb.append(str2);
            sb.append(t9);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(t10)) {
            sb.append(str3);
            sb.append(t10);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(int i8) {
        return Log.isLoggable(P(), i8);
    }

    public final C2381k2 F() {
        return this.f17640m;
    }

    public final C2381k2 G() {
        return this.f17633f;
    }

    public final C2381k2 H() {
        return this.f17635h;
    }

    public final C2381k2 I() {
        return this.f17634g;
    }

    public final C2381k2 J() {
        return this.f17639l;
    }

    public final C2381k2 K() {
        return this.f17641n;
    }

    public final C2381k2 L() {
        return this.f17636i;
    }

    public final C2381k2 M() {
        return this.f17638k;
    }

    public final C2381k2 N() {
        return this.f17637j;
    }

    public final String O() {
        Pair a8;
        if (f().f17816f == null || (a8 = f().f17816f.a()) == null || a8 == C2443t2.f17811B) {
            return null;
        }
        return String.valueOf(a8.second) + ":" + ((String) a8.first);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final boolean q() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(int i8, String str) {
        Log.println(i8, P(), str);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(int i8, boolean z8, boolean z9, String str, Object obj, Object obj2, Object obj3) {
        int i9;
        if (!z8 && C(i8)) {
            v(i8, u(false, str, obj, obj2, obj3));
        }
        if (!z9 && i8 >= 5) {
            AbstractC1400p.l(str);
            M2 G8 = this.f17844a.G();
            if (G8 == null) {
                v(6, "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!G8.p()) {
                v(6, "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i8 < 0) {
                i8 = 0;
            }
            if (i8 >= 9) {
                i9 = 8;
            } else {
                i9 = i8;
            }
            G8.D(new RunnableC2388l2(this, i9, str, obj, obj2, obj3));
        }
    }
}
