package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f20143f;

    private c() {
    }

    public static c m() {
        if (f20143f == null) {
            synchronized (c.class) {
                try {
                    if (f20143f == null) {
                        f20143f = new c();
                    }
                } finally {
                }
            }
        }
        return f20143f;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected final void a(a.InterfaceC0392a interfaceC0392a) {
    }
}
