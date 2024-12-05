package com.stripe.android.googlepaylauncher;

import android.content.Context;
import com.stripe.android.googlepaylauncher.h;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class c implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final L5.a f24908a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f24909b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f24910c;

    public c(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        this.f24908a = aVar;
        this.f24909b = aVar2;
        this.f24910c = aVar3;
    }

    public static c a(L5.a aVar, L5.a aVar2, L5.a aVar3) {
        return new c(aVar, aVar2, aVar3);
    }

    public static b c(Context context, h.d dVar, InterfaceC4057d interfaceC4057d) {
        return new b(context, dVar, interfaceC4057d);
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b get() {
        return c((Context) this.f24908a.get(), (h.d) this.f24909b.get(), (InterfaceC4057d) this.f24910c.get());
    }
}
