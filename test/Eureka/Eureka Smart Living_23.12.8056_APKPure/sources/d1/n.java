package d1;

import d1.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract n a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a b(b1.b bVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a c(b1.c cVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract a d(b1.e eVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract b1.b b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract b1.c c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract b1.e e();

    public abstract o f();

    public abstract String g();
}
