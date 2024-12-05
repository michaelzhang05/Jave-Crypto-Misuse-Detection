package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3965z extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private float[] f39641a;

    /* renamed from: b, reason: collision with root package name */
    private int f39642b;

    public C3965z(float[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39641a = bufferWithData;
        this.f39642b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        float[] fArr = this.f39641a;
        if (fArr.length < i8) {
            float[] copyOf = Arrays.copyOf(fArr, d6.m.d(i8, fArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39641a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39642b;
    }

    public final void e(float f8) {
        h0.c(this, 0, 1, null);
        float[] fArr = this.f39641a;
        int d8 = d();
        this.f39642b = d8 + 1;
        fArr[d8] = f8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] copyOf = Arrays.copyOf(this.f39641a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
