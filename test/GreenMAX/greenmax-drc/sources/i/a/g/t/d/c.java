package i.a.g.t.d;

import i.a.d;
import i.a.g.f;
import i.a.g.g;
import i.a.g.h;
import i.a.g.l;
import i.a.g.s.e;
import java.io.IOException;
import okhttp3.HttpUrl;

/* compiled from: ServiceResolver.java */
/* loaded from: classes2.dex */
public class c extends a {

    /* renamed from: i, reason: collision with root package name */
    private final String f18433i;

    public c(l lVar, String str) {
        super(lVar);
        this.f18433i = str;
    }

    @Override // i.a.g.t.a
    public String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("ServiceResolver(");
        sb.append(e() != null ? e().I0() : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(")");
        return sb.toString();
    }

    @Override // i.a.g.t.d.a
    protected f g(f fVar) throws IOException {
        long currentTimeMillis = System.currentTimeMillis();
        for (d dVar : e().M0().values()) {
            fVar = b(fVar, new h.e(dVar.s(), i.a.g.s.d.CLASS_IN, false, 3600, dVar.n()), currentTimeMillis);
        }
        return fVar;
    }

    @Override // i.a.g.t.d.a
    protected f h(f fVar) throws IOException {
        return d(fVar, g.C(this.f18433i, e.TYPE_PTR, i.a.g.s.d.CLASS_IN, false));
    }

    @Override // i.a.g.t.d.a
    protected String i() {
        return "querying service";
    }
}
