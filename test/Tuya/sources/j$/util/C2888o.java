package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2888o implements ListIterator, InterfaceC3022z {

    /* renamed from: a, reason: collision with root package name */
    private final ListIterator f32250a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2888o(C2889p c2889p, int i8) {
        this.f32250a = c2889p.f32251b.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3022z
    public final void forEachRemaining(Consumer consumer) {
        AbstractC2877d.r(this.f32250a, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f32250a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f32250a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f32250a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f32250a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f32250a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f32250a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
