package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzuo {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15630b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15631c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15632d;

    /* renamed from: e, reason: collision with root package name */
    private final zzvb f15633e;

    /* renamed from: f, reason: collision with root package name */
    private final zzvk f15634f;
    private int n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f15635g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private ArrayList<String> f15636h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList<String> f15637i = new ArrayList<>();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList<zzuz> f15638j = new ArrayList<>();

    /* renamed from: k, reason: collision with root package name */
    private int f15639k = 0;
    private int l = 0;
    private int m = 0;
    private String o = HttpUrl.FRAGMENT_ENCODE_SET;
    private String p = HttpUrl.FRAGMENT_ENCODE_SET;
    private String q = HttpUrl.FRAGMENT_ENCODE_SET;

    public zzuo(int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        this.a = i2;
        this.f15630b = i3;
        this.f15631c = i4;
        this.f15632d = z;
        this.f15633e = new zzvb(i5);
        this.f15634f = new zzvk(i6, i7, i8);
    }

    private static String b(ArrayList<String> arrayList, int i2) {
        if (arrayList.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = arrayList.get(i3);
            i3++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    private final void f(String str, boolean z, float f2, float f3, float f4, float f5) {
        if (str == null || str.length() < this.f15631c) {
            return;
        }
        synchronized (this.f15635g) {
            this.f15636h.add(str);
            this.f15639k += str.length();
            if (z) {
                this.f15637i.add(str);
                this.f15638j.add(new zzuz(f2, f3, f4, f5, this.f15637i.size() - 1));
            }
        }
    }

    @VisibleForTesting
    private final int g(int i2, int i3) {
        if (this.f15632d) {
            return this.f15630b;
        }
        return (i2 * this.a) + (i3 * this.f15630b);
    }

    public final int a() {
        return this.n;
    }

    public final void c(String str, boolean z, float f2, float f3, float f4, float f5) {
        f(str, z, f2, f3, f4, f5);
        synchronized (this.f15635g) {
            if (this.m < 0) {
                zzbad.e("ActivityContent: negative number of WebViews.");
            }
            p();
        }
    }

    public final void d(String str, boolean z, float f2, float f3, float f4, float f5) {
        f(str, z, f2, f3, f4, f5);
    }

    public final void e(int i2) {
        this.l = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzuo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzuo) obj).o;
        return str != null && str.equals(this.o);
    }

    public final boolean h() {
        boolean z;
        synchronized (this.f15635g) {
            z = this.m == 0;
        }
        return z;
    }

    public final int hashCode() {
        return this.o.hashCode();
    }

    public final String i() {
        return this.o;
    }

    public final String j() {
        return this.p;
    }

    public final String k() {
        return this.q;
    }

    public final void l() {
        synchronized (this.f15635g) {
            this.n -= 100;
        }
    }

    public final void m() {
        synchronized (this.f15635g) {
            this.m--;
        }
    }

    public final void n() {
        synchronized (this.f15635g) {
            this.m++;
        }
    }

    public final void o() {
        synchronized (this.f15635g) {
            int g2 = g(this.f15639k, this.l);
            if (g2 > this.n) {
                this.n = g2;
            }
        }
    }

    public final void p() {
        synchronized (this.f15635g) {
            int g2 = g(this.f15639k, this.l);
            if (g2 > this.n) {
                this.n = g2;
                if (!zzk.zzlk().r().t()) {
                    this.o = this.f15633e.a(this.f15636h);
                    this.p = this.f15633e.a(this.f15637i);
                }
                if (!zzk.zzlk().r().l()) {
                    this.q = this.f15634f.a(this.f15637i, this.f15638j);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final int q() {
        return this.f15639k;
    }

    public final String toString() {
        int i2 = this.l;
        int i3 = this.n;
        int i4 = this.f15639k;
        String b2 = b(this.f15636h, 100);
        String b3 = b(this.f15637i, 100);
        String str = this.o;
        String str2 = this.p;
        String str3 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 165 + String.valueOf(b3).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i2);
        sb.append(" score:");
        sb.append(i3);
        sb.append(" total_length:");
        sb.append(i4);
        sb.append("\n text: ");
        sb.append(b2);
        sb.append("\n viewableText");
        sb.append(b3);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }
}
