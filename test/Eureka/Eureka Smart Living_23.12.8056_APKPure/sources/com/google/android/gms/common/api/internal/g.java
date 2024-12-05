package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
final class g implements a.InterfaceC0078a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f4596a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(b bVar) {
        this.f4596a = bVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0078a
    public final void a(boolean z5) {
        Handler handler;
        Handler handler2;
        b bVar = this.f4596a;
        handler = bVar.f4581p;
        handler2 = bVar.f4581p;
        handler.sendMessage(handler2.obtainMessage(1, Boolean.valueOf(z5)));
    }
}
