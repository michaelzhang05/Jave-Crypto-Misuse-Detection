package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f18632a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private final EventBus f18633b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncPoster(EventBus eventBus) {
        this.f18633b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f18632a.a(PendingPost.a(subscription, obj));
        EventBus.f18637a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a8 = this.f18632a.a();
        if (a8 != null) {
            this.f18633b.a(a8);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
