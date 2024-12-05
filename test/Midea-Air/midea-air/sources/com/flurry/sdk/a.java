package com.flurry.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.flurry.sdk.d;
import com.flurry.sdk.i2;
import com.flurry.sdk.v3;
import com.flurry.sdk.z6;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class a extends l2 {
    public static AtomicBoolean o = new AtomicBoolean(false);
    private static a p = null;
    public List<e.d.a.e> q;

    /* renamed from: com.flurry.sdk.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0158a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f9708h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ e.d.a.c f9709i;

        public C0158a(long j2, e.d.a.c cVar) {
            this.f9708h = j2;
            this.f9709i = cVar;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            e7.a().l.s = this.f9708h;
            e7.a().l.A(this.f9709i);
        }
    }

    /* loaded from: classes2.dex */
    public class b extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f9711h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f9712i;

        public b(Context context, List list) {
            this.f9711h = context;
            this.f9712i = list;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            m2 a = m2.a();
            a.f10029d.a();
            a.f10027b.a.a();
            z6 z6Var = a.f10028c;
            File[] listFiles = new File(q2.c()).listFiles();
            if (listFiles != null) {
                for (int i2 = 0; i2 < listFiles.length; i2++) {
                    if (listFiles[i2].isFile()) {
                        d1.c(3, "StreamingFileUtil", "File " + listFiles[i2].getName());
                    } else if (listFiles[i2].isDirectory()) {
                        d1.c(3, "StreamingFileUtil", "Directory " + listFiles[i2].getName());
                    }
                }
            }
            System.out.println();
            d1.c(2, "VNodeFileProcessor", "Number of files already pending: in startWatching " + listFiles.length);
            z6Var.e(Arrays.asList(listFiles));
            z6Var.m(new z6.a(z6Var));
            h2.a();
            g1.a(this.f9711h);
            h2.c(this.f9712i);
            h2.b(this.f9711h);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9714h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f9715i;

        public c(String str, String str2) {
            this.f9714h = str;
            this.f9715i = str2;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            o6.j(this.f9714h, this.f9715i);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f9717h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f9718i;

        public d(int i2, Context context) {
            this.f9717h = i2;
            this.f9718i = context;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            if (this.f9717h != e.d.a.f.a) {
                o1.a().b(this.f9718i, null);
            }
            int i2 = this.f9717h;
            int i3 = e.d.a.f.f17398b;
            if ((i2 & i3) == i3) {
                n1 a = n1.a();
                a.f10049h = true;
                if (a.f10050i) {
                    a.f();
                }
            }
            int i4 = this.f9717h;
            int i5 = e.d.a.f.f17399c;
            if ((i4 & i5) == i5) {
                q1.a().f10130e = true;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9720h;

        public e(boolean z) {
            this.f9720h = z;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            e7.a().q.x(this.f9720h);
        }
    }

    /* loaded from: classes2.dex */
    final class f extends f2 {
        f() {
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            p5.h();
            e7.a().l.C(f0.FOREGROUND, true);
        }
    }

    /* loaded from: classes2.dex */
    public class g extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f9723h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9724i;

        public g(boolean z, boolean z2) {
            this.f9723h = z;
            this.f9724i = z2;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            int identifier;
            com.flurry.sdk.d dVar = e7.a().f9844i;
            String b2 = k0.a().b();
            boolean z = this.f9723h;
            boolean z2 = this.f9724i;
            dVar.p = b2;
            dVar.q = z;
            dVar.r = z2;
            dVar.m(new d.c());
            String property = System.getProperty("os.arch");
            boolean isEmpty = TextUtils.isEmpty(property);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (isEmpty) {
                property = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("device.model", Build.MODEL);
            hashMap.put("build.brand", Build.BRAND);
            hashMap.put("build.id", Build.ID);
            hashMap.put("version.release", Build.VERSION.RELEASE);
            hashMap.put("build.device", Build.DEVICE);
            hashMap.put("build.product", Build.PRODUCT);
            l0.a();
            Context a = b0.a();
            if (a != null && (identifier = a.getResources().getIdentifier("com.flurry.crash.map_id", "string", a.getPackageName())) != 0) {
                str = a.getResources().getString(identifier);
            }
            hashMap.put("proguard.build.uuid", str);
            hashMap.put("device.arch", property);
            m2.a().b(new n5(new o5(hashMap)));
            d5.h();
            p5.h();
            Map<String, List<String>> a2 = new v0().a();
            if (a2.size() > 0) {
                m2.a().b(new g6(new h6(a2)));
            }
            f5.h(e7.a().f9839d.q);
        }
    }

    /* loaded from: classes2.dex */
    public class h extends f2 {
        public h() {
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            e7.a().l.D(f0.FOREGROUND, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class i extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9727h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ v3.a f9728i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map f9729j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f9730k;
        final /* synthetic */ boolean l;
        final /* synthetic */ long m;
        final /* synthetic */ long n;

        i(String str, v3.a aVar, Map map, boolean z, boolean z2, long j2, long j3) {
            this.f9727h = str;
            this.f9728i = aVar;
            this.f9729j = map;
            this.f9730k = z;
            this.l = z2;
            this.m = j2;
            this.n = j3;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            u3.h(this.f9727h, this.f9728i, this.f9729j, this.f9730k, this.l, this.m, this.n);
        }
    }

    /* loaded from: classes2.dex */
    public class j extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f9731h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f9732i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f9733j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Throwable f9734k;
        final /* synthetic */ Map l;

        public j(String str, long j2, String str2, Throwable th, Map map) {
            this.f9731h = str;
            this.f9732i = j2;
            this.f9733j = str2;
            this.f9734k = th;
            this.l = map;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            e7.a().f9842g.x(this.f9731h, this.f9732i, this.f9733j, this.f9734k.getClass().getName(), this.f9734k, o7.a(), this.l);
        }
    }

    public a() {
        super("FlurryAgentImpl", i2.a(i2.b.PUBLIC_API));
        this.q = new ArrayList();
    }

    public static a v() {
        if (p == null) {
            p = new a();
        }
        return p;
    }

    public static boolean x() {
        return o.get();
    }

    public final e.d.a.d s(String str, v3.a aVar, Map<String, String> map) {
        if (!c2.g(16)) {
            return e.d.a.d.kFlurryEventFailed;
        }
        return t(str, aVar, map, false, false);
    }

    public final e.d.a.d t(String str, v3.a aVar, Map<String, String> map, boolean z, boolean z2) {
        e.d.a.d dVar;
        if (!o.get()) {
            d1.n("FlurryAgentImpl", "Invalid call to logEvent. Flurry is not initialized");
            return null;
        }
        if (c2.b(str).length() == 0) {
            return e.d.a.d.kFlurryEventFailed;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (hashMap.size() > 10) {
            dVar = e.d.a.d.kFlurryEventParamsCountExceeded;
        } else {
            dVar = e.d.a.d.kFlurryEventRecorded;
        }
        m(new i(str, aVar, hashMap, z, z2, currentTimeMillis, elapsedRealtime));
        return dVar;
    }

    public final e.d.a.d u(String str, Map<String, String> map, boolean z, boolean z2) {
        return t(str, v3.a.CUSTOM, map, z, z2);
    }

    public final void w(Context context) {
        if (context instanceof Activity) {
            d1.e("FlurryAgentImpl", "Activity's session is controlled by Flurry SDK");
        } else if (!o.get()) {
            d1.n("FlurryAgentImpl", "Invalid call to onStartSession. Flurry is not initialized");
        } else {
            m(new f());
        }
    }
}
