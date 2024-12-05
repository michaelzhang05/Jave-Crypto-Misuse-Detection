package kotlin.reflect.x.internal.l0.i.w;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.y;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: MemberScope.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final Set<f> a(Iterable<? extends h> iterable) {
        l.f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator<? extends h> it = iterable.iterator();
        while (it.hasNext()) {
            Set<f> e2 = it.next().e();
            if (e2 == null) {
                return null;
            }
            y.y(hashSet, e2);
        }
        return hashSet;
    }
}
