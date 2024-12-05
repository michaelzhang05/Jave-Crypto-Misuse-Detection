package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class O extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f519a;

    /* renamed from: b, reason: collision with root package name */
    private int f520b;

    public O(long[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f519a = bufferWithData;
        this.f520b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        long[] jArr = this.f519a;
        if (jArr.length < i8) {
            long[] copyOf = Arrays.copyOf(jArr, g6.m.d(i8, jArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f519a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f520b;
    }

    public final void e(long j8) {
        h0.c(this, 0, 1, null);
        long[] jArr = this.f519a;
        int d8 = d();
        this.f520b = d8 + 1;
        jArr[d8] = j8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.f519a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
