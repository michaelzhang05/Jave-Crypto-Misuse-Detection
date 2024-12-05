package com.google.zxing.f.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BinaryShiftToken.java */
/* loaded from: classes2.dex */
public final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f17018c;

    /* renamed from: d, reason: collision with root package name */
    private final short f17019d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(g gVar, int i2, int i3) {
        super(gVar);
        this.f17018c = (short) i2;
        this.f17019d = (short) i3;
    }

    @Override // com.google.zxing.f.b.g
    public void c(com.google.zxing.g.a aVar, byte[] bArr) {
        int i2 = 0;
        while (true) {
            short s = this.f17019d;
            if (i2 >= s) {
                return;
            }
            if (i2 == 0 || (i2 == 31 && s <= 62)) {
                aVar.d(31, 5);
                short s2 = this.f17019d;
                if (s2 > 62) {
                    aVar.d(s2 - 31, 16);
                } else if (i2 == 0) {
                    aVar.d(Math.min((int) s2, 31), 5);
                } else {
                    aVar.d(s2 - 31, 5);
                }
            }
            aVar.d(bArr[this.f17018c + i2], 8);
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f17018c);
        sb.append("::");
        sb.append((this.f17018c + this.f17019d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
