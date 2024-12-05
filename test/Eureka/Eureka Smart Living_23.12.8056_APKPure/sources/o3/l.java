package o3;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8247a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8248b;

    /* loaded from: classes.dex */
    class a extends l {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f8249c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f8249c = bVar;
        }

        @Override // o3.l
        public Object a(g3.g gVar) {
            return this.f8249c.a(gVar);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Object a(g3.g gVar);
    }

    private l(Class cls, Class cls2) {
        this.f8247a = cls;
        this.f8248b = cls2;
    }

    public static l b(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public abstract Object a(g3.g gVar);

    public Class c() {
        return this.f8247a;
    }

    public Class d() {
        return this.f8248b;
    }

    /* synthetic */ l(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }
}
