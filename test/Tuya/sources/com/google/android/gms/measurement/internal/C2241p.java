package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.ContextCompat;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2241p extends AbstractC2258s2 {

    /* renamed from: c, reason: collision with root package name */
    private long f16721c;

    /* renamed from: d, reason: collision with root package name */
    private String f16722d;

    /* renamed from: e, reason: collision with root package name */
    private AccountManager f16723e;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f16724f;

    /* renamed from: g, reason: collision with root package name */
    private long f16725g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2241p(Y1 y12) {
        super(y12);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2258s2
    protected final boolean j() {
        Calendar calendar = Calendar.getInstance();
        this.f16721c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f16722d = language.toLowerCase(locale2) + "-" + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long o() {
        h();
        return this.f16725g;
    }

    public final long p() {
        k();
        return this.f16721c;
    }

    public final String q() {
        k();
        return this.f16722d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        h();
        this.f16724f = null;
        this.f16725g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean s() {
        Account[] result;
        h();
        long currentTimeMillis = this.f16777a.a().currentTimeMillis();
        if (currentTimeMillis - this.f16725g > 86400000) {
            this.f16724f = null;
        }
        Boolean bool = this.f16724f;
        if (bool == null) {
            if (ContextCompat.checkSelfPermission(this.f16777a.c(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f16777a.d().y().a("Permission error checking for dasher/unicorn accounts");
                this.f16725g = currentTimeMillis;
                this.f16724f = Boolean.FALSE;
                return false;
            }
            if (this.f16723e == null) {
                this.f16723e = AccountManager.get(this.f16777a.c());
            }
            try {
                result = this.f16723e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException e8) {
                e = e8;
                this.f16777a.d().t().b("Exception checking account types", e);
                this.f16725g = currentTimeMillis;
                this.f16724f = Boolean.FALSE;
                return false;
            } catch (OperationCanceledException e9) {
                e = e9;
                this.f16777a.d().t().b("Exception checking account types", e);
                this.f16725g = currentTimeMillis;
                this.f16724f = Boolean.FALSE;
                return false;
            } catch (IOException e10) {
                e = e10;
                this.f16777a.d().t().b("Exception checking account types", e);
                this.f16725g = currentTimeMillis;
                this.f16724f = Boolean.FALSE;
                return false;
            }
            if (result != null && result.length > 0) {
                this.f16724f = Boolean.TRUE;
                this.f16725g = currentTimeMillis;
                return true;
            }
            Account[] result2 = this.f16723e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f16724f = Boolean.TRUE;
                this.f16725g = currentTimeMillis;
                return true;
            }
            this.f16725g = currentTimeMillis;
            this.f16724f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
