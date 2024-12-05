package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.l;

/* loaded from: classes5.dex */
public abstract class L extends N implements e6.l {
    public L(Class cls, String str, String str2, int i8) {
        super(AbstractC3146k.NO_RECEIVER, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3146k
    protected InterfaceC2642b computeReflected() {
        return U.h(this);
    }

    @Override // e6.l
    public l.a getGetter() {
        ((e6.l) getReflected()).getGetter();
        return null;
    }

    @Override // X5.n
    public Object invoke(Object obj, Object obj2) {
        return f(obj, obj2);
    }
}
