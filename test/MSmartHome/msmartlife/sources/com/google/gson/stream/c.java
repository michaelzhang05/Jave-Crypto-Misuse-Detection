package com.google.gson.stream;

import cm.aptoide.pt.account.AdultContentAnalytics;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* compiled from: JsonWriter.java */
/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f16861f = new String[128];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f16862g;

    /* renamed from: h, reason: collision with root package name */
    private final Writer f16863h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f16864i = new int[32];

    /* renamed from: j, reason: collision with root package name */
    private int f16865j = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f16866k;
    private String l;
    private boolean m;
    private boolean n;
    private String o;
    private boolean p;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f16861f[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f16861f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f16862g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        k0(6);
        this.l = ":";
        this.p = true;
        if (writer != null) {
            this.f16863h = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void C0() throws IOException {
        if (this.o != null) {
            a();
            w0(this.o);
            this.o = null;
        }
    }

    private void Y() throws IOException {
        if (this.f16866k == null) {
            return;
        }
        this.f16863h.write("\n");
        int i2 = this.f16865j;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f16863h.write(this.f16866k);
        }
    }

    private void a() throws IOException {
        int i0 = i0();
        if (i0 == 5) {
            this.f16863h.write(44);
        } else if (i0 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        Y();
        q0(4);
    }

    private void b() throws IOException {
        int i0 = i0();
        if (i0 == 1) {
            q0(2);
            Y();
            return;
        }
        if (i0 == 2) {
            this.f16863h.append(',');
            Y();
        } else {
            if (i0 != 4) {
                if (i0 != 6) {
                    if (i0 == 7) {
                        if (!this.m) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                q0(7);
                return;
            }
            this.f16863h.append((CharSequence) this.l);
            q0(5);
        }
    }

    private c g0(int i2, String str) throws IOException {
        b();
        k0(i2);
        this.f16863h.write(str);
        return this;
    }

    private int i0() {
        int i2 = this.f16865j;
        if (i2 != 0) {
            return this.f16864i[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void k0(int i2) {
        int i3 = this.f16865j;
        int[] iArr = this.f16864i;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[i3 * 2];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f16864i = iArr2;
        }
        int[] iArr3 = this.f16864i;
        int i4 = this.f16865j;
        this.f16865j = i4 + 1;
        iArr3[i4] = i2;
    }

    private void q0(int i2) {
        this.f16864i[this.f16865j - 1] = i2;
    }

    private c w(int i2, int i3, String str) throws IOException {
        int i0 = i0();
        if (i0 != i3 && i0 != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.o == null) {
            this.f16865j--;
            if (i0 == i3) {
                Y();
            }
            this.f16863h.write(str);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.n
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.c.f16862g
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.c.f16861f
        L9:
            java.io.Writer r1 = r8.f16863h
            java.lang.String r2 = "\""
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = 0
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f16863h
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f16863h
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f16863h
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f16863h
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.c.w0(java.lang.String):void");
    }

    public c A0(String str) throws IOException {
        if (str == null) {
            return c0();
        }
        C0();
        b();
        w0(str);
        return this;
    }

    public c B0(boolean z) throws IOException {
        C0();
        b();
        this.f16863h.write(z ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    public c D() throws IOException {
        return w(3, 5, "}");
    }

    public final boolean J() {
        return this.p;
    }

    public final boolean L() {
        return this.n;
    }

    public boolean P() {
        return this.m;
    }

    public c T(String str) throws IOException {
        if (str != null) {
            if (this.o == null) {
                if (this.f16865j != 0) {
                    this.o = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c c0() throws IOException {
        if (this.o != null) {
            if (this.p) {
                C0();
            } else {
                this.o = null;
                return this;
            }
        }
        b();
        this.f16863h.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f16863h.close();
        int i2 = this.f16865j;
        if (i2 <= 1 && (i2 != 1 || this.f16864i[i2 - 1] == 7)) {
            this.f16865j = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c f() throws IOException {
        C0();
        return g0(1, "[");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f16865j != 0) {
            this.f16863h.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c o() throws IOException {
        C0();
        return g0(3, "{");
    }

    public final void s0(boolean z) {
        this.n = z;
    }

    public final void t0(String str) {
        if (str.length() == 0) {
            this.f16866k = null;
            this.l = ":";
        } else {
            this.f16866k = str;
            this.l = ": ";
        }
    }

    public final void u0(boolean z) {
        this.m = z;
    }

    public final void v0(boolean z) {
        this.p = z;
    }

    public c x0(long j2) throws IOException {
        C0();
        b();
        this.f16863h.write(Long.toString(j2));
        return this;
    }

    public c y0(Boolean bool) throws IOException {
        if (bool == null) {
            return c0();
        }
        C0();
        b();
        this.f16863h.write(bool.booleanValue() ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    public c z() throws IOException {
        return w(1, 2, "]");
    }

    public c z0(Number number) throws IOException {
        if (number == null) {
            return c0();
        }
        C0();
        String obj = number.toString();
        if (!this.m && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        b();
        this.f16863h.append((CharSequence) obj);
        return this;
    }
}
