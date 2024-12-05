package W1;

import a2.C1617e;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static g f11359a = g.f11348h;

    /* renamed from: b, reason: collision with root package name */
    public static final Z1.d f11360b = new Z1.d();

    /* renamed from: c, reason: collision with root package name */
    public static final C1617e f11361c = new C1617e();

    public static void a(String str, Appendable appendable, g gVar) {
        if (str == null) {
            return;
        }
        gVar.f(str, appendable);
    }

    public static void b(Object obj, Appendable appendable, g gVar) {
        if (obj == null) {
            appendable.append("null");
            return;
        }
        Class<?> cls = obj.getClass();
        Z1.d dVar = f11360b;
        Z1.e a8 = dVar.a(cls);
        if (a8 == null) {
            if (cls.isArray()) {
                a8 = Z1.d.f13618l;
            } else {
                a8 = dVar.b(obj.getClass());
                if (a8 == null) {
                    a8 = Z1.d.f13616j;
                }
            }
            dVar.d(a8, cls);
        }
        a8.a(obj, appendable, gVar);
    }
}
