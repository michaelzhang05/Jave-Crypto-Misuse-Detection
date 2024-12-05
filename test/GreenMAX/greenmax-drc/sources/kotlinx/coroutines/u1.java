package kotlinx.coroutines;

/* compiled from: MainCoroutineDispatcher.kt */
/* loaded from: classes2.dex */
public abstract class u1 extends c0 {
    @Override // kotlinx.coroutines.c0
    public String toString() {
        String v0 = v0();
        if (v0 != null) {
            return v0;
        }
        return m0.a(this) + '@' + m0.b(this);
    }

    public abstract u1 u0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final String v0() {
        u1 u1Var;
        u0 u0Var = u0.a;
        u1 c2 = u0.c();
        if (this == c2) {
            return "Dispatchers.Main";
        }
        try {
            u1Var = c2.u0();
        } catch (UnsupportedOperationException unused) {
            u1Var = null;
        }
        if (this == u1Var) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
