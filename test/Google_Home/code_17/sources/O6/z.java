package o6;

import a6.InterfaceC1668n;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class z extends AbstractC3701a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1668n f36819a;

    public z(InterfaceC1668n interfaceC1668n) {
        this.f36819a = interfaceC1668n;
    }

    @Override // o6.AbstractC3701a
    public Object b(InterfaceC3707g interfaceC3707g, S5.d dVar) {
        Object invoke = this.f36819a.invoke(interfaceC3707g, dVar);
        if (invoke == T5.b.e()) {
            return invoke;
        }
        return O5.I.f8278a;
    }
}
