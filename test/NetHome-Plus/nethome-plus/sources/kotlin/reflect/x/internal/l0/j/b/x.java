package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: NameResolverUtil.kt */
/* loaded from: classes2.dex */
public final class x {
    public static final b a(c cVar, int i2) {
        l.f(cVar, "<this>");
        b f2 = b.f(cVar.a(i2), cVar.b(i2));
        l.e(f2, "fromString(getQualifiedC… isLocalClassName(index))");
        return f2;
    }

    public static final f b(c cVar, int i2) {
        l.f(cVar, "<this>");
        f o = f.o(cVar.getString(i2));
        l.e(o, "guessByFirstCharacter(getString(index))");
        return o;
    }
}
