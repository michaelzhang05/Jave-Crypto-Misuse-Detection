package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import cm.aptoide.pt.account.view.LoginActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeProtocol.java */
/* loaded from: classes.dex */
public final class s {
    private static final String a = "com.facebook.internal.s";

    /* renamed from: b, reason: collision with root package name */
    private static final List<f> f9213b = f();

    /* renamed from: c, reason: collision with root package name */
    private static final List<f> f9214c = e();

    /* renamed from: d, reason: collision with root package name */
    private static final Map<String, List<f>> f9215d = d();

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f9216e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    private static final List<Integer> f9217f = Arrays.asList(20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                try {
                    Iterator it = s.f9213b.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).b(true);
                    }
                } finally {
                    s.f9216e.set(false);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        private b() {
            super(null);
        }

        @Override // com.facebook.internal.s.f
        protected String d() {
            return null;
        }

        @Override // com.facebook.internal.s.f
        protected String e() {
            return "com.facebook.arstudio.player";
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    private static class c extends f {
        private c() {
            super(null);
        }

        @Override // com.facebook.internal.s.f
        protected String d() {
            return "com.facebook.lite.platform.LoginGDPDialogActivity";
        }

        @Override // com.facebook.internal.s.f
        protected String e() {
            return "com.facebook.lite";
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static class d extends f {
        private d() {
            super(null);
        }

        @Override // com.facebook.internal.s.f
        protected String d() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.s.f
        protected String e() {
            return "com.facebook.katana";
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static class e extends f {
        private e() {
            super(null);
        }

        @Override // com.facebook.internal.s.f
        protected String d() {
            return null;
        }

        @Override // com.facebook.internal.s.f
        protected String e() {
            return "com.facebook.orca";
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static abstract class f {
        private TreeSet<Integer> a;

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x000b, code lost:
        
            if (r1.isEmpty() == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public synchronized void b(boolean r1) {
            /*
                r0 = this;
                monitor-enter(r0)
                if (r1 != 0) goto Ld
                java.util.TreeSet<java.lang.Integer> r1 = r0.a     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto Ld
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto L13
            Ld:
                java.util.TreeSet r1 = com.facebook.internal.s.a(r0)     // Catch: java.lang.Throwable -> L15
                r0.a = r1     // Catch: java.lang.Throwable -> L15
            L13:
                monitor-exit(r0)
                return
            L15:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.s.f.b(boolean):void");
        }

        public TreeSet<Integer> c() {
            TreeSet<Integer> treeSet = this.a;
            if (treeSet == null || treeSet.isEmpty()) {
                b(false);
            }
            return this.a;
        }

        protected abstract String d();

        protected abstract String e();

        /* synthetic */ f(a aVar) {
            this();
        }
    }

    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static class g {
        private f a;

        /* renamed from: b, reason: collision with root package name */
        private int f9218b;

        private g() {
        }

        public static g a(f fVar, int i2) {
            g gVar = new g();
            gVar.a = fVar;
            gVar.f9218b = i2;
            return gVar;
        }

        public static g b() {
            g gVar = new g();
            gVar.f9218b = -1;
            return gVar;
        }

        public int c() {
            return this.f9218b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NativeProtocol.java */
    /* loaded from: classes.dex */
    public static class h extends f {
        private h() {
            super(null);
        }

        @Override // com.facebook.internal.s.f
        protected String d() {
            return "com.facebook.katana.ProxyAuth";
        }

        @Override // com.facebook.internal.s.f
        protected String e() {
            return "com.facebook.wakizashi";
        }

        /* synthetic */ h(a aVar) {
            this();
        }
    }

    private static Map<String, List<f>> d() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new e(null));
        List<f> list = f9213b;
        hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
        hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
        hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", f9214c);
        hashMap.put("com.facebook.platform.action.request.SHARE_STORY", list);
        return hashMap;
    }

    private static List<f> e() {
        ArrayList arrayList = new ArrayList(f());
        arrayList.add(0, new b(null));
        return arrayList;
    }

    private static List<f> f() {
        ArrayList arrayList = new ArrayList();
        a aVar = null;
        arrayList.add(new d(aVar));
        arrayList.add(new h(aVar));
        return arrayList;
    }

    private static Uri g(f fVar) {
        return Uri.parse("content://" + fVar.e() + ".provider.PlatformProvider/versions");
    }

    public static int h(TreeSet<Integer> treeSet, int i2, int[] iArr) {
        int length = iArr.length - 1;
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        int i3 = -1;
        while (descendingIterator.hasNext()) {
            int intValue = descendingIterator.next().intValue();
            i3 = Math.max(i3, intValue);
            while (length >= 0 && iArr[length] > intValue) {
                length--;
            }
            if (length < 0) {
                return -1;
            }
            if (iArr[length] == intValue) {
                if (length % 2 == 0) {
                    return Math.min(i3, i2);
                }
                return -1;
            }
        }
        return -1;
    }

    public static Bundle i(FacebookException facebookException) {
        if (facebookException == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("error_description", facebookException.toString());
        if (facebookException instanceof FacebookOperationCanceledException) {
            bundle.putString("error_type", "UserCanceled");
        }
        return bundle;
    }

    public static Intent j(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.b bVar, String str3, String str4) {
        c cVar = new c(null);
        return y(context, k(cVar, str, collection, str2, z, z2, bVar, str3, str4, false), cVar);
    }

    private static Intent k(f fVar, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.b bVar, String str3, String str4, boolean z3) {
        String d2 = fVar.d();
        if (d2 == null) {
            return null;
        }
        Intent putExtra = new Intent().setClassName(fVar.e(), d2).putExtra("client_id", str);
        putExtra.putExtra("facebook_sdk_version", com.facebook.f.t());
        if (!x.R(collection)) {
            putExtra.putExtra("scope", TextUtils.join(",", collection));
        }
        if (!x.Q(str2)) {
            putExtra.putExtra("e2e", str2);
        }
        putExtra.putExtra("state", str3);
        putExtra.putExtra("response_type", "token,signed_request,graph_domain");
        putExtra.putExtra("return_scopes", "true");
        if (z2) {
            putExtra.putExtra("default_audience", bVar.d());
        }
        putExtra.putExtra("legacy_override", com.facebook.f.o());
        putExtra.putExtra(LoginActivity.AUTH_TYPE, str4);
        if (z3) {
            putExtra.putExtra("fail_on_logged_out", true);
        }
        return putExtra;
    }

    public static Intent l(Context context) {
        for (f fVar : f9213b) {
            Intent z = z(context, new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(fVar.e()).addCategory("android.intent.category.DEFAULT"), fVar);
            if (z != null) {
                return z;
            }
        }
        return null;
    }

    public static Intent m(Intent intent, Bundle bundle, FacebookException facebookException) {
        UUID p = p(intent);
        if (p == null) {
            return null;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", v(intent));
        Bundle bundle2 = new Bundle();
        bundle2.putString("action_id", p.toString());
        if (facebookException != null) {
            bundle2.putBundle("error", i(facebookException));
        }
        intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle2);
        if (bundle != null) {
            intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
        }
        return intent2;
    }

    public static Intent n(Context context, String str, Collection<String> collection, String str2, boolean z, boolean z2, com.facebook.login.b bVar, String str3, String str4, boolean z3) {
        for (f fVar : f9213b) {
            Intent y = y(context, k(fVar, str, collection, str2, z, z2, bVar, str3, str4, z3), fVar);
            if (y != null) {
                return y;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static TreeSet<Integer> o(f fVar) {
        ProviderInfo providerInfo;
        TreeSet<Integer> treeSet = new TreeSet<>();
        ContentResolver contentResolver = com.facebook.f.e().getContentResolver();
        String[] strArr = {"version"};
        Uri g2 = g(fVar);
        Cursor cursor = null;
        try {
            try {
                providerInfo = com.facebook.f.e().getPackageManager().resolveContentProvider(fVar.e() + ".provider.PlatformProvider", 0);
            } catch (RuntimeException e2) {
                Log.e(a, "Failed to query content resolver.", e2);
                providerInfo = null;
            }
            if (providerInfo != null) {
                try {
                    cursor = contentResolver.query(g2, strArr, null, null, null);
                } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
                    Log.e(a, "Failed to query content resolver.");
                }
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        treeSet.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version"))));
                    }
                }
            }
            return treeSet;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static UUID p(Intent intent) {
        String stringExtra;
        if (intent == null) {
            return null;
        }
        if (w(v(intent))) {
            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
        } else {
            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
        }
        if (stringExtra == null) {
            return null;
        }
        try {
            return UUID.fromString(stringExtra);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static FacebookException q(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        String string = bundle.getString("error_type");
        if (string == null) {
            string = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String string2 = bundle.getString("error_description");
        if (string2 == null) {
            string2 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (string != null && string.equalsIgnoreCase("UserCanceled")) {
            return new FacebookOperationCanceledException(string2);
        }
        return new FacebookException(string2);
    }

    private static g r(List<f> list, int[] iArr) {
        x();
        if (list == null) {
            return g.b();
        }
        for (f fVar : list) {
            int h2 = h(fVar.c(), t(), iArr);
            if (h2 != -1) {
                return g.a(fVar, h2);
            }
        }
        return g.b();
    }

    public static int s(int i2) {
        return r(f9213b, new int[]{i2}).c();
    }

    public static final int t() {
        return f9217f.get(0).intValue();
    }

    public static Bundle u(Intent intent) {
        if (!w(v(intent))) {
            return intent.getExtras();
        }
        return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
    }

    public static int v(Intent intent) {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    public static boolean w(int i2) {
        return f9217f.contains(Integer.valueOf(i2)) && i2 >= 20140701;
    }

    public static void x() {
        if (f9216e.compareAndSet(false, true)) {
            com.facebook.f.m().execute(new a());
        }
    }

    static Intent y(Context context, Intent intent, f fVar) {
        ResolveInfo resolveActivity;
        if (intent == null || (resolveActivity = context.getPackageManager().resolveActivity(intent, 0)) == null || !i.b(context, resolveActivity.activityInfo.packageName)) {
            return null;
        }
        return intent;
    }

    static Intent z(Context context, Intent intent, f fVar) {
        ResolveInfo resolveService;
        if (intent == null || (resolveService = context.getPackageManager().resolveService(intent, 0)) == null || !i.b(context, resolveService.serviceInfo.packageName)) {
            return null;
        }
        return intent;
    }
}
