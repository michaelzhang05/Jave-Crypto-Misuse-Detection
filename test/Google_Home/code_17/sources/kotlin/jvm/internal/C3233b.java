package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3233b extends P5.E {

    /* renamed from: a, reason: collision with root package name */
    private final double[] f34168a;

    /* renamed from: b, reason: collision with root package name */
    private int f34169b;

    public C3233b(double[] array) {
        AbstractC3255y.i(array, "array");
        this.f34168a = array;
    }

    @Override // P5.E
    public double a() {
        try {
            double[] dArr = this.f34168a;
            int i8 = this.f34169b;
            this.f34169b = i8 + 1;
            return dArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34169b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34169b < this.f34168a.length) {
            return true;
        }
        return false;
    }
}
