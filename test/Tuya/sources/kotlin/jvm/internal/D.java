package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.InterfaceC2646f;
import e6.InterfaceC2648h;
import e6.i;
import e6.k;

/* loaded from: classes5.dex */
public abstract class D extends F implements InterfaceC2648h {
    public D(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3146k
    protected InterfaceC2642b computeReflected() {
        return U.e(this);
    }

    @Override // e6.k
    public Object getDelegate(Object obj) {
        return ((InterfaceC2648h) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5601getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ InterfaceC2646f getSetter() {
        mo5602getSetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // e6.k
    /* renamed from: getGetter, reason: collision with other method in class */
    public k.a mo5601getGetter() {
        ((InterfaceC2648h) getReflected()).mo5601getGetter();
        return null;
    }

    @Override // e6.InterfaceC2648h
    /* renamed from: getSetter, reason: collision with other method in class */
    public InterfaceC2648h.a mo5602getSetter() {
        ((InterfaceC2648h) getReflected()).mo5602getSetter();
        return null;
    }
}
