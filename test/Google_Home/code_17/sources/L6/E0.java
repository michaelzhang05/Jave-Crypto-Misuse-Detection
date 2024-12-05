package l6;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class E0 extends AbstractC3341E implements InterfaceC3351d0, InterfaceC3380s0 {

    /* renamed from: d, reason: collision with root package name */
    public F0 f34533d;

    @Override // l6.InterfaceC3380s0
    public K0 a() {
        return null;
    }

    @Override // l6.InterfaceC3351d0
    public void dispose() {
        s().x0(this);
    }

    @Override // l6.InterfaceC3380s0
    public boolean isActive() {
        return true;
    }

    public final F0 s() {
        F0 f02 = this.f34533d;
        if (f02 != null) {
            return f02;
        }
        AbstractC3255y.y("job");
        return null;
    }

    public final void t(F0 f02) {
        this.f34533d = f02;
    }

    @Override // q6.C3882q
    public String toString() {
        return Q.a(this) + '@' + Q.b(this) + "[job@" + Q.b(s()) + ']';
    }
}
