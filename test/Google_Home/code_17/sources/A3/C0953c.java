package A3;

import v3.C4100c;
import v3.InterfaceC4099b;

/* renamed from: A3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0953c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final C0952b f303a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f304b;

    public C0953c(C0952b c0952b, L5.a aVar) {
        this.f303a = c0952b;
        this.f304b = aVar;
    }

    public static C0953c a(C0952b c0952b, L5.a aVar) {
        return new C0953c(c0952b, aVar);
    }

    public static InterfaceC4099b c(C0952b c0952b, C4100c c4100c) {
        return (InterfaceC4099b) x5.h.d(c0952b.a(c4100c));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4099b get() {
        return c(this.f303a, (C4100c) this.f304b.get());
    }
}
