package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3247p;
import n6.EnumC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3704d extends p6.e {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1668n f36632d;

    public /* synthetic */ C3704d(InterfaceC1668n interfaceC1668n, S5.g gVar, int i8, EnumC3487a enumC3487a, int i9, AbstractC3247p abstractC3247p) {
        this(interfaceC1668n, (i9 & 2) != 0 ? S5.h.f9825a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC3487a.SUSPEND : enumC3487a);
    }

    static /* synthetic */ Object n(C3704d c3704d, n6.s sVar, S5.d dVar) {
        Object invoke = c3704d.f36632d.invoke(sVar, dVar);
        if (invoke == T5.b.e()) {
            return invoke;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p6.e
    public Object h(n6.s sVar, S5.d dVar) {
        return n(this, sVar, dVar);
    }

    @Override // p6.e
    protected p6.e i(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return new C3704d(this.f36632d, gVar, i8, enumC3487a);
    }

    @Override // p6.e
    public String toString() {
        return "block[" + this.f36632d + "] -> " + super.toString();
    }

    public C3704d(InterfaceC1668n interfaceC1668n, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        super(gVar, i8, enumC3487a);
        this.f36632d = interfaceC1668n;
    }
}
