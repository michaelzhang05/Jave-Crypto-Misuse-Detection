package h1;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f31353b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f31354a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f31353b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f31353b;
                    if (dVar == null) {
                        dVar = new d();
                        f31353b = dVar;
                    }
                } finally {
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f31354a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.f31354a);
        }
        return unmodifiableSet;
    }
}
