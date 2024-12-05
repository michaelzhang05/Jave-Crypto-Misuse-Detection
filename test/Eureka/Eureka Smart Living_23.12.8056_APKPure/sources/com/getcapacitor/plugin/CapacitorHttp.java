package com.getcapacitor.plugin;

import android.webkit.JavascriptInterface;
import com.getcapacitor.a1;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import z0.d;

@v0.b(permissions = {@v0.c(alias = "HttpWrite", strings = {"android.permission.WRITE_EXTERNAL_STORAGE"}), @v0.c(alias = "HttpRead", strings = {"android.permission.READ_EXTERNAL_STORAGE"})})
/* loaded from: classes.dex */
public class CapacitorHttp extends u0 {
    private Map<Runnable, v0> activeRequests = new HashMap();
    private final ExecutorService executor = Executors.newCachedThreadPool();

    private void http(final v0 v0Var, final String str) {
        Runnable runnable = new Runnable() { // from class: com.getcapacitor.plugin.c
            @Override // java.lang.Runnable
            public final void run() {
                CapacitorHttp.this.lambda$http$0(v0Var, str);
            }
        };
        this.activeRequests.put(runnable, v0Var);
        this.executor.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$http$0(v0 v0Var, String str) {
        try {
            v0Var.x(d.i(v0Var, str, getBridge()));
        } catch (Exception e6) {
            v0Var.t(e6.getLocalizedMessage(), e6.getClass().getSimpleName(), e6);
        }
    }

    @a1
    public void delete(v0 v0Var) {
        http(v0Var, "DELETE");
    }

    @a1
    public void get(v0 v0Var) {
        http(v0Var, "GET");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnDestroy() {
        super.handleOnDestroy();
        for (Map.Entry<Runnable, v0> entry : this.activeRequests.entrySet()) {
            entry.getKey();
            v0 value = entry.getValue();
            if (value.h().has("activeCapacitorHttpUrlConnection")) {
                try {
                    ((z0.c) value.h().get("activeCapacitorHttpUrlConnection")).f();
                    value.h().remove("activeCapacitorHttpUrlConnection");
                } catch (Exception unused) {
                }
            }
            getBridge().o0(value);
        }
        this.activeRequests.clear();
        this.executor.shutdownNow();
    }

    @JavascriptInterface
    public boolean isEnabled() {
        return getBridge().n().l("CapacitorHttp").c("enabled", false);
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.bridge.G().addJavascriptInterface(this, "CapacitorHttpAndroidInterface");
        super.load();
    }

    @a1
    public void patch(v0 v0Var) {
        http(v0Var, "PATCH");
    }

    @a1
    public void post(v0 v0Var) {
        http(v0Var, "POST");
    }

    @a1
    public void put(v0 v0Var) {
        http(v0Var, "PUT");
    }

    @a1
    public void request(v0 v0Var) {
        http(v0Var, null);
    }
}
