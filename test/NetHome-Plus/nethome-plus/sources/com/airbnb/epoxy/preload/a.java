package com.airbnb.epoxy.preload;

import android.view.View;
import com.airbnb.epoxy.preload.c;
import com.airbnb.epoxy.preload.h;
import com.airbnb.epoxy.s;
import java.util.List;
import kotlin.jvm.internal.l;

/* compiled from: EpoxyModelPreloader.kt */
/* loaded from: classes.dex */
public abstract class a<T extends s<?>, U extends h, P extends c> {
    public static final C0097a a = new C0097a(null);

    /* renamed from: b, reason: collision with root package name */
    private final Class<T> f7854b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Integer> f7855c;

    /* compiled from: EpoxyModelPreloader.kt */
    /* renamed from: com.airbnb.epoxy.preload.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0097a {
        private C0097a() {
        }

        public /* synthetic */ C0097a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public abstract U a(View view);

    public final Class<T> b() {
        return this.f7854b;
    }

    public final List<Integer> c() {
        return this.f7855c;
    }

    public abstract void d(T t, P p, g<? extends U> gVar);

    public Object e(T t) {
        l.g(t, "epoxyModel");
        return null;
    }
}
