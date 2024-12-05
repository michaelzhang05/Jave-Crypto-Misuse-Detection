package com.google.firebase.analytics.connector.internal;

import B0.a;
import android.os.Bundle;
import k0.C3210a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f implements C3210a.InterfaceC0777a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f18233a;

    public f(d dVar) {
        this.f18233a = dVar;
    }

    @Override // l0.InterfaceC3285t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        a.b bVar;
        if (str != null && c.f(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j8);
            bundle2.putBundle("params", bundle);
            bVar = this.f18233a.f18229a;
            bVar.a(3, bundle2);
        }
    }
}
