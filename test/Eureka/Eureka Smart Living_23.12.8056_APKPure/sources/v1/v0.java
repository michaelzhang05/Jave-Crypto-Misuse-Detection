package v1;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class v0 extends k0 {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ c f9654g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(c cVar, int i6, Bundle bundle) {
        super(cVar, i6, null);
        this.f9654g = cVar;
    }

    @Override // v1.k0
    protected final void f(s1.a aVar) {
        if (this.f9654g.s() && c.f0(this.f9654g)) {
            c.b0(this.f9654g, 16);
        } else {
            this.f9654g.f9522p.b(aVar);
            this.f9654g.K(aVar);
        }
    }

    @Override // v1.k0
    protected final boolean g() {
        this.f9654g.f9522p.b(s1.a.f9206e);
        return true;
    }
}
