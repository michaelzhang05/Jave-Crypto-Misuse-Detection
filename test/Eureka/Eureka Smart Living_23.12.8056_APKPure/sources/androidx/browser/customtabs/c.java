package androidx.browser.customtabs;

import a.a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f1427a;

    /* renamed from: b, reason: collision with root package name */
    private final ComponentName f1428b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f1429c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0000a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f1430a = new Handler(Looper.getMainLooper());

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f1431b;

        /* renamed from: androidx.browser.customtabs.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0017a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1433a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1434b;

            RunnableC0017a(int i6, Bundle bundle) {
                this.f1433a = i6;
                this.f1434b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1431b.e(this.f1433a, this.f1434b);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1436a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1437b;

            b(String str, Bundle bundle) {
                this.f1436a = str;
                this.f1437b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1431b.a(this.f1436a, this.f1437b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0018c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f1439a;

            RunnableC0018c(Bundle bundle) {
                this.f1439a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1431b.d(this.f1439a);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1441a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f1442b;

            d(String str, Bundle bundle) {
                this.f1441a = str;
                this.f1442b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1431b.f(this.f1441a, this.f1442b);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f1445b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f1446c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f1447d;

            e(int i6, Uri uri, boolean z5, Bundle bundle) {
                this.f1444a = i6;
                this.f1445b = uri;
                this.f1446c = z5;
                this.f1447d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1431b.g(this.f1444a, this.f1445b, this.f1446c, this.f1447d);
            }
        }

        /* loaded from: classes.dex */
        class f implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1449a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f1450b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f1451c;

            f(int i6, int i7, Bundle bundle) {
                this.f1449a = i6;
                this.f1450b = i7;
                this.f1451c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f1431b.c(this.f1449a, this.f1450b, this.f1451c);
            }
        }

        a(androidx.browser.customtabs.b bVar) {
            this.f1431b = bVar;
        }

        @Override // a.a
        public void e(int i6, int i7, Bundle bundle) {
            if (this.f1431b == null) {
                return;
            }
            this.f1430a.post(new f(i6, i7, bundle));
        }

        @Override // a.a
        public Bundle g(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f1431b;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // a.a
        public void l(String str, Bundle bundle) {
            if (this.f1431b == null) {
                return;
            }
            this.f1430a.post(new d(str, bundle));
        }

        @Override // a.a
        public void n(String str, Bundle bundle) {
            if (this.f1431b == null) {
                return;
            }
            this.f1430a.post(new b(str, bundle));
        }

        @Override // a.a
        public void p(Bundle bundle) {
            if (this.f1431b == null) {
                return;
            }
            this.f1430a.post(new RunnableC0018c(bundle));
        }

        @Override // a.a
        public void s(int i6, Uri uri, boolean z5, Bundle bundle) {
            if (this.f1431b == null) {
                return;
            }
            this.f1430a.post(new e(i6, uri, z5, bundle));
        }

        @Override // a.a
        public void w(int i6, Bundle bundle) {
            if (this.f1431b == null) {
                return;
            }
            this.f1430a.post(new RunnableC0017a(i6, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a.b bVar, ComponentName componentName, Context context) {
        this.f1427a = bVar;
        this.f1428b = componentName;
        this.f1429c = context;
    }

    public static boolean a(Context context, String str, h hVar) {
        hVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, hVar, 33);
    }

    private a.AbstractBinderC0000a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z5) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z5 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private i f(b bVar, PendingIntent pendingIntent) {
        boolean i6;
        a.AbstractBinderC0000a b6 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                i6 = this.f1427a.u(b6, bundle);
            } else {
                i6 = this.f1427a.i(b6);
            }
            if (i6) {
                return new i(this.f1427a, b6, this.f1428b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public i e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j6) {
        try {
            return this.f1427a.q(j6);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
