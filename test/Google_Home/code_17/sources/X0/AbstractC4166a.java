package x0;

import java.util.NoSuchElementException;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4166a extends T {

    /* renamed from: a, reason: collision with root package name */
    private final int f40598a;

    /* renamed from: b, reason: collision with root package name */
    private int f40599b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4166a(int i8, int i9) {
        w0.h.k(i9, i8);
        this.f40598a = i8;
        this.f40599b = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.f40599b < this.f40598a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f40599b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (hasNext()) {
            int i8 = this.f40599b;
            this.f40599b = i8 + 1;
            return a(i8);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f40599b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i8 = this.f40599b - 1;
            this.f40599b = i8;
            return a(i8);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f40599b - 1;
    }
}
