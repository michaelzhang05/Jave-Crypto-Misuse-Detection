package o3;

import com.google.crypto.tink.shaded.protobuf.o0;
import g3.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import l3.b;
import t3.y;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8223a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8224b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f8225c;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f8226a;

        /* renamed from: o3.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0127a {

            /* renamed from: a, reason: collision with root package name */
            public Object f8227a;

            /* renamed from: b, reason: collision with root package name */
            public l.b f8228b;

            public C0127a(Object obj, l.b bVar) {
                this.f8227a = obj;
                this.f8228b = bVar;
            }
        }

        public a(Class cls) {
            this.f8226a = cls;
        }

        public abstract o0 a(o0 o0Var);

        public final Class b() {
            return this.f8226a;
        }

        public Map c() {
            return Collections.emptyMap();
        }

        public abstract o0 d(com.google.crypto.tink.shaded.protobuf.h hVar);

        public abstract void e(o0 o0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(Class cls, m... mVarArr) {
        this.f8223a = cls;
        HashMap hashMap = new HashMap();
        for (m mVar : mVarArr) {
            if (hashMap.containsKey(mVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + mVar.b().getCanonicalName());
            }
            hashMap.put(mVar.b(), mVar);
        }
        this.f8225c = mVarArr.length > 0 ? mVarArr[0].b() : Void.class;
        this.f8224b = Collections.unmodifiableMap(hashMap);
    }

    public b.EnumC0114b a() {
        return b.EnumC0114b.f7402a;
    }

    public final Class b() {
        return this.f8225c;
    }

    public final Class c() {
        return this.f8223a;
    }

    public abstract String d();

    public final Object e(o0 o0Var, Class cls) {
        m mVar = (m) this.f8224b.get(cls);
        if (mVar != null) {
            return mVar.a(o0Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a f();

    public abstract y.c g();

    public abstract o0 h(com.google.crypto.tink.shaded.protobuf.h hVar);

    public final Set i() {
        return this.f8224b.keySet();
    }

    public abstract void j(o0 o0Var);
}
