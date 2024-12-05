package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f26892a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final o a(boolean z8) {
            if (z8) {
                return c.f26894b;
            }
            return b.f26893b;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends o {

        /* renamed from: b, reason: collision with root package name */
        public static final b f26893b = new b();

        private b() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void a(String msg, Throwable th) {
            AbstractC3159y.i(msg, "msg");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void b(String msg) {
            AbstractC3159y.i(msg, "msg");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends o {

        /* renamed from: b, reason: collision with root package name */
        public static final c f26894b = new c();

        private c() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void a(String msg, Throwable th) {
            AbstractC3159y.i(msg, "msg");
            Log.e("StripeSdk", msg, th);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void b(String msg) {
            AbstractC3159y.i(msg, "msg");
            Log.i("StripeSdk", msg);
        }
    }

    private o() {
    }

    public abstract void a(String str, Throwable th);

    public abstract void b(String str);

    public /* synthetic */ o(AbstractC3151p abstractC3151p) {
        this();
    }
}
