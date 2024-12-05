package R;

import O.C1258b;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g0 extends Q {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC1306c f8563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC1306c abstractC1306c, int i8, Bundle bundle) {
        super(abstractC1306c, i8, null);
        this.f8563g = abstractC1306c;
    }

    @Override // R.Q
    protected final void f(C1258b c1258b) {
        if (this.f8563g.t() && AbstractC1306c.h0(this.f8563g)) {
            AbstractC1306c.d0(this.f8563g, 16);
        } else {
            this.f8563g.f8502p.b(c1258b);
            this.f8563g.L(c1258b);
        }
    }

    @Override // R.Q
    protected final boolean g() {
        this.f8563g.f8502p.b(C1258b.f7651e);
        return true;
    }
}
