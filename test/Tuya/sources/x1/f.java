package X1;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: b, reason: collision with root package name */
    private static String f12208b = "Invalid or non Implemented status";

    /* renamed from: a, reason: collision with root package name */
    public final e f12209a;

    public f(e eVar) {
        this.f12209a = eVar;
    }

    public abstract void a(Object obj, Object obj2);

    public abstract Object c();

    public Object d() {
        throw new RuntimeException(f12208b + " createObject() in " + getClass());
    }

    public void e(Object obj, String str, Object obj2) {
        throw new RuntimeException(f12208b + " setValue in " + getClass() + " key=" + str);
    }

    public f f(String str) {
        throw new RuntimeException(f12208b + " startArray in " + getClass() + " key=" + str);
    }

    public f g(String str) {
        throw new RuntimeException(f12208b + " startObject(String key) in " + getClass() + " key=" + str);
    }

    public Object b(Object obj) {
        return obj;
    }
}
