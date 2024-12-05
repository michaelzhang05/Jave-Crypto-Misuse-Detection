package com.squareup.moshi;

import com.squareup.moshi.i;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: JsonValueReader.java */
/* loaded from: classes2.dex */
final class m extends i {
    private static final Object l = new Object();
    private Object[] m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: JsonValueReader.java */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<Object>, Cloneable {

        /* renamed from: f, reason: collision with root package name */
        final i.b f17262f;

        /* renamed from: g, reason: collision with root package name */
        final Object[] f17263g;

        /* renamed from: h, reason: collision with root package name */
        int f17264h;

        a(i.b bVar, Object[] objArr, int i2) {
            this.f17262f = bVar;
            this.f17263g = objArr;
            this.f17264h = i2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f17262f, this.f17263g, this.f17264h);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f17264h < this.f17263g.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f17263g;
            int i2 = this.f17264h;
            this.f17264h = i2 + 1;
            return objArr[i2];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Object obj) {
        int[] iArr = this.f17250g;
        int i2 = this.f17249f;
        iArr[i2] = 7;
        Object[] objArr = new Object[32];
        this.m = objArr;
        this.f17249f = i2 + 1;
        objArr[i2] = obj;
    }

    private void B0(Object obj) {
        int i2 = this.f17249f;
        if (i2 == this.m.length) {
            if (i2 != 256) {
                int[] iArr = this.f17250g;
                this.f17250g = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f17251h;
                this.f17251h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f17252i;
                this.f17252i = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.m;
                this.m = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + c());
            }
        }
        Object[] objArr2 = this.m;
        int i3 = this.f17249f;
        this.f17249f = i3 + 1;
        objArr2[i3] = obj;
    }

    private void C0() {
        int i2 = this.f17249f - 1;
        this.f17249f = i2;
        Object[] objArr = this.m;
        objArr[i2] = null;
        this.f17250g[i2] = 0;
        if (i2 > 0) {
            int[] iArr = this.f17252i;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            Object obj = objArr[i2 - 1];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    B0(it.next());
                }
            }
        }
    }

    private <T> T D0(Class<T> cls, i.b bVar) throws IOException {
        int i2 = this.f17249f;
        Object obj = i2 != 0 ? this.m[i2 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && bVar == i.b.NULL) {
            return null;
        }
        if (obj == l) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw z0(obj, bVar);
    }

    private String E0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw z0(key, i.b.NAME);
    }

    public String A0() throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) D0(Map.Entry.class, i.b.NAME);
        String E0 = E0(entry);
        this.m[this.f17249f - 1] = entry.getValue();
        this.f17251h[this.f17249f - 2] = E0;
        return E0;
    }

    @Override // com.squareup.moshi.i
    public boolean J() throws IOException {
        Boolean bool = (Boolean) D0(Boolean.class, i.b.BOOLEAN);
        C0();
        return bool.booleanValue();
    }

    @Override // com.squareup.moshi.i
    public double L() throws IOException {
        double parseDouble;
        i.b bVar = i.b.NUMBER;
        Object D0 = D0(Object.class, bVar);
        if (D0 instanceof Number) {
            parseDouble = ((Number) D0).doubleValue();
        } else if (D0 instanceof String) {
            try {
                parseDouble = Double.parseDouble((String) D0);
            } catch (NumberFormatException unused) {
                throw z0(D0, i.b.NUMBER);
            }
        } else {
            throw z0(D0, bVar);
        }
        if (!this.f17253j && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new JsonEncodingException("JSON forbids NaN and infinities: " + parseDouble + " at path " + c());
        }
        C0();
        return parseDouble;
    }

    @Override // com.squareup.moshi.i
    public int P() throws IOException {
        int intValueExact;
        i.b bVar = i.b.NUMBER;
        Object D0 = D0(Object.class, bVar);
        if (D0 instanceof Number) {
            intValueExact = ((Number) D0).intValue();
        } else if (D0 instanceof String) {
            try {
                try {
                    intValueExact = Integer.parseInt((String) D0);
                } catch (NumberFormatException unused) {
                    throw z0(D0, i.b.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                intValueExact = new BigDecimal((String) D0).intValueExact();
            }
        } else {
            throw z0(D0, bVar);
        }
        C0();
        return intValueExact;
    }

    @Override // com.squareup.moshi.i
    public long T() throws IOException {
        long longValueExact;
        i.b bVar = i.b.NUMBER;
        Object D0 = D0(Object.class, bVar);
        if (D0 instanceof Number) {
            longValueExact = ((Number) D0).longValue();
        } else if (D0 instanceof String) {
            try {
                try {
                    longValueExact = Long.parseLong((String) D0);
                } catch (NumberFormatException unused) {
                    throw z0(D0, i.b.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                longValueExact = new BigDecimal((String) D0).longValueExact();
            }
        } else {
            throw z0(D0, bVar);
        }
        C0();
        return longValueExact;
    }

    @Override // com.squareup.moshi.i
    public <T> T Y() throws IOException {
        D0(Void.class, i.b.NULL);
        C0();
        return null;
    }

    @Override // com.squareup.moshi.i
    public void a() throws IOException {
        List list = (List) D0(List.class, i.b.BEGIN_ARRAY);
        a aVar = new a(i.b.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.m;
        int i2 = this.f17249f;
        objArr[i2 - 1] = aVar;
        this.f17250g[i2 - 1] = 1;
        this.f17252i[i2 - 1] = 0;
        if (aVar.hasNext()) {
            B0(aVar.next());
        }
    }

    @Override // com.squareup.moshi.i
    public void b() throws IOException {
        Map map = (Map) D0(Map.class, i.b.BEGIN_OBJECT);
        a aVar = new a(i.b.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.m;
        int i2 = this.f17249f;
        objArr[i2 - 1] = aVar;
        this.f17250g[i2 - 1] = 3;
        if (aVar.hasNext()) {
            B0(aVar.next());
        }
    }

    @Override // com.squareup.moshi.i
    public String c0() throws IOException {
        int i2 = this.f17249f;
        Object obj = i2 != 0 ? this.m[i2 - 1] : null;
        if (obj instanceof String) {
            C0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            C0();
            return obj.toString();
        }
        if (obj == l) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw z0(obj, i.b.STRING);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Arrays.fill(this.m, 0, this.f17249f, (Object) null);
        this.m[0] = l;
        this.f17250g[0] = 8;
        this.f17249f = 1;
    }

    @Override // com.squareup.moshi.i
    public void f() throws IOException {
        i.b bVar = i.b.END_ARRAY;
        a aVar = (a) D0(a.class, bVar);
        if (aVar.f17262f == bVar && !aVar.hasNext()) {
            C0();
            return;
        }
        throw z0(aVar, bVar);
    }

    @Override // com.squareup.moshi.i
    public i.b i0() throws IOException {
        int i2 = this.f17249f;
        if (i2 == 0) {
            return i.b.END_DOCUMENT;
        }
        Object obj = this.m[i2 - 1];
        if (obj instanceof a) {
            return ((a) obj).f17262f;
        }
        if (obj instanceof List) {
            return i.b.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return i.b.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return i.b.NAME;
        }
        if (obj instanceof String) {
            return i.b.STRING;
        }
        if (obj instanceof Boolean) {
            return i.b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return i.b.NUMBER;
        }
        if (obj == null) {
            return i.b.NULL;
        }
        if (obj == l) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw z0(obj, "a JSON value");
    }

    @Override // com.squareup.moshi.i
    public void k0() throws IOException {
        if (z()) {
            B0(A0());
        }
    }

    @Override // com.squareup.moshi.i
    public void o() throws IOException {
        i.b bVar = i.b.END_OBJECT;
        a aVar = (a) D0(a.class, bVar);
        if (aVar.f17262f == bVar && !aVar.hasNext()) {
            this.f17251h[this.f17249f - 1] = null;
            C0();
            return;
        }
        throw z0(aVar, bVar);
    }

    @Override // com.squareup.moshi.i
    public int s0(i.a aVar) throws IOException {
        Map.Entry<?, ?> entry = (Map.Entry) D0(Map.Entry.class, i.b.NAME);
        String E0 = E0(entry);
        int length = aVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (aVar.a[i2].equals(E0)) {
                this.m[this.f17249f - 1] = entry.getValue();
                this.f17251h[this.f17249f - 2] = E0;
                return i2;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.i
    public int t0(i.a aVar) throws IOException {
        int i2 = this.f17249f;
        Object obj = i2 != 0 ? this.m[i2 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != l) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = aVar.a.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (aVar.a[i3].equals(str)) {
                C0();
                return i3;
            }
        }
        return -1;
    }

    @Override // com.squareup.moshi.i
    public void w0() throws IOException {
        if (!this.f17254k) {
            this.m[this.f17249f - 1] = ((Map.Entry) D0(Map.Entry.class, i.b.NAME)).getValue();
            this.f17251h[this.f17249f - 2] = "null";
            return;
        }
        i.b i0 = i0();
        A0();
        throw new JsonDataException("Cannot skip unexpected " + i0 + " at " + c());
    }

    @Override // com.squareup.moshi.i
    public void x0() throws IOException {
        if (!this.f17254k) {
            int i2 = this.f17249f;
            if (i2 > 1) {
                this.f17251h[i2 - 2] = "null";
            }
            Object obj = i2 != 0 ? this.m[i2 - 1] : null;
            if (!(obj instanceof a)) {
                if (obj instanceof Map.Entry) {
                    Object[] objArr = this.m;
                    objArr[i2 - 1] = ((Map.Entry) objArr[i2 - 1]).getValue();
                    return;
                } else {
                    if (i2 > 0) {
                        C0();
                        return;
                    }
                    throw new JsonDataException("Expected a value but was " + i0() + " at path " + c());
                }
            }
            throw new JsonDataException("Expected a value but was " + i0() + " at path " + c());
        }
        throw new JsonDataException("Cannot skip unexpected " + i0() + " at " + c());
    }

    @Override // com.squareup.moshi.i
    public boolean z() throws IOException {
        int i2 = this.f17249f;
        if (i2 == 0) {
            return false;
        }
        Object obj = this.m[i2 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }
}
