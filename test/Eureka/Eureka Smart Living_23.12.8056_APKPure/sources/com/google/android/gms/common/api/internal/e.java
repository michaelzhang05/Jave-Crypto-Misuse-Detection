package com.google.android.gms.common.api.internal;

import androidx.appcompat.app.f0;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map f4592a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f4593b = Collections.synchronizedMap(new WeakHashMap());

    private final void f(boolean z5, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f4592a) {
            hashMap = new HashMap(this.f4592a);
        }
        synchronized (this.f4593b) {
            hashMap2 = new HashMap(this.f4593b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z5 || ((Boolean) entry.getValue()).booleanValue()) {
                f0.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z5 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((l2.j) entry2.getKey()).d(new t1.b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(l2.j jVar, boolean z5) {
        this.f4593b.put(jVar, Boolean.valueOf(z5));
        jVar.a().c(new d(this, jVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The connection to Google Play services was lost"
            r0.<init>(r1)
            r1 = 1
            if (r4 != r1) goto L10
            java.lang.String r4 = " due to service disconnection."
        Lc:
            r0.append(r4)
            goto L16
        L10:
            r2 = 3
            if (r4 != r2) goto L16
            java.lang.String r4 = " due to dead object exception."
            goto Lc
        L16:
            if (r5 == 0) goto L20
            java.lang.String r4 = " Last reason for disconnect: "
            r0.append(r4)
            r0.append(r5)
        L20:
            com.google.android.gms.common.api.Status r4 = new com.google.android.gms.common.api.Status
            r5 = 20
            java.lang.String r0 = r0.toString()
            r4.<init>(r5, r0)
            r3.f(r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.e.c(int, java.lang.String):void");
    }

    public final void d() {
        f(false, b.f4562r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return (this.f4592a.isEmpty() && this.f4593b.isEmpty()) ? false : true;
    }
}
