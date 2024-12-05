package b1;

import b1.C1851a;
import b1.C1853c;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1854d {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC1854d f14267a = a().a();

    /* renamed from: b1.d$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract AbstractC1854d a();

        public abstract a b(String str);

        public abstract a c(long j8);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C1853c.a aVar);

        public abstract a h(long j8);
    }

    public static a a() {
        return new C1851a.b().h(0L).g(C1853c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C1853c.a g();

    public abstract long h();

    public boolean i() {
        if (g() == C1853c.a.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (g() != C1853c.a.NOT_GENERATED && g() != C1853c.a.ATTEMPT_MIGRATION) {
            return false;
        }
        return true;
    }

    public boolean k() {
        if (g() == C1853c.a.REGISTERED) {
            return true;
        }
        return false;
    }

    public boolean l() {
        if (g() == C1853c.a.UNREGISTERED) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (g() == C1853c.a.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    public abstract a n();

    public AbstractC1854d o(String str, long j8, long j9) {
        return n().b(str).c(j8).h(j9).a();
    }

    public AbstractC1854d p() {
        return n().b(null).a();
    }

    public AbstractC1854d q(String str) {
        return n().e(str).g(C1853c.a.REGISTER_ERROR).a();
    }

    public AbstractC1854d r() {
        return n().g(C1853c.a.NOT_GENERATED).a();
    }

    public AbstractC1854d s(String str, String str2, long j8, String str3, long j9) {
        return n().d(str).g(C1853c.a.REGISTERED).b(str3).f(str2).c(j9).h(j8).a();
    }

    public AbstractC1854d t(String str) {
        return n().d(str).g(C1853c.a.UNREGISTERED).a();
    }
}
