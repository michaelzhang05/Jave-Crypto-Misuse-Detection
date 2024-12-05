package P;

import Q.InterfaceC1302c;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC1938b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f7851a = Collections.newSetFromMap(new WeakHashMap());

    /* loaded from: classes3.dex */
    public interface a extends InterfaceC1302c {
    }

    /* loaded from: classes3.dex */
    public interface b extends Q.h {
    }

    public static Set b() {
        Set set = f7851a;
        synchronized (set) {
        }
        return set;
    }

    public abstract AbstractC1938b a(AbstractC1938b abstractC1938b);

    public abstract Looper c();

    public boolean d(Q.j jVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
