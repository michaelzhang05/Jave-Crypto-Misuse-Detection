package p3;

import g3.v;
import g3.w;
import g3.x;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h implements w {

    /* renamed from: a, reason: collision with root package name */
    private static final h f8835a = new h();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        private final v f8836a;

        private b(v vVar) {
            this.f8836a = vVar;
        }
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d() {
        x.n(f8835a);
    }

    @Override // g3.w
    public Class a() {
        return g.class;
    }

    @Override // g3.w
    public Class c() {
        return g.class;
    }

    @Override // g3.w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g b(v vVar) {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new b(vVar);
    }
}
