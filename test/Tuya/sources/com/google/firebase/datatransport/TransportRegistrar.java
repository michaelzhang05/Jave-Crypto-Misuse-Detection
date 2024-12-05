package com.google.firebase.datatransport;

import B0.C1062c;
import B0.InterfaceC1064e;
import B0.h;
import B0.r;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import s.g;
import u.u;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(InterfaceC1064e interfaceC1064e) {
        u.f((Context) interfaceC1064e.a(Context.class));
        return u.c().g(a.f15000h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1062c> getComponents() {
        return Arrays.asList(C1062c.e(g.class).h(LIBRARY_NAME).b(r.k(Context.class)).f(new h() { // from class: Q0.a
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC1064e);
                return lambda$getComponents$0;
            }
        }).d(), h1.h.b(LIBRARY_NAME, "18.1.8"));
    }
}
