package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import android.os.Bundle;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import l0.AbstractC3281p;
import l0.AbstractC3282q;
import l0.AbstractC3284s;
import l0.InterfaceC3273h;

/* renamed from: com.google.android.gms.measurement.internal.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2360h2 {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference f17607b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference f17608c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference f17609d = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3273h f17610a;

    public C2360h2(InterfaceC3273h interfaceC3273h) {
        this.f17610a = interfaceC3273h;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        boolean z8;
        String str2;
        AbstractC1400p.l(strArr);
        AbstractC1400p.l(strArr2);
        AbstractC1400p.l(atomicReference);
        if (strArr.length == strArr2.length) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1400p.a(z8);
        for (int i8 = 0; i8 < strArr.length; i8++) {
            if (Objects.equals(str, strArr[i8])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i8] == null) {
                            strArr3[i8] = strArr2[i8] + "(" + strArr[i8] + ")";
                        }
                        str2 = strArr3[i8];
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = a((Bundle) obj);
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
    public final String a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!this.f17610a.w()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(f(str));
            sb.append("=");
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                valueOf = e(new Object[]{obj});
            } else if (obj instanceof Object[]) {
                valueOf = e((Object[]) obj);
            } else if (obj instanceof ArrayList) {
                valueOf = e(((ArrayList) obj).toArray());
            } else {
                valueOf = String.valueOf(obj);
            }
            sb.append(valueOf);
        }
        sb.append("}]");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(G g8) {
        String str = null;
        if (g8 == null) {
            return null;
        }
        if (!this.f17610a.w()) {
            return g8.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(g8.f17035c);
        sb.append(",name=");
        sb.append(c(g8.f17033a));
        sb.append(",params=");
        C c8 = g8.f17034b;
        if (c8 != null) {
            if (!this.f17610a.w()) {
                str = c8.toString();
            } else {
                str = a(c8.y());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f17610a.w()) {
            return str;
        }
        return d(str, AbstractC3282q.f34217c, AbstractC3282q.f34215a, f17607b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f17610a.w()) {
            return str;
        }
        return d(str, AbstractC3281p.f34212b, AbstractC3281p.f34211a, f17608c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f17610a.w()) {
            return str;
        }
        if (str.startsWith("_exp_")) {
            return "experiment_id(" + str + ")";
        }
        return d(str, AbstractC3284s.f34220b, AbstractC3284s.f34219a, f17609d);
    }
}
