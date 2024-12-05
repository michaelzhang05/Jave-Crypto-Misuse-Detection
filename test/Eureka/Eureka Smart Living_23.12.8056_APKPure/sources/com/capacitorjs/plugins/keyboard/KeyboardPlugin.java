package com.capacitorjs.plugins.keyboard;

import android.os.Handler;
import android.os.Looper;
import com.capacitorjs.plugins.keyboard.c;
import com.getcapacitor.a1;
import com.getcapacitor.j0;
import com.getcapacitor.u0;
import com.getcapacitor.v0;

@v0.b(name = "Keyboard")
/* loaded from: classes.dex */
public class KeyboardPlugin extends u0 {
    private c implementation;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$3(v0 v0Var) {
        if (this.implementation.k()) {
            v0Var.w();
        } else {
            v0Var.r("Can't close keyboard, not currently focused");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0() {
        c cVar = new c(getActivity(), getConfig().c("resizeOnFullScreen", false));
        this.implementation = cVar;
        cVar.l(new c.b() { // from class: com.capacitorjs.plugins.keyboard.f
            @Override // com.capacitorjs.plugins.keyboard.c.b
            public final void a(String str, int i6) {
                KeyboardPlugin.this.onKeyboardEvent(str, i6);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$1(v0 v0Var) {
        this.implementation.m();
        v0Var.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(final v0 v0Var) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.capacitorjs.plugins.keyboard.e
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardPlugin.this.lambda$show$1(v0Var);
            }
        }, 350L);
    }

    @a1
    public void getResizeMode(v0 v0Var) {
        v0Var.B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.getcapacitor.u0
    public void handleOnDestroy() {
        this.implementation.l(null);
    }

    @a1
    public void hide(final v0 v0Var) {
        execute(new Runnable() { // from class: com.capacitorjs.plugins.keyboard.d
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardPlugin.this.lambda$hide$3(v0Var);
            }
        });
    }

    @Override // com.getcapacitor.u0
    public void load() {
        execute(new Runnable() { // from class: com.capacitorjs.plugins.keyboard.g
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardPlugin.this.lambda$load$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x003c. Please report as an issue. */
    public void onKeyboardEvent(String str, int i6) {
        j0 j0Var = new j0();
        str.hashCode();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -662060934:
                if (str.equals("keyboardDidHide")) {
                    c6 = 0;
                    break;
                }
                break;
            case -661733835:
                if (str.equals("keyboardDidShow")) {
                    c6 = 1;
                    break;
                }
                break;
            case -34092741:
                if (str.equals("keyboardWillHide")) {
                    c6 = 2;
                    break;
                }
                break;
            case -33765642:
                if (str.equals("keyboardWillShow")) {
                    c6 = 3;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
            case 2:
                this.bridge.F0(str);
                notifyListeners(str, j0Var);
                return;
            case 1:
            case 3:
                this.bridge.G0(str, "{ 'keyboardHeight': " + i6 + " }");
                j0Var.put("keyboardHeight", i6);
                notifyListeners(str, j0Var);
                return;
            default:
                return;
        }
    }

    @a1
    public void setAccessoryBarVisible(v0 v0Var) {
        v0Var.B();
    }

    @a1
    public void setResizeMode(v0 v0Var) {
        v0Var.B();
    }

    @a1
    public void setScroll(v0 v0Var) {
        v0Var.B();
    }

    @a1
    public void setStyle(v0 v0Var) {
        v0Var.B();
    }

    @a1
    public void show(final v0 v0Var) {
        execute(new Runnable() { // from class: com.capacitorjs.plugins.keyboard.h
            @Override // java.lang.Runnable
            public final void run() {
                KeyboardPlugin.this.lambda$show$2(v0Var);
            }
        });
    }
}
