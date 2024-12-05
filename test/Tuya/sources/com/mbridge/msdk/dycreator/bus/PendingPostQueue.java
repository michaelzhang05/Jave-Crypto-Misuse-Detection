package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class PendingPostQueue {

    /* renamed from: a, reason: collision with root package name */
    private PendingPost f18665a;

    /* renamed from: b, reason: collision with root package name */
    private PendingPost f18666b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(PendingPost pendingPost) {
        try {
            if (pendingPost != null) {
                PendingPost pendingPost2 = this.f18666b;
                if (pendingPost2 != null) {
                    pendingPost2.f18664c = pendingPost;
                    this.f18666b = pendingPost;
                } else if (this.f18665a == null) {
                    this.f18666b = pendingPost;
                    this.f18665a = pendingPost;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } else {
                throw new NullPointerException("null cannot be enqueued");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized PendingPost a() {
        PendingPost pendingPost;
        pendingPost = this.f18665a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f18664c;
            this.f18665a = pendingPost2;
            if (pendingPost2 == null) {
                this.f18666b = null;
            }
        }
        return pendingPost;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized PendingPost a(int i8) throws InterruptedException {
        try {
            if (this.f18665a == null) {
                wait(i8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a();
    }
}
