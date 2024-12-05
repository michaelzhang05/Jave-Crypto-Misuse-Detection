package kotlin.reflect.x.internal.l0.e.y;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.io.a;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import kotlin.reflect.x.internal.l0.e.m;
import kotlin.s;

/* compiled from: readPackageFragment.kt */
/* loaded from: classes2.dex */
public final class c {
    public static final Pair<m, a> a(InputStream inputStream) {
        m mVar;
        l.f(inputStream, "<this>");
        try {
            a a = a.f20673g.a(inputStream);
            if (a.h()) {
                f d2 = f.d();
                b.a(d2);
                mVar = m.Y(inputStream, d2);
            } else {
                mVar = null;
            }
            Pair<m, a> a2 = s.a(mVar, a);
            a.a(inputStream, null);
            return a2;
        } finally {
        }
    }
}
