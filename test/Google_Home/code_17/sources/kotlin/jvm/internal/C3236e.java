package kotlin.jvm.internal;

import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlin.jvm.internal.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3236e implements Iterator, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f34174a;

    /* renamed from: b, reason: collision with root package name */
    private int f34175b;

    public C3236e(Object[] array) {
        AbstractC3255y.i(array, "array");
        this.f34174a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34175b < this.f34174a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f34174a;
            int i8 = this.f34175b;
            this.f34175b = i8 + 1;
            return objArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34175b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
