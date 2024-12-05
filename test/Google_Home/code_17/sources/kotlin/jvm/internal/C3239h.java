package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3239h extends P5.O {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f34176a;

    /* renamed from: b, reason: collision with root package name */
    private int f34177b;

    public C3239h(long[] array) {
        AbstractC3255y.i(array, "array");
        this.f34176a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34177b < this.f34176a.length) {
            return true;
        }
        return false;
    }

    @Override // P5.O
    public long nextLong() {
        try {
            long[] jArr = this.f34176a;
            int i8 = this.f34177b;
            this.f34177b = i8 + 1;
            return jArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34177b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
