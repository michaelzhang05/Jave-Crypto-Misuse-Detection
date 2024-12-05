package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.s;
import i2.InterfaceC2777e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: u, reason: collision with root package name */
    private static final long f23363u = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a, reason: collision with root package name */
    int f23364a;

    /* renamed from: b, reason: collision with root package name */
    long f23365b;

    /* renamed from: c, reason: collision with root package name */
    int f23366c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f23367d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23368e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23369f;

    /* renamed from: g, reason: collision with root package name */
    public final List f23370g;

    /* renamed from: h, reason: collision with root package name */
    public final int f23371h;

    /* renamed from: i, reason: collision with root package name */
    public final int f23372i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23373j;

    /* renamed from: k, reason: collision with root package name */
    public final int f23374k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f23375l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f23376m;

    /* renamed from: n, reason: collision with root package name */
    public final float f23377n;

    /* renamed from: o, reason: collision with root package name */
    public final float f23378o;

    /* renamed from: p, reason: collision with root package name */
    public final float f23379p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f23380q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f23381r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap.Config f23382s;

    /* renamed from: t, reason: collision with root package name */
    public final s.f f23383t;

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Uri f23384a;

        /* renamed from: b, reason: collision with root package name */
        private int f23385b;

        /* renamed from: c, reason: collision with root package name */
        private String f23386c;

        /* renamed from: d, reason: collision with root package name */
        private int f23387d;

        /* renamed from: e, reason: collision with root package name */
        private int f23388e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f23389f;

        /* renamed from: g, reason: collision with root package name */
        private int f23390g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f23391h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f23392i;

        /* renamed from: j, reason: collision with root package name */
        private float f23393j;

        /* renamed from: k, reason: collision with root package name */
        private float f23394k;

        /* renamed from: l, reason: collision with root package name */
        private float f23395l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f23396m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f23397n;

        /* renamed from: o, reason: collision with root package name */
        private List f23398o;

        /* renamed from: p, reason: collision with root package name */
        private Bitmap.Config f23399p;

        /* renamed from: q, reason: collision with root package name */
        private s.f f23400q;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Uri uri, int i8, Bitmap.Config config) {
            this.f23384a = uri;
            this.f23385b = i8;
            this.f23399p = config;
        }

        public v a() {
            boolean z8 = this.f23391h;
            if (z8 && this.f23389f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (this.f23389f && this.f23387d == 0 && this.f23388e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z8 && this.f23387d == 0 && this.f23388e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f23400q == null) {
                this.f23400q = s.f.NORMAL;
            }
            return new v(this.f23384a, this.f23385b, this.f23386c, this.f23398o, this.f23387d, this.f23388e, this.f23389f, this.f23391h, this.f23390g, this.f23392i, this.f23393j, this.f23394k, this.f23395l, this.f23396m, this.f23397n, this.f23399p, this.f23400q);
        }

        public b b(int i8) {
            if (!this.f23391h) {
                this.f23389f = true;
                this.f23390g = i8;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean c() {
            if (this.f23384a == null && this.f23385b == 0) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean d() {
            if (this.f23400q != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean e() {
            if (this.f23387d == 0 && this.f23388e == 0) {
                return false;
            }
            return true;
        }

        public b f(s.f fVar) {
            if (fVar != null) {
                if (this.f23400q == null) {
                    this.f23400q = fVar;
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
                    this.f23387d = i8;
                    this.f23388e = i9;
                    return this;
                }
                throw new IllegalArgumentException("Height must be positive number or 0.");
            }
            throw new IllegalArgumentException("Width must be positive number or 0.");
        }

        public b h(InterfaceC2777e interfaceC2777e) {
            if (interfaceC2777e != null) {
                if (interfaceC2777e.key() != null) {
                    if (this.f23398o == null) {
                        this.f23398o = new ArrayList(2);
                    }
                    this.f23398o.add(interfaceC2777e);
                    return this;
                }
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
            throw new IllegalArgumentException("Transformation must not be null.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a() {
        Uri uri = this.f23367d;
        if (uri != null) {
            return String.valueOf(uri.getPath());
        }
        return Integer.toHexString(this.f23368e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        if (this.f23370g != null) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (this.f23371h == 0 && this.f23372i == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        long nanoTime = System.nanoTime() - this.f23365b;
        if (nanoTime > f23363u) {
            return g() + '+' + TimeUnit.NANOSECONDS.toSeconds(nanoTime) + 's';
        }
        return g() + '+' + TimeUnit.NANOSECONDS.toMillis(nanoTime) + "ms";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        if (!c() && this.f23377n == 0.0f) {
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
        return "[R" + this.f23364a + ']';
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i8 = this.f23368e;
        if (i8 > 0) {
            sb.append(i8);
        } else {
            sb.append(this.f23367d);
        }
        List list = this.f23370g;
        if (list != null && !list.isEmpty()) {
            for (InterfaceC2777e interfaceC2777e : this.f23370g) {
                sb.append(' ');
                sb.append(interfaceC2777e.key());
            }
        }
        if (this.f23369f != null) {
            sb.append(" stableKey(");
            sb.append(this.f23369f);
            sb.append(')');
        }
        if (this.f23371h > 0) {
            sb.append(" resize(");
            sb.append(this.f23371h);
            sb.append(',');
            sb.append(this.f23372i);
            sb.append(')');
        }
        if (this.f23373j) {
            sb.append(" centerCrop");
        }
        if (this.f23375l) {
            sb.append(" centerInside");
        }
        if (this.f23377n != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.f23377n);
            if (this.f23380q) {
                sb.append(" @ ");
                sb.append(this.f23378o);
                sb.append(',');
                sb.append(this.f23379p);
            }
            sb.append(')');
        }
        if (this.f23381r) {
            sb.append(" purgeable");
        }
        if (this.f23382s != null) {
            sb.append(' ');
            sb.append(this.f23382s);
        }
        sb.append('}');
        return sb.toString();
    }

    private v(Uri uri, int i8, String str, List list, int i9, int i10, boolean z8, boolean z9, int i11, boolean z10, float f8, float f9, float f10, boolean z11, boolean z12, Bitmap.Config config, s.f fVar) {
        this.f23367d = uri;
        this.f23368e = i8;
        this.f23369f = str;
        if (list == null) {
            this.f23370g = null;
        } else {
            this.f23370g = DesugarCollections.unmodifiableList(list);
        }
        this.f23371h = i9;
        this.f23372i = i10;
        this.f23373j = z8;
        this.f23375l = z9;
        this.f23374k = i11;
        this.f23376m = z10;
        this.f23377n = f8;
        this.f23378o = f9;
        this.f23379p = f10;
        this.f23380q = z11;
        this.f23381r = z12;
        this.f23382s = config;
        this.f23383t = fVar;
    }
}
