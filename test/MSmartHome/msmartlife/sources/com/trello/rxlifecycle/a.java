package com.trello.rxlifecycle;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Functions.java */
/* loaded from: classes2.dex */
public final class a {
    static final rx.m.e<Throwable, Boolean> a = new C0212a();

    /* renamed from: b, reason: collision with root package name */
    static final rx.m.e<Boolean, Boolean> f17344b = new b();

    /* renamed from: c, reason: collision with root package name */
    static final rx.m.e<Object, rx.e<Object>> f17345c = new c();

    /* compiled from: Functions.java */
    /* renamed from: com.trello.rxlifecycle.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class C0212a implements rx.m.e<Throwable, Boolean> {
        C0212a() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Throwable th) {
            if (th instanceof OutsideLifecycleException) {
                return Boolean.TRUE;
            }
            rx.exceptions.a.c(th);
            return Boolean.FALSE;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static class b implements rx.m.e<Boolean, Boolean> {
        b() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Boolean bool) {
            return bool;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes2.dex */
    static class c implements rx.m.e<Object, rx.e<Object>> {
        c() {
        }

        @Override // rx.m.e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public rx.e<Object> call(Object obj) {
            return rx.e.C(new CancellationException());
        }
    }
}
