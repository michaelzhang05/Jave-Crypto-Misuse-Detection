package d1;

import d1.C2731a;
import d1.C2733c;

/* renamed from: d1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2734d {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC2734d f31155a = a().a();

    /* renamed from: d1.d$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract AbstractC2734d a();

        public abstract a b(String str);

        public abstract a c(long j8);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C2733c.a aVar);

        public abstract a h(long j8);
    }

    public static a a() {
        return new C2731a.b().h(0L).g(C2733c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C2733c.a g();

    public abstract long h();

    public boolean i() {
        if (g() == C2733c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != C2733c.a.NOT_GENERATED && g() != C2733c.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == C2733c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == C2733c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == C2733c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public abstract a n();

    public AbstractC2734d o(String str, long j8, long j9) {
        return n().b(str).c(j8).h(j9).a();
    }

    public AbstractC2734d p() {
        return n().b(null).a();
    }

    public AbstractC2734d q(String str) {
        return n().e(str).g(C2733c.a.REGISTER_ERROR).a();
    }

    public AbstractC2734d r() {
        return n().g(C2733c.a.NOT_GENERATED).a();
    }

    public AbstractC2734d s(String str, String str2, long j8, String str3, long j9) {
        return n().d(str).g(C2733c.a.REGISTERED).b(str3).f(str2).c(j9).h(j8).a();
    }

    public AbstractC2734d t(String str) {
        return n().d(str).g(C2733c.a.UNREGISTERED).a();
    }
}
