package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3235d extends P5.N {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f34172a;

    /* renamed from: b, reason: collision with root package name */
    private int f34173b;

    public C3235d(int[] array) {
        AbstractC3255y.i(array, "array");
        this.f34172a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34173b < this.f34172a.length) {
            return true;
        }
        return false;
    }

    @Override // P5.N
    public int nextInt() {
        try {
            int[] iArr = this.f34172a;
            int i8 = this.f34173b;
            this.f34173b = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34173b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
