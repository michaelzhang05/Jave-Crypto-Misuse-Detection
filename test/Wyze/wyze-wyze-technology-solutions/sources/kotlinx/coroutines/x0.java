package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: JobSupport.kt */
/* loaded from: classes2.dex */
public final class x0 implements g1 {

    /* renamed from: f, reason: collision with root package name */
    private final boolean f22299f;

    public x0(boolean z) {
        this.f22299f = z;
    }

    @Override // kotlinx.coroutines.g1
    public boolean b() {
        return this.f22299f;
    }

    @Override // kotlinx.coroutines.g1
    public v1 e() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
