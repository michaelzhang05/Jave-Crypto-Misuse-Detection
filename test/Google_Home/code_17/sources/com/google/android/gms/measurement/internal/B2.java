package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.AbstractBinderC2086c0;
import com.google.android.gms.internal.measurement.InterfaceC2096d0;

/* loaded from: classes3.dex */
public final class B2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final String f16978a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C2 f16979b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B2(C2 c22, String str) {
        this.f16979b = c22;
        this.f16978a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder == null) {
            this.f16979b.f16986a.c().L().a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            InterfaceC2096d0 i8 = AbstractBinderC2086c0.i(iBinder);
            if (i8 == null) {
                this.f16979b.f16986a.c().L().a("Install Referrer Service implementation was not found");
            } else {
                this.f16979b.f16986a.c().K().a("Install Referrer Service connected");
                this.f16979b.f16986a.e().D(new D2(this, i8, this));
            }
        } catch (RuntimeException e8) {
            this.f16979b.f16986a.c().L().b("Exception occurred while calling Install Referrer API", e8);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16979b.f16986a.c().K().a("Install Referrer Service disconnected");
    }
}
