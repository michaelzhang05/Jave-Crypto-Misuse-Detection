package x0;

import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import x0.AbstractC4181p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class J extends AbstractC4181p {

    /* renamed from: h, reason: collision with root package name */
    static final AbstractC4181p f40569h = new J(null, new Object[0], 0);

    /* renamed from: e, reason: collision with root package name */
    private final transient Object f40570e;

    /* renamed from: f, reason: collision with root package name */
    final transient Object[] f40571f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f40572g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a extends r {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC4181p f40573c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f40574d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f40575e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f40576f;

        /* renamed from: x0.J$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0921a extends AbstractC4180o {
            C0921a() {
            }

            @Override // java.util.List
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i8) {
                w0.h.g(i8, a.this.f40576f);
                int i9 = i8 * 2;
                Object obj = a.this.f40574d[a.this.f40575e + i9];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f40574d[i9 + (a.this.f40575e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // x0.AbstractC4179n
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f40576f;
            }
        }

        a(AbstractC4181p abstractC4181p, Object[] objArr, int i8, int i9) {
            this.f40573c = abstractC4181p;
            this.f40574d = objArr;
            this.f40575e = i8;
            this.f40576f = i9;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return k().iterator();
        }

        @Override // x0.AbstractC4179n
        int c(Object[] objArr, int i8) {
            return k().c(objArr, i8);
        }

        @Override // x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f40573c.get(key))) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public boolean j() {
            return true;
        }

        @Override // x0.r
        AbstractC4180o q() {
            return new C0921a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f40576f;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends r {

        /* renamed from: c, reason: collision with root package name */
        private final transient AbstractC4181p f40578c;

        /* renamed from: d, reason: collision with root package name */
        private final transient AbstractC4180o f40579d;

        b(AbstractC4181p abstractC4181p, AbstractC4180o abstractC4180o) {
            this.f40578c = abstractC4181p;
            this.f40579d = abstractC4180o;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public S iterator() {
            return k().iterator();
        }

        @Override // x0.AbstractC4179n
        int c(Object[] objArr, int i8) {
            return k().c(objArr, i8);
        }

        @Override // x0.AbstractC4179n, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (this.f40578c.get(obj) != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public boolean j() {
            return true;
        }

        @Override // x0.r
        public AbstractC4180o k() {
            return this.f40579d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f40578c.size();
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends AbstractC4180o {

        /* renamed from: c, reason: collision with root package name */
        private final transient Object[] f40580c;

        /* renamed from: d, reason: collision with root package name */
        private final transient int f40581d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f40582e;

        c(Object[] objArr, int i8, int i9) {
            this.f40580c = objArr;
            this.f40581d = i8;
            this.f40582e = i9;
        }

        @Override // java.util.List
        public Object get(int i8) {
            w0.h.g(i8, this.f40582e);
            Object obj = this.f40580c[(i8 * 2) + this.f40581d];
            Objects.requireNonNull(obj);
            return obj;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // x0.AbstractC4179n
        public boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f40582e;
        }
    }

    private J(Object obj, Object[] objArr, int i8) {
        this.f40570e = obj;
        this.f40571f = objArr;
        this.f40572g = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static J i(int i8, Object[] objArr, AbstractC4181p.a aVar) {
        if (i8 == 0) {
            return (J) f40569h;
        }
        if (i8 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC4172g.a(obj, obj2);
            return new J(null, objArr, 1);
        }
        w0.h.k(i8, objArr.length >> 1);
        Object j8 = j(objArr, i8, r.m(i8), 0);
        if (j8 instanceof Object[]) {
            Object[] objArr2 = (Object[]) j8;
            AbstractC4181p.a.C0924a c0924a = (AbstractC4181p.a.C0924a) objArr2[2];
            if (aVar != null) {
                aVar.f40653e = c0924a;
                Object obj3 = objArr2[0];
                int intValue = ((Integer) objArr2[1]).intValue();
                objArr = Arrays.copyOf(objArr, intValue * 2);
                j8 = obj3;
                i8 = intValue;
            } else {
                throw c0924a.a();
            }
        }
        return new J(j8, objArr, i8);
    }

    private static Object j(Object[] objArr, int i8, int i9, int i10) {
        AbstractC4181p.a.C0924a c0924a = null;
        if (i8 == 1) {
            Object obj = objArr[i10];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i10 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC4172g.a(obj, obj2);
            return null;
        }
        int i11 = i9 - 1;
        int i12 = -1;
        if (i9 <= 128) {
            byte[] bArr = new byte[i9];
            Arrays.fill(bArr, (byte) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i8; i14++) {
                int i15 = (i14 * 2) + i10;
                int i16 = (i13 * 2) + i10;
                Object obj3 = objArr[i15];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC4172g.a(obj3, obj4);
                int b8 = AbstractC4178m.b(obj3.hashCode());
                while (true) {
                    int i17 = b8 & i11;
                    int i18 = bArr[i17] & 255;
                    if (i18 == 255) {
                        bArr[i17] = (byte) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj3;
                            objArr[i16 ^ 1] = obj4;
                        }
                        i13++;
                    } else {
                        if (obj3.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj5 = objArr[i19];
                            Objects.requireNonNull(obj5);
                            c0924a = new AbstractC4181p.a.C0924a(obj3, obj4, obj5);
                            objArr[i19] = obj4;
                            break;
                        }
                        b8 = i17 + 1;
                    }
                }
            }
            if (i13 != i8) {
                return new Object[]{bArr, Integer.valueOf(i13), c0924a};
            }
            return bArr;
        }
        if (i9 <= 32768) {
            short[] sArr = new short[i9];
            Arrays.fill(sArr, (short) -1);
            int i20 = 0;
            for (int i21 = 0; i21 < i8; i21++) {
                int i22 = (i21 * 2) + i10;
                int i23 = (i20 * 2) + i10;
                Object obj6 = objArr[i22];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i22 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC4172g.a(obj6, obj7);
                int b9 = AbstractC4178m.b(obj6.hashCode());
                while (true) {
                    int i24 = b9 & i11;
                    int i25 = sArr[i24] & 65535;
                    if (i25 == 65535) {
                        sArr[i24] = (short) i23;
                        if (i20 < i21) {
                            objArr[i23] = obj6;
                            objArr[i23 ^ 1] = obj7;
                        }
                        i20++;
                    } else {
                        if (obj6.equals(objArr[i25])) {
                            int i26 = i25 ^ 1;
                            Object obj8 = objArr[i26];
                            Objects.requireNonNull(obj8);
                            c0924a = new AbstractC4181p.a.C0924a(obj6, obj7, obj8);
                            objArr[i26] = obj7;
                            break;
                        }
                        b9 = i24 + 1;
                    }
                }
            }
            if (i20 != i8) {
                return new Object[]{sArr, Integer.valueOf(i20), c0924a};
            }
            return sArr;
        }
        int[] iArr = new int[i9];
        Arrays.fill(iArr, -1);
        int i27 = 0;
        int i28 = 0;
        while (i27 < i8) {
            int i29 = (i27 * 2) + i10;
            int i30 = (i28 * 2) + i10;
            Object obj9 = objArr[i29];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i29 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC4172g.a(obj9, obj10);
            int b10 = AbstractC4178m.b(obj9.hashCode());
            while (true) {
                int i31 = b10 & i11;
                int i32 = iArr[i31];
                if (i32 == i12) {
                    iArr[i31] = i30;
                    if (i28 < i27) {
                        objArr[i30] = obj9;
                        objArr[i30 ^ 1] = obj10;
                    }
                    i28++;
                } else {
                    if (obj9.equals(objArr[i32])) {
                        int i33 = i32 ^ 1;
                        Object obj11 = objArr[i33];
                        Objects.requireNonNull(obj11);
                        c0924a = new AbstractC4181p.a.C0924a(obj9, obj10, obj11);
                        objArr[i33] = obj10;
                        break;
                    }
                    b10 = i31 + 1;
                    i12 = -1;
                }
            }
            i27++;
            i12 = -1;
        }
        if (i28 != i8) {
            return new Object[]{iArr, Integer.valueOf(i28), c0924a};
        }
        return iArr;
    }

    static Object k(Object obj, Object[] objArr, int i8, int i9, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i8 == 1) {
            Object obj3 = objArr[i9];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b8 = AbstractC4178m.b(obj2.hashCode());
            while (true) {
                int i10 = b8 & length;
                int i11 = bArr[i10] & 255;
                if (i11 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                b8 = i10 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b9 = AbstractC4178m.b(obj2.hashCode());
            while (true) {
                int i12 = b9 & length2;
                int i13 = sArr[i12] & 65535;
                if (i13 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                b9 = i12 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b10 = AbstractC4178m.b(obj2.hashCode());
            while (true) {
                int i14 = b10 & length3;
                int i15 = iArr[i14];
                if (i15 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i15])) {
                    return objArr[i15 ^ 1];
                }
                b10 = i14 + 1;
            }
        }
    }

    @Override // x0.AbstractC4181p
    r a() {
        return new a(this, this.f40571f, 0, this.f40572g);
    }

    @Override // x0.AbstractC4181p
    r b() {
        return new b(this, new c(this.f40571f, 0, this.f40572g));
    }

    @Override // x0.AbstractC4181p
    AbstractC4179n c() {
        return new c(this.f40571f, 1, this.f40572g);
    }

    @Override // x0.AbstractC4181p, java.util.Map
    public Object get(Object obj) {
        Object k8 = k(this.f40570e, this.f40571f, this.f40572g, 0, obj);
        if (k8 == null) {
            return null;
        }
        return k8;
    }

    @Override // java.util.Map
    public int size() {
        return this.f40572g;
    }
}
