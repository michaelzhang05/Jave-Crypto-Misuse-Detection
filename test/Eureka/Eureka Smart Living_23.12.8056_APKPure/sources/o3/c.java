package o3;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final Class f8220a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8221b;

    /* loaded from: classes.dex */
    class a extends c {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f8222c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Class cls, Class cls2, b bVar) {
            super(cls, cls2, null);
            this.f8222c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    private c(Class cls, Class cls2) {
        this.f8220a = cls;
        this.f8221b = cls2;
    }

    public static c a(b bVar, Class cls, Class cls2) {
        return new a(cls, cls2, bVar);
    }

    public Class b() {
        return this.f8220a;
    }

    public Class c() {
        return this.f8221b;
    }

    /* synthetic */ c(Class cls, Class cls2, a aVar) {
        this(cls, cls2);
    }
}
