package Q;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes3.dex */
public final class d0 extends T {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC1387c f8994a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8995b;

    public d0(AbstractC1387c abstractC1387c, int i8) {
        this.f8994a = abstractC1387c;
        this.f8995b = i8;
    }

    @Override // Q.InterfaceC1395k
    public final void H(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // Q.InterfaceC1395k
    public final void R(int i8, IBinder iBinder, h0 h0Var) {
        AbstractC1387c abstractC1387c = this.f8994a;
        AbstractC1400p.m(abstractC1387c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC1400p.l(h0Var);
        AbstractC1387c.c0(abstractC1387c, h0Var);
        Y(i8, iBinder, h0Var.f9031a);
    }

    @Override // Q.InterfaceC1395k
    public final void Y(int i8, IBinder iBinder, Bundle bundle) {
        AbstractC1400p.m(this.f8994a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f8994a.N(i8, iBinder, bundle, this.f8995b);
        this.f8994a = null;
    }
}
