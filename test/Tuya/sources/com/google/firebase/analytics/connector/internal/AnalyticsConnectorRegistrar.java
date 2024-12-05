package com.google.firebase.analytics.connector.internal;

import B0.C1062c;
import B0.InterfaceC1064e;
import B0.h;
import B0.r;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import z0.C4012b;
import z0.InterfaceC4011a;

@Keep
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1062c> getComponents() {
        return Arrays.asList(C1062c.e(InterfaceC4011a.class).b(r.k(y0.e.class)).b(r.k(Context.class)).b(r.k(W0.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                InterfaceC4011a d8;
                d8 = C4012b.d((y0.e) interfaceC1064e.a(y0.e.class), (Context) interfaceC1064e.a(Context.class), (W0.d) interfaceC1064e.a(W0.d.class));
                return d8;
            }
        }).e().d(), h1.h.b("fire-analytics", "21.3.0"));
    }
}
