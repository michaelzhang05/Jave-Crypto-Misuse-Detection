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
    private final ExecutorService f19580a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f19581b;

    /* renamed from: c, reason: collision with root package name */
    private CronetEngine.Builder f19582c;

    /* renamed from: d, reason: collision with root package name */
    private CronetEngine f19583d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.foundation.same.net.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0403a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f19584a = new a();
    }

    public static a a() {
        return C0403a.f19584a;
    }

    private CronetEngine.Builder d() {
        if (this.f19582c == null) {
            this.f19582c = new CronetEngine.Builder(com.mbridge.msdk.foundation.controller.c.m().c());
            this.f19582c.setStoragePath(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_OTHER)).enableHttpCache(2, 5242880L).enableHttp2(true).enableQuic(true);
        }
        return this.f19582c;
    }

    public final ExecutorService b() {
        return this.f19580a;
    }

    public final CronetEngine c() {
        if (com.mbridge.msdk.foundation.controller.c.m().c() == null) {
            return null;
        }
        CronetEngine cronetEngine = this.f19583d;
        if (cronetEngine != null) {
            return cronetEngine;
        }
        if (this.f19582c == null) {
            this.f19582c = d();
        }
        CronetEngine build = this.f19582c.build();
        this.f19583d = build;
        return build;
    }

    private a() {
        this.f19580a = Executors.newCachedThreadPool();
        this.f19581b = new ArrayList<>();
        if (this.f19582c == null) {
            this.f19582c = d();
        }
        this.f19583d = this.f19582c.build();
    }

    public final void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f19581b.contains(str)) {
                return;
            }
            this.f19581b.add(str);
            if (this.f19582c == null) {
                this.f19582c = d();
            }
            CronetEngine.Builder builder = this.f19582c;
            if (builder != null) {
                builder.addQuicHint(str, 443, 443);
            }
        } catch (Throwable th) {
            ad.b("CronetEngineManager", th.getMessage());
        }
    }
}
