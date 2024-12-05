package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final char f31937a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(char c8) {
        this.f31937a = c8;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        sb.append(this.f31937a);
        return true;
    }

    public final String toString() {
        char c8 = this.f31937a;
        if (c8 == '\'') {
            return "''";
        }
        return "'" + c8 + "'";
    }
}
