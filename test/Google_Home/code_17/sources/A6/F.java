package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class F extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private int[] f508a;

    /* renamed from: b, reason: collision with root package name */
    private int f509b;

    public F(int[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f508a = bufferWithData;
        this.f509b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        int[] iArr = this.f508a;
        if (iArr.length < i8) {
            int[] copyOf = Arrays.copyOf(iArr, g6.m.d(i8, iArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f508a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f509b;
    }

    public final void e(int i8) {
        h0.c(this, 0, 1, null);
        int[] iArr = this.f508a;
        int d8 = d();
        this.f509b = d8 + 1;
        iArr[d8] = i8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.f508a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
