package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1937a;

/* loaded from: classes3.dex */
final class i implements ComponentCallbacks2C1937a.InterfaceC0376a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1939c f15162a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(C1939c c1939c) {
        this.f15162a = c1939c;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1937a.InterfaceC0376a
    public final void a(boolean z8) {
        Handler handler;
        Handler handler2;
        C1939c c1939c = this.f15162a;
        handler = c1939c.f15145n;
        handler2 = c1939c.f15145n;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z8)));
    }
}
