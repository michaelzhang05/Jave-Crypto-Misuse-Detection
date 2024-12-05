package com.mbridge.msdk.dycreator.bus;

/* loaded from: classes4.dex */
final class Subscription {

    /* renamed from: a, reason: collision with root package name */
    final Object f18673a;

    /* renamed from: b, reason: collision with root package name */
    final SubscriberMethod f18674b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f18673a = obj;
        this.f18674b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (this.f18673a != subscription.f18673a || !this.f18674b.equals(subscription.f18674b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18673a.hashCode() + this.f18674b.f18670d.hashCode();
    }
}
