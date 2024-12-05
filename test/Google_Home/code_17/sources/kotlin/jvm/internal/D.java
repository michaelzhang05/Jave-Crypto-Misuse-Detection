package kotlin.jvm.internal;

import h6.InterfaceC2962b;
import h6.InterfaceC2966f;
import h6.InterfaceC2968h;
import h6.i;
import h6.k;

/* loaded from: classes5.dex */
public abstract class D extends F implements InterfaceC2968h {
    public D(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3242k
    protected InterfaceC2962b computeReflected() {
        return U.e(this);
    }

    @Override // h6.k
    public Object getDelegate(Object obj) {
        return ((InterfaceC2968h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5604getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC2966f getSetter() {
        mo5605getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // h6.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public k.a mo5604getGetter() {
        ((InterfaceC2968h) getReflected()).mo5604getGetter();
        return null;
    }

    @Override // h6.InterfaceC2968h
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC2968h.a mo5605getSetter() {
        ((InterfaceC2968h) getReflected()).mo5605getSetter();
        return null;
    }
}
