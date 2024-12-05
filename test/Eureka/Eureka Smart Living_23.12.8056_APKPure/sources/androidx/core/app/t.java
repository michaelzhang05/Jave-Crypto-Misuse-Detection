package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class t {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f1957a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f1958b;

        /* renamed from: c, reason: collision with root package name */
        private final g1[] f1959c;

        /* renamed from: d, reason: collision with root package name */
        private final g1[] f1960d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f1961e;

        /* renamed from: f, reason: collision with root package name */
        boolean f1962f;

        /* renamed from: g, reason: collision with root package name */
        private final int f1963g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f1964h;

        /* renamed from: i, reason: collision with root package name */
        public int f1965i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f1966j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f1967k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f1968l;

        public a(int i6, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i6 != 0 ? IconCompat.c(null, "", i6) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.f1967k;
        }

        public boolean b() {
            return this.f1961e;
        }

        public Bundle c() {
            return this.f1957a;
        }

        public IconCompat d() {
            int i6;
            if (this.f1958b == null && (i6 = this.f1965i) != 0) {
                this.f1958b = IconCompat.c(null, "", i6);
            }
            return this.f1958b;
        }

        public g1[] e() {
            return this.f1959c;
        }

        public int f() {
            return this.f1963g;
        }

        public boolean g() {
            return this.f1962f;
        }

        public CharSequence h() {
            return this.f1966j;
        }

        public boolean i() {
            return this.f1968l;
        }

        public boolean j() {
            return this.f1964h;
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, g1[] g1VarArr, g1[] g1VarArr2, boolean z5, int i6, boolean z6, boolean z7, boolean z8) {
            this.f1962f = true;
            this.f1958b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f1965i = iconCompat.e();
            }
            this.f1966j = e.d(charSequence);
            this.f1967k = pendingIntent;
            this.f1957a = bundle == null ? new Bundle() : bundle;
            this.f1959c = g1VarArr;
            this.f1960d = g1VarArr2;
            this.f1961e = z5;
            this.f1963g = i6;
            this.f1962f = z6;
            this.f1964h = z7;
            this.f1968l = z8;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        private IconCompat f1969e;

        /* renamed from: f, reason: collision with root package name */
        private IconCompat f1970f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f1971g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f1972h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f1973i;

        /* loaded from: classes.dex */
        private static class a {
            static Notification.BigPictureStyle a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                return bigPictureStyle.bigPicture(bitmap);
            }

            static Notification.BigPictureStyle b(Notification.Builder builder) {
                return new Notification.BigPictureStyle(builder);
            }

            static Notification.BigPictureStyle c(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                return bigPictureStyle.setBigContentTitle(charSequence);
            }

            static void d(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void e(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.t$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0024b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* loaded from: classes.dex */
        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z5) {
                bigPictureStyle.showBigPictureWhenCollapsed(z5);
            }
        }

        @Override // androidx.core.app.t.f
        public void b(s sVar) {
            int i6 = Build.VERSION.SDK_INT;
            Notification.BigPictureStyle c6 = a.c(a.b(sVar.a()), this.f2002b);
            IconCompat iconCompat = this.f1969e;
            if (iconCompat != null) {
                if (i6 >= 31) {
                    c.a(c6, this.f1969e.m(sVar instanceof y ? ((y) sVar).f() : null));
                } else if (iconCompat.g() == 1) {
                    c6 = a.a(c6, this.f1969e.d());
                }
            }
            if (this.f1971g) {
                IconCompat iconCompat2 = this.f1970f;
                if (iconCompat2 != null) {
                    if (i6 >= 23) {
                        C0024b.a(c6, this.f1970f.m(sVar instanceof y ? ((y) sVar).f() : null));
                    } else if (iconCompat2.g() == 1) {
                        a.d(c6, this.f1970f.d());
                    }
                }
                a.d(c6, null);
            }
            if (this.f2004d) {
                a.e(c6, this.f2003c);
            }
            if (i6 >= 31) {
                c.c(c6, this.f1973i);
                c.b(c6, this.f1972h);
            }
        }

        @Override // androidx.core.app.t.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public b h(Bitmap bitmap) {
            this.f1970f = bitmap == null ? null : IconCompat.b(bitmap);
            this.f1971g = true;
            return this;
        }

        public b i(Bitmap bitmap) {
            this.f1969e = bitmap == null ? null : IconCompat.b(bitmap);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f1974e;

        /* loaded from: classes.dex */
        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.t.f
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.t.f
        public void b(s sVar) {
            Notification.BigTextStyle a6 = a.a(a.c(a.b(sVar.a()), this.f2002b), this.f1974e);
            if (this.f2004d) {
                a.d(a6, this.f2003c);
            }
        }

        @Override // androidx.core.app.t.f
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public c h(CharSequence charSequence) {
            this.f1974e = e.d(charSequence);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        public static Notification.BubbleMetadata a(d dVar) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
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
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;
        public ArrayList U;

        /* renamed from: a, reason: collision with root package name */
        public Context f1975a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f1976b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f1977c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f1978d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f1979e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f1980f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f1981g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f1982h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f1983i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f1984j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f1985k;

        /* renamed from: l, reason: collision with root package name */
        int f1986l;

        /* renamed from: m, reason: collision with root package name */
        int f1987m;

        /* renamed from: n, reason: collision with root package name */
        boolean f1988n;

        /* renamed from: o, reason: collision with root package name */
        boolean f1989o;

        /* renamed from: p, reason: collision with root package name */
        f f1990p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f1991q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f1992r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f1993s;

        /* renamed from: t, reason: collision with root package name */
        int f1994t;

        /* renamed from: u, reason: collision with root package name */
        int f1995u;

        /* renamed from: v, reason: collision with root package name */
        boolean f1996v;

        /* renamed from: w, reason: collision with root package name */
        String f1997w;

        /* renamed from: x, reason: collision with root package name */
        boolean f1998x;

        /* renamed from: y, reason: collision with root package name */
        String f1999y;

        /* renamed from: z, reason: collision with root package name */
        boolean f2000z;

        /* loaded from: classes.dex */
        static class a {
            static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i6) {
                return builder.setContentType(i6);
            }

            static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i6) {
                return builder.setLegacyStreamType(i6);
            }

            static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i6) {
                return builder.setUsage(i6);
            }
        }

        public e(Context context) {
            this(context, null);
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap e(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f1975a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(s.b.f9134b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(s.b.f9133a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }

        private void n(int i6, boolean z5) {
            Notification notification;
            int i7;
            if (z5) {
                notification = this.R;
                i7 = i6 | notification.flags;
            } else {
                notification = this.R;
                i7 = (~i6) & notification.flags;
            }
            notification.flags = i7;
        }

        public e A(long j6) {
            this.R.when = j6;
            return this;
        }

        public e a(int i6, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1976b.add(new a(i6, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new y(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public e f(boolean z5) {
            n(16, z5);
            return this;
        }

        public e g(String str) {
            this.K = str;
            return this;
        }

        public e h(int i6) {
            this.E = i6;
            return this;
        }

        public e i(PendingIntent pendingIntent) {
            this.f1981g = pendingIntent;
            return this;
        }

        public e j(CharSequence charSequence) {
            this.f1980f = d(charSequence);
            return this;
        }

        public e k(CharSequence charSequence) {
            this.f1979e = d(charSequence);
            return this;
        }

        public e l(int i6) {
            Notification notification = this.R;
            notification.defaults = i6;
            if ((i6 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e m(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public e o(Bitmap bitmap) {
            this.f1984j = e(bitmap);
            return this;
        }

        public e p(int i6, int i7, int i8) {
            Notification notification = this.R;
            notification.ledARGB = i6;
            notification.ledOnMS = i7;
            notification.ledOffMS = i8;
            notification.flags = ((i7 == 0 || i8 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public e q(boolean z5) {
            this.f2000z = z5;
            return this;
        }

        public e r(int i6) {
            this.f1986l = i6;
            return this;
        }

        public e s(int i6) {
            this.f1987m = i6;
            return this;
        }

        public e t(boolean z5) {
            this.f1988n = z5;
            return this;
        }

        public e u(int i6) {
            this.R.icon = i6;
            return this;
        }

        public e v(Uri uri) {
            Notification notification = this.R;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder e6 = a.e(a.c(a.b(), 4), 5);
            this.R.audioAttributes = a.a(e6);
            return this;
        }

        public e w(f fVar) {
            if (this.f1990p != fVar) {
                this.f1990p = fVar;
                if (fVar != null) {
                    fVar.g(this);
                }
            }
            return this;
        }

        public e x(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public e y(long[] jArr) {
            this.R.vibrate = jArr;
            return this;
        }

        public e z(int i6) {
            this.F = i6;
            return this;
        }

        public e(Context context, String str) {
            this.f1976b = new ArrayList();
            this.f1977c = new ArrayList();
            this.f1978d = new ArrayList();
            this.f1988n = true;
            this.f2000z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f1975a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f1987m = 0;
            this.U = new ArrayList();
            this.Q = true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected e f2001a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f2002b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f2003c;

        /* renamed from: d, reason: collision with root package name */
        boolean f2004d = false;

        public void a(Bundle bundle) {
            if (this.f2004d) {
                bundle.putCharSequence("android.summaryText", this.f2003c);
            }
            CharSequence charSequence = this.f2002b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c6 = c();
            if (c6 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c6);
            }
        }

        public abstract void b(s sVar);

        protected abstract String c();

        public RemoteViews d(s sVar) {
            return null;
        }

        public RemoteViews e(s sVar) {
            return null;
        }

        public RemoteViews f(s sVar) {
            return null;
        }

        public void g(e eVar) {
            if (this.f2001a != eVar) {
                this.f2001a = eVar;
                if (eVar != null) {
                    eVar.w(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
