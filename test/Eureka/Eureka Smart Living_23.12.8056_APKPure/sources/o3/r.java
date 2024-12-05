package o3;

import g3.y;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8263a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8264b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f8265c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f8266d;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f8267a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f8268b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f8269c;

        /* renamed from: d, reason: collision with root package name */
        private final Map f8270d;

        public b() {
            this.f8267a = new HashMap();
            this.f8268b = new HashMap();
            this.f8269c = new HashMap();
            this.f8270d = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public r e() {
            return new r(this);
        }

        public b f(o3.b bVar) {
            c cVar = new c(bVar.c(), bVar.b());
            if (this.f8268b.containsKey(cVar)) {
                o3.b bVar2 = (o3.b) this.f8268b.get(cVar);
                if (!bVar2.equals(bVar) || !bVar.equals(bVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f8268b.put(cVar, bVar);
            }
            return this;
        }

        public b g(o3.c cVar) {
            d dVar = new d(cVar.b(), cVar.c());
            if (this.f8267a.containsKey(dVar)) {
                o3.c cVar2 = (o3.c) this.f8267a.get(dVar);
                if (!cVar2.equals(cVar) || !cVar.equals(cVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f8267a.put(dVar, cVar);
            }
            return this;
        }

        public b h(j jVar) {
            c cVar = new c(jVar.c(), jVar.b());
            if (this.f8270d.containsKey(cVar)) {
                j jVar2 = (j) this.f8270d.get(cVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f8270d.put(cVar, jVar);
            }
            return this;
        }

        public b i(k kVar) {
            d dVar = new d(kVar.b(), kVar.c());
            if (this.f8269c.containsKey(dVar)) {
                k kVar2 = (k) this.f8269c.get(dVar);
                if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f8269c.put(dVar, kVar);
            }
            return this;
        }

        public b(r rVar) {
            this.f8267a = new HashMap(rVar.f8263a);
            this.f8268b = new HashMap(rVar.f8264b);
            this.f8269c = new HashMap(rVar.f8265c);
            this.f8270d = new HashMap(rVar.f8266d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f8271a;

        /* renamed from: b, reason: collision with root package name */
        private final v3.a f8272b;

        private c(Class cls, v3.a aVar) {
            this.f8271a = cls;
            this.f8272b = aVar;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f8271a.equals(this.f8271a) && cVar.f8272b.equals(this.f8272b);
        }

        public int hashCode() {
            return Objects.hash(this.f8271a, this.f8272b);
        }

        public String toString() {
            return this.f8271a.getSimpleName() + ", object identifier: " + this.f8272b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        private final Class f8273a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f8274b;

        private d(Class cls, Class cls2) {
            this.f8273a = cls;
            this.f8274b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f8273a.equals(this.f8273a) && dVar.f8274b.equals(this.f8274b);
        }

        public int hashCode() {
            return Objects.hash(this.f8273a, this.f8274b);
        }

        public String toString() {
            return this.f8273a.getSimpleName() + " with serialization type: " + this.f8274b.getSimpleName();
        }
    }

    private r(b bVar) {
        this.f8263a = new HashMap(bVar.f8267a);
        this.f8264b = new HashMap(bVar.f8268b);
        this.f8265c = new HashMap(bVar.f8269c);
        this.f8266d = new HashMap(bVar.f8270d);
    }

    public boolean e(q qVar) {
        return this.f8264b.containsKey(new c(qVar.getClass(), qVar.a()));
    }

    public g3.g f(q qVar, y yVar) {
        c cVar = new c(qVar.getClass(), qVar.a());
        if (this.f8264b.containsKey(cVar)) {
            return ((o3.b) this.f8264b.get(cVar)).d(qVar, yVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }
}
