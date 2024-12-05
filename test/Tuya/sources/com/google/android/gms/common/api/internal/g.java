package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import r0.C3679j;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final Map f15158a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    private final Map f15159b = DesugarCollections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z8, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f15158a) {
            hashMap = new HashMap(this.f15158a);
        }
        synchronized (this.f15159b) {
            hashMap2 = new HashMap(this.f15159b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C3679j) entry2.getKey()).d(new P.b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(BasePendingResult basePendingResult, boolean z8) {
        this.f15158a.put(basePendingResult, Boolean.valueOf(z8));
        basePendingResult.a(new e(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(C3679j c3679j, boolean z8) {
        this.f15159b.put(c3679j, Boolean.valueOf(z8));
        c3679j.a().c(new f(this, c3679j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i8, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i8 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i8 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        h(true, new Status(20, sb.toString()));
    }

    public final void f() {
        h(false, C1939c.f15128p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        if (this.f15158a.isEmpty() && this.f15159b.isEmpty()) {
            return false;
        }
        return true;
    }
}
