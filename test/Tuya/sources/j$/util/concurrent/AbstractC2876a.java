package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2876a extends p {

    /* renamed from: i, reason: collision with root package name */
    final ConcurrentHashMap f32149i;

    /* renamed from: j, reason: collision with root package name */
    l f32150j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2876a(l[] lVarArr, int i8, int i9, ConcurrentHashMap concurrentHashMap) {
        super(lVarArr, i8, 0, i9);
        this.f32149i = concurrentHashMap;
        a();
    }

    public final boolean hasMoreElements() {
        return this.f32170b != null;
    }

    public final boolean hasNext() {
        return this.f32170b != null;
    }

    public final void remove() {
        l lVar = this.f32150j;
        if (lVar == null) {
            throw new IllegalStateException();
        }
        this.f32150j = null;
        this.f32149i.g(lVar.f32162b, null, null);
    }
}
