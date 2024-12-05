package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.browser.customtabs.a;
import androidx.core.app.o;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f1454b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        static String a() {
            LocaleList adjustedDefault;
            int size;
            Locale locale;
            adjustedDefault = LocaleList.getAdjustedDefault();
            size = adjustedDefault.size();
            if (size <= 0) {
                return null;
            }
            locale = adjustedDefault.get(0);
            return locale.toLanguageTag();
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList f1457c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f1458d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f1459e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray f1460f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f1461g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f1455a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0016a f1456b = new a.C0016a();

        /* renamed from: h, reason: collision with root package name */
        private int f1462h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1463i = true;

        public b(i iVar) {
            if (iVar != null) {
                d(iVar);
            }
        }

        private void b() {
            String a6 = a.a();
            if (TextUtils.isEmpty(a6)) {
                return;
            }
            Bundle bundleExtra = this.f1455a.hasExtra("com.android.browser.headers") ? this.f1455a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", a6);
            this.f1455a.putExtra("com.android.browser.headers", bundleExtra);
        }

        private void e(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            o.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f1455a.putExtras(bundle);
        }

        public g a() {
            if (!this.f1455a.hasExtra("android.support.customtabs.extra.SESSION")) {
                e(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f1457c;
            if (arrayList != null) {
                this.f1455a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f1459e;
            if (arrayList2 != null) {
                this.f1455a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1455a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1463i);
            this.f1455a.putExtras(this.f1456b.a().a());
            Bundle bundle = this.f1461g;
            if (bundle != null) {
                this.f1455a.putExtras(bundle);
            }
            if (this.f1460f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f1460f);
                this.f1455a.putExtras(bundle2);
            }
            this.f1455a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f1462h);
            if (Build.VERSION.SDK_INT >= 24) {
                b();
            }
            return new g(this.f1455a, this.f1458d);
        }

        public b c(androidx.browser.customtabs.a aVar) {
            this.f1461g = aVar.a();
            return this;
        }

        public b d(i iVar) {
            this.f1455a.setPackage(iVar.b().getPackageName());
            e(iVar.a(), iVar.c());
            return this;
        }

        public b f(int i6) {
            if (i6 < 0 || i6 > 2) {
                throw new IllegalArgumentException("Invalid value for the shareState argument");
            }
            this.f1462h = i6;
            if (i6 == 1) {
                this.f1455a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            } else if (i6 == 2) {
                this.f1455a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            } else {
                this.f1455a.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
            }
            return this;
        }
    }

    g(Intent intent, Bundle bundle) {
        this.f1453a = intent;
        this.f1454b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f1453a.setData(uri);
        androidx.core.content.a.k(context, this.f1453a, this.f1454b);
    }
}
