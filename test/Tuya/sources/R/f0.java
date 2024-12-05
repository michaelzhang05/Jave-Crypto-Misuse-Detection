package R;

import O.C1258b;
import R.AbstractC1306c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes3.dex */
public final class f0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f8558g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8559h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(AbstractC1306c abstractC1306c, int i8, IBinder iBinder, Bundle bundle) {
        super(abstractC1306c, i8, bundle);
        this.f8559h = abstractC1306c;
        this.f8558g = iBinder;
    }

    @Override // R.Q
    protected final void f(C1258b c1258b) {
        if (this.f8559h.f8508v != null) {
            this.f8559h.f8508v.j(c1258b);
        }
        this.f8559h.L(c1258b);
    }

    @Override // R.Q
    protected final boolean g() {
        AbstractC1306c.a aVar;
        AbstractC1306c.a aVar2;
        try {
            IBinder iBinder = this.f8558g;
            AbstractC1319p.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f8559h.E().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + this.f8559h.E() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface s8 = this.f8559h.s(this.f8558g);
            if (s8 != null && (AbstractC1306c.g0(this.f8559h, 2, 4, s8) || AbstractC1306c.g0(this.f8559h, 3, 4, s8))) {
                this.f8559h.f8512z = null;
                AbstractC1306c abstractC1306c = this.f8559h;
                Bundle x8 = abstractC1306c.x();
                aVar = abstractC1306c.f8507u;
                if (aVar != null) {
                    aVar2 = this.f8559h.f8507u;
                    aVar2.l(x8);
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
