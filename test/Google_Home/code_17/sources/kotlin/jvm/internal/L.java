package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.l;

/* loaded from: classes5.dex */
public abstract class L extends N implements h6.l {
    public L(Class cls, String str, String str2, int i8) {
        super(AbstractC3242k.NO_RECEIVER, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3242k
    protected InterfaceC2962b computeReflected() {
        return U.h(this);
    }

    @Override // h6.l
    public l.a getGetter() {
        ((h6.l) getReflected()).getGetter();
        return null;
    }

    @Override // a6.InterfaceC1668n
    public Object invoke(Object obj, Object obj2) {
        return g(obj, obj2);
    }
}
