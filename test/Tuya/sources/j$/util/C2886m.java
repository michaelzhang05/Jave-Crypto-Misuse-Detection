package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2886m implements Iterator, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32243a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Iterator f32244b;

    public C2886m(C2887n c2887n) {
        this.f32244b = c2887n.f32249a.iterator();
    }

    public C2886m(C3016t c3016t) {
        this.f32244b = c3016t.f32249a.iterator();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3022z
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f32243a) {
            case 0:
                AbstractC2877d.r(this.f32244b, consumer);
                return;
            default:
                AbstractC2877d.r(this.f32244b, new C2890q(consumer));
                return;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32243a) {
            case 0:
                return this.f32244b.hasNext();
            default:
                return this.f32244b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f32243a) {
            case 0:
                return this.f32244b.next();
            default:
                return new r((Map.Entry) this.f32244b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f32243a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
