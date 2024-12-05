package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzag;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zzr<T> implements Comparable<zzr<T>> {

    /* renamed from: f, reason: collision with root package name */
    private final zzag.a f15456f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15457g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15458h;

    /* renamed from: i, reason: collision with root package name */
    private final int f15459i;

    /* renamed from: j, reason: collision with root package name */
    private final Object f15460j;

    /* renamed from: k, reason: collision with root package name */
    private zzz f15461k;
    private Integer l;
    private zzv m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private zzac r;
    private zzc s;
    private p30 t;

    public zzr(int i2, String str, zzz zzzVar) {
        Uri parse;
        String host;
        this.f15456f = zzag.a.a ? new zzag.a() : null;
        this.f15460j = new Object();
        this.n = true;
        int i3 = 0;
        this.o = false;
        this.p = false;
        this.q = false;
        this.s = null;
        this.f15457g = i2;
        this.f15458h = str;
        this.f15461k = zzzVar;
        this.r = new zzh();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i3 = host.hashCode();
        }
        this.f15459i = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(int i2) {
        zzv zzvVar = this.m;
        if (zzvVar != null) {
            zzvVar.b(this, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void C(p30 p30Var) {
        synchronized (this.f15460j) {
            this.t = p30Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void D(zzy<?> zzyVar) {
        p30 p30Var;
        synchronized (this.f15460j) {
            p30Var = this.t;
        }
        if (p30Var != null) {
            p30Var.b(this, zzyVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void E(T t);

    /* JADX WARN: Multi-variable type inference failed */
    public final zzr<?> F(int i2) {
        this.l = Integer.valueOf(i2);
        return this;
    }

    public final void G(zzaf zzafVar) {
        zzz zzzVar;
        synchronized (this.f15460j) {
            zzzVar = this.f15461k;
        }
        if (zzzVar != null) {
            zzzVar.a(zzafVar);
        }
    }

    public final void H(String str) {
        if (zzag.a.a) {
            this.f15456f.a(str, Thread.currentThread().getId());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void I(String str) {
        zzv zzvVar = this.m;
        if (zzvVar != null) {
            zzvVar.d(this);
        }
        if (zzag.a.a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new m30(this, str, id));
            } else {
                this.f15456f.a(str, id);
                this.f15456f.b(toString());
            }
        }
    }

    public final int J() {
        return this.f15459i;
    }

    public final String L() {
        String str = this.f15458h;
        int i2 = this.f15457g;
        if (i2 == 0 || i2 == -1) {
            return str;
        }
        String num = Integer.toString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final zzc M() {
        return this.s;
    }

    public byte[] N() throws zza {
        return null;
    }

    public final boolean O() {
        return this.n;
    }

    public final int P() {
        return this.r.l0();
    }

    public final zzac Q() {
        return this.r;
    }

    public final void R() {
        synchronized (this.f15460j) {
            this.p = true;
        }
    }

    public final boolean S() {
        boolean z;
        synchronized (this.f15460j) {
            z = this.p;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void T() {
        p30 p30Var;
        synchronized (this.f15460j) {
            p30Var = this.t;
        }
        if (p30Var != null) {
            p30Var.a(this);
        }
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Object obj) {
        zzr zzrVar = (zzr) obj;
        zzu zzuVar = zzu.NORMAL;
        return zzuVar == zzuVar ? this.l.intValue() - zzrVar.l.intValue() : zzuVar.ordinal() - zzuVar.ordinal();
    }

    public Map<String, String> d() throws zza {
        return Collections.emptyMap();
    }

    public final int f() {
        return this.f15457g;
    }

    public final String i() {
        return this.f15458h;
    }

    public final boolean n() {
        synchronized (this.f15460j) {
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzr<?> o(zzc zzcVar) {
        this.s = zzcVar;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final zzr<?> r(zzv zzvVar) {
        this.m = zzvVar;
        return this;
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f15459i));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        n();
        String str = this.f15458h;
        String valueOf2 = String.valueOf(zzu.NORMAL);
        String valueOf3 = String.valueOf(this.l);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + valueOf2.length() + valueOf3.length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzy<T> x(zzp zzpVar);
}
