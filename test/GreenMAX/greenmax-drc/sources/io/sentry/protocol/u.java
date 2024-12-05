package io.sentry.protocol;

import cm.aptoide.pt.downloadmanager.Constants;
import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.t4;
import io.sentry.w1;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: SentryStackFrame.java */
/* loaded from: classes2.dex */
public final class u implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19187f;

    /* renamed from: g, reason: collision with root package name */
    private String f19188g;

    /* renamed from: h, reason: collision with root package name */
    private String f19189h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f19190i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f19191j;

    /* renamed from: k, reason: collision with root package name */
    private String f19192k;
    private String l;
    private Boolean m;
    private String n;
    private Boolean o;
    private String p;
    private String q;
    private String r;
    private String s;
    private String t;
    private Map<String, Object> u;
    private String v;
    private t4 w;

    /* compiled from: SentryStackFrame.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<u> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public u a(n2 n2Var, w1 w1Var) throws Exception {
            u uVar = new u();
            n2Var.b();
            ConcurrentHashMap concurrentHashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case -1443345323:
                        if (k0.equals("image_addr")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -1184392185:
                        if (k0.equals("in_app")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -1113875953:
                        if (k0.equals("raw_function")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case -1102671691:
                        if (k0.equals("lineno")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -1068784020:
                        if (k0.equals("module")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (k0.equals("native")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -887523944:
                        if (k0.equals("symbol")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case -807062458:
                        if (k0.equals(Constants.PACKAGE)) {
                            c2 = 7;
                            break;
                        }
                        break;
                    case -734768633:
                        if (k0.equals("filename")) {
                            c2 = '\b';
                            break;
                        }
                        break;
                    case -330260936:
                        if (k0.equals("symbol_addr")) {
                            c2 = '\t';
                            break;
                        }
                        break;
                    case 3327275:
                        if (k0.equals("lock")) {
                            c2 = '\n';
                            break;
                        }
                        break;
                    case 94842689:
                        if (k0.equals("colno")) {
                            c2 = 11;
                            break;
                        }
                        break;
                    case 410194178:
                        if (k0.equals("instruction_addr")) {
                            c2 = '\f';
                            break;
                        }
                        break;
                    case 1116694660:
                        if (k0.equals("context_line")) {
                            c2 = '\r';
                            break;
                        }
                        break;
                    case 1380938712:
                        if (k0.equals("function")) {
                            c2 = 14;
                            break;
                        }
                        break;
                    case 1713445842:
                        if (k0.equals("abs_path")) {
                            c2 = 15;
                            break;
                        }
                        break;
                    case 1874684019:
                        if (k0.equals("platform")) {
                            c2 = 16;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        uVar.q = n2Var.T0();
                        break;
                    case 1:
                        uVar.m = n2Var.I0();
                        break;
                    case 2:
                        uVar.v = n2Var.T0();
                        break;
                    case 3:
                        uVar.f19190i = n2Var.N0();
                        break;
                    case 4:
                        uVar.f19189h = n2Var.T0();
                        break;
                    case 5:
                        uVar.o = n2Var.I0();
                        break;
                    case 6:
                        uVar.t = n2Var.T0();
                        break;
                    case 7:
                        uVar.n = n2Var.T0();
                        break;
                    case '\b':
                        uVar.f19187f = n2Var.T0();
                        break;
                    case '\t':
                        uVar.r = n2Var.T0();
                        break;
                    case '\n':
                        uVar.w = (t4) n2Var.S0(w1Var, new t4.a());
                        break;
                    case 11:
                        uVar.f19191j = n2Var.N0();
                        break;
                    case '\f':
                        uVar.s = n2Var.T0();
                        break;
                    case '\r':
                        uVar.l = n2Var.T0();
                        break;
                    case 14:
                        uVar.f19188g = n2Var.T0();
                        break;
                    case 15:
                        uVar.f19192k = n2Var.T0();
                        break;
                    case 16:
                        uVar.p = n2Var.T0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        n2Var.V0(w1Var, concurrentHashMap, k0);
                        break;
                }
            }
            uVar.z(concurrentHashMap);
            n2Var.D();
            return uVar;
        }
    }

    public void r(String str) {
        this.f19187f = str;
    }

    public void s(String str) {
        this.f19188g = str;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19187f != null) {
            h3Var.k("filename").b(this.f19187f);
        }
        if (this.f19188g != null) {
            h3Var.k("function").b(this.f19188g);
        }
        if (this.f19189h != null) {
            h3Var.k("module").b(this.f19189h);
        }
        if (this.f19190i != null) {
            h3Var.k("lineno").e(this.f19190i);
        }
        if (this.f19191j != null) {
            h3Var.k("colno").e(this.f19191j);
        }
        if (this.f19192k != null) {
            h3Var.k("abs_path").b(this.f19192k);
        }
        if (this.l != null) {
            h3Var.k("context_line").b(this.l);
        }
        if (this.m != null) {
            h3Var.k("in_app").h(this.m);
        }
        if (this.n != null) {
            h3Var.k(Constants.PACKAGE).b(this.n);
        }
        if (this.o != null) {
            h3Var.k("native").h(this.o);
        }
        if (this.p != null) {
            h3Var.k("platform").b(this.p);
        }
        if (this.q != null) {
            h3Var.k("image_addr").b(this.q);
        }
        if (this.r != null) {
            h3Var.k("symbol_addr").b(this.r);
        }
        if (this.s != null) {
            h3Var.k("instruction_addr").b(this.s);
        }
        if (this.v != null) {
            h3Var.k("raw_function").b(this.v);
        }
        if (this.t != null) {
            h3Var.k("symbol").b(this.t);
        }
        if (this.w != null) {
            h3Var.k("lock").g(w1Var, this.w);
        }
        Map<String, Object> map = this.u;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.u.get(str);
                h3Var.k(str);
                h3Var.g(w1Var, obj);
            }
        }
        h3Var.d();
    }

    public void t(Boolean bool) {
        this.m = bool;
    }

    public void u(Integer num) {
        this.f19190i = num;
    }

    public void v(t4 t4Var) {
        this.w = t4Var;
    }

    public void w(String str) {
        this.f19189h = str;
    }

    public void x(Boolean bool) {
        this.o = bool;
    }

    public void y(String str) {
        this.n = str;
    }

    public void z(Map<String, Object> map) {
        this.u = map;
    }
}
