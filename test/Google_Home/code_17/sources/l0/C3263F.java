package l0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C2164j8;
import com.google.android.gms.measurement.internal.R2;
import j$.util.Objects;

/* renamed from: l0.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3263F extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final R2 f34198a;

    public C3263F(R2 r22) {
        this.f34198a = r22;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f34198a.c().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f34198a.c().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f34198a.c().L().a("App receiver called with unknown action");
            return;
        }
        final R2 r22 = this.f34198a;
        if (C2164j8.a() && r22.z().J(null, com.google.android.gms.measurement.internal.H.f17068I0)) {
            r22.c().K().a("App receiver notified triggers are available");
            r22.e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.e6
                @Override // java.lang.Runnable
                public final void run() {
                    R2 r23 = R2.this;
                    if (!r23.L().X0()) {
                        r23.c().L().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final A3 H8 = r23.H();
                    Objects.requireNonNull(H8);
                    new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            A3.this.E0();
                        }
                    }).start();
                }
            });
        }
    }
}
