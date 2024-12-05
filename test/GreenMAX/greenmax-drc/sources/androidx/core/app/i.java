package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import okhttp3.HttpUrl;

/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public class i {

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class a {
        final Bundle a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f838b;

        /* renamed from: c, reason: collision with root package name */
        private final n[] f839c;

        /* renamed from: d, reason: collision with root package name */
        private final n[] f840d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f841e;

        /* renamed from: f, reason: collision with root package name */
        boolean f842f;

        /* renamed from: g, reason: collision with root package name */
        private final int f843g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f844h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f845i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f846j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f847k;

        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.b(null, HttpUrl.FRAGMENT_ENCODE_SET, i2) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f847k;
        }

        public boolean b() {
            return this.f841e;
        }

        public n[] c() {
            return this.f840d;
        }

        public Bundle d() {
            return this.a;
        }

        public IconCompat e() {
            int i2;
            if (this.f838b == null && (i2 = this.f845i) != 0) {
                this.f838b = IconCompat.b(null, HttpUrl.FRAGMENT_ENCODE_SET, i2);
            }
            return this.f838b;
        }

        public n[] f() {
            return this.f839c;
        }

        public int g() {
            return this.f843g;
        }

        public boolean h() {
            return this.f842f;
        }

        public CharSequence i() {
            return this.f846j;
        }

        public boolean j() {
            return this.f844h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, n[] nVarArr, n[] nVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f842f = true;
            this.f838b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f845i = iconCompat.c();
            }
            this.f846j = d.e(charSequence);
            this.f847k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.f839c = nVarArr;
            this.f840d = nVarArr2;
            this.f841e = z;
            this.f843g = i2;
            this.f842f = z2;
            this.f844h = z3;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f848e;

        @Override // androidx.core.app.i.e
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f848e);
            }
        }

        @Override // androidx.core.app.i.e
        public void b(h hVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(hVar.a()).setBigContentTitle(this.f859b).bigText(this.f848e);
                if (this.f861d) {
                    bigText.setSummaryText(this.f860c);
                }
            }
        }

        @Override // androidx.core.app.i.e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f848e = d.e(charSequence);
            return this;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static final class c {

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static class a {
            static Notification.BubbleMetadata a(c cVar) {
                if (cVar == null) {
                    return null;
                }
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: NotificationCompat.java */
        /* loaded from: classes.dex */
        public static class b {
            static Notification.BubbleMetadata a(c cVar) {
                if (cVar == null) {
                    return null;
                }
                throw null;
            }
        }

        public static Notification.BubbleMetadata a(c cVar) {
            if (cVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(cVar);
            }
            if (i2 == 29) {
                return a.a(cVar);
            }
            return null;
        }
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        protected d a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f859b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f860c;

        /* renamed from: d, reason: collision with root package name */
        boolean f861d = false;

        public void a(Bundle bundle) {
            if (this.f861d) {
                bundle.putCharSequence("android.summaryText", this.f860c);
            }
            CharSequence charSequence = this.f859b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c2 = c();
            if (c2 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c2);
            }
        }

        public abstract void b(h hVar);

        protected abstract String c();

        public RemoteViews d(h hVar) {
            return null;
        }

        public RemoteViews e(h hVar) {
            return null;
        }

        public RemoteViews f(h hVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.a != dVar) {
                this.a = dVar;
                if (dVar != null) {
                    dVar.v(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return k.c(notification);
        }
        return null;
    }

    /* compiled from: NotificationCompat.java */
    /* loaded from: classes.dex */
    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        androidx.core.content.b N;
        long O;
        int P;
        boolean Q;
        c R;
        Notification S;
        boolean T;
        Icon U;

        @Deprecated
        public ArrayList<String> V;
        public Context a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f849b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<m> f850c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f851d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f852e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f853f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f854g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f855h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f856i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f857j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f858k;
        int l;
        int m;
        boolean n;
        boolean o;
        e p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        public d(Context context, String str) {
            this.f849b = new ArrayList<>();
            this.f850c = new ArrayList<>();
            this.f851d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap f(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(c.h.b.f2630b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(c.h.b.a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double d2 = dimensionPixelSize;
            double max = Math.max(1, bitmap.getWidth());
            Double.isNaN(d2);
            Double.isNaN(max);
            double d3 = d2 / max;
            double d4 = dimensionPixelSize2;
            double max2 = Math.max(1, bitmap.getHeight());
            Double.isNaN(d4);
            Double.isNaN(max2);
            double min = Math.min(d3, d4 / max2);
            double width = bitmap.getWidth();
            Double.isNaN(width);
            int ceil = (int) Math.ceil(width * min);
            double height = bitmap.getHeight();
            Double.isNaN(height);
            return Bitmap.createScaledBitmap(bitmap, ceil, (int) Math.ceil(height * min), true);
        }

        private void n(int i2, boolean z) {
            if (z) {
                Notification notification = this.S;
                notification.flags = i2 | notification.flags;
            } else {
                Notification notification2 = this.S;
                notification2.flags = (i2 ^ (-1)) & notification2.flags;
            }
        }

        public d a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f849b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public d b(a aVar) {
            if (aVar != null) {
                this.f849b.add(aVar);
            }
            return this;
        }

        public Notification c() {
            return new j(this).c();
        }

        public Bundle d() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d g(boolean z) {
            n(16, z);
            return this;
        }

        public d h(String str) {
            this.K = str;
            return this;
        }

        public d i(int i2) {
            this.E = i2;
            return this;
        }

        public d j(PendingIntent pendingIntent) {
            this.f854g = pendingIntent;
            return this;
        }

        public d k(CharSequence charSequence) {
            this.f853f = e(charSequence);
            return this;
        }

        public d l(CharSequence charSequence) {
            this.f852e = e(charSequence);
            return this;
        }

        public d m(PendingIntent pendingIntent) {
            this.S.deleteIntent = pendingIntent;
            return this;
        }

        public d o(Bitmap bitmap) {
            this.f857j = f(bitmap);
            return this;
        }

        public d p(boolean z) {
            this.z = z;
            return this;
        }

        public d q(boolean z) {
            n(2, z);
            return this;
        }

        public d r(boolean z) {
            n(8, z);
            return this;
        }

        public d s(int i2) {
            this.m = i2;
            return this;
        }

        public d t(int i2, int i3, boolean z) {
            this.t = i2;
            this.u = i3;
            this.v = z;
            return this;
        }

        public d u(int i2) {
            this.S.icon = i2;
            return this;
        }

        public d v(e eVar) {
            if (this.p != eVar) {
                this.p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d w(CharSequence charSequence) {
            this.S.tickerText = e(charSequence);
            return this;
        }

        public d x(long j2) {
            this.S.when = j2;
            return this;
        }

        @Deprecated
        public d(Context context) {
            this(context, null);
        }
    }
}
