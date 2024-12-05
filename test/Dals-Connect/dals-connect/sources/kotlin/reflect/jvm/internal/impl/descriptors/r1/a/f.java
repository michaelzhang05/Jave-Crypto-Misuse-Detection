package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.text.u;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes2.dex */
public final class f implements q {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Class<?> f21811b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.d.b.c0.a f21812c;

    /* compiled from: ReflectKotlinClass.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final f a(Class<?> cls) {
            kotlin.jvm.internal.l.f(cls, "klass");
            kotlin.reflect.x.internal.l0.d.b.c0.b bVar = new kotlin.reflect.x.internal.l0.d.b.c0.b();
            c.a.b(cls, bVar);
            kotlin.reflect.x.internal.l0.d.b.c0.a m = bVar.m();
            kotlin.jvm.internal.g gVar = null;
            if (m == null) {
                return null;
            }
            return new f(cls, m, gVar);
        }
    }

    private f(Class<?> cls, kotlin.reflect.x.internal.l0.d.b.c0.a aVar) {
        this.f21811b = cls;
        this.f21812c = aVar;
    }

    public /* synthetic */ f(Class cls, kotlin.reflect.x.internal.l0.d.b.c0.a aVar, kotlin.jvm.internal.g gVar) {
        this(cls, aVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.q
    public kotlin.reflect.x.internal.l0.d.b.c0.a a() {
        return this.f21812c;
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.q
    public void b(q.c cVar, byte[] bArr) {
        kotlin.jvm.internal.l.f(cVar, "visitor");
        c.a.b(this.f21811b, cVar);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.q
    public kotlin.reflect.x.internal.l0.f.b c() {
        return kotlin.reflect.jvm.internal.impl.descriptors.r1.b.d.a(this.f21811b);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.q
    public void d(q.d dVar, byte[] bArr) {
        kotlin.jvm.internal.l.f(dVar, "visitor");
        c.a.i(this.f21811b, dVar);
    }

    public final Class<?> e() {
        return this.f21811b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && kotlin.jvm.internal.l.a(this.f21811b, ((f) obj).f21811b);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.q
    public String getLocation() {
        String v;
        StringBuilder sb = new StringBuilder();
        String name = this.f21811b.getName();
        kotlin.jvm.internal.l.e(name, "klass.name");
        v = u.v(name, '.', '/', false, 4, null);
        sb.append(v);
        sb.append(".class");
        return sb.toString();
    }

    public int hashCode() {
        return this.f21811b.hashCode();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f21811b;
    }
}
