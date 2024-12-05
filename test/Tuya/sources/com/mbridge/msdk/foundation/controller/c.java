package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f19088f;

    private c() {
    }

    public static c m() {
        if (f19088f == null) {
            synchronized (c.class) {
                try {
                    if (f19088f == null) {
                        f19088f = new c();
                    }
                } finally {
                }
            }
        }
        return f19088f;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    protected final void a(a.InterfaceC0396a interfaceC0396a) {
    }
}
