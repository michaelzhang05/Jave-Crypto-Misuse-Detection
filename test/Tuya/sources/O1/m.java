package O1;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private Set f7746a = Collections.emptySet();

    public void a(K1.m mVar) {
        if (d(mVar)) {
        } else {
            throw new K1.f("Unsupported critical header parameter(s)");
        }
    }

    public Set b() {
        return DesugarCollections.unmodifiableSet(this.f7746a);
    }

    public Set c() {
        return Collections.singleton("b64");
    }

    public boolean d(K1.e eVar) {
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
            this.f7746a = Collections.emptySet();
        } else {
            this.f7746a = set;
        }
    }
}
