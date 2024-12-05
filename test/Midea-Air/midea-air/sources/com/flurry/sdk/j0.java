package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class j0 extends d7<String> {
    protected BroadcastReceiver p;

    /* loaded from: classes2.dex */
    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            j0.this.t(TimeZone.getDefault().getID());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class b extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f7 f9953h;

        b(f7 f7Var) {
            this.f9953h = f7Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            this.f9953h.a(TimeZone.getDefault().getID());
        }
    }

    public j0() {
        super("TimeZoneProvider");
        this.p = new a();
        Context a2 = b0.a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.TIMEZONE_CHANGED");
        if (a2 != null) {
            a2.registerReceiver(this.p, intentFilter);
        } else {
            d1.c(6, "TimeZoneProvider", "Context is null when initializing.");
        }
    }

    @Override // com.flurry.sdk.d7
    public final void v(f7<String> f7Var) {
        super.v(f7Var);
        m(new b(f7Var));
    }
}
