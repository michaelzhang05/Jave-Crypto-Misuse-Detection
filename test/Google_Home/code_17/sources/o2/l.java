package o2;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import o2.f;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class l implements InterfaceC3517d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3518e f35863a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f35864b;

    public l(InterfaceC3518e store) {
        AbstractC3255y.i(store, "store");
        this.f35863a = store;
        this.f35864b = y4.g.n(Boolean.FALSE);
    }

    @Override // o2.InterfaceC3517d
    public InterfaceC3698L a() {
        return this.f35864b;
    }

    @Override // o2.InterfaceC3517d
    public Object b(f.b bVar, S5.d dVar) {
        C3514a d8 = bVar.d();
        if (d8 != null) {
            Object a8 = this.f35863a.a(d8, dVar);
            if (a8 == T5.b.e()) {
                return a8;
            }
            return (List) a8;
        }
        return null;
    }
}
