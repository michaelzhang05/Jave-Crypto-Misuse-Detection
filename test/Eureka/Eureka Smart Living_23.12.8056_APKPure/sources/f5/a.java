package f5;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class a implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f6609a;

    /* renamed from: b, reason: collision with root package name */
    private int f6610b;

    public a(Object[] objArr) {
        h.e(objArr, "array");
        this.f6609a = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f6610b < this.f6609a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f6609a;
            int i6 = this.f6610b;
            this.f6610b = i6 + 1;
            return objArr[i6];
        } catch (ArrayIndexOutOfBoundsException e6) {
            this.f6610b--;
            throw new NoSuchElementException(e6.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
