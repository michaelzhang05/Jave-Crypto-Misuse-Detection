package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import v.AbstractC4079h;
import v.InterfaceC4075d;
import v.InterfaceC4084m;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory implements InterfaceC4075d {
    @Override // v.InterfaceC4075d
    public InterfaceC4084m create(AbstractC4079h abstractC4079h) {
        return new d(abstractC4079h.b(), abstractC4079h.e(), abstractC4079h.d());
    }
}
