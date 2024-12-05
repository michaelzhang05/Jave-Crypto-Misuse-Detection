package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class t0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f608a;

    /* renamed from: b, reason: collision with root package name */
    private int f609b;

    public /* synthetic */ t0(byte[] bArr, AbstractC3247p abstractC3247p) {
        this(bArr);
    }

    @Override // A6.h0
    public /* bridge */ /* synthetic */ Object a() {
        return O5.z.c(f());
    }

    @Override // A6.h0
    public void b(int i8) {
        if (O5.z.p(this.f608a) < i8) {
            byte[] bArr = this.f608a;
            byte[] copyOf = Arrays.copyOf(bArr, g6.m.d(i8, O5.z.p(bArr) * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f608a = O5.z.f(copyOf);
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f609b;
    }

    public final void e(byte b8) {
        h0.c(this, 0, 1, null);
        byte[] bArr = this.f608a;
        int d8 = d();
        this.f609b = d8 + 1;
        O5.z.u(bArr, d8, b8);
    }

    public byte[] f() {
        byte[] copyOf = Arrays.copyOf(this.f608a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return O5.z.f(copyOf);
    }

    private t0(byte[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f608a = bufferWithData;
        this.f609b = O5.z.p(bufferWithData);
        b(10);
    }
}
