package o3;

import g3.y;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final v3.a f8217a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8218b;

    /* loaded from: classes.dex */
    class a extends b {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0126b f8219c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v3.a aVar, Class cls, InterfaceC0126b interfaceC0126b) {
            super(aVar, cls, null);
            this.f8219c = interfaceC0126b;
        }

        @Override // o3.b
        public g3.g d(q qVar, y yVar) {
            return this.f8219c.a(qVar, yVar);
        }
    }

    /* renamed from: o3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0126b {
        g3.g a(q qVar, y yVar);
    }

    private b(v3.a aVar, Class cls) {
        this.f8217a = aVar;
        this.f8218b = cls;
    }

    public static b a(InterfaceC0126b interfaceC0126b, v3.a aVar, Class cls) {
        return new a(aVar, cls, interfaceC0126b);
    }

    public final v3.a b() {
        return this.f8217a;
    }

    public final Class c() {
        return this.f8218b;
    }

    public abstract g3.g d(q qVar, y yVar);

    /* synthetic */ b(v3.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }
}
