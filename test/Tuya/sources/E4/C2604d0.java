package e4;

/* renamed from: e4.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2604d0 implements u5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I5.a f30663a;

    public C2604d0(I5.a aVar) {
        this.f30663a = aVar;
    }

    public static C2604d0 a(I5.a aVar) {
        return new C2604d0(aVar);
    }

    public static C2602c0 c(k3.i iVar) {
        return new C2602c0(iVar);
    }

    @Override // I5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2602c0 get() {
        return c((k3.i) this.f30663a.get());
    }
}
