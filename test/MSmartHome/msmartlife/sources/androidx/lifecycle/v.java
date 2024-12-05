package androidx.lifecycle;

/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class v {
    private final a a;

    /* renamed from: b, reason: collision with root package name */
    private final w f1280b;

    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public interface a {
        <T extends u> T a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public static abstract class b implements a {
        b() {
        }

        @Override // androidx.lifecycle.v.a
        public <T extends u> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends u> T b(String str, Class<T> cls);
    }

    public v(w wVar, a aVar) {
        this.a = aVar;
        this.f1280b = wVar;
    }

    public <T extends u> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends u> T b(String str, Class<T> cls) {
        T t;
        T t2 = (T) this.f1280b.b(str);
        if (cls.isInstance(t2)) {
            return t2;
        }
        a aVar = this.a;
        if (aVar instanceof b) {
            t = (T) ((b) aVar).b(str, cls);
        } else {
            t = (T) aVar.a(cls);
        }
        this.f1280b.c(str, t);
        return t;
    }
}
