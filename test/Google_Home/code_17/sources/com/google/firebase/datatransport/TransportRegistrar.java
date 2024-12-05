package com.google.firebase.datatransport;

import D0.C1053c;
import D0.F;
import D0.InterfaceC1055e;
import D0.h;
import D0.r;
import S0.b;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import s.j;
import u.u;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$0(InterfaceC1055e interfaceC1055e) {
        u.f((Context) interfaceC1055e.a(Context.class));
        return u.c().g(a.f15811h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$1(InterfaceC1055e interfaceC1055e) {
        u.f((Context) interfaceC1055e.a(Context.class));
        return u.c().g(a.f15811h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j lambda$getComponents$2(InterfaceC1055e interfaceC1055e) {
        u.f((Context) interfaceC1055e.a(Context.class));
        return u.c().g(a.f15810g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List<C1053c> getComponents() {
        return Arrays.asList(C1053c.e(j.class).h(LIBRARY_NAME).b(r.l(Context.class)).f(new h() { // from class: S0.c
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                j lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC1055e);
                return lambda$getComponents$0;
            }
        }).d(), C1053c.c(F.a(S0.a.class, j.class)).b(r.l(Context.class)).f(new h() { // from class: S0.d
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                j lambda$getComponents$1;
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(interfaceC1055e);
                return lambda$getComponents$1;
            }
        }).d(), C1053c.c(F.a(b.class, j.class)).b(r.l(Context.class)).f(new h() { // from class: S0.e
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                j lambda$getComponents$2;
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(interfaceC1055e);
                return lambda$getComponents$2;
            }
        }).d(), j1.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
