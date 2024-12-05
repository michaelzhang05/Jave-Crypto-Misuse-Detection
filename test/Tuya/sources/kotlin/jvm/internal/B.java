package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.InterfaceC2647g;
import e6.j;

/* loaded from: classes5.dex */
public abstract class B extends F implements InterfaceC2647g {
    public B(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3146k
    protected InterfaceC2642b computeReflected() {
        return U.d(this);
    }

    @Override // e6.j
    public Object getDelegate() {
        return ((InterfaceC2647g) getReflected()).getDelegate();
    }

    @Override // e6.j
    /* renamed from: getGetter */
    public j.a mo5603getGetter() {
        ((InterfaceC2647g) getReflected()).mo5603getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }
}
