package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1006z extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private float[] f636a;

    /* renamed from: b, reason: collision with root package name */
    private int f637b;

    public C1006z(float[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f636a = bufferWithData;
        this.f637b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        float[] fArr = this.f636a;
        if (fArr.length < i8) {
            float[] copyOf = Arrays.copyOf(fArr, g6.m.d(i8, fArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f636a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f637b;
    }

    public final void e(float f8) {
        h0.c(this, 0, 1, null);
        float[] fArr = this.f636a;
        int d8 = d();
        this.f637b = d8 + 1;
        fArr[d8] = f8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f636a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
