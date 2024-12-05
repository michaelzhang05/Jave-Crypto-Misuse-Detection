package s4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static volatile d f9254b;

    /* renamed from: a, reason: collision with root package name */
    private final Set f9255a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f9254b;
        if (dVar == null) {
            synchronized (d.class) {
                dVar = f9254b;
                if (dVar == null) {
                    dVar = new d();
                    f9254b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f9255a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f9255a);
        }
        return unmodifiableSet;
    }
}
