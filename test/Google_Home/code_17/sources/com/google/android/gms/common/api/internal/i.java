package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C2061a;

/* loaded from: classes3.dex */
final class i implements ComponentCallbacks2C2061a.InterfaceC0371a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2063c f15963a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(C2063c c2063c) {
        this.f15963a = c2063c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C2061a.InterfaceC0371a
    public final void a(boolean z8) {
        Handler handler;
        Handler handler2;
        C2063c c2063c = this.f15963a;
        handler = c2063c.f15946n;
        handler2 = c2063c.f15946n;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
