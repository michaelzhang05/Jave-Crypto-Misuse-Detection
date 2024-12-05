package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.x;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5578b = true;

    /* renamed from: c, reason: collision with root package name */
    private static volatile p f5579c;

    /* renamed from: d, reason: collision with root package name */
    static final p f5580d = new p(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f5581a = Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f5582a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5583b;

        a(Object obj, int i6) {
            this.f5582a = obj;
            this.f5583b = i6;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f5582a == aVar.f5582a && this.f5583b == aVar.f5583b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f5582a) * 65535) + this.f5583b;
        }
    }

    p(boolean z5) {
    }

    public static p b() {
        p pVar = f5579c;
        if (pVar == null) {
            synchronized (p.class) {
                pVar = f5579c;
                if (pVar == null) {
                    pVar = f5578b ? o.a() : f5580d;
                    f5579c = pVar;
                }
            }
        }
        return pVar;
    }

    public x.c a(o0 o0Var, int i6) {
        androidx.appcompat.app.f0.a(this.f5581a.get(new a(o0Var, i6)));
        return null;
    }
}
