package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.i;
import h6.k;

/* loaded from: classes5.dex */
public abstract class J extends N implements h6.k {
    public J(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3242k
    protected InterfaceC2962b computeReflected() {
        return U.g(this);
    }

    @Override // h6.k
    public Object getDelegate(Object obj) {
        return ((h6.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5604getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // h6.k
    /* renamed from: getGetter */
    public k.a mo5604getGetter() {
        ((h6.k) getReflected()).mo5604getGetter();
        return null;
    }
}
