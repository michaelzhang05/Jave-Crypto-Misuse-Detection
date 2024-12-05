package io.sentry.protocol;

import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ViewHierarchyNode.java */
/* loaded from: classes2.dex */
public final class c0 implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19100f;

    /* renamed from: g, reason: collision with root package name */
    private String f19101g;

    /* renamed from: h, reason: collision with root package name */
    private String f19102h;

    /* renamed from: i, reason: collision with root package name */
    private String f19103i;

    /* renamed from: j, reason: collision with root package name */
    private Double f19104j;

    /* renamed from: k, reason: collision with root package name */
    private Double f19105k;
    private Double l;
    private Double m;
    private String n;
    private Double o;
    private List<c0> p;
    private Map<String, Object> q;

    /* compiled from: ViewHierarchyNode.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<c0> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 a(n2 n2Var, w1 w1Var) throws Exception {
            c0 c0Var = new c0();
            n2Var.b();
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1784982718:
                        if (k0.equals("rendering_system")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1618432855:
                        if (k0.equals("identifier")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1221029593:
                        if (k0.equals("height")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 120:
                        if (k0.equals("x")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 121:
                        if (k0.equals("y")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 114586:
                        if (k0.equals(StoreTabGridRecyclerFragment.BundleCons.TAG)) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 3575610:
                        if (k0.equals("type")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 92909918:
                        if (k0.equals("alpha")) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case 113126854:
                        if (k0.equals("width")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case 1659526655:
                        if (k0.equals("children")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 1941332754:
                        if (k0.equals("visibility")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        c0Var.f19100f = n2Var.T0();
                        break;
                    case 1:
                        c0Var.f19102h = n2Var.T0();
                        break;
                    case 2:
                        c0Var.f19105k = n2Var.K0();
                        break;
                    case 3:
                        c0Var.l = n2Var.K0();
                        break;
                    case 4:
                        c0Var.m = n2Var.K0();
                        break;
                    case 5:
                        c0Var.f19103i = n2Var.T0();
                        break;
                    case 6:
                        c0Var.f19101g = n2Var.T0();
                        break;
                    case 7:
                        c0Var.o = n2Var.K0();
                        break;
                    case '\b':
                        c0Var.f19104j = n2Var.K0();
                        break;
                    case '\t':
                        c0Var.p = n2Var.O0(w1Var, this);
                        break;
                    case '\n':
                        c0Var.n = n2Var.T0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        n2Var.V0(w1Var, hashMap, k0);
                        break;
                }
            }
            n2Var.D();
            c0Var.q(hashMap);
            return c0Var;
        }
    }

    public void l(Double d2) {
        this.o = d2;
    }

    public void m(List<c0> list) {
        this.p = list;
    }

    public void n(Double d2) {
        this.f19105k = d2;
    }

    public void o(String str) {
        this.f19102h = str;
    }

    public void p(String str) {
        this.f19101g = str;
    }

    public void q(Map<String, Object> map) {
        this.q = map;
    }

    public void r(String str) {
        this.n = str;
    }

    public void s(Double d2) {
        this.f19104j = d2;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19100f != null) {
            h3Var.k("rendering_system").b(this.f19100f);
        }
        if (this.f19101g != null) {
            h3Var.k("type").b(this.f19101g);
        }
        if (this.f19102h != null) {
            h3Var.k("identifier").b(this.f19102h);
        }
        if (this.f19103i != null) {
            h3Var.k(StoreTabGridRecyclerFragment.BundleCons.TAG).b(this.f19103i);
        }
        if (this.f19104j != null) {
            h3Var.k("width").e(this.f19104j);
        }
        if (this.f19105k != null) {
            h3Var.k("height").e(this.f19105k);
        }
        if (this.l != null) {
            h3Var.k("x").e(this.l);
        }
        if (this.m != null) {
            h3Var.k("y").e(this.m);
        }
        if (this.n != null) {
            h3Var.k("visibility").b(this.n);
        }
        if (this.o != null) {
            h3Var.k("alpha").e(this.o);
        }
        List<c0> list = this.p;
        if (list != null && !list.isEmpty()) {
            h3Var.k("children").g(w1Var, this.p);
        }
        Map<String, Object> map = this.q;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.q.get(str));
            }
        }
        h3Var.d();
    }

    public void t(Double d2) {
        this.l = d2;
    }

    public void u(Double d2) {
        this.m = d2;
    }
}
