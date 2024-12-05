package o3;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8244a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8245b;

    /* loaded from: classes.dex */
    class a extends k {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f8246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f8246c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    private k(Class cls, Class cls2) {
        this.f8244a = cls;
        this.f8245b = cls2;
    }

    public static k a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f8244a;
    }

    public Class c() {
        return this.f8245b;
    }

    /* synthetic */ k(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }
}
