package v1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import org.apache.cordova.networkinformation.NetworkManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e1 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f1 f9566a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ e1(f1 f1Var, d1 d1Var) {
        this.f9566a = f1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i6 = message.what;
        if (i6 == 0) {
            hashMap = this.f9566a.f9583f;
            synchronized (hashMap) {
                a1 a1Var = (a1) message.obj;
                hashMap2 = this.f9566a.f9583f;
                c1 c1Var = (c1) hashMap2.get(a1Var);
                if (c1Var != null && c1Var.i()) {
                    if (c1Var.j()) {
                        c1Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f9566a.f9583f;
                    hashMap3.remove(a1Var);
                }
            }
            return true;
        }
        if (i6 != 1) {
            return false;
        }
        hashMap4 = this.f9566a.f9583f;
        synchronized (hashMap4) {
            a1 a1Var2 = (a1) message.obj;
            hashMap5 = this.f9566a.f9583f;
            c1 c1Var2 = (c1) hashMap5.get(a1Var2);
            if (c1Var2 != null && c1Var2.a() == 3) {
                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(a1Var2), new Exception());
                ComponentName b6 = c1Var2.b();
                if (b6 == null) {
                    b6 = a1Var2.b();
                }
                if (b6 == null) {
                    String d6 = a1Var2.d();
                    n.h(d6);
                    b6 = new ComponentName(d6, NetworkManager.TYPE_UNKNOWN);
                }
                c1Var2.onServiceDisconnected(b6);
            }
        }
        return true;
    }
}
