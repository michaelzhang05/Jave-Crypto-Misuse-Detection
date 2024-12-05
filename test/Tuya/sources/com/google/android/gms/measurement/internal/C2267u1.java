package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C2027j6;

/* renamed from: com.google.android.gms.measurement.internal.u1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2267u1 extends AbstractC2258s2 {

    /* renamed from: c, reason: collision with root package name */
    private char f16830c;

    /* renamed from: d, reason: collision with root package name */
    private long f16831d;

    /* renamed from: e, reason: collision with root package name */
    private String f16832e;

    /* renamed from: f, reason: collision with root package name */
    private final C2257s1 f16833f;

    /* renamed from: g, reason: collision with root package name */
    private final C2257s1 f16834g;

    /* renamed from: h, reason: collision with root package name */
    private final C2257s1 f16835h;

    /* renamed from: i, reason: collision with root package name */
    private final C2257s1 f16836i;

    /* renamed from: j, reason: collision with root package name */
    private final C2257s1 f16837j;

    /* renamed from: k, reason: collision with root package name */
    private final C2257s1 f16838k;

    /* renamed from: l, reason: collision with root package name */
    private final C2257s1 f16839l;

    /* renamed from: m, reason: collision with root package name */
    private final C2257s1 f16840m;

    /* renamed from: n, reason: collision with root package name */
    private final C2257s1 f16841n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2267u1(Y1 y12) {
        super(y12);
        this.f16830c = (char) 0;
        this.f16831d = -1L;
        this.f16833f = new C2257s1(this, 6, false, false);
        this.f16834g = new C2257s1(this, 6, true, false);
        this.f16835h = new C2257s1(this, 6, false, true);
        this.f16836i = new C2257s1(this, 5, false, false);
        this.f16837j = new C2257s1(this, 5, true, false);
        this.f16838k = new C2257s1(this, 5, false, true);
        this.f16839l = new C2257s1(this, 4, false, false);
        this.f16840m = new C2257s1(this, 3, false, false);
        this.f16841n = new C2257s1(this, 2, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String A(boolean z8, String str, Object obj, Object obj2, Object obj3) {
        String B8 = B(z8, obj);
        String B9 = B(z8, obj2);
        String B10 = B(z8, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(B8)) {
            sb.append(str2);
            sb.append(B8);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(B9)) {
            sb.append(str2);
            sb.append(B9);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(B10)) {
            sb.append(str3);
            sb.append(B10);
        }
        return sb.toString();
    }

    static String B(boolean z8, Object obj) {
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
                return obj.toString();
            }
            Long l8 = (Long) obj;
            if (Math.abs(l8.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l8.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder();
            if (charAt == '-') {
                str2 = "-";
            }
            sb.append(str2);
            sb.append(round);
            sb.append("...");
            sb.append(str2);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z8) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb2 = new StringBuilder(th);
            String C8 = C(Y1.class.getCanonicalName());
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i8 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i8];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C8)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i8++;
            }
            return sb2.toString();
        }
        if (obj instanceof C2262t1) {
            str = ((C2262t1) obj).f16825a;
            return str;
        }
        if (z8) {
            return "-";
        }
        return obj.toString();
    }

    static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            C2027j6.c();
            if (((Boolean) AbstractC2217k1.f16546A0.a(null)).booleanValue()) {
                return "";
            }
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object z(String str) {
        if (str == null) {
            return null;
        }
        return new C2262t1(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String D() {
        String str;
        synchronized (this) {
            try {
                if (this.f16832e == null) {
                    if (this.f16777a.Q() != null) {
                        this.f16832e = this.f16777a.Q();
                    } else {
                        this.f16832e = this.f16777a.z().w();
                    }
                }
                AbstractC1319p.l(this.f16832e);
                str = this.f16832e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void G(int i8, boolean z8, boolean z9, String str, Object obj, Object obj2, Object obj3) {
        int i9;
        if (!z8 && Log.isLoggable(D(), i8)) {
            Log.println(i8, D(), A(false, str, obj, obj2, obj3));
        }
        if (!z9 && i8 >= 5) {
            AbstractC1319p.l(str);
            W1 G8 = this.f16777a.G();
            if (G8 == null) {
                Log.println(6, D(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!G8.n()) {
                Log.println(6, D(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i8 >= 9) {
                i9 = 8;
            } else {
                i9 = i8;
            }
            G8.z(new RunnableC2252r1(this, i9, str, obj, obj2, obj3));
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        return false;
    }

    public final C2257s1 q() {
        return this.f16840m;
    }

    public final C2257s1 r() {
        return this.f16833f;
    }

    public final C2257s1 s() {
        return this.f16835h;
    }

    public final C2257s1 t() {
        return this.f16834g;
    }

    public final C2257s1 u() {
        return this.f16839l;
    }

    public final C2257s1 v() {
        return this.f16841n;
    }

    public final C2257s1 w() {
        return this.f16836i;
    }

    public final C2257s1 x() {
        return this.f16838k;
    }

    public final C2257s1 y() {
        return this.f16837j;
    }
}
