package j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.r f33149a;

    /* renamed from: b, reason: collision with root package name */
    private final v f33150b;

    /* renamed from: c, reason: collision with root package name */
    private final b f33151c;

    /* renamed from: d, reason: collision with root package name */
    private volatile i f33152d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(j$.time.temporal.r rVar, v vVar, b bVar) {
        this.f33149a = rVar;
        this.f33150b = vVar;
        this.f33151c = bVar;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        Long e8 = pVar.e(this.f33149a);
        if (e8 == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) pVar.d().u(j$.time.temporal.n.e());
        String c8 = (mVar == null || mVar == j$.time.chrono.t.f33103d) ? this.f33151c.c(this.f33149a, e8.longValue(), this.f33150b, pVar.c()) : this.f33151c.b(mVar, this.f33149a, e8.longValue(), this.f33150b, pVar.c());
        if (c8 != null) {
            sb.append(c8);
            return true;
        }
        if (this.f33152d == null) {
            this.f33152d = new i(this.f33149a, 1, 19, u.NORMAL);
        }
        return this.f33152d.j(pVar, sb);
    }

    public final String toString() {
        StringBuilder sb;
        v vVar = v.FULL;
        j$.time.temporal.r rVar = this.f33149a;
        v vVar2 = this.f33150b;
        if (vVar2 == vVar) {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
        } else {
            sb = new StringBuilder("Text(");
            sb.append(rVar);
            sb.append(",");
            sb.append(vVar2);
        }
        sb.append(")");
        return sb.toString();
    }
}
