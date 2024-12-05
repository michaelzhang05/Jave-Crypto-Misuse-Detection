package com.google.firebase.crashlytics;

import D0.C1053c;
import P5.AbstractC1378t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {
    public static final a Companion = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1053c> getComponents() {
        return AbstractC1378t.m();
    }
}
