package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.i;
import e6.k;

/* loaded from: classes5.dex */
public abstract class J extends N implements e6.k {
    public J(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3146k
    protected InterfaceC2642b computeReflected() {
        return U.g(this);
    }

    @Override // e6.k
    public Object getDelegate(Object obj) {
        return ((e6.k) getReflected()).getDelegate(obj);
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5601getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // e6.k
    /* renamed from: getGetter */
    public k.a mo5601getGetter() {
        ((e6.k) getReflected()).mo5601getGetter();
        return null;
    }
}
