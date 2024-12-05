package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
final class o40 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ n40 f11920f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o40(n40 n40Var) {
        this.f11920f = n40Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List list;
        obj = this.f11920f.f11847h;
        synchronized (obj) {
            z = this.f11920f.f11848i;
            if (z) {
                z2 = this.f11920f.f11849j;
                if (z2) {
                    n40.g(this.f11920f, false);
                    zzbad.e("App went background");
                    list = this.f11920f.f11850k;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        try {
                            ((zzut) it.next()).a(false);
                        } catch (Exception e2) {
                            zzbad.c(HttpUrl.FRAGMENT_ENCODE_SET, e2);
                        }
                    }
                }
            }
            zzbad.e("App is still foreground");
        }
    }
}
