package com.capacitorjs.plugins.haptics;

import com.getcapacitor.a1;
import com.getcapacitor.u0;
import com.getcapacitor.v0;
import v0.b;

@b(name = "Haptics")
/* loaded from: classes.dex */
public class HapticsPlugin extends u0 {
    private a implementation;

    @a1
    public void impact(v0 v0Var) {
        this.implementation.b(s0.a.e(v0Var.n("style")));
        v0Var.w();
    }

    @Override // com.getcapacitor.u0
    public void load() {
        this.implementation = new a(getContext());
    }

    @a1
    public void notification(v0 v0Var) {
        this.implementation.b(s0.b.e(v0Var.n("type")));
        v0Var.w();
    }

    @a1
    public void selectionChanged(v0 v0Var) {
        this.implementation.c();
        v0Var.w();
    }

    @a1
    public void selectionEnd(v0 v0Var) {
        this.implementation.d();
        v0Var.w();
    }

    @a1
    public void selectionStart(v0 v0Var) {
        this.implementation.e();
        v0Var.w();
    }

    @a1
    public void vibrate(v0 v0Var) {
        this.implementation.f(v0Var.j("duration", 300).intValue());
        v0Var.w();
    }
}
