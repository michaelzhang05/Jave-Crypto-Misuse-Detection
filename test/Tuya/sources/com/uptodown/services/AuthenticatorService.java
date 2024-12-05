package com.uptodown.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3325m;

/* loaded from: classes5.dex */
public final class AuthenticatorService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC3159y.i(intent, "intent");
        IBinder iBinder = new C3325m(this).getIBinder();
        AbstractC3159y.h(iBinder, "authenticator.iBinder");
        return iBinder;
    }
}
