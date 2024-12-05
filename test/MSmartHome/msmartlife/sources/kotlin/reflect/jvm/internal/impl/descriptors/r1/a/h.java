package kotlin.reflect.jvm.internal.impl.descriptors.r1.a;

import kotlin.text.u;

/* compiled from: ReflectKotlinClassFinder.kt */
/* loaded from: classes2.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(kotlin.reflect.x.internal.l0.f.b bVar) {
        String v;
        String b2 = bVar.i().b();
        kotlin.jvm.internal.l.e(b2, "relativeClassName.asString()");
        v = u.v(b2, '.', '$', false, 4, null);
        if (bVar.h().d()) {
            return v;
        }
        return bVar.h() + '.' + v;
    }
}
