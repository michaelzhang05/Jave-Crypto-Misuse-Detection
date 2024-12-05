package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import okhttp3.internal.http2.Settings;

/* compiled from: ExtensionRegistryLite.java */
/* loaded from: classes2.dex */
public class f {
    private static final f a = new f(true);

    /* renamed from: b, reason: collision with root package name */
    private final Map<a, h.f<?, ?>> f21911b;

    /* compiled from: ExtensionRegistryLite.java */
    /* loaded from: classes2.dex */
    private static final class a {
        private final Object a;

        /* renamed from: b, reason: collision with root package name */
        private final int f21912b;

        a(Object obj, int i2) {
            this.a = obj;
            this.f21912b = i2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f21912b == aVar.f21912b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.f21912b;
        }
    }

    f() {
        this.f21911b = new HashMap();
    }

    public static f c() {
        return a;
    }

    public static f d() {
        return new f();
    }

    public final void a(h.f<?, ?> fVar) {
        this.f21911b.put(new a(fVar.b(), fVar.d()), fVar);
    }

    public <ContainingType extends o> h.f<ContainingType, ?> b(ContainingType containingtype, int i2) {
        return (h.f) this.f21911b.get(new a(containingtype, i2));
    }

    private f(boolean z) {
        this.f21911b = Collections.emptyMap();
    }
}
