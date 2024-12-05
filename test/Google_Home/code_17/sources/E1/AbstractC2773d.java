package e1;

import e1.C2770a;

/* renamed from: e1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2773d {

    /* renamed from: e1.d$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract AbstractC2773d a();

        public abstract a b(AbstractC2775f abstractC2775f);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* renamed from: e1.d$b */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new C2770a.b();
    }

    public abstract AbstractC2775f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
