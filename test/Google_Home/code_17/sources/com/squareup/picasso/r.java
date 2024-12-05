package com.squareup.picasso;

import I6.C1265c;
import I6.e;
import I6.u;
import android.content.Context;
import java.io.File;
import l2.InterfaceC3310c;

/* loaded from: classes4.dex */
public final class r implements InterfaceC3310c {

    /* renamed from: a, reason: collision with root package name */
    final e.a f24367a;

    /* renamed from: b, reason: collision with root package name */
    private final C1265c f24368b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24369c;

    public r(Context context) {
        this(C.f(context));
    }

    @Override // l2.InterfaceC3310c
    public I6.z a(I6.x xVar) {
        return this.f24367a.a(xVar).execute();
    }

    public r(File file) {
        this(file, C.a(file));
    }

    public r(File file, long j8) {
        this(new u.b().b(new C1265c(file, j8)).a());
        this.f24369c = false;
    }

    public r(I6.u uVar) {
        this.f24369c = true;
        this.f24367a = uVar;
        this.f24368b = uVar.c();
    }
}
