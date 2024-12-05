package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class r extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private double[] f593a;

    /* renamed from: b, reason: collision with root package name */
    private int f594b;

    public r(double[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f593a = bufferWithData;
        this.f594b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        double[] dArr = this.f593a;
        if (dArr.length < i8) {
            double[] copyOf = Arrays.copyOf(dArr, g6.m.d(i8, dArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f593a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f594b;
    }

    public final void e(double d8) {
        h0.c(this, 0, 1, null);
        double[] dArr = this.f593a;
        int d9 = d();
        this.f594b = d9 + 1;
        dArr[d9] = d8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f593a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
