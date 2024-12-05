package n6;

import L5.C1224h;
import i6.J0;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class v {
    private static final w a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new C1224h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ w b(Throwable th, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            th = null;
        }
        if ((i8 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(J0 j02) {
        return j02.E() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final J0 e(t tVar, List list) {
        try {
            return tVar.b(list);
        } catch (Throwable th) {
            return a(th, tVar.a());
        }
    }
}
