package j$.util.stream;

import j$.util.AbstractC2877d;
import j$.util.Collection;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
final class M2 extends E2 {

    /* renamed from: d, reason: collision with root package name */
    private ArrayList f32357d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f32357d.add(obj);
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void j() {
        AbstractC2877d.u(this.f32357d, this.f32296b);
        long size = this.f32357d.size();
        InterfaceC2975q2 interfaceC2975q2 = this.f32578a;
        interfaceC2975q2.k(size);
        if (this.f32297c) {
            Iterator it = this.f32357d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (interfaceC2975q2.m()) {
                    break;
                } else {
                    interfaceC2975q2.accept((InterfaceC2975q2) next);
                }
            }
        } else {
            ArrayList arrayList = this.f32357d;
            Objects.requireNonNull(interfaceC2975q2);
            Collection.EL.a(arrayList, new C2892a(2, interfaceC2975q2));
        }
        interfaceC2975q2.j();
        this.f32357d = null;
    }

    @Override // j$.util.stream.AbstractC2955m2, j$.util.stream.InterfaceC2975q2
    public final void k(long j8) {
        if (j8 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f32357d = j8 >= 0 ? new ArrayList((int) j8) : new ArrayList();
    }
}
