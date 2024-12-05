package i6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: i6.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2822g0 implements InterfaceC2845s0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f31773a;

    public C2822g0(boolean z8) {
        this.f31773a = z8;
    }

    @Override // i6.InterfaceC2845s0
    public K0 a() {
        return null;
    }

    @Override // i6.InterfaceC2845s0
    public boolean isActive() {
        return this.f31773a;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (isActive()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
