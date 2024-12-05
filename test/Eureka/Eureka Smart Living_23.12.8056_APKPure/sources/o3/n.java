package o3;

import g3.v;
import g3.w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8251a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8252b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Map f8253a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f8254b;

        public b() {
            this.f8253a = new HashMap();
            this.f8254b = new HashMap();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public n c() {
            return new n(this);
        }

        public b d(l lVar) {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (this.f8253a.containsKey(cVar)) {
                l lVar2 = (l) this.f8253a.get(cVar);
                if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.f8253a.put(cVar, lVar);
            }
            return this;
        }

        public b e(w wVar) {
            if (wVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class c6 = wVar.c();
            if (this.f8254b.containsKey(c6)) {
                w wVar2 = (w) this.f8254b.get(c6);
                if (!wVar2.equals(wVar) || !wVar.equals(wVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c6);
                }
            } else {
                this.f8254b.put(c6, wVar);
            }
            return this;
        }

        public b(n nVar) {
            this.f8253a = new HashMap(nVar.f8251a);
            this.f8254b = new HashMap(nVar.f8252b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class f8255a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f8256b;

        private c(Class cls, Class cls2) {
            this.f8255a = cls;
            this.f8256b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f8255a.equals(this.f8255a) && cVar.f8256b.equals(this.f8256b);
        }

        public int hashCode() {
            return Objects.hash(this.f8255a, this.f8256b);
        }

        public String toString() {
            return this.f8255a.getSimpleName() + " with primitive type: " + this.f8256b.getSimpleName();
        }
    }

    private n(b bVar) {
        this.f8251a = new HashMap(bVar.f8253a);
        this.f8252b = new HashMap(bVar.f8254b);
    }

    public Class c(Class cls) {
        if (this.f8252b.containsKey(cls)) {
            return ((w) this.f8252b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object d(g3.g gVar, Class cls) {
        c cVar = new c(gVar.getClass(), cls);
        if (this.f8251a.containsKey(cVar)) {
            return ((l) this.f8251a.get(cVar)).a(gVar);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public Object e(v vVar, Class cls) {
        if (!this.f8252b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        w wVar = (w) this.f8252b.get(cls);
        if (vVar.g().equals(wVar.a()) && wVar.a().equals(vVar.g())) {
            return wVar.b(vVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
