package n3;

import java.util.Map;

/* loaded from: classes4.dex */
public final class w implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final s f36133a;

    public w(s sVar) {
        this.f36133a = sVar;
    }

    public static w a(s sVar) {
        return new w(sVar);
    }

    public static Map c(s sVar) {
        return (Map) u5.h.d(sVar.d());
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Map get() {
        return c(this.f36133a);
    }
}
