package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class f1 implements g1 {

    /* renamed from: f, reason: collision with root package name */
    private final v1 f22152f;

    public f1(v1 v1Var) {
        this.f22152f = v1Var;
    }

    @Override // kotlinx.coroutines.g1
    public boolean b() {
        return false;
    }

    @Override // kotlinx.coroutines.g1
    public v1 e() {
        return this.f22152f;
    }

    public String toString() {
        return l0.c() ? e().v("New") : super.toString();
    }
}
