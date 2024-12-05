package kotlin.reflect.x.internal.l0.d.a;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.f.d;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: BuiltinSpecialProperties.kt */
/* loaded from: classes2.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final c c(c cVar, String str) {
        c c2 = cVar.c(f.r(str));
        l.e(c2, "child(Name.identifier(name))");
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c d(d dVar, String str) {
        c l = dVar.c(f.r(str)).l();
        l.e(l, "child(Name.identifier(name)).toSafe()");
        return l;
    }
}
