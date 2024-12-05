package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class t0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f39613a;

    /* renamed from: b, reason: collision with root package name */
    private int f39614b;

    public /* synthetic */ t0(byte[] bArr, AbstractC3151p abstractC3151p) {
        this(bArr);
    }

    @Override // x6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return L5.z.a(f());
    }

    @Override // x6.h0
    public void b(int i8) {
        if (L5.z.s(this.f39613a) < i8) {
            byte[] bArr = this.f39613a;
            byte[] copyOf = Arrays.copyOf(bArr, d6.m.d(i8, L5.z.s(bArr) * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39613a = L5.z.h(copyOf);
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39614b;
    }

    public final void e(byte b8) {
        h0.c(this, 0, 1, null);
        byte[] bArr = this.f39613a;
        int d8 = d();
        this.f39614b = d8 + 1;
        L5.z.w(bArr, d8, b8);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f39613a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return L5.z.h(copyOf);
    }

    private t0(byte[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39613a = bufferWithData;
        this.f39614b = L5.z.s(bufferWithData);
        b(10);
    }
}
