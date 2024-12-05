package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import l0.C3162a;
import m0.q;
import z0.InterfaceC4011a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class c implements C3162a.InterfaceC0777a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f17190a;

    public c(d dVar) {
        this.f17190a = dVar;
    }

    @Override // m0.u
    public final void a(String str, String str2, Bundle bundle, long j8) {
        InterfaceC4011a.b bVar;
        if (!this.f17190a.f17191a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        int i8 = b.f17189g;
        String a8 = q.a(str2);
        if (a8 != null) {
            str2 = a8;
        }
        bundle2.putString("events", str2);
        bVar = this.f17190a.f17192b;
        bVar.a(2, bundle2);
    }
}
