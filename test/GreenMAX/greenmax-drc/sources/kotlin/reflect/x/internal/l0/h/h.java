package kotlin.reflect.x.internal.l0.h;

import java.util.Set;
import kotlin.collections.u0;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public final class h {
    public static final h a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<c> f20803b;

    static {
        Set<c> g2;
        g2 = u0.g(new c("kotlin.internal.NoInfer"), new c("kotlin.internal.Exact"));
        f20803b = g2;
    }

    private h() {
    }

    public final Set<c> a() {
        return f20803b;
    }
}
