package o3;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    private final v3.a f8241a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f8242b;

    /* loaded from: classes.dex */
    class a extends j {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f8243c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v3.a aVar, Class cls, b bVar) {
            super(aVar, cls, null);
            this.f8243c = bVar;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    private j(v3.a aVar, Class cls) {
        this.f8241a = aVar;
        this.f8242b = cls;
    }

    public static j a(b bVar, v3.a aVar, Class cls) {
        return new a(aVar, cls, bVar);
    }

    public final v3.a b() {
        return this.f8241a;
    }

    public final Class c() {
        return this.f8242b;
    }

    /* synthetic */ j(v3.a aVar, Class cls, a aVar2) {
        this(aVar, cls);
    }
}
