package E1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import y1.EnumC3974g;
import y1.EnumC3977j;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static EnumC3977j f1927a = EnumC3977j.UNKNOWN;

    /* loaded from: classes3.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            EnumC3977j enumC3977j;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    enumC3977j = EnumC3977j.NOT_DETECTED;
                } else if (intExtra == 1) {
                    enumC3977j = EnumC3977j.UNKNOWN;
                } else {
                    return;
                }
                EnumC3977j unused = e.f1927a = enumC3977j;
            }
        }
    }

    public static EnumC3977j a() {
        if (E1.a.a() != EnumC3974g.CTV) {
            return EnumC3977j.UNKNOWN;
        }
        return f1927a;
    }

    public static void c(Context context) {
        context.registerReceiver(new a(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
