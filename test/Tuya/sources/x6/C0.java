package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class C0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private short[] f39506a;

    /* renamed from: b, reason: collision with root package name */
    private int f39507b;

    public /* synthetic */ C0(short[] sArr, AbstractC3151p abstractC3151p) {
        this(sArr);
    }

    @Override // x6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return L5.G.a(f());
    }

    @Override // x6.h0
    public void b(int i8) {
        if (L5.G.s(this.f39506a) < i8) {
            short[] sArr = this.f39506a;
            short[] copyOf = Arrays.copyOf(sArr, d6.m.d(i8, L5.G.s(sArr) * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39506a = L5.G.h(copyOf);
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39507b;
    }

    public final void e(short s8) {
        h0.c(this, 0, 1, null);
        short[] sArr = this.f39506a;
        int d8 = d();
        this.f39507b = d8 + 1;
        L5.G.w(sArr, d8, s8);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.f39506a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return L5.G.h(copyOf);
    }

    private C0(short[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39506a = bufferWithData;
        this.f39507b = L5.G.s(bufferWithData);
        b(10);
    }
}
