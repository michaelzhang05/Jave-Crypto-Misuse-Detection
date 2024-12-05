package com.google.firebase.ktx;

import D0.C1053c;
import P5.AbstractC1378t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import j1.h;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1053c> getComponents() {
        return AbstractC1378t.e(h.b("fire-core-ktx", "21.0.0"));
    }
}
