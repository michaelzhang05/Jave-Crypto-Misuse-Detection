package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.i;
import h6.j;

/* loaded from: classes5.dex */
public abstract class H extends N implements h6.j {
    public H(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3242k
    protected InterfaceC2962b computeReflected() {
        return U.f(this);
    }

    @Override // h6.j
    public Object getDelegate() {
        return ((h6.j) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5606getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // h6.j
    /* renamed from: getGetter, reason: collision with other method in class */
    public j.a mo5606getGetter() {
        ((h6.j) getReflected()).mo5606getGetter();
        return null;
    }
}
