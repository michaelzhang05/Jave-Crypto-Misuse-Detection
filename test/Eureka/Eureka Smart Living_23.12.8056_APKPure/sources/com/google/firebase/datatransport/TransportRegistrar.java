package com.google.firebase.datatransport;

import android.content.Context;
import b1.g;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import d1.t;
import java.util.Arrays;
import java.util.List;
import z3.c;
import z3.e;
import z3.h;
import z3.r;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        t.f((Context) eVar.a(Context.class));
        return t.c().g(a.f4508h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.c(g.class).g(LIBRARY_NAME).b(r.i(Context.class)).e(new h() { // from class: b4.a
            @Override // z3.h
            public final Object a(e eVar) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).d(), s4.h.b(LIBRARY_NAME, "18.1.7"));
    }
}
