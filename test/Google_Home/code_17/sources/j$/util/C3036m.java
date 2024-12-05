package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3036m implements Iterator, InterfaceC3172z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33437a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f33438b;

    public C3036m(C3037n c3037n) {
        this.f33438b = c3037n.f33443a.iterator();
    }

    public C3036m(C3166t c3166t) {
        this.f33438b = c3166t.f33443a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3172z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f33437a) {
            case 0:
                AbstractC3027d.r(this.f33438b, consumer);
                return;
            default:
                AbstractC3027d.r(this.f33438b, new C3040q(consumer));
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f33437a) {
            case 0:
                return this.f33438b.hasNext();
            default:
                return this.f33438b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f33437a) {
            case 0:
                return this.f33438b.next();
            default:
                return new r((Map.Entry) this.f33438b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f33437a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
