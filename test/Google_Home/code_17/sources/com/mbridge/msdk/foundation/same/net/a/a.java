package com.mbridge.msdk.foundation.same.net.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f20635a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f20636b;

    /* renamed from: c, reason: collision with root package name */
    private CronetEngine.Builder f20637c;

    /* renamed from: d, reason: collision with root package name */
    private CronetEngine f20638d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.same.net.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0399a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f20639a = new a();
    }

    public static a a() {
        return C0399a.f20639a;
    }

    private CronetEngine.Builder d() {
        if (this.f20637c == null) {
            this.f20637c = new CronetEngine.Builder(com.mbridge.msdk.foundation.controller.c.m().c());
            this.f20637c.setStoragePath(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER)).enableHttpCache(2, 5242880L).enableHttp2(true).enableQuic(true);
        }
        return this.f20637c;
    }

    public final ExecutorService b() {
        return this.f20635a;
    }

    public final CronetEngine c() {
        if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return null;
        }
        CronetEngine cronetEngine = this.f20638d;
        if (cronetEngine != null) {
            return cronetEngine;
        }
        if (this.f20637c == null) {
            this.f20637c = d();
        }
        CronetEngine build = this.f20637c.build();
        this.f20638d = build;
        return build;
    }

    private a() {
        this.f20635a = Executors.newCachedThreadPool();
        this.f20636b = new ArrayList<>();
        if (this.f20637c == null) {
            this.f20637c = d();
        }
        this.f20638d = this.f20637c.build();
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f20636b.contains(str)) {
                return;
            }
            this.f20636b.add(str);
            if (this.f20637c == null) {
                this.f20637c = d();
            }
            CronetEngine.Builder builder = this.f20637c;
            if (builder != null) {
                builder.addQuicHint(str, 443, 443);
            }
        } catch (Throwable th) {
            ad.b("CronetEngineManager", th.getMessage());
        }
    }
}
