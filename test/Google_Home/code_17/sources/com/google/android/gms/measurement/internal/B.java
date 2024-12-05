package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class B extends AbstractC2444t3 {

    /* renamed from: c, reason: collision with root package name */
    private long f16973c;

    /* renamed from: d, reason: collision with root package name */
    private String f16974d;

    /* renamed from: e, reason: collision with root package name */
    private AccountManager f16975e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f16976f;

    /* renamed from: g, reason: collision with root package name */
    private long f16977g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(R2 r22) {
        super(r22);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2364i a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ B b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2367i2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2360h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ M2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ C2443t2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ a6 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2444t3
    protected final boolean q() {
        Calendar calendar = Calendar.getInstance();
        this.f16973c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f16974d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long r() {
        k();
        return this.f16977g;
    }

    public final long s() {
        m();
        return this.f16973c;
    }

    public final String t() {
        m();
        return this.f16974d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void u() {
        k();
        this.f16976f = null;
        this.f16977g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        Account[] result;
        k();
        long currentTimeMillis = x().currentTimeMillis();
        if (currentTimeMillis - this.f16977g > 86400000) {
            this.f16976f = null;
        }
        Boolean bool = this.f16976f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (ContextCompat.checkSelfPermission(w(), "android.permission.GET_ACCOUNTS") != 0) {
            c().N().a("Permission error checking for dasher/unicorn accounts");
            this.f16977g = currentTimeMillis;
            this.f16976f = Boolean.FALSE;
            return false;
        }
        if (this.f16975e == null) {
            this.f16975e = AccountManager.get(w());
        }
        try {
            result = this.f16975e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e8) {
            e = e8;
            c().I().b("Exception checking account types", e);
            this.f16977g = currentTimeMillis;
            this.f16976f = Boolean.FALSE;
            return false;
        } catch (OperationCanceledException e9) {
            e = e9;
            c().I().b("Exception checking account types", e);
            this.f16977g = currentTimeMillis;
            this.f16976f = Boolean.FALSE;
            return false;
        } catch (IOException e10) {
            e = e10;
            c().I().b("Exception checking account types", e);
            this.f16977g = currentTimeMillis;
            this.f16976f = Boolean.FALSE;
            return false;
        }
        if (result != null && result.length > 0) {
            this.f16976f = Boolean.TRUE;
            this.f16977g = currentTimeMillis;
            return true;
        }
        Account[] result2 = this.f16975e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.f16976f = Boolean.TRUE;
            this.f16977g = currentTimeMillis;
            return true;
        }
        this.f16977g = currentTimeMillis;
        this.f16976f = Boolean.FALSE;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2451u3, com.google.android.gms.measurement.internal.InterfaceC2465w3
    public final /* bridge */ /* synthetic */ C2329d y() {
        return super.y();
    }
}
