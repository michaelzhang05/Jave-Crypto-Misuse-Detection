package v1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import v1.c;

/* loaded from: classes.dex */
public final class u0 extends k0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f9652g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f9653h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(c cVar, int i6, IBinder iBinder, Bundle bundle) {
        super(cVar, i6, bundle);
        this.f9653h = cVar;
        this.f9652g = iBinder;
    }

    @Override // v1.k0
    protected final void f(s1.a aVar) {
        if (this.f9653h.f9528v != null) {
            this.f9653h.f9528v.a(aVar);
        }
        this.f9653h.K(aVar);
    }

    @Override // v1.k0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f9652g;
            n.h(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f9653h.D().equals(interfaceDescriptor)) {
            str = "service descriptor mismatch: " + this.f9653h.D() + " vs. " + interfaceDescriptor;
            Log.w("GmsClient", str);
            return false;
        }
        IInterface r5 = this.f9653h.r(this.f9652g);
        if (r5 == null || !(c.e0(this.f9653h, 2, 4, r5) || c.e0(this.f9653h, 3, 4, r5))) {
            return false;
        }
        this.f9653h.f9532z = null;
        Bundle w5 = this.f9653h.w();
        c cVar = this.f9653h;
        aVar = cVar.f9527u;
        if (aVar == null) {
            return true;
        }
        aVar2 = cVar.f9527u;
        aVar2.c(w5);
        return true;
    }
}
