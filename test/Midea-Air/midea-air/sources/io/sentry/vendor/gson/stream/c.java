package io.sentry.vendor.gson.stream;

import cm.aptoide.pt.account.AdultContentAnalytics;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonWriter.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f19317f = new String[128];

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f19318g;

    /* renamed from: h, reason: collision with root package name */
    private final Writer f19319h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f19320i = new int[32];

    /* renamed from: j, reason: collision with root package name */
    private int f19321j = 0;

    /* renamed from: k, reason: collision with root package name */
    private String f19322k;
    private String l;
    private boolean m;
    private boolean n;
    private String o;
    private boolean p;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f19317f[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f19317f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f19318g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        c0(6);
        this.l = ":";
        this.p = true;
        if (writer != null) {
            this.f19319h = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private void L() throws IOException {
        if (this.f19322k == null) {
            return;
        }
        this.f19319h.write(10);
        int i2 = this.f19321j;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f19319h.write(this.f19322k);
        }
    }

    private c T(int i2, char c2) throws IOException {
        b();
        c0(i2);
        this.f19319h.write(c2);
        return this;
    }

    private int Y() {
        int i2 = this.f19321j;
        if (i2 != 0) {
            return this.f19320i[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void a() throws IOException {
        int Y = Y();
        if (Y == 5) {
            this.f19319h.write(44);
        } else if (Y != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        L();
        g0(4);
    }

    private void b() throws IOException {
        int Y = Y();
        if (Y == 1) {
            g0(2);
            L();
            return;
        }
        if (Y == 2) {
            this.f19319h.append(',');
            L();
        } else {
            if (Y != 4) {
                if (Y != 6) {
                    if (Y == 7) {
                        if (!this.m) {
                            throw new IllegalStateException("JSON must have only one top-level value.");
                        }
                    } else {
                        throw new IllegalStateException("Nesting problem.");
                    }
                }
                g0(7);
                return;
            }
            this.f19319h.append((CharSequence) this.l);
            g0(5);
        }
    }

    private void c0(int i2) {
        int i3 = this.f19321j;
        int[] iArr = this.f19320i;
        if (i3 == iArr.length) {
            this.f19320i = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f19320i;
        int i4 = this.f19321j;
        this.f19321j = i4 + 1;
        iArr2[i4] = i2;
    }

    private void g0(int i2) {
        this.f19320i[this.f19321j - 1] = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.n
            if (r0 == 0) goto L7
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f19318g
            goto L9
        L7:
            java.lang.String[] r0 = io.sentry.vendor.gson.stream.c.f19317f
        L9:
            java.io.Writer r1 = r8.f19319h
            r2 = 34
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
            java.io.Writer r6 = r8.f19319h
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f19319h
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f19319h
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f19319h
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.c.k0(java.lang.String):void");
    }

    private c w(int i2, int i3, char c2) throws IOException {
        int Y = Y();
        if (Y != i3 && Y != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.o == null) {
            this.f19321j--;
            if (Y == i3) {
                L();
            }
            this.f19319h.write(c2);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.o);
    }

    private void w0() throws IOException {
        if (this.o != null) {
            a();
            k0(this.o);
            this.o = null;
        }
    }

    public c D() throws IOException {
        return w(3, 5, '}');
    }

    public c J(String str) throws IOException {
        if (str != null) {
            if (this.o == null) {
                if (this.f19321j != 0) {
                    this.o = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public c P() throws IOException {
        if (this.o != null) {
            if (this.p) {
                w0();
            } else {
                this.o = null;
                return this;
            }
        }
        b();
        this.f19319h.write("null");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f19319h.close();
        int i2 = this.f19321j;
        if (i2 <= 1 && (i2 != 1 || this.f19320i[i2 - 1] == 7)) {
            this.f19321j = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c f() throws IOException {
        w0();
        return T(1, '[');
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f19321j != 0) {
            this.f19319h.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void i0(String str) {
        if (str.length() == 0) {
            this.f19322k = null;
            this.l = ":";
        } else {
            this.f19322k = str;
            this.l = ": ";
        }
    }

    public c o() throws IOException {
        w0();
        return T(3, '{');
    }

    public c q0(long j2) throws IOException {
        w0();
        b();
        this.f19319h.write(Long.toString(j2));
        return this;
    }

    public c s0(Boolean bool) throws IOException {
        if (bool == null) {
            return P();
        }
        w0();
        b();
        this.f19319h.write(bool.booleanValue() ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    public c t0(Number number) throws IOException {
        if (number == null) {
            return P();
        }
        w0();
        String obj = number.toString();
        if (!this.m && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        b();
        this.f19319h.append((CharSequence) obj);
        return this;
    }

    public c u0(String str) throws IOException {
        if (str == null) {
            return P();
        }
        w0();
        b();
        k0(str);
        return this;
    }

    public c v0(boolean z) throws IOException {
        w0();
        b();
        this.f19319h.write(z ? "true" : AdultContentAnalytics.UNLOCK);
        return this;
    }

    public c z() throws IOException {
        return w(1, 2, ']');
    }
}
