package u5;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private i f38568a;

    public static void a(i iVar, i iVar2) {
        b((c) iVar, iVar2);
    }

    private static void b(c cVar, i iVar) {
        h.b(iVar);
        if (cVar.f38568a == null) {
            cVar.f38568a = iVar;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // I5.a
    public Object get() {
        i iVar = this.f38568a;
        if (iVar != null) {
            return iVar.get();
        }
        throw new IllegalStateException();
    }
}
