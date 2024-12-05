package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.c6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2092c6 extends Z5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C2092c6() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.Z5
    public final void m() {
        if (!o()) {
            if (a() <= 0) {
                Iterator it = h().iterator();
                if (it.hasNext()) {
                    android.support.v4.media.a.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                android.support.v4.media.a.a(g(0).getKey());
                throw null;
            }
        }
        super.m();
    }
}
