package kotlin.reflect.jvm.internal.impl.descriptors;

/* compiled from: Visibility.kt */
/* loaded from: classes2.dex */
public abstract class m1 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f21659b;

    /* JADX INFO: Access modifiers changed from: protected */
    public m1(String str, boolean z) {
        kotlin.jvm.internal.l.f(str, "name");
        this.a = str;
        this.f21659b = z;
    }

    public Integer a(m1 m1Var) {
        kotlin.jvm.internal.l.f(m1Var, "visibility");
        return l1.a.a(this, m1Var);
    }

    public String b() {
        return this.a;
    }

    public final boolean c() {
        return this.f21659b;
    }

    public m1 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
