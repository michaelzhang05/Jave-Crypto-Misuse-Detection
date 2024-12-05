package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3140e implements Iterator, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f33773a;

    /* renamed from: b, reason: collision with root package name */
    private int f33774b;

    public C3140e(Object[] array) {
        AbstractC3159y.i(array, "array");
        this.f33773a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33774b < this.f33773a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f33773a;
            int i8 = this.f33774b;
            this.f33774b = i8 + 1;
            return objArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f33774b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
