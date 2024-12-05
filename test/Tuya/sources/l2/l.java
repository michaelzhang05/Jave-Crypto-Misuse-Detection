package l2;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l2.f;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class l implements InterfaceC3169d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3170e f33862a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f33863b;

    public l(InterfaceC3170e store) {
        AbstractC3159y.i(store, "store");
        this.f33862a = store;
        this.f33863b = v4.g.n(Boolean.FALSE);
    }

    @Override // l2.InterfaceC3169d
    public InterfaceC3349K a() {
        return this.f33863b;
    }

    @Override // l2.InterfaceC3169d
    public Object b(f.b bVar, P5.d dVar) {
        C3166a d8 = bVar.d();
        if (d8 != null) {
            Object c8 = this.f33862a.c(d8, dVar);
            if (c8 == Q5.b.e()) {
                return c8;
            }
            return (List) c8;
        }
        return null;
    }
}
