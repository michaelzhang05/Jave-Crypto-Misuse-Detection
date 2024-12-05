package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public abstract class q1 extends y implements v0, g1 {

    /* renamed from: i, reason: collision with root package name */
    public r1 f22267i;

    @Override // kotlinx.coroutines.g1
    public boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.v0
    public void d() {
        w().X(this);
    }

    @Override // kotlinx.coroutines.g1
    public v1 e() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.l
    public String toString() {
        return m0.a(this) + '@' + m0.b(this) + "[job@" + m0.b(w()) + ']';
    }

    public final r1 w() {
        r1 r1Var = this.f22267i;
        if (r1Var != null) {
            return r1Var;
        }
        kotlin.jvm.internal.l.v("job");
        throw null;
    }

    public final void x(r1 r1Var) {
        this.f22267i = r1Var;
    }
}
