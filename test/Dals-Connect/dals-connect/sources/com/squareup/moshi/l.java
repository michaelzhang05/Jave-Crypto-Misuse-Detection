package com.squareup.moshi;

import cm.aptoide.pt.account.AdultContentAnalytics;
import java.io.IOException;

/* compiled from: JsonUtf8Writer.java */
/* loaded from: classes2.dex */
final class l extends o {
    private static final String[] o = new String[128];
    private final j.g p;
    private String q = ":";
    private String r;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            o[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(j.g gVar) {
        if (gVar != null) {
            this.p = gVar;
            g0(6);
            return;
        }
        throw new NullPointerException("sink == null");
    }

    private o A0(int i2, int i3, char c2) throws IOException {
        int Y = Y();
        if (Y != i3 && Y != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.r == null) {
            int i4 = this.f17265f;
            int i5 = this.n;
            if (i4 == (i5 ^ (-1))) {
                this.n = i5 ^ (-1);
                return this;
            }
            int i6 = i4 - 1;
            this.f17265f = i6;
            this.f17267h[i6] = null;
            int[] iArr = this.f17268i;
            int i7 = i6 - 1;
            iArr[i7] = iArr[i7] + 1;
            if (Y == i3) {
                B0();
            }
            this.p.writeByte(c2);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.r);
    }

    private void B0() throws IOException {
        if (this.f17269j == null) {
            return;
        }
        this.p.writeByte(10);
        int i2 = this.f17265f;
        for (int i3 = 1; i3 < i2; i3++) {
            this.p.M(this.f17269j);
        }
    }

    private o C0(int i2, int i3, char c2) throws IOException {
        int i4 = this.f17265f;
        int i5 = this.n;
        if (i4 == i5) {
            int[] iArr = this.f17266g;
            if (iArr[i4 - 1] == i2 || iArr[i4 - 1] == i3) {
                this.n = i5 ^ (-1);
                return this;
            }
        }
        z0();
        f();
        g0(i2);
        this.f17268i[this.f17265f - 1] = 0;
        this.p.writeByte(c2);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void D0(j.g r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.squareup.moshi.l.o
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = 0
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.U(r8, r4, r3)
        L2e:
            r7.M(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.U(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.l.D0(j.g, java.lang.String):void");
    }

    private void E0() throws IOException {
        if (this.r != null) {
            y0();
            D0(this.p, this.r);
            this.r = null;
        }
    }

    private void y0() throws IOException {
        int Y = Y();
        if (Y == 5) {
            this.p.writeByte(44);
        } else if (Y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        B0();
        i0(4);
    }

    private void z0() throws IOException {
        int Y = Y();
        int i2 = 7;
        if (Y != 1) {
            if (Y == 2) {
                this.p.writeByte(44);
            } else {
                if (Y == 4) {
                    i2 = 5;
                    this.p.M(this.q);
                } else {
                    if (Y == 9) {
                        throw new IllegalStateException("Sink from valueSink() was not closed");
                    }
                    if (Y != 6) {
                        if (Y == 7) {
                            if (!this.f17270k) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                }
                i0(i2);
            }
        }
        B0();
        i2 = 2;
        i0(i2);
    }

    @Override // com.squareup.moshi.o
    public o L(String str) throws IOException {
        if (str != null) {
            if (this.f17265f != 0) {
                int Y = Y();
                if ((Y == 3 || Y == 5) && this.r == null && !this.m) {
                    this.r = str;
                    this.f17267h[this.f17265f - 1] = str;
                    return this;
                }
                throw new IllegalStateException("Nesting problem.");
            }
            throw new IllegalStateException("JsonWriter is closed.");
        }
        throw new NullPointerException("name == null");
    }

    @Override // com.squareup.moshi.o
    public o P() throws IOException {
        if (!this.m) {
            if (this.r != null) {
                if (this.l) {
                    E0();
                } else {
                    this.r = null;
                    return this;
                }
            }
            z0();
            this.p.M("null");
            int[] iArr = this.f17268i;
            int i2 = this.f17265f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("null cannot be used as a map key in JSON at path " + c());
    }

    @Override // com.squareup.moshi.o
    public o a() throws IOException {
        if (!this.m) {
            E0();
            return C0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + c());
    }

    @Override // com.squareup.moshi.o
    public o b() throws IOException {
        if (!this.m) {
            E0();
            return C0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.p.close();
        int i2 = this.f17265f;
        if (i2 <= 1 && (i2 != 1 || this.f17266g[i2 - 1] == 7)) {
            this.f17265f = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f17265f != 0) {
            this.p.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // com.squareup.moshi.o
    public void k0(String str) {
        super.k0(str);
        this.q = !str.isEmpty() ? ": " : ":";
    }

    @Override // com.squareup.moshi.o
    public o o() throws IOException {
        return A0(1, 2, ']');
    }

    @Override // com.squareup.moshi.o
    public o t0(double d2) throws IOException {
        if (!this.f17270k && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        if (this.m) {
            this.m = false;
            return L(Double.toString(d2));
        }
        E0();
        z0();
        this.p.M(Double.toString(d2));
        int[] iArr = this.f17268i;
        int i2 = this.f17265f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o u0(long j2) throws IOException {
        if (this.m) {
            this.m = false;
            return L(Long.toString(j2));
        }
        E0();
        z0();
        this.p.M(Long.toString(j2));
        int[] iArr = this.f17268i;
        int i2 = this.f17265f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o v0(Number number) throws IOException {
        if (number == null) {
            return P();
        }
        String obj = number.toString();
        if (!this.f17270k && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.m) {
            this.m = false;
            return L(obj);
        }
        E0();
        z0();
        this.p.M(obj);
        int[] iArr = this.f17268i;
        int i2 = this.f17265f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o w() throws IOException {
        this.m = false;
        return A0(3, 5, '}');
    }

    @Override // com.squareup.moshi.o
    public o w0(String str) throws IOException {
        if (str == null) {
            return P();
        }
        if (this.m) {
            this.m = false;
            return L(str);
        }
        E0();
        z0();
        D0(this.p, str);
        int[] iArr = this.f17268i;
        int i2 = this.f17265f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o x0(boolean z) throws IOException {
        if (!this.m) {
            E0();
            z0();
            this.p.M(z ? "true" : AdultContentAnalytics.UNLOCK);
            int[] iArr = this.f17268i;
            int i2 = this.f17265f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c());
    }
}
