package io.sentry.clientreport;

import io.sentry.a1;
import io.sentry.clientreport.f;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.s4;
import io.sentry.w1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReport.java */
@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class b implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private final Date f18883f;

    /* renamed from: g, reason: collision with root package name */
    private final List<f> f18884g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, Object> f18885h;

    /* compiled from: ClientReport.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<b> {
        private Exception c(String str, w1 w1Var) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            w1Var.b(s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a(n2 n2Var, w1 w1Var) throws Exception {
            ArrayList arrayList = new ArrayList();
            n2Var.b();
            Date date = null;
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                if (k0.equals("discarded_events")) {
                    arrayList.addAll(n2Var.O0(w1Var, new f.a()));
                } else if (!k0.equals("timestamp")) {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    n2Var.V0(w1Var, hashMap, k0);
                } else {
                    date = n2Var.J0(w1Var);
                }
            }
            n2Var.D();
            if (date != null) {
                if (!arrayList.isEmpty()) {
                    b bVar = new b(date, arrayList);
                    bVar.b(hashMap);
                    return bVar;
                }
                throw c("discarded_events", w1Var);
            }
            throw c("timestamp", w1Var);
        }
    }

    public b(Date date, List<f> list) {
        this.f18883f = date;
        this.f18884g = list;
    }

    public List<f> a() {
        return this.f18884g;
    }

    public void b(Map<String, Object> map) {
        this.f18885h = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        h3Var.k("timestamp").b(a1.g(this.f18883f));
        h3Var.k("discarded_events").g(w1Var, this.f18884g);
        Map<String, Object> map = this.f18885h;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f18885h.get(str));
            }
        }
        h3Var.d();
    }
}
