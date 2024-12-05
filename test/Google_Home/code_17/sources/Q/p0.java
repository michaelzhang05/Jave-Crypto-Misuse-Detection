package Q;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import androidx.core.os.EnvironmentCompat;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q0 f9062a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ p0(q0 q0Var, o0 o0Var) {
        this.f9062a = q0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i8 = message.what;
        if (i8 == 0) {
            hashMap = this.f9062a.f9066f;
            synchronized (hashMap) {
                try {
                    l0 l0Var = (l0) message.obj;
                    hashMap2 = this.f9062a.f9066f;
                    n0 n0Var = (n0) hashMap2.get(l0Var);
                    if (n0Var != null && n0Var.i()) {
                        if (n0Var.j()) {
                            n0Var.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.f9062a.f9066f;
                        hashMap3.remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i8 == 1) {
            hashMap4 = this.f9062a.f9066f;
            synchronized (hashMap4) {
                try {
                    l0 l0Var2 = (l0) message.obj;
                    hashMap5 = this.f9062a.f9066f;
                    n0 n0Var2 = (n0) hashMap5.get(l0Var2);
                    if (n0Var2 != null && n0Var2.a() == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(l0Var2), new Exception());
                        ComponentName b8 = n0Var2.b();
                        if (b8 == null) {
                            b8 = l0Var2.a();
                        }
                        if (b8 == null) {
                            String c8 = l0Var2.c();
                            AbstractC1400p.l(c8);
                            b8 = new ComponentName(c8, EnvironmentCompat.MEDIA_UNKNOWN);
                        }
                        n0Var2.onServiceDisconnected(b8);
                    }
                } finally {
                }
            }
            return true;
        }
        return false;
    }
}
