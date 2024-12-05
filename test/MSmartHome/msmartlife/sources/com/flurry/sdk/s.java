package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class s extends d7<r> {
    protected BroadcastReceiver p;

    /* loaded from: classes2.dex */
    final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            s.this.t(s.y());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class b extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f7 f10148h;

        b(f7 f7Var) {
            this.f10148h = f7Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            this.f10148h.a(s.y());
        }
    }

    public s() {
        super("LocaleProvider");
        this.p = new a();
        Context a2 = b0.a();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.LOCALE_CHANGED");
        if (a2 != null) {
            a2.registerReceiver(this.p, intentFilter);
        } else {
            d1.c(6, "LocaleProvider", "Context is null when initializing.");
        }
    }

    public static r y() {
        return new r(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry());
    }

    @Override // com.flurry.sdk.d7
    public final void v(f7<r> f7Var) {
        super.v(f7Var);
        m(new b(f7Var));
    }
}
