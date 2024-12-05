package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.InterfaceC2967g;
import h6.j;

/* loaded from: classes5.dex */
public abstract class B extends F implements InterfaceC2967g {
    public B(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3242k
    protected InterfaceC2962b computeReflected() {
        return U.d(this);
    }

    @Override // h6.j
    public Object getDelegate() {
        return ((InterfaceC2967g) getReflected()).getDelegate();
    }

    @Override // h6.j
    /* renamed from: getGetter */
    public j.a mo5606getGetter() {
        ((InterfaceC2967g) getReflected()).mo5606getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
