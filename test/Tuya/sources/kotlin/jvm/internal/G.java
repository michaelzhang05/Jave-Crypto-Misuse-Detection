package kotlin.jvm.internal;

/* loaded from: classes5.dex */
public final class G implements InterfaceC3148m {

    /* renamed from: a, reason: collision with root package name */
    private final Class f33755a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33756b;

    public G(Class jClass, String moduleName) {
        AbstractC3159y.i(jClass, "jClass");
        AbstractC3159y.i(moduleName, "moduleName");
        this.f33755a = jClass;
        this.f33756b = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC3148m
    public Class d() {
        return this.f33755a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof G) && AbstractC3159y.d(d(), ((G) obj).d())) {
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
