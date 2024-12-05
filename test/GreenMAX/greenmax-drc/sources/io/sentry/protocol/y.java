package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: TransactionInfo.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class y implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final String f19203f;

    /* renamed from: g, reason: collision with root package name */
    private Map<String, Object> f19204g;

    /* compiled from: TransactionInfo.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<y> {
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y a(n2 n2Var, w1 w1Var) throws Exception {
            n2Var.b();
            String str = null;
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (!k0.equals("source")) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    n2Var.V0(w1Var, concurrentHashMap, k0);
                } else {
                    str = n2Var.T0();
                }
            }
            y yVar = new y(str);
            yVar.a(concurrentHashMap);
            n2Var.D();
            return yVar;
        }
    }

    public y(String str) {
        this.f19203f = str;
    }

    public void a(Map<String, Object> map) {
        this.f19204g = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19203f != null) {
            h3Var.k("source").g(w1Var, this.f19203f);
        }
        Map<String, Object> map = this.f19204g;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f19204g.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }
}
