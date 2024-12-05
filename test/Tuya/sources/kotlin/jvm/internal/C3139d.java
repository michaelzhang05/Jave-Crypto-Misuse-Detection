package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3139d extends M5.N {

    /* renamed from: a, reason: collision with root package name */
    private final int[] f33771a;

    /* renamed from: b, reason: collision with root package name */
    private int f33772b;

    public C3139d(int[] array) {
        AbstractC3159y.i(array, "array");
        this.f33771a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f33772b < this.f33771a.length) {
            return true;
        }
        return false;
    }

    @Override // M5.N
    public int nextInt() {
        try {
            int[] iArr = this.f33771a;
            int i8 = this.f33772b;
            this.f33772b = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f33772b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
