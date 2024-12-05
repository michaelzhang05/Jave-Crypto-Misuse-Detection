package j1;

import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: j1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3178d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C3178d f33899b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f33900a = new HashSet();

    C3178d() {
    }

    public static C3178d a() {
        C3178d c3178d = f33899b;
        if (c3178d == null) {
            synchronized (C3178d.class) {
                try {
                    c3178d = f33899b;
                    if (c3178d == null) {
                        c3178d = new C3178d();
                        f33899b = c3178d;
                    }
                } finally {
                }
            }
        }
        return c3178d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f33900a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.f33900a);
        }
        return unmodifiableSet;
    }
}
