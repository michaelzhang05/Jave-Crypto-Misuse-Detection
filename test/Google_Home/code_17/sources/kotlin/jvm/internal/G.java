package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class G implements InterfaceC3244m {

    /* renamed from: a, reason: collision with root package name */
    private final Class f34156a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34157b;

    public G(Class jClass, String moduleName) {
        AbstractC3255y.i(jClass, "jClass");
        AbstractC3255y.i(moduleName, "moduleName");
        this.f34156a = jClass;
        this.f34157b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC3244m
    public Class d() {
        return this.f34156a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof G) && AbstractC3255y.d(d(), ((G) obj).d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
