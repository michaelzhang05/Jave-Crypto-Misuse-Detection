package com.google.gson.t.n;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.Map;

/* compiled from: JsonTreeReader.java */
/* loaded from: classes2.dex */
public final class e extends com.google.gson.stream.a {
    private static final Reader v = new a();
    private static final Object w = new Object();
    private int[] A;
    private Object[] x;
    private int y;
    private String[] z;

    /* compiled from: JsonTreeReader.java */
    /* loaded from: classes2.dex */
    static class a extends Reader {
        a() {
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new AssertionError();
        }
    }

    private void J0(com.google.gson.stream.b bVar) throws IOException {
        if (x0() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + x0() + Y());
    }

    private Object K0() {
        return this.x[this.y - 1];
    }

    private Object L0() {
        Object[] objArr = this.x;
        int i2 = this.y - 1;
        this.y = i2;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    private void N0(Object obj) {
        int i2 = this.y;
        Object[] objArr = this.x;
        if (i2 == objArr.length) {
            Object[] objArr2 = new Object[i2 * 2];
            int[] iArr = new int[i2 * 2];
            String[] strArr = new String[i2 * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.A, 0, iArr, 0, this.y);
            System.arraycopy(this.z, 0, strArr, 0, this.y);
            this.x = objArr2;
            this.A = iArr;
            this.z = strArr;
        }
        Object[] objArr3 = this.x;
        int i3 = this.y;
        this.y = i3 + 1;
        objArr3[i3] = obj;
    }

    private String Y() {
        return " at path " + c();
    }

    @Override // com.google.gson.stream.a
    public void D() throws IOException {
        J0(com.google.gson.stream.b.END_OBJECT);
        L0();
        L0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public void H0() throws IOException {
        if (x0() == com.google.gson.stream.b.NAME) {
            q0();
            this.z[this.y - 2] = "null";
        } else {
            L0();
            int i2 = this.y;
            if (i2 > 0) {
                this.z[i2 - 1] = "null";
            }
        }
        int i3 = this.y;
        if (i3 > 0) {
            int[] iArr = this.A;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public boolean L() throws IOException {
        com.google.gson.stream.b x0 = x0();
        return (x0 == com.google.gson.stream.b.END_OBJECT || x0 == com.google.gson.stream.b.END_ARRAY) ? false : true;
    }

    public void M0() throws IOException {
        J0(com.google.gson.stream.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) K0()).next();
        N0(entry.getValue());
        N0(new com.google.gson.m((String) entry.getKey()));
    }

    @Override // com.google.gson.stream.a
    public void a() throws IOException {
        J0(com.google.gson.stream.b.BEGIN_ARRAY);
        N0(((com.google.gson.g) K0()).iterator());
        this.A[this.y - 1] = 0;
    }

    @Override // com.google.gson.stream.a
    public void b() throws IOException {
        J0(com.google.gson.stream.b.BEGIN_OBJECT);
        N0(((com.google.gson.l) K0()).J().iterator());
    }

    @Override // com.google.gson.stream.a
    public String c() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = 0;
        while (i2 < this.y) {
            Object[] objArr = this.x;
            if (objArr[i2] instanceof com.google.gson.g) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.A[i2]);
                    sb.append(']');
                }
            } else if (objArr[i2] instanceof com.google.gson.l) {
                i2++;
                if (objArr[i2] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.z;
                    if (strArr[i2] != null) {
                        sb.append(strArr[i2]);
                    }
                }
            }
            i2++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.a
    public boolean c0() throws IOException {
        J0(com.google.gson.stream.b.BOOLEAN);
        boolean D = ((com.google.gson.m) L0()).D();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return D;
    }

    @Override // com.google.gson.stream.a, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.x = new Object[]{w};
        this.y = 1;
    }

    @Override // com.google.gson.stream.a
    public double g0() throws IOException {
        com.google.gson.stream.b x0 = x0();
        com.google.gson.stream.b bVar = com.google.gson.stream.b.NUMBER;
        if (x0 != bVar && x0 != com.google.gson.stream.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x0 + Y());
        }
        double K = ((com.google.gson.m) K0()).K();
        if (!P() && (Double.isNaN(K) || Double.isInfinite(K))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + K);
        }
        L0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return K;
    }

    @Override // com.google.gson.stream.a
    public int i0() throws IOException {
        com.google.gson.stream.b x0 = x0();
        com.google.gson.stream.b bVar = com.google.gson.stream.b.NUMBER;
        if (x0 != bVar && x0 != com.google.gson.stream.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x0 + Y());
        }
        int L = ((com.google.gson.m) K0()).L();
        L0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return L;
    }

    @Override // com.google.gson.stream.a
    public long k0() throws IOException {
        com.google.gson.stream.b x0 = x0();
        com.google.gson.stream.b bVar = com.google.gson.stream.b.NUMBER;
        if (x0 != bVar && x0 != com.google.gson.stream.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x0 + Y());
        }
        long M = ((com.google.gson.m) K0()).M();
        L0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return M;
    }

    @Override // com.google.gson.stream.a
    public String q0() throws IOException {
        J0(com.google.gson.stream.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) K0()).next();
        String str = (String) entry.getKey();
        this.z[this.y - 1] = str;
        N0(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.a
    public void t0() throws IOException {
        J0(com.google.gson.stream.b.NULL);
        L0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.a
    public String toString() {
        return e.class.getSimpleName();
    }

    @Override // com.google.gson.stream.a
    public String v0() throws IOException {
        com.google.gson.stream.b x0 = x0();
        com.google.gson.stream.b bVar = com.google.gson.stream.b.STRING;
        if (x0 != bVar && x0 != com.google.gson.stream.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + x0 + Y());
        }
        String O = ((com.google.gson.m) L0()).O();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
        return O;
    }

    @Override // com.google.gson.stream.a
    public com.google.gson.stream.b x0() throws IOException {
        if (this.y == 0) {
            return com.google.gson.stream.b.END_DOCUMENT;
        }
        Object K0 = K0();
        if (K0 instanceof Iterator) {
            boolean z = this.x[this.y - 2] instanceof com.google.gson.l;
            Iterator it = (Iterator) K0;
            if (!it.hasNext()) {
                return z ? com.google.gson.stream.b.END_OBJECT : com.google.gson.stream.b.END_ARRAY;
            }
            if (z) {
                return com.google.gson.stream.b.NAME;
            }
            N0(it.next());
            return x0();
        }
        if (K0 instanceof com.google.gson.l) {
            return com.google.gson.stream.b.BEGIN_OBJECT;
        }
        if (K0 instanceof com.google.gson.g) {
            return com.google.gson.stream.b.BEGIN_ARRAY;
        }
        if (K0 instanceof com.google.gson.m) {
            com.google.gson.m mVar = (com.google.gson.m) K0;
            if (mVar.T()) {
                return com.google.gson.stream.b.STRING;
            }
            if (mVar.P()) {
                return com.google.gson.stream.b.BOOLEAN;
            }
            if (mVar.R()) {
                return com.google.gson.stream.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (K0 instanceof com.google.gson.k) {
            return com.google.gson.stream.b.NULL;
        }
        if (K0 == w) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new AssertionError();
    }

    @Override // com.google.gson.stream.a
    public void z() throws IOException {
        J0(com.google.gson.stream.b.END_ARRAY);
        L0();
        L0();
        int i2 = this.y;
        if (i2 > 0) {
            int[] iArr = this.A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }
}
