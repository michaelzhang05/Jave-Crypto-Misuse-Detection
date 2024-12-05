package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.s;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l2.InterfaceC3312e;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: u, reason: collision with root package name */
    private static final long f24418u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f24419a;

    /* renamed from: b, reason: collision with root package name */
    long f24420b;

    /* renamed from: c, reason: collision with root package name */
    int f24421c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f24422d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24423e;

    /* renamed from: f, reason: collision with root package name */
    public final String f24424f;

    /* renamed from: g, reason: collision with root package name */
    public final List f24425g;

    /* renamed from: h, reason: collision with root package name */
    public final int f24426h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24427i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f24428j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24429k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24430l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f24431m;

    /* renamed from: n, reason: collision with root package name */
    public final float f24432n;

    /* renamed from: o, reason: collision with root package name */
    public final float f24433o;

    /* renamed from: p, reason: collision with root package name */
    public final float f24434p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f24435q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f24436r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f24437s;

    /* renamed from: t, reason: collision with root package name */
    public final s.f f24438t;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f24439a;

        /* renamed from: b, reason: collision with root package name */
        private int f24440b;

        /* renamed from: c, reason: collision with root package name */
        private String f24441c;

        /* renamed from: d, reason: collision with root package name */
        private int f24442d;

        /* renamed from: e, reason: collision with root package name */
        private int f24443e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f24444f;

        /* renamed from: g, reason: collision with root package name */
        private int f24445g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f24446h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f24447i;

        /* renamed from: j, reason: collision with root package name */
        private float f24448j;

        /* renamed from: k, reason: collision with root package name */
        private float f24449k;

        /* renamed from: l, reason: collision with root package name */
        private float f24450l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f24451m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f24452n;

        /* renamed from: o, reason: collision with root package name */
        private List f24453o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f24454p;

        /* renamed from: q, reason: collision with root package name */
        private s.f f24455q;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Uri uri, int i8, Bitmap.Config config) {
            this.f24439a = uri;
            this.f24440b = i8;
            this.f24454p = config;
        }

        public v a() {
            boolean z8 = this.f24446h;
            if (z8 && this.f24444f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f24444f && this.f24442d == 0 && this.f24443e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z8 && this.f24442d == 0 && this.f24443e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f24455q == null) {
                this.f24455q = s.f.NORMAL;
            }
            return new v(this.f24439a, this.f24440b, this.f24441c, this.f24453o, this.f24442d, this.f24443e, this.f24444f, this.f24446h, this.f24445g, this.f24447i, this.f24448j, this.f24449k, this.f24450l, this.f24451m, this.f24452n, this.f24454p, this.f24455q);
        }

        public b b(int i8) {
            if (!this.f24446h) {
                this.f24444f = true;
                this.f24445g = i8;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c() {
            if (this.f24439a == null && this.f24440b == 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d() {
            if (this.f24455q != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e() {
            if (this.f24442d == 0 && this.f24443e == 0) {
                return false;
            }
            return true;
        }

        public b f(s.f fVar) {
            if (fVar != null) {
                if (this.f24455q == null) {
                    this.f24455q = fVar;
                    return this;
                }
                throw new IllegalStateException("Priority already set.");
            }
            throw new IllegalArgumentException("Priority invalid.");
        }

        public b g(int i8, int i9) {
            if (i8 >= 0) {
                if (i9 >= 0) {
                    if (i9 == 0 && i8 == 0) {
                        throw new IllegalArgumentException("At least one dimension has to be positive number.");
                    }
                    this.f24442d = i8;
                    this.f24443e = i9;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public b h(InterfaceC3312e interfaceC3312e) {
            if (interfaceC3312e != null) {
                if (interfaceC3312e.key() != null) {
                    if (this.f24453o == null) {
                        this.f24453o = new ArrayList(2);
                    }
                    this.f24453o.add(interfaceC3312e);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f24422d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f24423e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.f24425g != null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f24426h == 0 && this.f24427i == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        long nanoTime = System.nanoTime() - this.f24420b;
        if (nanoTime > f24418u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (!c() && this.f24432n == 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f() {
        if (!e() && !b()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g() {
        return "[R" + this.f24419a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i8 = this.f24423e;
        if (i8 > 0) {
            sb.append(i8);
        } else {
            sb.append(this.f24422d);
        }
        List list = this.f24425g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC3312e interfaceC3312e : this.f24425g) {
                sb.append(' ');
                sb.append(interfaceC3312e.key());
            }
        }
        if (this.f24424f != null) {
            sb.append(" stableKey(");
            sb.append(this.f24424f);
            sb.append(')');
        }
        if (this.f24426h > 0) {
            sb.append(" resize(");
            sb.append(this.f24426h);
            sb.append(',');
            sb.append(this.f24427i);
            sb.append(')');
        }
        if (this.f24428j) {
            sb.append(" centerCrop");
        }
        if (this.f24430l) {
            sb.append(" centerInside");
        }
        if (this.f24432n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f24432n);
            if (this.f24435q) {
                sb.append(" @ ");
                sb.append(this.f24433o);
                sb.append(',');
                sb.append(this.f24434p);
            }
            sb.append(')');
        }
        if (this.f24436r) {
            sb.append(" purgeable");
        }
        if (this.f24437s != null) {
            sb.append(' ');
            sb.append(this.f24437s);
        }
        sb.append('}');
        return sb.toString();
    }

    private v(Uri uri, int i8, String str, List list, int i9, int i10, boolean z8, boolean z9, int i11, boolean z10, float f8, float f9, float f10, boolean z11, boolean z12, Bitmap.Config config, s.f fVar) {
        this.f24422d = uri;
        this.f24423e = i8;
        this.f24424f = str;
        if (list == null) {
            this.f24425g = null;
        } else {
            this.f24425g = DesugarCollections.unmodifiableList(list);
        }
        this.f24426h = i9;
        this.f24427i = i10;
        this.f24428j = z8;
        this.f24430l = z9;
        this.f24429k = i11;
        this.f24431m = z10;
        this.f24432n = f8;
        this.f24433o = f9;
        this.f24434p = f10;
        this.f24435q = z11;
        this.f24436r = z12;
        this.f24437s = config;
        this.f24438t = fVar;
    }
}
