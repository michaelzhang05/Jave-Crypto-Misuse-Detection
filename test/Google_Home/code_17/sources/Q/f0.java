package Q;

import N.C1331b;
import Q.AbstractC1387c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class f0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f9020g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC1387c f9021h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC1387c abstractC1387c, int i8, IBinder iBinder, Bundle bundle) {
        super(abstractC1387c, i8, bundle);
        this.f9021h = abstractC1387c;
        this.f9020g = iBinder;
    }

    @Override // Q.Q
    protected final void f(C1331b c1331b) {
        if (this.f9021h.f8970v != null) {
            this.f9021h.f8970v.i(c1331b);
        }
        this.f9021h.L(c1331b);
    }

    @Override // Q.Q
    protected final boolean g() {
        AbstractC1387c.a aVar;
        AbstractC1387c.a aVar2;
        try {
            IBinder iBinder = this.f9020g;
            AbstractC1400p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f9021h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f9021h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface s8 = this.f9021h.s(this.f9020g);
            if (s8 != null && (AbstractC1387c.g0(this.f9021h, 2, 4, s8) || AbstractC1387c.g0(this.f9021h, 3, 4, s8))) {
                this.f9021h.f8974z = null;
                AbstractC1387c abstractC1387c = this.f9021h;
                Bundle x8 = abstractC1387c.x();
                aVar = abstractC1387c.f8969u;
                if (aVar != null) {
                    aVar2 = this.f9021h.f8969u;
                    aVar2.k(x8);
                    return true;
                }
                return true;
            }
            return false;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
