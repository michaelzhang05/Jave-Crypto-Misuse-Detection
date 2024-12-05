package i.a.g;

/* compiled from: ServiceEventImpl.java */
/* loaded from: classes2.dex */
public class p extends i.a.c {

    /* renamed from: f, reason: collision with root package name */
    private final String f18371f;

    /* renamed from: g, reason: collision with root package name */
    private final String f18372g;

    /* renamed from: h, reason: collision with root package name */
    private final i.a.d f18373h;

    public p(l lVar, String str, String str2, i.a.d dVar) {
        super(lVar);
        this.f18371f = str;
        this.f18372g = str2;
        this.f18373h = dVar;
    }

    @Override // i.a.c
    public i.a.a c() {
        return (i.a.a) getSource();
    }

    @Override // i.a.c
    public i.a.d d() {
        return this.f18373h;
    }

    @Override // i.a.c
    public String e() {
        return this.f18372g;
    }

    @Override // i.a.c
    public String g() {
        return this.f18371f;
    }

    @Override // i.a.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public p clone() {
        return new p((l) c(), g(), e(), new q(d()));
    }

    @Override // java.util.EventObject
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[" + p.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("\n\tname: '");
        sb.append(e());
        sb.append("' type: '");
        sb.append(g());
        sb.append("' info: '");
        sb.append(d());
        sb.append("']");
        return sb.toString();
    }
}
