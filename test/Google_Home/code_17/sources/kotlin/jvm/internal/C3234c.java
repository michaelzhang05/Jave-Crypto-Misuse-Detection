package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C3234c extends P5.J {

    /* renamed from: a, reason: collision with root package name */
    private final float[] f34170a;

    /* renamed from: b, reason: collision with root package name */
    private int f34171b;

    public C3234c(float[] array) {
        AbstractC3255y.i(array, "array");
        this.f34170a = array;
    }

    @Override // P5.J
    public float a() {
        try {
            float[] fArr = this.f34170a;
            int i8 = this.f34171b;
            this.f34171b = i8 + 1;
            return fArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.f34171b--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f34171b < this.f34170a.length) {
            return true;
        }
        return false;
    }
}
