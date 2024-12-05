package com.squareup.moshi;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JsonValueWriter.java */
/* loaded from: classes2.dex */
public final class n extends o {
    Object[] o = new Object[32];
    private String p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n() {
        g0(6);
    }

    private n y0(Object obj) {
        String str;
        Object put;
        int Y = Y();
        int i2 = this.f17265f;
        if (i2 == 1) {
            if (Y == 6) {
                this.f17266g[i2 - 1] = 7;
                this.o[i2 - 1] = obj;
            } else {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
        } else if (Y != 3 || (str = this.p) == null) {
            if (Y != 1) {
                if (Y == 9) {
                    throw new IllegalStateException("Sink from valueSink() was not closed");
                }
                throw new IllegalStateException("Nesting problem.");
            }
            ((List) this.o[i2 - 1]).add(obj);
        } else if ((obj == null && !this.l) || (put = ((Map) this.o[i2 - 1]).put(str, obj)) == null) {
            this.p = null;
        } else {
            throw new IllegalArgumentException("Map key '" + this.p + "' has multiple values at path " + c() + ": " + put + " and " + obj);
        }
        return this;
    }

    @Override // com.squareup.moshi.o
    public o L(String str) throws IOException {
        if (str != null) {
            if (this.f17265f != 0) {
                if (Y() == 3 && this.p == null && !this.m) {
                    this.p = str;
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
            y0(null);
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
            int i2 = this.f17265f;
            int i3 = this.n;
            if (i2 == i3 && this.f17266g[i2 - 1] == 1) {
                this.n = i3 ^ (-1);
                return this;
            }
            f();
            ArrayList arrayList = new ArrayList();
            y0(arrayList);
            Object[] objArr = this.o;
            int i4 = this.f17265f;
            objArr[i4] = arrayList;
            this.f17268i[i4] = 0;
            g0(1);
            return this;
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + c());
    }

    @Override // com.squareup.moshi.o
    public o b() throws IOException {
        if (!this.m) {
            int i2 = this.f17265f;
            int i3 = this.n;
            if (i2 == i3 && this.f17266g[i2 - 1] == 3) {
                this.n = i3 ^ (-1);
                return this;
            }
            f();
            p pVar = new p();
            y0(pVar);
            this.o[this.f17265f] = pVar;
            g0(3);
            return this;
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + c());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i2 = this.f17265f;
        if (i2 <= 1 && (i2 != 1 || this.f17266g[i2 - 1] == 7)) {
            this.f17265f = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.f17265f == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // com.squareup.moshi.o
    public o o() throws IOException {
        if (Y() == 1) {
            int i2 = this.f17265f;
            int i3 = this.n;
            if (i2 == (i3 ^ (-1))) {
                this.n = i3 ^ (-1);
                return this;
            }
            int i4 = i2 - 1;
            this.f17265f = i4;
            this.o[i4] = null;
            int[] iArr = this.f17268i;
            int i5 = i4 - 1;
            iArr[i5] = iArr[i5] + 1;
            return this;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.o
    public o t0(double d2) throws IOException {
        if (!this.f17270k && (Double.isNaN(d2) || d2 == Double.NEGATIVE_INFINITY || d2 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
        }
        if (this.m) {
            this.m = false;
            return L(Double.toString(d2));
        }
        y0(Double.valueOf(d2));
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
        y0(Long.valueOf(j2));
        int[] iArr = this.f17268i;
        int i2 = this.f17265f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o v0(Number number) throws IOException {
        if (!(number instanceof Byte) && !(number instanceof Short) && !(number instanceof Integer) && !(number instanceof Long)) {
            if ((number instanceof Float) || (number instanceof Double)) {
                return t0(number.doubleValue());
            }
            if (number == null) {
                return P();
            }
            BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
            if (this.m) {
                this.m = false;
                return L(bigDecimal.toString());
            }
            y0(bigDecimal);
            int[] iArr = this.f17268i;
            int i2 = this.f17265f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        return u0(number.longValue());
    }

    @Override // com.squareup.moshi.o
    public o w() throws IOException {
        if (Y() == 3) {
            if (this.p == null) {
                int i2 = this.f17265f;
                int i3 = this.n;
                if (i2 == (i3 ^ (-1))) {
                    this.n = i3 ^ (-1);
                    return this;
                }
                this.m = false;
                int i4 = i2 - 1;
                this.f17265f = i4;
                this.o[i4] = null;
                this.f17267h[i4] = null;
                int[] iArr = this.f17268i;
                int i5 = i4 - 1;
                iArr[i5] = iArr[i5] + 1;
                return this;
            }
            throw new IllegalStateException("Dangling name: " + this.p);
        }
        throw new IllegalStateException("Nesting problem.");
    }

    @Override // com.squareup.moshi.o
    public o w0(String str) throws IOException {
        if (this.m) {
            this.m = false;
            return L(str);
        }
        y0(str);
        int[] iArr = this.f17268i;
        int i2 = this.f17265f - 1;
        iArr[i2] = iArr[i2] + 1;
        return this;
    }

    @Override // com.squareup.moshi.o
    public o x0(boolean z) throws IOException {
        if (!this.m) {
            y0(Boolean.valueOf(z));
            int[] iArr = this.f17268i;
            int i2 = this.f17265f - 1;
            iArr[i2] = iArr[i2] + 1;
            return this;
        }
        throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c());
    }

    public Object z0() {
        int i2 = this.f17265f;
        if (i2 <= 1 && (i2 != 1 || this.f17266g[i2 - 1] == 7)) {
            return this.o[0];
        }
        throw new IllegalStateException("Incomplete document");
    }
}
