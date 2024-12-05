package R1;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private Set f9602a = Collections.emptySet();

    public void a(N1.m mVar) {
        if (d(mVar)) {
        } else {
            throw new N1.f("Unsupported critical header parameter(s)");
        }
    }

    public Set b() {
        return DesugarCollections.unmodifiableSet(this.f9602a);
    }

    public Set c() {
        return Collections.singleton("b64");
    }

    public boolean d(N1.e eVar) {
        if (eVar.c() == null) {
            return true;
        }
        for (String str : eVar.c()) {
            if (!c().contains(str) && !b().contains(str)) {
                return false;
            }
        }
        return true;
    }

    public void e(Set set) {
        if (set == null) {
            this.f9602a = Collections.emptySet();
        } else {
            this.f9602a = set;
        }
    }
}
