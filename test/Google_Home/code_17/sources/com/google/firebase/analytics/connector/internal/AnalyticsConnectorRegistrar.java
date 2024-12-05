package com.google.firebase.analytics.connector.internal;

import D0.C1053c;
import D0.InterfaceC1055e;
import D0.h;
import D0.r;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C1053c> getComponents() {
        return Arrays.asList(C1053c.e(B0.a.class).b(r.l(A0.f.class)).b(r.l(Context.class)).b(r.l(Y0.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                B0.a d8;
                d8 = B0.b.d((A0.f) interfaceC1055e.a(A0.f.class), (Context) interfaceC1055e.a(Context.class), (Y0.d) interfaceC1055e.a(Y0.d.class));
                return d8;
            }
        }).e().d(), j1.h.b("fire-analytics", "22.1.0"));
    }
}
