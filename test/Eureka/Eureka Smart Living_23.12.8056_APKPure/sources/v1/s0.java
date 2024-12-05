package v1;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class s0 extends l0 {

    /* renamed from: a, reason: collision with root package name */
    private c f9645a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9646b;

    public s0(c cVar, int i6) {
        this.f9645a = cVar;
        this.f9646b = i6;
    }

    @Override // v1.j
    public final void f(int i6, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // v1.j
    public final void x(int i6, IBinder iBinder, Bundle bundle) {
        n.i(this.f9645a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f9645a.M(i6, iBinder, bundle, this.f9646b);
        this.f9645a = null;
    }

    @Override // v1.j
    public final void y(int i6, IBinder iBinder, w0 w0Var) {
        c cVar = this.f9645a;
        n.i(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        n.h(w0Var);
        c.a0(cVar, w0Var);
        x(i6, iBinder, w0Var.f9655a);
    }
}
