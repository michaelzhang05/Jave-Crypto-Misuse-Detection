package A6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: A6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0990i extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f569a;

    /* renamed from: b, reason: collision with root package name */
    private int f570b;

    public C0990i(byte[] bufferWithData) {
        AbstractC3255y.i(bufferWithData, "bufferWithData");
        this.f569a = bufferWithData;
        this.f570b = bufferWithData.length;
        b(10);
    }

    @Override // A6.h0
    public void b(int i8) {
        byte[] bArr = this.f569a;
        if (bArr.length < i8) {
            byte[] copyOf = Arrays.copyOf(bArr, g6.m.d(i8, bArr.length * 2));
            AbstractC3255y.h(copyOf, "copyOf(...)");
            this.f569a = copyOf;
        }
    }

    @Override // A6.h0
    public int d() {
        return this.f570b;
    }

    public final void e(byte b8) {
        h0.c(this, 0, 1, null);
        byte[] bArr = this.f569a;
        int d8 = d();
        this.f570b = d8 + 1;
        bArr[d8] = b8;
    }

    @Override // A6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f569a, d());
        AbstractC3255y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
