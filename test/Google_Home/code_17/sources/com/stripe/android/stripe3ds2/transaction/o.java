package com.stripe.android.stripe3ds2.transaction;

import android.util.Log;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27947a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final o a(boolean z8) {
            if (z8) {
                return c.f27949b;
            }
            return b.f27948b;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends o {

        /* renamed from: b, reason: collision with root package name */
        public static final b f27948b = new b();

        private b() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void a(String msg, Throwable th) {
            AbstractC3255y.i(msg, "msg");
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void b(String msg) {
            AbstractC3255y.i(msg, "msg");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends o {

        /* renamed from: b, reason: collision with root package name */
        public static final c f27949b = new c();

        private c() {
            super(null);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void a(String msg, Throwable th) {
            AbstractC3255y.i(msg, "msg");
            Log.e("StripeSdk", msg, th);
        }

        @Override // com.stripe.android.stripe3ds2.transaction.o
        public void b(String msg) {
            AbstractC3255y.i(msg, "msg");
            Log.i("StripeSdk", msg);
        }
    }

    private o() {
    }

    public abstract void a(String str, Throwable th);

    public abstract void b(String str);

    public /* synthetic */ o(AbstractC3247p abstractC3247p) {
        this();
    }
}
