package com.google.zxing.f.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SimpleToken.java */
/* loaded from: classes2.dex */
public final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f17025c;

    /* renamed from: d, reason: collision with root package name */
    private final short f17026d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(g gVar, int i2, int i3) {
        super(gVar);
        this.f17025c = (short) i2;
        this.f17026d = (short) i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.zxing.f.b.g
    public void c(com.google.zxing.g.a aVar, byte[] bArr) {
        aVar.d(this.f17025c, this.f17026d);
    }

    public String toString() {
        short s = this.f17025c;
        short s2 = this.f17026d;
        return "<" + Integer.toBinaryString((s & ((1 << s2) - 1)) | (1 << s2) | (1 << this.f17026d)).substring(1) + '>';
    }
}
