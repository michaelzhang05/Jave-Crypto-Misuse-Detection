package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes2.dex */
public final class k {
    private final q a;

    /* renamed from: b, reason: collision with root package name */
    private final List<q> f20173b;

    /* JADX WARN: Multi-variable type inference failed */
    public k() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public k(q qVar, List<q> list) {
        l.f(list, "parametersInfo");
        this.a = qVar;
        this.f20173b = list;
    }

    public final List<q> a() {
        return this.f20173b;
    }

    public final q b() {
        return this.a;
    }

    public /* synthetic */ k(q qVar, List list, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : qVar, (i2 & 2) != 0 ? t.i() : list);
    }
}
