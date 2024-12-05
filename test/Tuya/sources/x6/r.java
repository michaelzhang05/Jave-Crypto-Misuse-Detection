package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class r extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private double[] f39598a;

    /* renamed from: b, reason: collision with root package name */
    private int f39599b;

    public r(double[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39598a = bufferWithData;
        this.f39599b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        double[] dArr = this.f39598a;
        if (dArr.length < i8) {
            double[] copyOf = Arrays.copyOf(dArr, d6.m.d(i8, dArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39598a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39599b;
    }

    public final void e(double d8) {
        h0.c(this, 0, 1, null);
        double[] dArr = this.f39598a;
        int d9 = d();
        this.f39599b = d9 + 1;
        dArr[d9] = d8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f39598a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
