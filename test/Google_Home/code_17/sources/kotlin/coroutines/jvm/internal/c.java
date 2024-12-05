package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public final class c implements S5.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f34148a = new c();

    private c() {
    }

    @Override // S5.d
    public S5.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
