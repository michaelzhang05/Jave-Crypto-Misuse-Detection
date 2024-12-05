package l6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.g0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3357g0 implements InterfaceC3380s0 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34625a;

    public C3357g0(boolean z8) {
        this.f34625a = z8;
    }

    @Override // l6.InterfaceC3380s0
    public K0 a() {
        return null;
    }

    @Override // l6.InterfaceC3380s0
    public boolean isActive() {
        return this.f34625a;
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
