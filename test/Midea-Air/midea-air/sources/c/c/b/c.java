package c.c.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: CustomTabsIntent.java */
/* loaded from: classes.dex */
public final class c {
    public final Intent a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f2370b;

    /* compiled from: CustomTabsIntent.java */
    /* loaded from: classes.dex */
    public static final class a {
        private final Intent a;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList<Bundle> f2371b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f2372c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList<Bundle> f2373d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f2374e;

        public a() {
            this(null);
        }

        public a a() {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }

        public a b(String str, PendingIntent pendingIntent) {
            if (this.f2371b == null) {
                this.f2371b = new ArrayList<>();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", str);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
            this.f2371b.add(bundle);
            return this;
        }

        public c c() {
            ArrayList<Bundle> arrayList = this.f2371b;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f2373d;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f2374e);
            return new c(this.a, this.f2372c);
        }

        public a d(Bitmap bitmap) {
            this.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
            return this;
        }

        public a e(Context context, int i2, int i3) {
            this.a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", androidx.core.app.b.a(context, i2, i3).b());
            return this;
        }

        public a f(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        public a g(Context context, int i2, int i3) {
            this.f2372c = androidx.core.app.b.a(context, i2, i3).b();
            return this;
        }

        public a h(int i2) {
            this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i2);
            return this;
        }

        public a(e eVar) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.a = intent;
            this.f2371b = null;
            this.f2372c = null;
            this.f2373d = null;
            this.f2374e = true;
            if (eVar != null) {
                intent.setPackage(eVar.b().getPackageName());
            }
            Bundle bundle = new Bundle();
            androidx.core.app.e.b(bundle, "android.support.customtabs.extra.SESSION", eVar != null ? eVar.a() : null);
            intent.putExtras(bundle);
        }
    }

    c(Intent intent, Bundle bundle) {
        this.a = intent;
        this.f2370b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        androidx.core.content.a.i(context, this.a, this.f2370b);
    }
}
