package com.capacitorjs.plugins.network;

import android.os.Build;
import android.util.Log;
import com.capacitorjs.plugins.network.c;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import org.apache.cordova.networkinformation.NetworkManager;

@v0.b(name = "Network")
/* loaded from: classes.dex */
public class NetworkPlugin extends u0 {
    public static final String NETWORK_CHANGE_EVENT = "networkStatusChange";
    private c implementation;
    private e prePauseNetworkStatus = null;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(boolean z5) {
        if (!z5) {
            updateNetworkStatus();
            return;
        }
        j0 j0Var = new j0();
        j0Var.put("connected", false);
        j0Var.m("connectionType", NetworkManager.TYPE_NONE);
        notifyListeners(NETWORK_CHANGE_EVENT, j0Var);
    }

    private j0 parseNetworkStatus(e eVar) {
        j0 j0Var = new j0();
        j0Var.put("connected", eVar.f4238a);
        j0Var.m("connectionType", eVar.f4239b.b());
        return j0Var;
    }

    private void updateNetworkStatus() {
        notifyListeners(NETWORK_CHANGE_EVENT, parseNetworkStatus(this.implementation.c()));
    }

    @a1
    public void getStatus(v0 v0Var) {
        v0Var.x(parseNetworkStatus(this.implementation.c()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnDestroy() {
        this.implementation.d(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnPause() {
        this.prePauseNetworkStatus = this.implementation.c();
        if (Build.VERSION.SDK_INT >= 24) {
            this.implementation.g();
        } else {
            this.implementation.h(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnResume() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.implementation.e();
        } else {
            this.implementation.f(getActivity());
        }
        e c6 = this.implementation.c();
        e eVar = this.prePauseNetworkStatus;
        if (eVar != null && !c6.f4238a && (eVar.f4238a || c6.f4239b != eVar.f4239b)) {
            Log.d("Capacitor/NetworkPlugin", "Detected pre-pause and after-pause network status mismatch. Updating network status and notifying listeners.");
            updateNetworkStatus();
        }
        this.prePauseNetworkStatus = null;
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.implementation = new c(getContext());
        this.implementation.d(new c.InterfaceC0075c() { // from class: com.capacitorjs.plugins.network.d
            @Override // com.capacitorjs.plugins.network.c.InterfaceC0075c
            public final void a(boolean z5) {
                NetworkPlugin.this.lambda$load$0(z5);
            }
        });
    }
}
