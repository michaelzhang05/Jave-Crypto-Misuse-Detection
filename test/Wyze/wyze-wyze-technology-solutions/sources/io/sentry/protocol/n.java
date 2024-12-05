package io.sentry.protocol;

import io.sentry.h3;
import io.sentry.l2;
import io.sentry.n2;
import io.sentry.r2;
import io.sentry.w1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SdkInfo.java */
/* loaded from: classes2.dex */
public final class n implements r2 {

    /* renamed from: f, reason: collision with root package name */
    private String f19156f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f19157g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f19158h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f19159i;

    /* renamed from: j, reason: collision with root package name */
    private Map<String, Object> f19160j;

    /* compiled from: SdkInfo.java */
    /* loaded from: classes2.dex */
    public static final class a implements l2<n> {
        /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001d. Please report as an issue. */
        @Override // io.sentry.l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n a(n2 n2Var, w1 w1Var) throws Exception {
            n nVar = new n();
            n2Var.b();
            HashMap hashMap = null;
            while (n2Var.w0() == io.sentry.vendor.gson.stream.b.NAME) {
                String k0 = n2Var.k0();
                k0.hashCode();
                char c2 = 65535;
                switch (k0.hashCode()) {
                    case 270207856:
                        if (k0.equals("sdk_name")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 696101379:
                        if (k0.equals("version_patchlevel")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 1111241618:
                        if (k0.equals("version_major")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1111483790:
                        if (k0.equals("version_minor")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        nVar.f19156f = n2Var.T0();
                        break;
                    case 1:
                        nVar.f19159i = n2Var.N0();
                        break;
                    case 2:
                        nVar.f19157g = n2Var.N0();
                        break;
                    case 3:
                        nVar.f19158h = n2Var.N0();
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
            nVar.e(hashMap);
            return nVar;
        }
    }

    public void e(Map<String, Object> map) {
        this.f19160j = map;
    }

    @Override // io.sentry.r2
    public void serialize(h3 h3Var, w1 w1Var) throws IOException {
        h3Var.f();
        if (this.f19156f != null) {
            h3Var.k("sdk_name").b(this.f19156f);
        }
        if (this.f19157g != null) {
            h3Var.k("version_major").e(this.f19157g);
        }
        if (this.f19158h != null) {
            h3Var.k("version_minor").e(this.f19158h);
        }
        if (this.f19159i != null) {
            h3Var.k("version_patchlevel").e(this.f19159i);
        }
        Map<String, Object> map = this.f19160j;
        if (map != null) {
            for (String str : map.keySet()) {
                h3Var.k(str).g(w1Var, this.f19160j.get(str));
            }
        }
        h3Var.d();
    }
}
