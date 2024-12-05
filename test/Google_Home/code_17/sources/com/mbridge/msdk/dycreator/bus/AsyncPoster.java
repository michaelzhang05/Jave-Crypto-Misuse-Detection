package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
class AsyncPoster implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final PendingPostQueue f19687a = new PendingPostQueue();

    /* renamed from: b, reason: collision with root package name */
    private final EventBus f19688b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AsyncPoster(EventBus eventBus) {
        this.f19688b = eventBus;
    }

    public void enqueue(Subscription subscription, Object obj) {
        this.f19687a.a(PendingPost.a(subscription, obj));
        EventBus.f19692a.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost a8 = this.f19687a.a();
        if (a8 != null) {
            this.f19688b.a(a8);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
