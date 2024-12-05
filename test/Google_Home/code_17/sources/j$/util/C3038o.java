package j$.util;

import java.util.ListIterator;
import java.util.function.Consumer;

/* renamed from: j$.util.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3038o implements ListIterator, InterfaceC3172z {

    /* renamed from: a, reason: collision with root package name */
    private final ListIterator f33444a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3038o(C3039p c3039p, int i8) {
        this.f33444a = c3039p.f33445b.listIterator(i8);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.InterfaceC3172z
    public final void forEachRemaining(Consumer consumer) {
        AbstractC3027d.r(this.f33444a, consumer);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f33444a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f33444a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f33444a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f33444a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f33444a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f33444a.previousIndex();
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
