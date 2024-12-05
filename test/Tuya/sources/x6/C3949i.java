package x6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: x6.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3949i extends h0 {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f39574a;

    /* renamed from: b, reason: collision with root package name */
    private int f39575b;

    public C3949i(byte[] bufferWithData) {
        AbstractC3159y.i(bufferWithData, "bufferWithData");
        this.f39574a = bufferWithData;
        this.f39575b = bufferWithData.length;
        b(10);
    }

    @Override // x6.h0
    public void b(int i8) {
        byte[] bArr = this.f39574a;
        if (bArr.length < i8) {
            byte[] copyOf = Arrays.copyOf(bArr, d6.m.d(i8, bArr.length * 2));
            AbstractC3159y.h(copyOf, "copyOf(...)");
            this.f39574a = copyOf;
        }
    }

    @Override // x6.h0
    public int d() {
        return this.f39575b;
    }

    public final void e(byte b8) {
        h0.c(this, 0, 1, null);
        byte[] bArr = this.f39574a;
        int d8 = d();
        this.f39575b = d8 + 1;
        bArr[d8] = b8;
    }

    @Override // x6.h0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] copyOf = Arrays.copyOf(this.f39574a, d());
        AbstractC3159y.h(copyOf, "copyOf(...)");
        return copyOf;
    }
}
