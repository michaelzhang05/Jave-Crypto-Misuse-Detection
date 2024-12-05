package g3;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import t3.c0;
import t3.i0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f6737a;

    /* renamed from: b, reason: collision with root package name */
    private c f6738b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f6739c;

    /* renamed from: d, reason: collision with root package name */
    private final r3.a f6740d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6741e;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Class f6742a;

        /* renamed from: b, reason: collision with root package name */
        private ConcurrentMap f6743b;

        /* renamed from: c, reason: collision with root package name */
        private c f6744c;

        /* renamed from: d, reason: collision with root package name */
        private r3.a f6745d;

        private b(Class cls) {
            this.f6743b = new ConcurrentHashMap();
            this.f6742a = cls;
            this.f6745d = r3.a.f9112b;
        }

        private b c(Object obj, Object obj2, c0.c cVar, boolean z5) {
            if (this.f6743b == null) {
                throw new IllegalStateException("addPrimitive cannot be called after build");
            }
            if (obj == null && obj2 == null) {
                throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
            }
            if (cVar.c0() != t3.z.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c b6 = v.b(obj, obj2, cVar, this.f6743b);
            if (z5) {
                if (this.f6744c != null) {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
                this.f6744c = b6;
            }
            return this;
        }

        public b a(Object obj, Object obj2, c0.c cVar) {
            return c(obj, obj2, cVar, false);
        }

        public b b(Object obj, Object obj2, c0.c cVar) {
            return c(obj, obj2, cVar, true);
        }

        public v d() {
            ConcurrentMap concurrentMap = this.f6743b;
            if (concurrentMap == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            v vVar = new v(concurrentMap, this.f6744c, this.f6745d, this.f6742a);
            this.f6743b = null;
            return vVar;
        }

        public b e(r3.a aVar) {
            if (this.f6743b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f6745d = aVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Object f6746a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f6747b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f6748c;

        /* renamed from: d, reason: collision with root package name */
        private final t3.z f6749d;

        /* renamed from: e, reason: collision with root package name */
        private final i0 f6750e;

        /* renamed from: f, reason: collision with root package name */
        private final int f6751f;

        /* renamed from: g, reason: collision with root package name */
        private final String f6752g;

        /* renamed from: h, reason: collision with root package name */
        private final g f6753h;

        c(Object obj, Object obj2, byte[] bArr, t3.z zVar, i0 i0Var, int i6, String str, g gVar) {
            this.f6746a = obj;
            this.f6747b = obj2;
            this.f6748c = Arrays.copyOf(bArr, bArr.length);
            this.f6749d = zVar;
            this.f6750e = i0Var;
            this.f6751f = i6;
            this.f6752g = str;
            this.f6753h = gVar;
        }

        public Object a() {
            return this.f6746a;
        }

        public final byte[] b() {
            byte[] bArr = this.f6748c;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public g c() {
            return this.f6753h;
        }

        public int d() {
            return this.f6751f;
        }

        public String e() {
            return this.f6752g;
        }

        public i0 f() {
            return this.f6750e;
        }

        public Object g() {
            return this.f6747b;
        }

        public t3.z h() {
            return this.f6749d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f6754a;

        private d(byte[] bArr) {
            this.f6754a = Arrays.copyOf(bArr, bArr.length);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            byte[] bArr = this.f6754a;
            int length = bArr.length;
            byte[] bArr2 = dVar.f6754a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i6 = 0;
            while (true) {
                byte[] bArr3 = this.f6754a;
                if (i6 >= bArr3.length) {
                    return 0;
                }
                byte b6 = bArr3[i6];
                byte b7 = dVar.f6754a[i6];
                if (b6 != b7) {
                    return b6 - b7;
                }
                i6++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return Arrays.equals(this.f6754a, ((d) obj).f6754a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f6754a);
        }

        public String toString() {
            return u3.k.b(this.f6754a);
        }
    }

    private v(ConcurrentMap concurrentMap, c cVar, r3.a aVar, Class cls) {
        this.f6737a = concurrentMap;
        this.f6738b = cVar;
        this.f6739c = cls;
        this.f6740d = aVar;
        this.f6741e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c b(Object obj, Object obj2, c0.c cVar, ConcurrentMap concurrentMap) {
        Integer valueOf = Integer.valueOf(cVar.a0());
        if (cVar.b0() == i0.RAW) {
            valueOf = null;
        }
        c cVar2 = new c(obj, obj2, g3.d.a(cVar), cVar.c0(), cVar.b0(), cVar.a0(), cVar.Z().a0(), o3.i.a().d(o3.o.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), valueOf), f.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar2);
        d dVar = new d(cVar2.b());
        List list = (List) concurrentMap.put(dVar, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(cVar2);
            concurrentMap.put(dVar, Collections.unmodifiableList(arrayList2));
        }
        return cVar2;
    }

    public static b j(Class cls) {
        return new b(cls);
    }

    public Collection c() {
        return this.f6737a.values();
    }

    public r3.a d() {
        return this.f6740d;
    }

    public c e() {
        return this.f6738b;
    }

    public List f(byte[] bArr) {
        List list = (List) this.f6737a.get(new d(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class g() {
        return this.f6739c;
    }

    public List h() {
        return f(g3.d.f6707a);
    }

    public boolean i() {
        return !this.f6740d.b().isEmpty();
    }
}
