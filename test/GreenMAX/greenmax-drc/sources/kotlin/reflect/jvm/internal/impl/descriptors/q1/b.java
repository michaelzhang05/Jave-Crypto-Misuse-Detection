package kotlin.reflect.jvm.internal.impl.descriptors.q1;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.l1;
import kotlin.reflect.jvm.internal.impl.descriptors.m1;

/* compiled from: JavaVisibilities.kt */
/* loaded from: classes2.dex */
public final class b extends m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final b f21804c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public Integer a(m1 m1Var) {
        l.f(m1Var, "visibility");
        if (l.a(this, m1Var)) {
            return 0;
        }
        if (m1Var == l1.b.f21649c) {
            return null;
        }
        return Integer.valueOf(l1.a.b(m1Var) ? 1 : -1);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m1
    public m1 d() {
        return l1.g.f21654c;
    }
}
