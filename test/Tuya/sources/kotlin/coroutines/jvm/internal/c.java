package kotlin.coroutines.jvm.internal;

/* loaded from: classes5.dex */
public final class c implements P5.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f33747a = new c();

    private c() {
    }

    @Override // P5.d
    public P5.g getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
