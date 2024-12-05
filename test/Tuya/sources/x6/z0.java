package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class z0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private long[] f39643a;

    /* renamed from: b, reason: collision with root package name */
    private int f39644b;

    public /* synthetic */ z0(long[] jArr, AbstractC3151p abstractC3151p) {
        this(jArr);
    }

    @Override // x6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return L5.D.a(f());
    }

    @Override // x6.h0
    public void b(int i8) {
        if (L5.D.s(this.f39643a) < i8) {
            long[] jArr = this.f39643a;
            long[] copyOf = Arrays.copyOf(jArr, d6.m.d(i8, L5.D.s(jArr) * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39643a = L5.D.h(copyOf);
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39644b;
    }

    public final void e(long j8) {
        h0.c(this, 0, 1, null);
        long[] jArr = this.f39643a;
        int d8 = d();
        this.f39644b = d8 + 1;
        L5.D.w(jArr, d8, j8);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.f39643a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return L5.D.h(copyOf);
    }

    private z0(long[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39643a = bufferWithData;
        this.f39644b = L5.D.s(bufferWithData);
        b(10);
    }
}
