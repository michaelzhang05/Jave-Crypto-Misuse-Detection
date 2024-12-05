package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC2091c5;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class O4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile O4 f16241b;

    /* renamed from: c, reason: collision with root package name */
    static final O4 f16242c = new O4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f16243a = Collections.emptyMap();

    /* loaded from: classes3.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f16244a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16245b;

        a(Object obj, int i8) {
            this.f16244a = obj;
            this.f16245b = i8;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16244a != aVar.f16244a || this.f16245b != aVar.f16245b) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f16244a) * 65535) + this.f16245b;
        }
    }

    private O4(boolean z8) {
    }

    public static O4 a() {
        O4 o42 = f16241b;
        if (o42 != null) {
            return o42;
        }
        synchronized (O4.class) {
            try {
                O4 o43 = f16241b;
                if (o43 != null) {
                    return o43;
                }
                O4 a8 = AbstractC2071a5.a(O4.class);
                f16241b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC2091c5.d b(I5 i52, int i8) {
        android.support.v4.media.a.a(this.f16243a.get(new a(i52, i8)));
        return null;
    }
}
