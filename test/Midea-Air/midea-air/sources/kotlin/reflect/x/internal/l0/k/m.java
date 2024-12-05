package kotlin.reflect.x.internal.l0.k;

import kotlin.jvm.internal.l;
import kotlin.reflect.KProperty;

/* compiled from: storage.kt */
/* loaded from: classes2.dex */
public final class m {
    public static final <T> T a(i<? extends T> iVar, Object obj, KProperty<?> kProperty) {
        l.f(iVar, "<this>");
        l.f(kProperty, "p");
        return iVar.invoke();
    }

    public static final <T> T b(j<? extends T> jVar, Object obj, KProperty<?> kProperty) {
        l.f(jVar, "<this>");
        l.f(kProperty, "p");
        return jVar.invoke();
    }
}
