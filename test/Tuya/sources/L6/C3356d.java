package l6;

import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3356d extends m6.e {

    /* renamed from: d, reason: collision with root package name */
    private final X5.n f34631d;

    public /* synthetic */ C3356d(X5.n nVar, P5.g gVar, int i8, EnumC3132a enumC3132a, int i9, AbstractC3151p abstractC3151p) {
        this(nVar, (i9 & 2) != 0 ? P5.h.f7994a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC3132a.SUSPEND : enumC3132a);
    }

    static /* synthetic */ Object n(C3356d c3356d, k6.s sVar, P5.d dVar) {
        Object invoke = c3356d.f34631d.invoke(sVar, dVar);
        if (invoke == Q5.b.e()) {
            return invoke;
        }
        return L5.I.f6487a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m6.e
    public Object h(k6.s sVar, P5.d dVar) {
        return n(this, sVar, dVar);
    }

    @Override // m6.e
    protected m6.e i(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return new C3356d(this.f34631d, gVar, i8, enumC3132a);
    }

    @Override // m6.e
    public String toString() {
        return "block[" + this.f34631d + "] -> " + super.toString();
    }

    public C3356d(X5.n nVar, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        super(gVar, i8, enumC3132a);
        this.f34631d = nVar;
    }
}
