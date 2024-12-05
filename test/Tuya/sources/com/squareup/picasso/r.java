package com.squareup.picasso;

import F6.C1166c;
import F6.e;
import F6.u;
import android.content.Context;
import i2.InterfaceC2775c;
import java.io.File;

/* loaded from: classes4.dex */
public final class r implements InterfaceC2775c {

    /* renamed from: a, reason: collision with root package name */
    final e.a f23312a;

    /* renamed from: b, reason: collision with root package name */
    private final C1166c f23313b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23314c;

    public r(Context context) {
        this(C.f(context));
    }

    @Override // i2.InterfaceC2775c
    public F6.z a(F6.x xVar) {
        return this.f23312a.a(xVar).execute();
    }

    public r(File file) {
        this(file, C.a(file));
    }

    public r(File file, long j8) {
        this(new u.b().b(new C1166c(file, j8)).a());
        this.f23314c = false;
    }

    public r(F6.u uVar) {
        this.f23314c = true;
        this.f23312a = uVar;
        this.f23313b = uVar.c();
    }
}
