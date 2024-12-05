package kotlin.jvm.internal;

import e6.InterfaceC2642b;
import e6.i;
import e6.j;

/* loaded from: classes5.dex */
public abstract class H extends N implements e6.j {
    public H(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.AbstractC3146k
    protected InterfaceC2642b computeReflected() {
        return U.f(this);
    }

    @Override // e6.j
    public Object getDelegate() {
        return ((e6.j) getReflected()).getDelegate();
    }

    public /* bridge */ /* synthetic */ i.a getGetter() {
        mo5603getGetter();
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return get();
    }

    @Override // e6.j
    /* renamed from: getGetter, reason: collision with other method in class */
    public j.a mo5603getGetter() {
        ((e6.j) getReflected()).mo5603getGetter();
        return null;
    }
}
