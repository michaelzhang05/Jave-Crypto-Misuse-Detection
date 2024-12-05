package o3;

import g3.v;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import r3.b;
import r3.c;
import t3.z;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f8232a = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8233a;

        static {
            int[] iArr = new int[z.values().length];
            f8233a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8233a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8233a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    private static class b implements b.a {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // r3.b.a
        public void a() {
        }

        @Override // r3.b.a
        public void b(int i6, long j6) {
        }
    }

    public static r3.c a(v vVar) {
        c.b a6 = r3.c.a();
        a6.d(vVar.d());
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                a6.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            a6.e(vVar.e().d());
        }
        try {
            return a6.b();
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }

    private static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static g3.k c(z zVar) {
        int i6 = a.f8233a[zVar.ordinal()];
        if (i6 == 1) {
            return g3.k.f6715b;
        }
        if (i6 == 2) {
            return g3.k.f6716c;
        }
        if (i6 == 3) {
            return g3.k.f6717d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
