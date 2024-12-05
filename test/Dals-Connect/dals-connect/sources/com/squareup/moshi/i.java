package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: JsonReader.java */
/* loaded from: classes2.dex */
public abstract class i implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    int f17249f;

    /* renamed from: g, reason: collision with root package name */
    int[] f17250g = new int[32];

    /* renamed from: h, reason: collision with root package name */
    String[] f17251h = new String[32];

    /* renamed from: i, reason: collision with root package name */
    int[] f17252i = new int[32];

    /* renamed from: j, reason: collision with root package name */
    boolean f17253j;

    /* renamed from: k, reason: collision with root package name */
    boolean f17254k;

    /* compiled from: JsonReader.java */
    /* loaded from: classes2.dex */
    public static final class a {
        final String[] a;

        /* renamed from: b, reason: collision with root package name */
        final j.t f17255b;

        private a(String[] strArr, j.t tVar) {
            this.a = strArr;
            this.f17255b = tVar;
        }

        public static a a(String... strArr) {
            try {
                j.i[] iVarArr = new j.i[strArr.length];
                j.f fVar = new j.f();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    l.D0(fVar, strArr[i2]);
                    fVar.readByte();
                    iVarArr[i2] = fVar.X();
                }
                return new a((String[]) strArr.clone(), j.t.J(iVarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: JsonReader.java */
    /* loaded from: classes2.dex */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public static i g0(j.h hVar) {
        return new k(hVar);
    }

    public final boolean D() {
        return this.f17253j;
    }

    public abstract boolean J() throws IOException;

    public abstract double L() throws IOException;

    public abstract int P() throws IOException;

    public abstract long T() throws IOException;

    public abstract <T> T Y() throws IOException;

    public abstract void a() throws IOException;

    public abstract void b() throws IOException;

    public final String c() {
        return j.a(this.f17249f, this.f17250g, this.f17251h, this.f17252i);
    }

    public abstract String c0() throws IOException;

    public abstract void f() throws IOException;

    public abstract b i0() throws IOException;

    public abstract void k0() throws IOException;

    public abstract void o() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q0(int i2) {
        int i3 = this.f17249f;
        int[] iArr = this.f17250g;
        if (i3 == iArr.length) {
            if (i3 != 256) {
                this.f17250g = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f17251h;
                this.f17251h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f17252i;
                this.f17252i = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + c());
            }
        }
        int[] iArr3 = this.f17250g;
        int i4 = this.f17249f;
        this.f17249f = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int s0(a aVar) throws IOException;

    public abstract int t0(a aVar) throws IOException;

    public final void u0(boolean z) {
        this.f17254k = z;
    }

    public final void v0(boolean z) {
        this.f17253j = z;
    }

    public final boolean w() {
        return this.f17254k;
    }

    public abstract void w0() throws IOException;

    public abstract void x0() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JsonEncodingException y0(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + c());
    }

    public abstract boolean z() throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JsonDataException z0(Object obj, Object obj2) {
        if (obj == null) {
            return new JsonDataException("Expected " + obj2 + " but was null at path " + c());
        }
        return new JsonDataException("Expected " + obj2 + " but was " + obj + ", a " + obj.getClass().getName() + ", at path " + c());
    }
}
