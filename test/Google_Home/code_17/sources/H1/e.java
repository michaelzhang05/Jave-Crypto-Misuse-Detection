package H1;

import B1.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes4.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static j f3477a = j.UNKNOWN;

    /* loaded from: classes4.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            j jVar;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    jVar = j.NOT_DETECTED;
                } else if (intExtra == 1) {
                    jVar = j.UNKNOWN;
                } else {
                    return;
                }
                j unused = e.f3477a = jVar;
            }
        }
    }

    public static j a() {
        if (H1.a.a() != B1.g.CTV) {
            return j.UNKNOWN;
        }
        return f3477a;
    }

    public static void c(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
