package x5;

/* loaded from: classes5.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private i f40752a;

    public static void a(i iVar, i iVar2) {
        b((c) iVar, iVar2);
    }

    private static void b(c cVar, i iVar) {
        h.b(iVar);
        if (cVar.f40752a == null) {
            cVar.f40752a = iVar;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // L5.a
    public Object get() {
        i iVar = this.f40752a;
        if (iVar != null) {
            return iVar.get();
        }
        throw new IllegalStateException();
    }
}
