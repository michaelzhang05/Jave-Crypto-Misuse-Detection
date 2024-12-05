package Q;

import N.C1331b;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1387c f9025g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC1387c abstractC1387c, int i8, Bundle bundle) {
        super(abstractC1387c, i8, null);
        this.f9025g = abstractC1387c;
    }

    @Override // Q.Q
    protected final void f(C1331b c1331b) {
        if (this.f9025g.t() && AbstractC1387c.h0(this.f9025g)) {
            AbstractC1387c.d0(this.f9025g, 16);
        } else {
            this.f9025g.f8964p.b(c1331b);
            this.f9025g.L(c1331b);
        }
    }

    @Override // Q.Q
    protected final boolean g() {
        this.f9025g.f8964p.b(C1331b.f7452e);
        return true;
    }
}
