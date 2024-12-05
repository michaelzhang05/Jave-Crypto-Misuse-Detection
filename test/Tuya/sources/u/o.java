package u;

import s.AbstractC3701c;
import s.C3700b;
import s.InterfaceC3703e;
import u.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class o {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(C3700b c3700b);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(AbstractC3701c abstractC3701c);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(InterfaceC3703e interfaceC3703e);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C3700b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract AbstractC3701c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract InterfaceC3703e e();

    public abstract p f();

    public abstract String g();
}
