package m3;

import java.security.GeneralSecurityException;
import t3.j0;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7874a = new a().d();

    /* renamed from: b, reason: collision with root package name */
    public static final j0 f7875b = j0.V();

    /* renamed from: c, reason: collision with root package name */
    public static final j0 f7876c = j0.V();

    static {
        try {
            a();
        } catch (GeneralSecurityException e6) {
            throw new ExceptionInInitializerError(e6);
        }
    }

    public static void a() {
        c.e();
        if (k3.a.a()) {
            return;
        }
        a.m(true);
    }
}
