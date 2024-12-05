package j$.util.stream;

import j$.util.AbstractC3027d;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class M2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f33551d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33551d.add(obj);
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void j() {
        AbstractC3027d.u(this.f33551d, this.f33490b);
        long size = this.f33551d.size();
        InterfaceC3125q2 interfaceC3125q2 = this.f33772a;
        interfaceC3125q2.k(size);
        if (this.f33491c) {
            Iterator it = this.f33551d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC3125q2.m()) {
                    break;
                } else {
                    interfaceC3125q2.accept((InterfaceC3125q2) next);
                }
            }
        } else {
            ArrayList arrayList = this.f33551d;
            Objects.requireNonNull(interfaceC3125q2);
            Collection.EL.a(arrayList, new C3042a(2, interfaceC3125q2));
        }
        interfaceC3125q2.j();
        this.f33551d = null;
    }

    @Override // j$.util.stream.AbstractC3105m2, j$.util.stream.InterfaceC3125q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f33551d = j8 >= 0 ? new ArrayList((int) j8) : new ArrayList();
    }
}
