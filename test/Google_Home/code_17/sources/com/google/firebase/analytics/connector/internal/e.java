package com.google.firebase.analytics.connector.internal;

import B0.a;
import android.os.Bundle;
import k0.C3210a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements C3210a.InterfaceC0777a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b f18232a;

    public e(b bVar) {
        this.f18232a = bVar;
    }

    @Override // l0.InterfaceC3285t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        a.b bVar;
        if (!this.f18232a.f18219a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("events", c.a(str2));
        bVar = this.f18232a.f18220b;
        bVar.a(2, bundle2);
    }
}
