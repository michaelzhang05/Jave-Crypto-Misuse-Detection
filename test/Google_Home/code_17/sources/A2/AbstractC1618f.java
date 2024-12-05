package a2;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1618f {

    /* renamed from: b, reason: collision with root package name */
    private static String f13829b = "Invalid or non Implemented status";

    /* renamed from: a, reason: collision with root package name */
    public final C1617e f13830a;

    public AbstractC1618f(C1617e c1617e) {
        this.f13830a = c1617e;
    }

    public abstract void a(Object obj, Object obj2);

    public abstract Object c();

    public Object d() {
        throw new RuntimeException(f13829b + " createObject() in " + getClass());
    }

    public void e(Object obj, String str, Object obj2) {
        throw new RuntimeException(f13829b + " setValue in " + getClass() + " key=" + str);
    }

    public AbstractC1618f f(String str) {
        throw new RuntimeException(f13829b + " startArray in " + getClass() + " key=" + str);
    }

    public AbstractC1618f g(String str) {
        throw new RuntimeException(f13829b + " startObject(String key) in " + getClass() + " key=" + str);
    }

    public Object b(Object obj) {
        return obj;
    }
}
