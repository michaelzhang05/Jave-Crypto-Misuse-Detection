package R;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes3.dex */
public final class d0 extends T {

    /* renamed from: a, reason: collision with root package name */
    private AbstractC1306c f8532a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8533b;

    public d0(AbstractC1306c abstractC1306c, int i8) {
        this.f8532a = abstractC1306c;
        this.f8533b = i8;
    }

    @Override // R.InterfaceC1314k
    public final void E(int i8, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // R.InterfaceC1314k
    public final void Q(int i8, IBinder iBinder, Bundle bundle) {
        AbstractC1319p.m(this.f8532a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f8532a.N(i8, iBinder, bundle, this.f8533b);
        this.f8532a = null;
    }

    @Override // R.InterfaceC1314k
    public final void d0(int i8, IBinder iBinder, h0 h0Var) {
        AbstractC1306c abstractC1306c = this.f8532a;
        AbstractC1319p.m(abstractC1306c, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC1319p.l(h0Var);
        AbstractC1306c.c0(abstractC1306c, h0Var);
        Q(i8, iBinder, h0Var.f8569a);
    }
}
