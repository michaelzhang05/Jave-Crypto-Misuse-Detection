package io.sentry;

import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: Stack.java */
/* loaded from: classes2.dex */
final class k5 {
    private final Deque<a> a;

    /* renamed from: b, reason: collision with root package name */
    private final w1 f18997b;

    public k5(w1 w1Var, a aVar) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.a = linkedBlockingDeque;
        this.f18997b = (w1) io.sentry.util.q.c(w1Var, "logger is required");
        linkedBlockingDeque.push((a) io.sentry.util.q.c(aVar, "rootStackItem is required"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a a() {
        return this.a.peek();
    }

    void b(a aVar) {
        this.a.push(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Stack.java */
    /* loaded from: classes2.dex */
    public static final class a {
        private final x4 a;

        /* renamed from: b, reason: collision with root package name */
        private volatile a2 f18998b;

        /* renamed from: c, reason: collision with root package name */
        private volatile s3 f18999c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(x4 x4Var, a2 a2Var, s3 s3Var) {
            this.f18998b = (a2) io.sentry.util.q.c(a2Var, "ISentryClient is required.");
            this.f18999c = (s3) io.sentry.util.q.c(s3Var, "Scope is required.");
            this.a = (x4) io.sentry.util.q.c(x4Var, "Options is required");
        }

        public a2 a() {
            return this.f18998b;
        }

        public x4 b() {
            return this.a;
        }

        public s3 c() {
            return this.f18999c;
        }

        a(a aVar) {
            this.a = aVar.a;
            this.f18998b = aVar.f18998b;
            this.f18999c = new s3(aVar.f18999c);
        }
    }

    public k5(k5 k5Var) {
        this(k5Var.f18997b, new a(k5Var.a.getLast()));
        Iterator<a> descendingIterator = k5Var.a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            b(new a(descendingIterator.next()));
        }
    }
}
