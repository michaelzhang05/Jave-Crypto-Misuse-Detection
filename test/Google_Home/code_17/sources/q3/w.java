package q3;

import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f38261a;

    public w(s sVar) {
        this.f38261a = sVar;
    }

    public static w a(s sVar) {
        return new w(sVar);
    }

    public static Map c(s sVar) {
        return (Map) x5.h.d(sVar.d());
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map get() {
        return c(this.f38261a);
    }
}
