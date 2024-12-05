package u;

import s.AbstractC3983d;
import s.C3982c;
import u.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class o {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(C3982c c3982c);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(AbstractC3983d abstractC3983d);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(s.h hVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C3982c b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC3983d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract s.h e();

    public abstract p f();

    public abstract String g();
}
