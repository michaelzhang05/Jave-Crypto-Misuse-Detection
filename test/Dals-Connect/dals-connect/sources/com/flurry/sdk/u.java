package com.flurry.sdk;

import android.annotation.SuppressLint;
import android.location.Location;
import android.location.LocationManager;

/* loaded from: classes2.dex */
public final class u extends d7<t> {
    public boolean p;
    private boolean q;
    private boolean r;
    private Location s;
    private h7 t;
    protected f7<i7> u;

    /* loaded from: classes2.dex */
    final class a implements f7<i7> {
        a() {
        }

        @Override // com.flurry.sdk.f7
        public final /* synthetic */ void a(i7 i7Var) {
            u.this.r = i7Var.f9949b == g7.FOREGROUND;
            if (u.this.r) {
                u.this.F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class b extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f7 f10184h;

        b(f7 f7Var) {
            this.f10184h = f7Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            Location x = u.this.x();
            if (x != null) {
                u.this.s = x;
            }
            this.f10184h.a(new t(u.this.p, u.this.q, u.this.s));
        }
    }

    public u(h7 h7Var) {
        super("LocationProvider");
        this.p = true;
        this.q = false;
        this.r = false;
        a aVar = new a();
        this.u = aVar;
        this.t = h7Var;
        h7Var.v(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public Location x() {
        if (this.p && this.r) {
            if (!o2.a("android.permission.ACCESS_FINE_LOCATION") && !o2.a("android.permission.ACCESS_COARSE_LOCATION")) {
                this.q = false;
                return null;
            }
            String str = o2.a("android.permission.ACCESS_FINE_LOCATION") ? "passive" : "network";
            this.q = true;
            LocationManager locationManager = (LocationManager) b0.a().getSystemService("location");
            if (locationManager != null) {
                return locationManager.getLastKnownLocation(str);
            }
        }
        return null;
    }

    public final void F() {
        Location x = x();
        if (x != null) {
            this.s = x;
        }
        t(new t(this.p, this.q, this.s));
    }

    @Override // com.flurry.sdk.d7
    public final void v(f7<t> f7Var) {
        super.v(f7Var);
        m(new b(f7Var));
    }
}
