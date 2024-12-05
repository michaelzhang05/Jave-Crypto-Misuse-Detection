package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import l0.C3162a;
import z0.InterfaceC4011a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class e implements C3162a.InterfaceC0777a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f17195a;

    public e(f fVar) {
        this.f17195a = fVar;
    }

    @Override // m0.u
    public final void a(String str, String str2, Bundle bundle, long j8) {
        InterfaceC4011a.b bVar;
        if (str != null && b.c(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j8);
            bundle2.putBundle("params", bundle);
            bVar = this.f17195a.f17196a;
            bVar.a(3, bundle2);
        }
    }
}
