package com.capacitorjs.plugins.browser;

import a1.e;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import com.capacitorjs.plugins.browser.b;
import com.getcapacitor.a1;
import com.getcapacitor.l0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;

@v0.b(name = "Browser")
/* loaded from: classes.dex */
public class BrowserPlugin extends u0 {
    private b implementation;

    @a1
    public void close(v0 v0Var) {
        v0Var.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnPause() {
        this.implementation.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnResume() {
        if (this.implementation.d()) {
            return;
        }
        l0.d(getLogTag(), "Error binding to custom tabs service", null);
    }

    @Override // com.getcapacitor.u0
    public void load() {
        b bVar = new b(getContext());
        this.implementation = bVar;
        bVar.i(new b.c() { // from class: com.capacitorjs.plugins.browser.c
            @Override // com.capacitorjs.plugins.browser.b.c
            public final void a(int i6) {
                BrowserPlugin.this.onBrowserEvent(i6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onBrowserEvent(int i6) {
        String str;
        if (i6 == 1) {
            str = "browserPageLoaded";
        } else if (i6 != 2) {
            return;
        } else {
            str = "browserFinished";
        }
        notifyListeners(str, null);
    }

    @a1
    public void open(v0 v0Var) {
        String localizedMessage;
        Integer valueOf;
        String n6 = v0Var.n("url");
        if (n6 == null) {
            localizedMessage = "Must provide a URL to open";
        } else if (n6.isEmpty()) {
            localizedMessage = "URL must not be empty";
        } else {
            try {
                Uri parse = Uri.parse(n6);
                String n7 = v0Var.n("toolbarColor");
                try {
                    if (n7 != null) {
                        try {
                            valueOf = Integer.valueOf(e.a(n7));
                        } catch (IllegalArgumentException unused) {
                            l0.d(getLogTag(), "Invalid color provided for toolbarColor. Using default", null);
                        }
                        this.implementation.h(parse, valueOf);
                        v0Var.w();
                        return;
                    }
                    this.implementation.h(parse, valueOf);
                    v0Var.w();
                    return;
                } catch (ActivityNotFoundException e6) {
                    l0.d(getLogTag(), e6.getLocalizedMessage(), null);
                    localizedMessage = "Unable to display URL";
                }
                valueOf = null;
            } catch (Exception e7) {
                localizedMessage = e7.getLocalizedMessage();
            }
        }
        v0Var.r(localizedMessage);
    }
}
