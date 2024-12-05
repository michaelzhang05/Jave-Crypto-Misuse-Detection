package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import m0.InterfaceC3392e;

/* renamed from: com.google.android.gms.measurement.internal.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2243p1 {

    /* renamed from: b, reason: collision with root package name */
    protected static final AtomicReference f16727b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    protected static final AtomicReference f16728c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    protected static final AtomicReference f16729d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3392e f16730a;

    public C2243p1(InterfaceC3392e interfaceC3392e) {
        this.f16730a = interfaceC3392e;
    }

    private static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z8;
        String str2;
        AbstractC1319p.l(strArr);
        AbstractC1319p.l(strArr2);
        AbstractC1319p.l(atomicReference);
        if (strArr.length == strArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            Object obj = strArr[i8];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i8];
                        if (str2 == null) {
                            str2 = strArr2[i8] + "(" + strArr[i8] + ")";
                            strArr3[i8] = str2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    protected final String a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = b((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f16730a.a()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(e(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = a(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = a((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = a(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(C2270v c2270v) {
        String b8;
        if (!this.f16730a.a()) {
            return c2270v.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(c2270v.f16886c);
        sb.append(",name=");
        sb.append(d(c2270v.f16884a));
        sb.append(",params=");
        C2260t c2260t = c2270v.f16885b;
        if (c2260t == null) {
            b8 = null;
        } else if (!this.f16730a.a()) {
            b8 = c2260t.toString();
        } else {
            b8 = b(c2260t.z());
        }
        sb.append(b8);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String d(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16730a.a()) {
            return str;
        }
        return g(str, m0.q.f34885c, m0.q.f34883a, f16727b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16730a.a()) {
            return str;
        }
        return g(str, m0.r.f34888b, m0.r.f34887a, f16728c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f16730a.a()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return g(str, m0.s.f34892b, m0.s.f34891a, f16729d);
    }
}
