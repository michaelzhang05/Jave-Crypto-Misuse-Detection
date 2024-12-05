package i6;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class E0 extends AbstractC2806E implements InterfaceC2816d0, InterfaceC2845s0 {

    /* renamed from: d, reason: collision with root package name */
    public F0 f31681d;

    @Override // i6.InterfaceC2845s0
    public K0 a() {
        return null;
    }

    @Override // i6.InterfaceC2816d0
    public void dispose() {
        s().y0(this);
    }

    @Override // i6.InterfaceC2845s0
    public boolean isActive() {
        return true;
    }

    public final F0 s() {
        F0 f02 = this.f31681d;
        if (f02 != null) {
            return f02;
        }
        AbstractC3159y.y("job");
        return null;
    }

    public final void t(F0 f02) {
        this.f31681d = f02;
    }

    @Override // n6.C3503q
    public String toString() {
        return Q.a(this) + '@' + Q.b(this) + "[job@" + Q.b(s()) + ']';
    }
}
